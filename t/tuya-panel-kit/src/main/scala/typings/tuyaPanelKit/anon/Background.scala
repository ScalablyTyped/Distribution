package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Background extends StObject {
  
  var background: String = js.native
  
  var border: String = js.native
  
  var card: String = js.native
  
  var notification: String = js.native
  
  var primary: String = js.native
  
  var text: String = js.native
}
object Background {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class BackgroundMutableBuilder[Self <: Background] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackground(value: String): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBorder(value: String): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCard(value: String): Self = StObject.set(x, "card", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: String): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimary(value: String): Self = StObject.set(x, "primary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
