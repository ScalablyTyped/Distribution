package typings.twitchExt

import typings.twitchExt.twitchExtStrings.`false`
import typings.twitchExt.twitchExtStrings.`true`
import typings.twitchExt.twitchExtStrings.approved
import typings.twitchExt.twitchExtStrings.component
import typings.twitchExt.twitchExtStrings.config
import typings.twitchExt.twitchExtStrings.dashboard
import typings.twitchExt.twitchExtStrings.hosted_test
import typings.twitchExt.twitchExtStrings.in_review
import typings.twitchExt.twitchExtStrings.mobile
import typings.twitchExt.twitchExtStrings.panel
import typings.twitchExt.twitchExtStrings.pending_action
import typings.twitchExt.twitchExtStrings.ready_for_review
import typings.twitchExt.twitchExtStrings.released
import typings.twitchExt.twitchExtStrings.testing
import typings.twitchExt.twitchExtStrings.uploading
import typings.twitchExt.twitchExtStrings.video_overlay
import typings.twitchExt.twitchExtStrings.viewer
import typings.twitchExt.twitchExtStrings.web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The extension window receives the following query parameters, which indicate
  * information about the extension environment that isn’t subject to change over
  * the frame’s life cycle. Note that all parameters are encoded as strings here,
  * because they are always part of the URL.
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
    * @example "en"
    */
  var language: String
  /**
    * The user’s language locale.
    *
    * @example "en-US"
    */
  var locale: String
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
    locale: String,
    mode: config | dashboard | viewer,
    platform: mobile | web,
    popout: `true` | `false`,
    state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
  ): TwitchExtClientQueryParams = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popout = popout.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[TwitchExtClientQueryParams]
  }
}

