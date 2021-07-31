package typings.twilioVideo.mod

import typings.twilioVideo.mod.Track.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoBandwidthProfileOptions extends StObject {
  
  var dominantSpeakerPriority: js.UndefOr[Priority] = js.undefined
  
  var maxSubscriptionBitrate: js.UndefOr[Double] = js.undefined
  
  var maxTracks: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[BandwidthProfileMode] = js.undefined
  
  var renderDimensions: js.UndefOr[VideoRenderDimensions] = js.undefined
  
  var trackSwitchOffMode: js.UndefOr[TrackSwitchOffMode] = js.undefined
}
object VideoBandwidthProfileOptions {
  
  @scala.inline
  def apply(): VideoBandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoBandwidthProfileOptions]
  }
  
  @scala.inline
  implicit class VideoBandwidthProfileOptionsMutableBuilder[Self <: VideoBandwidthProfileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDominantSpeakerPriority(value: Priority): Self = StObject.set(x, "dominantSpeakerPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDominantSpeakerPriorityUndefined: Self = StObject.set(x, "dominantSpeakerPriority", js.undefined)
    
    @scala.inline
    def setMaxSubscriptionBitrate(value: Double): Self = StObject.set(x, "maxSubscriptionBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxSubscriptionBitrateUndefined: Self = StObject.set(x, "maxSubscriptionBitrate", js.undefined)
    
    @scala.inline
    def setMaxTracks(value: Double): Self = StObject.set(x, "maxTracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTracksUndefined: Self = StObject.set(x, "maxTracks", js.undefined)
    
    @scala.inline
    def setMode(value: BandwidthProfileMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setRenderDimensions(value: VideoRenderDimensions): Self = StObject.set(x, "renderDimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRenderDimensionsUndefined: Self = StObject.set(x, "renderDimensions", js.undefined)
    
    @scala.inline
    def setTrackSwitchOffMode(value: TrackSwitchOffMode): Self = StObject.set(x, "trackSwitchOffMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrackSwitchOffModeUndefined: Self = StObject.set(x, "trackSwitchOffMode", js.undefined)
  }
}
