package typings.twilioDashVideo.twilioDashVideoMod

import typings.std.MediaStreamTrack
import typings.std.RTCIceServer
import typings.std.RTCIceTransportPolicy
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var abortOnIceServersTimeout: js.UndefOr[Boolean] = js.undefined
  var audio: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
  var dominantSpeaker: js.UndefOr[Boolean] = js.undefined
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  var iceServersTimeout: js.UndefOr[Double] = js.undefined
  var iceTransportPolicy: js.UndefOr[RTCIceTransportPolicy] = js.undefined
  var insights: js.UndefOr[Boolean] = js.undefined
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var maxAudioBitRate: js.UndefOr[Double | Null] = js.undefined
  var maxVideoBitRate: js.UndefOr[Double | Null] = js.undefined
  var name: js.UndefOr[String | Null] = js.undefined
  var networkQuality: js.UndefOr[Boolean | NetworkQualityConfiguration] = js.undefined
  var preferredAudioCodecs: js.UndefOr[js.Array[AudioCodec]] = js.undefined
  var preferredVideoCodecs: js.UndefOr[js.Array[VideoCodec | VideoCodecSettings]] = js.undefined
  var tracks: js.UndefOr[js.Array[LocalTrack | MediaStreamTrack]] = js.undefined
  var video: js.UndefOr[Boolean | CreateLocalTrackOptions] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    abortOnIceServersTimeout: js.UndefOr[Boolean] = js.undefined,
    audio: Boolean | CreateLocalTrackOptions = null,
    dominantSpeaker: js.UndefOr[Boolean] = js.undefined,
    iceServers: js.Array[RTCIceServer] = null,
    iceServersTimeout: Int | Double = null,
    iceTransportPolicy: RTCIceTransportPolicy = null,
    insights: js.UndefOr[Boolean] = js.undefined,
    logLevel: LogLevel | LogLevels = null,
    maxAudioBitRate: Int | Double = null,
    maxVideoBitRate: Int | Double = null,
    name: String = null,
    networkQuality: Boolean | NetworkQualityConfiguration = null,
    preferredAudioCodecs: js.Array[AudioCodec] = null,
    preferredVideoCodecs: js.Array[VideoCodec | VideoCodecSettings] = null,
    tracks: js.Array[LocalTrack | MediaStreamTrack] = null,
    video: Boolean | CreateLocalTrackOptions = null
  ): ConnectOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(abortOnIceServersTimeout)) __obj.updateDynamic("abortOnIceServersTimeout")(abortOnIceServersTimeout)
    if (audio != null) __obj.updateDynamic("audio")(audio.asInstanceOf[js.Any])
    if (!js.isUndefined(dominantSpeaker)) __obj.updateDynamic("dominantSpeaker")(dominantSpeaker)
    if (iceServers != null) __obj.updateDynamic("iceServers")(iceServers)
    if (iceServersTimeout != null) __obj.updateDynamic("iceServersTimeout")(iceServersTimeout.asInstanceOf[js.Any])
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy)
    if (!js.isUndefined(insights)) __obj.updateDynamic("insights")(insights)
    if (logLevel != null) __obj.updateDynamic("logLevel")(logLevel.asInstanceOf[js.Any])
    if (maxAudioBitRate != null) __obj.updateDynamic("maxAudioBitRate")(maxAudioBitRate.asInstanceOf[js.Any])
    if (maxVideoBitRate != null) __obj.updateDynamic("maxVideoBitRate")(maxVideoBitRate.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (networkQuality != null) __obj.updateDynamic("networkQuality")(networkQuality.asInstanceOf[js.Any])
    if (preferredAudioCodecs != null) __obj.updateDynamic("preferredAudioCodecs")(preferredAudioCodecs)
    if (preferredVideoCodecs != null) __obj.updateDynamic("preferredVideoCodecs")(preferredVideoCodecs)
    if (tracks != null) __obj.updateDynamic("tracks")(tracks)
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

