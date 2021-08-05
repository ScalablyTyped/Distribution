package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Background extends StObject {
  
  var background: String
  
  var border: String
  
  var card: String
  
  var notification: String
  
  var primary: String
  
  var text: String
}
object Background {
  
  inline def apply(
    background: String,
    border: String,
    card: String,
    notification: String,
    primary: String,
    text: String
  ): Background = {
    val __obj = js.Dynamic.literal(background = background.asInstanceOf[js.Any], border = border.asInstanceOf[js.Any], card = card.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any], primary = primary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Background]
  }
  
  extension [Self <: Background](x: Self) {
    
    inline def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    inline def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    inline def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    inline def setNotification(value: String): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    inline def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
