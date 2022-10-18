package typings.twilioVideo.tsdefTypesMod

import typings.twilioVideo.tsdefTrackMod.Track.Priority
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VideoBandwidthProfileOptions extends StObject {
  
  var clientTrackSwitchOffControl: js.UndefOr[ClientTrackSwitchOffControl] = js.undefined
  
  var contentPreferencesMode: js.UndefOr[VideoContentPreferencesMode] = js.undefined
  
  var dominantSpeakerPriority: js.UndefOr[Priority] = js.undefined
  
  var maxSubscriptionBitrate: js.UndefOr[Double] = js.undefined
  
  /**
    * @deprecated use clientTrackSwitchOffControl instead
    */
  var maxTracks: js.UndefOr[Double] = js.undefined
  
  var mode: js.UndefOr[BandwidthProfileMode] = js.undefined
  
  /**
    * @deprecated use contentPreferencesMode instead
    */
  var renderDimensions: js.UndefOr[VideoRenderDimensions] = js.undefined
  
  var trackSwitchOffMode: js.UndefOr[TrackSwitchOffMode] = js.undefined
}
object VideoBandwidthProfileOptions {
  
  inline def apply(): VideoBandwidthProfileOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoBandwidthProfileOptions]
  }
  
  extension [Self <: VideoBandwidthProfileOptions](x: Self) {
    
    inline def setClientTrackSwitchOffControl(value: ClientTrackSwitchOffControl): Self = StObject.set(x, "clientTrackSwitchOffControl", value.asInstanceOf[js.Any])
    
    inline def setClientTrackSwitchOffControlUndefined: Self = StObject.set(x, "clientTrackSwitchOffControl", js.undefined)
    
    inline def setContentPreferencesMode(value: VideoContentPreferencesMode): Self = StObject.set(x, "contentPreferencesMode", value.asInstanceOf[js.Any])
    
    inline def setContentPreferencesModeUndefined: Self = StObject.set(x, "contentPreferencesMode", js.undefined)
    
    inline def setDominantSpeakerPriority(value: Priority): Self = StObject.set(x, "dominantSpeakerPriority", value.asInstanceOf[js.Any])
    
    inline def setDominantSpeakerPriorityUndefined: Self = StObject.set(x, "dominantSpeakerPriority", js.undefined)
    
    inline def setMaxSubscriptionBitrate(value: Double): Self = StObject.set(x, "maxSubscriptionBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxSubscriptionBitrateUndefined: Self = StObject.set(x, "maxSubscriptionBitrate", js.undefined)
    
    inline def setMaxTracks(value: Double): Self = StObject.set(x, "maxTracks", value.asInstanceOf[js.Any])
    
    inline def setMaxTracksUndefined: Self = StObject.set(x, "maxTracks", js.undefined)
    
    inline def setMode(value: BandwidthProfileMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setRenderDimensions(value: VideoRenderDimensions): Self = StObject.set(x, "renderDimensions", value.asInstanceOf[js.Any])
    
    inline def setRenderDimensionsUndefined: Self = StObject.set(x, "renderDimensions", js.undefined)
    
    inline def setTrackSwitchOffMode(value: TrackSwitchOffMode): Self = StObject.set(x, "trackSwitchOffMode", value.asInstanceOf[js.Any])
    
    inline def setTrackSwitchOffModeUndefined: Self = StObject.set(x, "trackSwitchOffMode", js.undefined)
  }
}
