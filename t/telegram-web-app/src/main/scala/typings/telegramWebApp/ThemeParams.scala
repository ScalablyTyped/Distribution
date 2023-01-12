package typings.telegramWebApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Web Apps can adjust the appearance of the interface to match the Telegram
  * user's app in real time. This object contains the user's current theme
  * settings:
  */
trait ThemeParams extends StObject {
  
  /**
    * Background color in the #RRGGBB format. Also available as the CSS variable
    * var(--tg-theme-bg-color).
    */
  var bg_color: String
  
  /**
    * Button color in the #RRGGBB format. Also available as the CSS variable
    * var(--tg-theme-button-color).
    */
  var button_color: String
  
  /**
    * Button text color in the #RRGGBB format. Also available as the CSS variable
    * var(--tg-theme-button-text-color).
    */
  var button_text_color: String
  
  /**
    * Hint text color in the #RRGGBB format. Also available as the CSS variable
    * var(--tg-theme-hint-color).
    */
  var hint_color: String
  
  /**
    * Link color in the #RRGGBB format. Also available as the CSS variable
    * var(--tg-theme-link-color).
    */
  var link_color: String
  
  /**
    * Optional. Bot API 6.1+ Secondary background color in the #RRGGBB format.
    * Also available as the CSS variable var(--tg-theme-secondary-bg-color).
    */
  var secondary_bg_color: String
  
  /**
    * Main text color in the #RRGGBB format. Also available as the CSS variable
    * var(--tg-theme-text-color).
    */
  var text_color: String
}
object ThemeParams {
  
  inline def apply(
    bg_color: String,
    button_color: String,
    button_text_color: String,
    hint_color: String,
    link_color: String,
    secondary_bg_color: String,
    text_color: String
  ): ThemeParams = {
    val __obj = js.Dynamic.literal(bg_color = bg_color.asInstanceOf[js.Any], button_color = button_color.asInstanceOf[js.Any], button_text_color = button_text_color.asInstanceOf[js.Any], hint_color = hint_color.asInstanceOf[js.Any], link_color = link_color.asInstanceOf[js.Any], secondary_bg_color = secondary_bg_color.asInstanceOf[js.Any], text_color = text_color.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThemeParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ThemeParams] (val x: Self) extends AnyVal {
    
    inline def setBg_color(value: String): Self = StObject.set(x, "bg_color", value.asInstanceOf[js.Any])
    
    inline def setButton_color(value: String): Self = StObject.set(x, "button_color", value.asInstanceOf[js.Any])
    
    inline def setButton_text_color(value: String): Self = StObject.set(x, "button_text_color", value.asInstanceOf[js.Any])
    
    inline def setHint_color(value: String): Self = StObject.set(x, "hint_color", value.asInstanceOf[js.Any])
    
    inline def setLink_color(value: String): Self = StObject.set(x, "link_color", value.asInstanceOf[js.Any])
    
    inline def setSecondary_bg_color(value: String): Self = StObject.set(x, "secondary_bg_color", value.asInstanceOf[js.Any])
    
    inline def setText_color(value: String): Self = StObject.set(x, "text_color", value.asInstanceOf[js.Any])
  }
}
