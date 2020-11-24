package typings.twilioVideo.mod

import typings.std.MediaStreamTrack
import typings.std.RTCIceServer
import typings.std.RTCIceTransportPolicy
import typings.twilioVideo.twilioVideoStrings.au1
import typings.twilioVideo.twilioVideoStrings.br1
import typings.twilioVideo.twilioVideoStrings.de1
import typings.twilioVideo.twilioVideoStrings.gll
import typings.twilioVideo.twilioVideoStrings.ie1
import typings.twilioVideo.twilioVideoStrings.jp1
import typings.twilioVideo.twilioVideoStrings.sg1
import typings.twilioVideo.twilioVideoStrings.us1
import typings.twilioVideo.twilioVideoStrings.us2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectOptions extends js.Object {
  
  var abortOnIceServersTimeout: js.UndefOr[Boolean] = js.native
  
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.native
  
  var automaticSubscription: js.UndefOr[Boolean] = js.native
  
  var bandwidthProfile: js.UndefOr[BandwidthProfileOptions] = js.native
  
  var dominantSpeaker: js.UndefOr[Boolean] = js.native
  
  var dscpTagging: js.UndefOr[Boolean] = js.native
  
  var enableDscp: js.UndefOr[Boolean] = js.native
  
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.native
  
  var iceServersTimeout: js.UndefOr[Double] = js.native
  
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.native
  
  var insights: js.UndefOr[Boolean] = js.native
  
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.native
  
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.native
  
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var networkQuality: js.UndefOr[Boolean | NetworkQualityConfiguration] = js.native
  
  var preferredAudioCodecs: js.UndefOr[js.Array[AudioCodec]] = js.native
  
  var preferredVideoCodecs: js.UndefOr[js.Array[VideoCodec | VideoCodecSettings | VP8CodecSettings]] = js.native
  
  var region: js.UndefOr[au1 | br1 | ie1 | de1 | jp1 | sg1 | us1 | us2 | gll] = js.native
  
  var tracks: js.UndefOr[js.Array[LocalTrack | MediaStreamTrack]] = js.native
  
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.native
}
object ConnectOptions {
  
  @scala.inline
  def apply(): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectOptions]
  }
  
  @scala.inline
  implicit class ConnectOptionsOps[Self <: ConnectOptions] (val x: Self) extends AnyVal {
    
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
    def setAbortOnIceServersTimeout(value: Boolean): Self = this.set("abortOnIceServersTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbortOnIceServersTimeout: Self = this.set("abortOnIceServersTimeout", js.undefined)
    
    @scala.inline
    def setAudio(value: Boolean | CreateLocalTrackOptions): Self = this.set("audio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAudio: Self = this.set("audio", js.undefined)
    
    @scala.inline
    def setAutomaticSubscription(value: Boolean): Self = this.set("automaticSubscription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutomaticSubscription: Self = this.set("automaticSubscription", js.undefined)
    
    @scala.inline
    def setBandwidthProfile(value: BandwidthProfileOptions): Self = this.set("bandwidthProfile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBandwidthProfile: Self = this.set("bandwidthProfile", js.undefined)
    
    @scala.inline
    def setDominantSpeaker(value: Boolean): Self = this.set("dominantSpeaker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDominantSpeaker: Self = this.set("dominantSpeaker", js.undefined)
    
    @scala.inline
    def setDscpTagging(value: Boolean): Self = this.set("dscpTagging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDscpTagging: Self = this.set("dscpTagging", js.undefined)
    
    @scala.inline
    def setEnableDscp(value: Boolean): Self = this.set("enableDscp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableDscp: Self = this.set("enableDscp", js.undefined)
    
    @scala.inline
    def setIceServersVarargs(value: RTCIceServer*): Self = this.set("iceServers", js.Array(value :_*))
    
    @scala.inline
    def setIceServers(value: js.Array[RTCIceServer]): Self = this.set("iceServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceServers: Self = this.set("iceServers", js.undefined)
    
    @scala.inline
    def setIceServersTimeout(value: Double): Self = this.set("iceServersTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceServersTimeout: Self = this.set("iceServersTimeout", js.undefined)
    
    @scala.inline
    def setIceTransportPolicy(value: RTCIceTransportPolicy): Self = this.set("iceTransportPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIceTransportPolicy: Self = this.set("iceTransportPolicy", js.undefined)
    
    @scala.inline
    def setInsights(value: Boolean): Self = this.set("insights", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInsights: Self = this.set("insights", js.undefined)
    
    @scala.inline
    def setLogLevel(value: LogLevel | LogLevels): Self = this.set("logLevel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogLevel: Self = this.set("logLevel", js.undefined)
    
    @scala.inline
    def setMaxAudioBitrate(value: Double): Self = this.set("maxAudioBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxAudioBitrate: Self = this.set("maxAudioBitrate", js.undefined)
    
    @scala.inline
    def setMaxAudioBitrateNull: Self = this.set("maxAudioBitrate", null)
    
    @scala.inline
    def setMaxVideoBitrate(value: Double): Self = this.set("maxVideoBitrate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxVideoBitrate: Self = this.set("maxVideoBitrate", js.undefined)
    
    @scala.inline
    def setMaxVideoBitrateNull: Self = this.set("maxVideoBitrate", null)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setNetworkQuality(value: Boolean | NetworkQualityConfiguration): Self = this.set("networkQuality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNetworkQuality: Self = this.set("networkQuality", js.undefined)
    
    @scala.inline
    def setPreferredAudioCodecsVarargs(value: AudioCodec*): Self = this.set("preferredAudioCodecs", js.Array(value :_*))
    
    @scala.inline
    def setPreferredAudioCodecs(value: js.Array[AudioCodec]): Self = this.set("preferredAudioCodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredAudioCodecs: Self = this.set("preferredAudioCodecs", js.undefined)
    
    @scala.inline
    def setPreferredVideoCodecsVarargs(value: (VideoCodec | VideoCodecSettings | VP8CodecSettings)*): Self = this.set("preferredVideoCodecs", js.Array(value :_*))
    
    @scala.inline
    def setPreferredVideoCodecs(value: js.Array[VideoCodec | VideoCodecSettings | VP8CodecSettings]): Self = this.set("preferredVideoCodecs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreferredVideoCodecs: Self = this.set("preferredVideoCodecs", js.undefined)
    
    @scala.inline
    def setRegion(value: au1 | br1 | ie1 | de1 | jp1 | sg1 | us1 | us2 | gll): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRegion: Self = this.set("region", js.undefined)
    
    @scala.inline
    def setTracksVarargs(value: (LocalTrack | MediaStreamTrack)*): Self = this.set("tracks", js.Array(value :_*))
    
    @scala.inline
    def setTracks(value: js.Array[LocalTrack | MediaStreamTrack]): Self = this.set("tracks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTracks: Self = this.set("tracks", js.undefined)
    
    @scala.inline
    def setVideo(value: Boolean | CreateLocalTrackOptions): Self = this.set("video", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVideo: Self = this.set("video", js.undefined)
  }
}
