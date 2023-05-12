package typings.telegramWebApp

import typings.telegramWebApp.telegramWebAppStrings.`private`
import typings.telegramWebApp.telegramWebAppStrings.channel
import typings.telegramWebApp.telegramWebAppStrings.group
import typings.telegramWebApp.telegramWebAppStrings.sender
import typings.telegramWebApp.telegramWebAppStrings.supergroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains data that is transferred to the Web App when it is
  * opened. It is empty if the Web App was launched from a keyboard button.
  */
trait WebAppInitData extends StObject {
  
  /** Unix time when the form was opened. */
  var auth_date: Double
  
  /**
    * Time in seconds, after which a message can be sent via the
    * answerWebAppQuery method.
    */
  var can_send_after: js.UndefOr[Double] = js.undefined
  
  /**
    * An object containing data about the chat where the bot was launched via
    * the attachment menu. Returned for supergroups, channels and group chats –
    * only for Web Apps launched via the attachment menu.
    */
  var chat: js.UndefOr[WebAppChat] = js.undefined
  
  /**
    * Global identifier, uniquely corresponding to the chat from which the Web App was opened.
    * Returned only for Web Apps launched from a direct link.
    */
  var chat_instance: js.UndefOr[String] = js.undefined
  
  /**
    * Type of the chat from which the Web App was opened.
    * Can be either “sender” for a private chat with the user opening the link,
    * “private”, “group”, “supergroup”, or “channel”.
    * Returned only for Web Apps launched from direct links.
    */
  var chat_type: js.UndefOr[sender | `private` | group | supergroup | channel] = js.undefined
  
  /**
    * A hash of all passed parameters, which the bot server can use to check
    * their validity.
    */
  var hash: String
  
  /**
    * A unique identifier for the Web App session, required for sending messages
    * via the answerWebAppQuery method.
    */
  var query_id: js.UndefOr[String] = js.undefined
  
  /**
    * An object containing data about the chat partner of the current user in the
    * chat where the bot was launched via the attachment menu. Returned only for
    * Web Apps launched via the attachment menu.
    */
  var receiver: js.UndefOr[WebAppUser] = js.undefined
  
  /**
    * The value of the startattach parameter, passed via link. Only returned for
    * Web Apps when launched from the attachment menu via link. The value of the
    * start_param parameter will also be passed in the GET-parameter
    * tgWebAppStartParam, so the Web App can load the correct interface right
    * away.
    */
  var start_param: js.UndefOr[String] = js.undefined
  
  /** An object containing data about the current user. */
  var user: js.UndefOr[WebAppUser] = js.undefined
}
object WebAppInitData {
  
  inline def apply(auth_date: Double, hash: String): WebAppInitData = {
    val __obj = js.Dynamic.literal(auth_date = auth_date.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebAppInitData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebAppInitData] (val x: Self) extends AnyVal {
    
    inline def setAuth_date(value: Double): Self = StObject.set(x, "auth_date", value.asInstanceOf[js.Any])
    
    inline def setCan_send_after(value: Double): Self = StObject.set(x, "can_send_after", value.asInstanceOf[js.Any])
    
    inline def setCan_send_afterUndefined: Self = StObject.set(x, "can_send_after", js.undefined)
    
    inline def setChat(value: WebAppChat): Self = StObject.set(x, "chat", value.asInstanceOf[js.Any])
    
    inline def setChatUndefined: Self = StObject.set(x, "chat", js.undefined)
    
    inline def setChat_instance(value: String): Self = StObject.set(x, "chat_instance", value.asInstanceOf[js.Any])
    
    inline def setChat_instanceUndefined: Self = StObject.set(x, "chat_instance", js.undefined)
    
    inline def setChat_type(value: sender | `private` | group | supergroup | channel): Self = StObject.set(x, "chat_type", value.asInstanceOf[js.Any])
    
    inline def setChat_typeUndefined: Self = StObject.set(x, "chat_type", js.undefined)
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setQuery_id(value: String): Self = StObject.set(x, "query_id", value.asInstanceOf[js.Any])
    
    inline def setQuery_idUndefined: Self = StObject.set(x, "query_id", js.undefined)
    
    inline def setReceiver(value: WebAppUser): Self = StObject.set(x, "receiver", value.asInstanceOf[js.Any])
    
    inline def setReceiverUndefined: Self = StObject.set(x, "receiver", js.undefined)
    
    inline def setStart_param(value: String): Self = StObject.set(x, "start_param", value.asInstanceOf[js.Any])
    
    inline def setStart_paramUndefined: Self = StObject.set(x, "start_param", js.undefined)
    
    inline def setUser(value: WebAppUser): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
  }
}
