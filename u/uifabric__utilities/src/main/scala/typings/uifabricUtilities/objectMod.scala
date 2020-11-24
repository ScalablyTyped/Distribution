package typings.uifabricUtilities

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/utilities/lib/object", JSImport.Namespace)
@js.native
object objectMod extends js.Object {
  
  def assign(target: js.Any, args: js.Any*): js.Any = js.native
  
  def filteredAssign(isAllowed: js.Function1[/* propName */ String, Boolean], target: js.Any, args: js.Any*): js.Any = js.native
  
  def mapEnumByName[T](
    theEnum: js.Any,
    callback: js.Function2[
      /* name */ js.UndefOr[String], 
      /* value */ js.UndefOr[String | Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = js.native
  
  def omit[TObj /* <: Record[String, _] */](obj: TObj, exclusions: js.Array[/* keyof TObj */ String]): TObj = js.native
  
  def shallowCompare[TA /* <: js.Any */, TB /* <: js.Any */](a: TA, b: TB): Boolean = js.native
  
  def values[T](obj: js.Any): js.Array[T] = js.native
}
