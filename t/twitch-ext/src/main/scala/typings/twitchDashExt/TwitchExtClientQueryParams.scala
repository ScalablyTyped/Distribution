package typings.twitchDashExt

import typings.twitchDashExt.twitchDashExtStrings.`false`
import typings.twitchDashExt.twitchDashExtStrings.`true`
import typings.twitchDashExt.twitchDashExtStrings.approved
import typings.twitchDashExt.twitchDashExtStrings.component
import typings.twitchDashExt.twitchDashExtStrings.config
import typings.twitchDashExt.twitchDashExtStrings.dashboard
import typings.twitchDashExt.twitchDashExtStrings.hosted_test
import typings.twitchDashExt.twitchDashExtStrings.in_review
import typings.twitchDashExt.twitchDashExtStrings.mobile
import typings.twitchDashExt.twitchDashExtStrings.panel
import typings.twitchDashExt.twitchDashExtStrings.pending_action
import typings.twitchDashExt.twitchDashExtStrings.ready_for_review
import typings.twitchDashExt.twitchDashExtStrings.released
import typings.twitchDashExt.twitchDashExtStrings.testing
import typings.twitchDashExt.twitchDashExtStrings.uploading
import typings.twitchDashExt.twitchDashExtStrings.video_overlay
import typings.twitchDashExt.twitchDashExtStrings.viewer
import typings.twitchDashExt.twitchDashExtStrings.web
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
  var anchor: component | panel | video_overlay
  /**
  	 * The user’s language setting.
  	 *
  	 * @example en
  	 */
  var language: String
  /**
  	 * The extension’s mode.
  	 */
  var mode: config | dashboard | viewer
  /**
  	 * The platform on which the Twitch client is running.
  	 */
  var platform: mobile | web
  /**
  	 * Indicates whether the extension is popped out.
  	 */
  var popout: `true` | `false`
  /**
  	 * The release state of the extension.
  	 */
  var state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
}

object TwitchExtClientQueryParams {
  @scala.inline
  def apply(
    anchor: component | panel | video_overlay,
    language: String,
    mode: config | dashboard | viewer,
    platform: mobile | web,
    popout: `true` | `false`,
    state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
  ): TwitchExtClientQueryParams = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], language = language, mode = mode.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popout = popout.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitchExtClientQueryParams]
  }
}

