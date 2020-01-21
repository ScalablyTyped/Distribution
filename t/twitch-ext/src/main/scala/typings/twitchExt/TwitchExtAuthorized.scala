package typings.twitchExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The result object as passed to the onAuthorized callback.
  *
  * @see TwitchExt.onAuthorized
  */
trait TwitchExtAuthorized extends js.Object {
  /**
  	 * Channel ID of the page where the extension is iframe embedded.
  	 */
  var channelId: String
  /**
  	 * Client ID of the extension.
  	 */
  var clientId: String
  /**
  	 * JWT that should be passed to any EBS call for authentication.
  	 */
  var token: String
  /**
  	 * Opaque user ID.
  	 */
  var userId: String
}

object TwitchExtAuthorized {
  @scala.inline
  def apply(channelId: String, clientId: String, token: String, userId: String): TwitchExtAuthorized = {
    val __obj = js.Dynamic.literal(channelId = channelId.asInstanceOf[js.Any], clientId = clientId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitchExtAuthorized]
  }
}

