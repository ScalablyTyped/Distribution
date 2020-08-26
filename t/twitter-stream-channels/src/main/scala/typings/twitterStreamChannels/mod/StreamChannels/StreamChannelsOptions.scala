package typings.twitterStreamChannels.mod.StreamChannels

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StreamChannelsOptions extends js.Object {
  var enableChannelsEvents: js.UndefOr[Boolean] = js.native
  var enableKeywordsEvents: js.UndefOr[Boolean] = js.native
  var enableRootChannelsEvent: js.UndefOr[Boolean] = js.native
  var follow: js.UndefOr[String] = js.native
  var locations: js.UndefOr[String] = js.native
  var track: js.UndefOr[js.Object] = js.native
}

object StreamChannelsOptions {
  @scala.inline
  def apply(): StreamChannelsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamChannelsOptions]
  }
  @scala.inline
  implicit class StreamChannelsOptionsOps[Self <: StreamChannelsOptions] (val x: Self) extends AnyVal {
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
    def setEnableChannelsEvents(value: Boolean): Self = this.set("enableChannelsEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableChannelsEvents: Self = this.set("enableChannelsEvents", js.undefined)
    @scala.inline
    def setEnableKeywordsEvents(value: Boolean): Self = this.set("enableKeywordsEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableKeywordsEvents: Self = this.set("enableKeywordsEvents", js.undefined)
    @scala.inline
    def setEnableRootChannelsEvent(value: Boolean): Self = this.set("enableRootChannelsEvent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnableRootChannelsEvent: Self = this.set("enableRootChannelsEvent", js.undefined)
    @scala.inline
    def setFollow(value: String): Self = this.set("follow", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    @scala.inline
    def setLocations(value: String): Self = this.set("locations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocations: Self = this.set("locations", js.undefined)
    @scala.inline
    def setTrack(value: js.Object): Self = this.set("track", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTrack: Self = this.set("track", js.undefined)
  }
  
}

