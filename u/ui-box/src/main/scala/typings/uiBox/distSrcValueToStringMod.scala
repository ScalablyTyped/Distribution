package typings.uiBox

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcValueToStringMod {
  
  @JSImport("ui-box/dist/src/value-to-string", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(value: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(value: String, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def default(value: Double): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(value: Double, unit: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(value.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String]
}
