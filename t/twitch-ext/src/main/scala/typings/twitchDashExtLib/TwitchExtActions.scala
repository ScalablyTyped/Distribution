package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Twitch actions add first-party Twitch functionality to extensions.
  *
  * @see TwitchExt.actions
  */
trait TwitchExtActions extends js.Object {
  /**
  	 * This function prompts users to follow the specified channel, with a dialog controlled by Twitch.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#followchannel
  	 */
  def followChannel(channelName: java.lang.String): scala.Unit
  /**
  	 * This function causes your video-component or video-overlay extension to be minimized.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#minimize
  	 */
  def minimize(): scala.Unit
  /**
  	 * This function registers a callback that is invoked whenever a user completes an interaction prompted by the followChannel action.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#onfollow
  	 */
  def onFollow(
    callback: js.Function2[/* didFollow */ scala.Boolean, /* channelName */ java.lang.String, scala.Unit]
  ): scala.Unit
  /**
  	 * This function opens a prompt for users to share their identity.
  	 * After a successful identity link, the Twitch.ext.onAuthorized callback is invoked with the user’s ID.
  	 *
  	 * @see https://dev.twitch.tv/docs/extensions/reference/#requestidshare
  	 */
  def requestIdShare(): scala.Unit
}

