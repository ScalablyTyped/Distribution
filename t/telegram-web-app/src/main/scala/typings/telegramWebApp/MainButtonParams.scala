package typings.telegramWebApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MainButtonParams extends StObject {
  
  /** button color */
  var color: js.UndefOr[Color] = js.undefined
  
  /** enable the button */
  var is_active: js.UndefOr[Boolean] = js.undefined
  
  /** show the button */
  var is_visible: js.UndefOr[Boolean] = js.undefined
  
  /** button text */
  var text: js.UndefOr[String] = js.undefined
  
  /** button text color */
  var text_color: js.UndefOr[Color] = js.undefined
}
object MainButtonParams {
  
  inline def apply(): MainButtonParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MainButtonParams]
  }
  
  extension [Self <: MainButtonParams](x: Self) {
    
    inline def setColor(value: Color): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setIs_active(value: Boolean): Self = StObject.set(x, "is_active", value.asInstanceOf[js.Any])
    
    inline def setIs_activeUndefined: Self = StObject.set(x, "is_active", js.undefined)
    
    inline def setIs_visible(value: Boolean): Self = StObject.set(x, "is_visible", value.asInstanceOf[js.Any])
    
    inline def setIs_visibleUndefined: Self = StObject.set(x, "is_visible", js.undefined)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setText_color(value: Color): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
    
    inline def setText_colorUndefined: Self = StObject.set(x, "text_color", js.undefined)
  }
}
