package typings.twilioVideo.tsdefTypesMod

import typings.std.Event
import typings.std.EventListener
import typings.std.MediaStreamTrack
import typings.std.RTCIceServer
import typings.std.RTCIceTransportPolicy
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConnectOptions extends StObject {
  
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions | CreateLocalAudioTrackOptions] = js.undefined
  
  var automaticSubscription: js.UndefOr[Boolean] = js.undefined
  
  var bandwidthProfile: js.UndefOr[BandwidthProfileOptions] = js.undefined
  
  var dominantSpeaker: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated use enableDscp
    */
  var dscpTagging: js.UndefOr[Boolean] = js.undefined
  
  var enableDscp: js.UndefOr[Boolean] = js.undefined
  
  var eventListener: js.UndefOr[EventListener] = js.undefined
  
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined
  
  var insights: js.UndefOr[Boolean] = js.undefined
  
  /**
    * @deprecated use Video.Logger.
    */
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  
  /**
    * @deprecated use Video.Logger
    */
  var loggerName: js.UndefOr[String] = js.undefined
  
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.undefined
  
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var networkQuality: js.UndefOr[Boolean | NetworkQualityConfiguration] = js.undefined
  
  var notifyWarnings: js.UndefOr[js.Array[NotifyWarning]] = js.undefined
  
  var preferredAudioCodecs: js.UndefOr[js.Array[AudioCodec | AudioCodecSettings | OpusCodecSettings]] = js.undefined
  
  var preferredVideoCodecs: js.UndefOr[
    (js.Array[VideoCodec | VideoCodecSettings | VP8CodecSettings]) | VideoEncodingMode
  ] = js.undefined
  
  var region: js.UndefOr[String] = js.undefined
  
  var tracks: js.UndefOr[js.Array[LocalTrack | MediaStreamTrack]] = js.undefined
  
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
}
object ConnectOptions {
  
  inline def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  extension [Self <: ConnectOptions](x: Self) {
    
    inline def setAudio(value: Boolean | CreateLocalTrackOptions | CreateLocalAudioTrackOptions): Self = StObject.set(x, "audio", value.asInstanceOf[js.Any])
    
    inline def setAudioUndefined: Self = StObject.set(x, "audio", js.undefined)
    
    inline def setAutomaticSubscription(value: Boolean): Self = StObject.set(x, "automaticSubscription", value.asInstanceOf[js.Any])
    
    inline def setAutomaticSubscriptionUndefined: Self = StObject.set(x, "automaticSubscription", js.undefined)
    
    inline def setBandwidthProfile(value: BandwidthProfileOptions): Self = StObject.set(x, "bandwidthProfile", value.asInstanceOf[js.Any])
    
    inline def setBandwidthProfileUndefined: Self = StObject.set(x, "bandwidthProfile", js.undefined)
    
    inline def setDominantSpeaker(value: Boolean): Self = StObject.set(x, "dominantSpeaker", value.asInstanceOf[js.Any])
    
    inline def setDominantSpeakerUndefined: Self = StObject.set(x, "dominantSpeaker", js.undefined)
    
    inline def setDscpTagging(value: Boolean): Self = StObject.set(x, "dscpTagging", value.asInstanceOf[js.Any])
    
    inline def setDscpTaggingUndefined: Self = StObject.set(x, "dscpTagging", js.undefined)
    
    inline def setEnableDscp(value: Boolean): Self = StObject.set(x, "enableDscp", value.asInstanceOf[js.Any])
    
    inline def setEnableDscpUndefined: Self = StObject.set(x, "enableDscp", js.undefined)
    
    inline def setEventListener(value: /* evt */ Event => Unit): Self = StObject.set(x, "eventListener", js.Any.fromFunction1(value))
    
    inline def setEventListenerUndefined: Self = StObject.set(x, "eventListener", js.undefined)
    
    inline def setIceServers(value: js.Array[RTCIceServer]): Self = StObject.set(x, "iceServers", value.asInstanceOf[js.Any])
    
    inline def setIceServersUndefined: Self = StObject.set(x, "iceServers", js.undefined)
    
    inline def setIceServersVarargs(value: RTCIceServer*): Self = StObject.set(x, "iceServers", js.Array(value*))
    
    inline def setIceTransportPolicy(value: RTCIceTransportPolicy): Self = StObject.set(x, "iceTransportPolicy", value.asInstanceOf[js.Any])
    
    inline def setIceTransportPolicyUndefined: Self = StObject.set(x, "iceTransportPolicy", js.undefined)
    
    inline def setInsights(value: Boolean): Self = StObject.set(x, "insights", value.asInstanceOf[js.Any])
    
    inline def setInsightsUndefined: Self = StObject.set(x, "insights", js.undefined)
    
    inline def setLogLevel(value: LogLevel | LogLevels): Self = StObject.set(x, "logLevel", value.asInstanceOf[js.Any])
    
    inline def setLogLevelUndefined: Self = StObject.set(x, "logLevel", js.undefined)
    
    inline def setLoggerName(value: String): Self = StObject.set(x, "loggerName", value.asInstanceOf[js.Any])
    
    inline def setLoggerNameUndefined: Self = StObject.set(x, "loggerName", js.undefined)
    
    inline def setMaxAudioBitrate(value: Double): Self = StObject.set(x, "maxAudioBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxAudioBitrateNull: Self = StObject.set(x, "maxAudioBitrate", null)
    
    inline def setMaxAudioBitrateUndefined: Self = StObject.set(x, "maxAudioBitrate", js.undefined)
    
    inline def setMaxVideoBitrate(value: Double): Self = StObject.set(x, "maxVideoBitrate", value.asInstanceOf[js.Any])
    
    inline def setMaxVideoBitrateNull: Self = StObject.set(x, "maxVideoBitrate", null)
    
    inline def setMaxVideoBitrateUndefined: Self = StObject.set(x, "maxVideoBitrate", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setNetworkQuality(value: Boolean | NetworkQualityConfiguration): Self = StObject.set(x, "networkQuality", value.asInstanceOf[js.Any])
    
    inline def setNetworkQualityUndefined: Self = StObject.set(x, "networkQuality", js.undefined)
    
    inline def setNotifyWarnings(value: js.Array[NotifyWarning]): Self = StObject.set(x, "notifyWarnings", value.asInstanceOf[js.Any])
    
    inline def setNotifyWarningsUndefined: Self = StObject.set(x, "notifyWarnings", js.undefined)
    
    inline def setNotifyWarningsVarargs(value: NotifyWarning*): Self = StObject.set(x, "notifyWarnings", js.Array(value*))
    
    inline def setPreferredAudioCodecs(value: js.Array[AudioCodec | AudioCodecSettings | OpusCodecSettings]): Self = StObject.set(x, "preferredAudioCodecs", value.asInstanceOf[js.Any])
    
    inline def setPreferredAudioCodecsUndefined: Self = StObject.set(x, "preferredAudioCodecs", js.undefined)
    
    inline def setPreferredAudioCodecsVarargs(value: (AudioCodec | AudioCodecSettings | OpusCodecSettings)*): Self = StObject.set(x, "preferredAudioCodecs", js.Array(value*))
    
    inline def setPreferredVideoCodecs(value: (js.Array[VideoCodec | VideoCodecSettings | VP8CodecSettings]) | VideoEncodingMode): Self = StObject.set(x, "preferredVideoCodecs", value.asInstanceOf[js.Any])
    
    inline def setPreferredVideoCodecsUndefined: Self = StObject.set(x, "preferredVideoCodecs", js.undefined)
    
    inline def setPreferredVideoCodecsVarargs(value: (VideoCodec | VideoCodecSettings | VP8CodecSettings)*): Self = StObject.set(x, "preferredVideoCodecs", js.Array(value*))
    
    inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setTracks(value: js.Array[LocalTrack | MediaStreamTrack]): Self = StObject.set(x, "tracks", value.asInstanceOf[js.Any])
    
    inline def setTracksUndefined: Self = StObject.set(x, "tracks", js.undefined)
    
    inline def setTracksVarargs(value: (LocalTrack | MediaStreamTrack)*): Self = StObject.set(x, "tracks", js.Array(value*))
    
    inline def setVideo(value: Boolean | CreateLocalTrackOptions): Self = StObject.set(x, "video", value.asInstanceOf[js.Any])
    
    inline def setVideoUndefined: Self = StObject.set(x, "video", js.undefined)
  }
}
