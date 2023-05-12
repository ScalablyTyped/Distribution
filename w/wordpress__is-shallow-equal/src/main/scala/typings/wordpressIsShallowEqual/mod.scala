package typings.wordpressIsShallowEqual

import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@wordpress/is-shallow-equal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(a: Any, b: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isShallowEqualArrays(a: js.Array[Any], b: js.Array[Any]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShallowEqualArrays")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isShallowEqualObjects(a: ComparableObject, b: ComparableObject): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isShallowEqualObjects")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  type ComparableObject = Record[String, Any]
}
