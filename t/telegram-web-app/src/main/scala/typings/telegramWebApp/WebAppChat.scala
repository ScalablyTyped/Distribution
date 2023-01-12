package typings.telegramWebApp

import typings.telegramWebApp.telegramWebAppStrings.channel
import typings.telegramWebApp.telegramWebAppStrings.group
import typings.telegramWebApp.telegramWebAppStrings.supergroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object represents a chat.
  */
trait WebAppChat extends StObject {
  
  /**
    * Unique identifier for this chat. This number may have more than 32
    * significant bits and some programming languages may have
    * difficulty/silent defects in interpreting it. But it has at most 52
    * significant bits, so a signed 64-bit integer or double-precision float
    * type are safe for storing this identifier.
    */
  var id: Double
  
  /**
    * URL of the chat’s photo. The photo can be in .jpeg or .svg formats. Only
    * returned for Web Apps launched from the attachment menu.
    */
  var photo_url: js.UndefOr[String] = js.undefined
  
  /**
    * Title of the chat
    */
  var title: String
  
  /**
    * Type of chat, can be either “group”, “supergroup” or “channel”
    */
  var `type`: group | supergroup | channel
  
  /**
    * Username of the chat
    */
  var username: js.UndefOr[String] = js.undefined
}
object WebAppChat {
  
  inline def apply(id: Double, title: String, `type`: group | supergroup | channel): WebAppChat = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAppChat]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebAppChat] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setPhoto_url(value: String): Self = StObject.set(x, "photo_url", value.asInstanceOf[js.Any])
    
    inline def setPhoto_urlUndefined: Self = StObject.set(x, "photo_url", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setType(value: group | supergroup | channel): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
