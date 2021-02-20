package typings.uifabricUtilities

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@uifabric/utilities/lib/object", "assign")
  @js.native
  def assign(target: js.Any, args: js.Any*): js.Any = js.native
  
  @JSImport("@uifabric/utilities/lib/object", "filteredAssign")
  @js.native
  def filteredAssign(isAllowed: js.Function1[/* propName */ String, Boolean], target: js.Any, args: js.Any*): js.Any = js.native
  
  @JSImport("@uifabric/utilities/lib/object", "mapEnumByName")
  @js.native
  def mapEnumByName[T](
    theEnum: js.Any,
    callback: js.Function2[
      /* name */ js.UndefOr[String], 
      /* value */ js.UndefOr[String | Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = js.native
  
  @JSImport("@uifabric/utilities/lib/object", "omit")
  @js.native
  def omit[TObj /* <: Record[String, _] */](obj: TObj, exclusions: js.Array[/* keyof TObj */ String]): TObj = js.native
  
  @JSImport("@uifabric/utilities/lib/object", "shallowCompare")
  @js.native
  def shallowCompare[TA /* <: js.Any */, TB /* <: js.Any */](a: TA, b: TB): Boolean = js.native
  
  @JSImport("@uifabric/utilities/lib/object", "values")
  @js.native
  def values[T](obj: js.Any): js.Array[T] = js.native
}
