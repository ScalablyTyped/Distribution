package typings.tuyaPanelKit.themeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopbarTheme extends StObject {
  
  var background: BackgroundProps
  
  var color: String
}
object TopbarTheme {
  
  inline def apply(background: BackgroundProps, color: String): TopbarTheme = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopbarTheme]
  }
  
  extension [Self <: TopbarTheme](x: Self) {
    
    inline def setBackground(value: BackgroundProps): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
  }
}
