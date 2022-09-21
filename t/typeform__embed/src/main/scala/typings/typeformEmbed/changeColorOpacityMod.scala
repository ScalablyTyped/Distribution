package typings.typeformEmbed

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object changeColorOpacityMod {
  
  @JSImport("@typeform/embed/types/utils/change-color-opacity", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def changeColorOpacity(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")().asInstanceOf[String]
  inline def changeColorOpacity(color: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")(color.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def changeColorOpacity(color: String, opacity: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[String]
  inline def changeColorOpacity(color: Unit, opacity: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("changeColorOpacity")(color.asInstanceOf[js.Any], opacity.asInstanceOf[js.Any])).asInstanceOf[String]
}
