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
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var abortOnIceServersTimeout: js.UndefOr[Boolean] = js.undefined
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
  var automaticSubscription: js.UndefOr[Boolean] = js.undefined
  var bandwidthProfile: js.UndefOr[BandwidthProfileOptions] = js.undefined
  var dominantSpeaker: js.UndefOr[Boolean] = js.undefined
  var dscpTagging: js.UndefOr[Boolean] = js.undefined
  var enableDscp: js.UndefOr[Boolean] = js.undefined
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  var iceServersTimeout: js.UndefOr[Double] = js.undefined
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined
  var insights: js.UndefOr[Boolean] = js.undefined
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var maxAudioBitrate: js.UndefOr[Double | Null] = js.undefined
  var maxVideoBitrate: js.UndefOr[Double | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var networkQuality: js.UndefOr[Boolean | NetworkQualityConfiguration] = js.undefined
  var preferredAudioCodecs: js.UndefOr[js.Array[AudioCodec]] = js.undefined
  var preferredVideoCodecs: js.UndefOr[js.Array[VideoCodec | VideoCodecSettings]] = js.undefined
  var region: js.UndefOr[au1 | br1 | ie1 | de1 | jp1 | sg1 | us1 | us2 | gll] = js.undefined
  var tracks: js.UndefOr[js.Array[LocalTrack | MediaStreamTrack]] = js.undefined
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    abortOnIceServersTimeout: js.UndefOr[Boolean] = js.undefined,
    audio: Boolean | CreateLocalTrackOptions = null,
    automaticSubscription: js.UndefOr[Boolean] = js.undefined,
    bandwidthProfile: BandwidthProfileOptions = null,
    dominantSpeaker: js.UndefOr[Boolean] = js.undefined,
    dscpTagging: js.UndefOr[Boolean] = js.undefined,
    enableDscp: js.UndefOr[Boolean] = js.undefined,
    iceServers: js.Array[RTCIceServer] = null,
    iceServersTimeout: Int | Double = null,
    iceTransportPolicy: RTCIceTransportPolicy = null,
    insights: js.UndefOr[Boolean] = js.undefined,
    logLevel: LogLevel | LogLevels = null,
    maxAudioBitrate: Int | Double = null,
    maxVideoBitrate: Int | Double = null,
    name: String = null,
    networkQuality: Boolean | NetworkQualityConfiguration = null,
    preferredAudioCodecs: js.Array[AudioCodec] = null,
    preferredVideoCodecs: js.Array[VideoCodec | VideoCodecSettings] = null,
    region: au1 | br1 | ie1 | de1 | jp1 | sg1 | us1 | us2 | gll = null,
    tracks: js.Array[LocalTrack | MediaStreamTrack] = null,
    video: Boolean | CreateLocalTrackOptions = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnIceServersTimeout)) __obj.updateDynamic("abortOnIceServersTimeout")(abortOnIceServersTimeout.asInstanceOf[js.Any])
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(automaticSubscription)) __obj.updateDynamic("automaticSubscription")(automaticSubscription.asInstanceOf[js.Any])
    if (bandwidthProfile != null) __obj.updateDynamic("bandwidthProfile")(bandwidthProfile.asInstanceOf[js.Any])
    if (!js.isUndefined(dominantSpeaker)) __obj.updateDynamic("dominantSpeaker")(dominantSpeaker.asInstanceOf[js.Any])
    if (!js.isUndefined(dscpTagging)) __obj.updateDynamic("dscpTagging")(dscpTagging.asInstanceOf[js.Any])
    if (!js.isUndefined(enableDscp)) __obj.updateDynamic("enableDscp")(enableDscp.asInstanceOf[js.Any])
    if (iceServers != null) __obj.updateDynamic("iceServers")(iceServers.asInstanceOf[js.Any])
    if (iceServersTimeout != null) __obj.updateDynamic("iceServersTimeout")(iceServersTimeout.asInstanceOf[js.Any])
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy.asInstanceOf[js.Any])
    if (!js.isUndefined(insights)) __obj.updateDynamic("insights")(insights.asInstanceOf[js.Any])
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (maxAudioBitrate != null) __obj.updateDynamic("maxAudioBitrate")(maxAudioBitrate.asInstanceOf[js.Any])
    if (maxVideoBitrate != null) __obj.updateDynamic("maxVideoBitrate")(maxVideoBitrate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (networkQuality != null) __obj.updateDynamic("networkQuality")(networkQuality.asInstanceOf[js.Any])
    if (preferredAudioCodecs != null) __obj.updateDynamic("preferredAudioCodecs")(preferredAudioCodecs.asInstanceOf[js.Any])
    if (preferredVideoCodecs != null) __obj.updateDynamic("preferredVideoCodecs")(preferredVideoCodecs.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

