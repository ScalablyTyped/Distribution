package typings
package titaniumLib

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

