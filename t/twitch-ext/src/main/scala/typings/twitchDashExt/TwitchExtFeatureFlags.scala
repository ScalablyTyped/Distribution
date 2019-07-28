package typings.twitchDashExt

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TwitchExtFeatureFlags extends js.Object {
  /**
  	 * If this flag is true, you can send a chat message to the current channel using Send Extension Chat Message
  	 * (subject to the authentication requirements documented for that endpoint).
  	 */
  var isChatEnabled: Boolean
}

object TwitchExtFeatureFlags {
  @scala.inline
  def apply(isChatEnabled: Boolean): TwitchExtFeatureFlags = {
    val __obj = js.Dynamic.literal(isChatEnabled = isChatEnabled)
  
    __obj.asInstanceOf[TwitchExtFeatureFlags]
  }
}

