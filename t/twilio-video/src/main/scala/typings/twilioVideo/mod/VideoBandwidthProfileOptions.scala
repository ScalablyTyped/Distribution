package typings.twilioVideo.mod

import typings.twilioVideo.mod.Track.Priority
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoBandwidthProfileOptions extends js.Object {
  
  var dominantSpeakerPriority: js.UndefOr[Priority] = js.native
  
  var maxSubscriptionBitrate: js.UndefOr[Double] = js.native
  
  var maxTracks: js.UndefOr[Double] = js.native
  
  var mode: js.UndefOr[BandwidthProfileMode] = js.native
  
  var renderDimensions: js.UndefOr[VideoRenderDimensions] = js.native
  
  var trackSwitchOffMode: js.UndefOr[TrackSwitchOffMode] = js.native
}
object VideoBandwidthProfileOptions {
  
  @scala.inline
  def apply(): VideoBandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoBandwidthProfileOptions]
  }
  
  @scala.inline
  implicit class VideoBandwidthProfileOptionsOps[Self <: VideoBandwidthProfileOptions] (val x: Self) extends AnyVal {
    
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
    def setDominantSpeakerPriority(value: Priority): Self = this.set("dominantSpeakerPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantSpeakerPriority: Self = this.set("dominantSpeakerPriority", js.undefined)
    
    @scala.inline
    def setMaxSubscriptionBitrate(value: Double): Self = this.set("maxSubscriptionBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSubscriptionBitrate: Self = this.set("maxSubscriptionBitrate", js.undefined)
    
    @scala.inline
    def setMaxTracks(value: Double): Self = this.set("maxTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTracks: Self = this.set("maxTracks", js.undefined)
    
    @scala.inline
    def setMode(value: BandwidthProfileMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setRenderDimensions(value: VideoRenderDimensions): Self = this.set("renderDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderDimensions: Self = this.set("renderDimensions", js.undefined)
    
    @scala.inline
    def setTrackSwitchOffMode(value: TrackSwitchOffMode): Self = this.set("trackSwitchOffMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrackSwitchOffMode: Self = this.set("trackSwitchOffMode", js.undefined)
  }
}
