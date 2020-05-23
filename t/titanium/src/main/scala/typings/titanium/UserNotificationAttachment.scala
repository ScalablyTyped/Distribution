package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provide at least the property `identifier` and `url` property to identify a local
  * image, sound or video. If your media is invalid, the API will throw an error log and
  * skip the invalid attachment.
  */
trait UserNotificationAttachment extends js.Object {
  /**
    * The identifier of this attachment.
    */
  var identifier: java.lang.String
  /**
    * An additional dictionary of options to provide.
    */
  var options: js.UndefOr[js.Any] = js.undefined
  /**
    * The URL to the attachment's data. If you have obtained this attachment from
    * the notification-center then the URL will be security-scoped.
    */
  var url: java.lang.String
}

object UserNotificationAttachment {
  @scala.inline
  def apply(identifier: java.lang.String, url: java.lang.String, options: js.Any = null): UserNotificationAttachment = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserNotificationAttachment]
  }
}

