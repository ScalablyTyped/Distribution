package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait TwitchExtFeatureFlags extends js.Object {
  /**
  	 * If this flag is true, you can send a chat message to the current channel using Send Extension Chat Message
  	 * (subject to the authentication requirements documented for that endpoint).
  	 */
  var isChatEnabled: scala.Boolean
}

