package typings.uifabricUtilities

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object objectMod {
  
  @JSImport("@uifabric/utilities/lib/object", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign(target: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(target.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def filteredAssign(isAllowed: js.Function1[/* propName */ String, Boolean], target: js.Any, args: js.Any*): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("filteredAssign")(isAllowed.asInstanceOf[js.Any], target.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  inline def mapEnumByName[T](
    theEnum: js.Any,
    callback: js.Function2[
      /* name */ js.UndefOr[String], 
      /* value */ js.UndefOr[String | Double], 
      js.UndefOr[T]
    ]
  ): js.UndefOr[js.Array[js.UndefOr[T]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("mapEnumByName")(theEnum.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[js.Array[js.UndefOr[T]]]]
  
  inline def omit[TObj /* <: Record[String, js.Any] */](obj: TObj, exclusions: js.Array[/* keyof TObj */ String]): TObj = (^.asInstanceOf[js.Dynamic].applyDynamic("omit")(obj.asInstanceOf[js.Any], exclusions.asInstanceOf[js.Any])).asInstanceOf[TObj]
  
  inline def shallowCompare[TA /* <: js.Any */, TB /* <: js.Any */](a: TA, b: TB): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("shallowCompare")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def values[T](obj: js.Any): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("values")(obj.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
