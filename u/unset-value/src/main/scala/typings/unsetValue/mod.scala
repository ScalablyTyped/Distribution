package typings.unsetValue

import typings.std.PropertyKey
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(obj: Record[PropertyKey, Any], prop: String): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def apply(obj: Record[PropertyKey, Any], prop: js.Array[String]): Boolean = (^.asInstanceOf[js.Dynamic].apply(obj.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("unset-value", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
