package typings
package twitchDashExtLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extension window receives the following query parameters, which indicate
  * information about the extension environment that isn’t subject to change over
  * the frame’s life cycle.
  *
  * @see https://dev.twitch.tv/docs/extensions/reference/#client-query-parameters
  */
trait TwitchExtClientQueryParams extends js.Object {
  /**
  	 * The type of the anchor in which the extension is activated.
  	 */
  var anchor: twitchDashExtLib.twitchDashExtLibStrings.component | twitchDashExtLib.twitchDashExtLibStrings.panel | twitchDashExtLib.twitchDashExtLibStrings.video_overlay
  /**
  	 * The user’s language setting.
  	 *
  	 * @example en
  	 */
  var language: java.lang.String
  /**
  	 * The extension’s mode.
  	 */
  var mode: twitchDashExtLib.twitchDashExtLibStrings.config | twitchDashExtLib.twitchDashExtLibStrings.dashboard | twitchDashExtLib.twitchDashExtLibStrings.viewer
  /**
  	 * The platform on which the Twitch client is running.
  	 */
  var platform: twitchDashExtLib.twitchDashExtLibStrings.mobile | twitchDashExtLib.twitchDashExtLibStrings.web
  /**
  	 * Indicates whether the extension is popped out.
  	 */
  var popout: twitchDashExtLib.twitchDashExtLibStrings.`true` | twitchDashExtLib.twitchDashExtLibStrings.`false`
  /**
  	 * The release state of the extension.
  	 */
  var state: twitchDashExtLib.twitchDashExtLibStrings.testing | twitchDashExtLib.twitchDashExtLibStrings.hosted_test | twitchDashExtLib.twitchDashExtLibStrings.approved | twitchDashExtLib.twitchDashExtLibStrings.released | twitchDashExtLib.twitchDashExtLibStrings.ready_for_review | twitchDashExtLib.twitchDashExtLibStrings.in_review | twitchDashExtLib.twitchDashExtLibStrings.pending_action | twitchDashExtLib.twitchDashExtLibStrings.uploading
}

