package typings.twitchExt.Twitch.ext

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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The extension window receives the following query parameters, which indicate
  * information about the extension environment that isn’t subject to change over
  * the frame’s life cycle. Note that all parameters are encoded as strings here,
  * because they are always part of the URL.
  *
  * @see https://dev.twitch.tv/docs/extensions/reference/#client-query-parameters
  */
@js.native
trait ClientQueryParams extends js.Object {
  
  /**
    * The type of the anchor in which the extension is activated.
    */
  var anchor: component | panel | video_overlay = js.native
  
  /**
    * The user’s language setting.
    *
    * @example "en"
    */
  var language: String = js.native
  
  /**
    * The user’s language locale.
    *
    * @example "en-US"
    */
  var locale: String = js.native
  
  /**
    * The extension’s mode.
    */
  var mode: config | dashboard | viewer = js.native
  
  /**
    * The platform on which the Twitch client is running.
    */
  var platform: mobile | web = js.native
  
  /**
    * Indicates whether the extension is popped out.
    */
  var popout: `true` | `false` = js.native
  
  /**
    * The release state of the extension.
    */
  var state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading = js.native
}
object ClientQueryParams {
  
  @scala.inline
  def apply(
    anchor: component | panel | video_overlay,
    language: String,
    locale: String,
    mode: config | dashboard | viewer,
    platform: mobile | web,
    popout: `true` | `false`,
    state: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
  ): ClientQueryParams = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], mode = mode.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popout = popout.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientQueryParams]
  }
  
  @scala.inline
  implicit class ClientQueryParamsOps[Self <: ClientQueryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchor(value: component | panel | video_overlay): Self = this.set("anchor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLanguage(value: String): Self = this.set("language", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMode(value: config | dashboard | viewer): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: mobile | web): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopout(value: `true` | `false`): Self = this.set("popout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(
      value: testing | hosted_test | approved | released | ready_for_review | in_review | pending_action | uploading
    ): Self = this.set("state", value.asInstanceOf[js.Any])
  }
}
