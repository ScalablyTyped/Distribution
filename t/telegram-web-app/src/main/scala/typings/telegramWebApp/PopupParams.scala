package typings.telegramWebApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object describes the native popup.
  */
trait PopupParams extends StObject {
  
  /**
    * List of buttons to be displayed in the popup, 1-3 buttons. Set to [{“type”:“close”}] by default.
    */
  var buttons: js.UndefOr[js.Array[PopupButton]] = js.undefined
  
  /**
    * The message to be displayed in the body of the popup, 1-256 characters.
    */
  var message: String
  
  /**
    * The text to be displayed in the popup title, 0-64 characters.
    */
  var title: js.UndefOr[String] = js.undefined
}
object PopupParams {
  
  inline def apply(message: String): PopupParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupParams]
  }
  
  extension [Self <: PopupParams](x: Self) {
    
    inline def setButtons(value: js.Array[PopupButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: PopupButton*): Self = StObject.set(x, "buttons", js.Array(value*))
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
