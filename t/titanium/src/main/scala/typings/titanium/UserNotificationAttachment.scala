package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provide at least the property `identifier` and `url` property to identify a local
  * image, sound or video. If your media is invalid, the API will throw an error log and
  * skip the invalid attachment.
  */
@js.native
trait UserNotificationAttachment extends StObject {
  
  /**
    * The identifier of this attachment.
    */
  var identifier: String = js.native
  
  /**
    * An additional dictionary of options to provide.
    */
  var options: js.UndefOr[js.Any] = js.native
  
  /**
    * The URL to the attachment's data. If you have obtained this attachment from
    * the notification-center then the URL will be security-scoped.
    */
  var url: String = js.native
}
object UserNotificationAttachment {
  
  @scala.inline
  def apply(identifier: String, url: String): UserNotificationAttachment = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationAttachment]
  }
  
  @scala.inline
  implicit class UserNotificationAttachmentMutableBuilder[Self <: UserNotificationAttachment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
