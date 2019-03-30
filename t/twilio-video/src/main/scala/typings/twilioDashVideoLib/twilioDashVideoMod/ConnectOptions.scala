package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var abortOnIceServersTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var audio: js.UndefOr[scala.Boolean | CreateLocalTrackOptions] = js.undefined
  var dominantSpeaker: js.UndefOr[scala.Boolean] = js.undefined
  var iceServers: js.UndefOr[js.Array[stdLib.RTCIceServer]] = js.undefined
  var iceServersTimeout: js.UndefOr[scala.Double] = js.undefined
  var iceTransportPolicy: js.UndefOr[stdLib.RTCIceTransportPolicy] = js.undefined
  var insights: js.UndefOr[scala.Boolean] = js.undefined
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var maxAudioBitRate: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxVideoBitRate: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var networkQuality: js.UndefOr[scala.Boolean] = js.undefined
  var preferredAudioCodecs: js.UndefOr[js.Array[AudioCodec]] = js.undefined
  var preferredVideoCodecs: js.UndefOr[js.Array[VideoCodec] | js.Array[VideoCodecSettings]] = js.undefined
  var tracks: js.UndefOr[js.Array[LocalTrack] | js.Array[stdLib.MediaStreamTrack]] = js.undefined
  var video: js.UndefOr[scala.Boolean | CreateLocalTrackOptions] = js.undefined
}

object ConnectOptions {
  @scala.inline
  def apply(
    abortOnIceServersTimeout: js.UndefOr[scala.Boolean] = js.undefined,
    audio: scala.Boolean | CreateLocalTrackOptions = null,
    dominantSpeaker: js.UndefOr[scala.Boolean] = js.undefined,
    iceServers: js.Array[stdLib.RTCIceServer] = null,
    iceServersTimeout: scala.Int | scala.Double = null,
    iceTransportPolicy: stdLib.RTCIceTransportPolicy = null,
    insights: js.UndefOr[scala.Boolean] = js.undefined,
    logLevel: LogLevel | LogLevels = null,
    maxAudioBitRate: scala.Int | scala.Double = null,
    maxVideoBitRate: scala.Int | scala.Double = null,
    name: java.lang.String = null,
    networkQuality: js.UndefOr[scala.Boolean] = js.undefined,
    preferredAudioCodecs: js.Array[AudioCodec] = null,
    preferredVideoCodecs: js.Array[VideoCodec] | js.Array[VideoCodecSettings] = null,
    tracks: js.Array[LocalTrack] | js.Array[stdLib.MediaStreamTrack] = null,
    video: scala.Boolean | CreateLocalTrackOptions = null
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
    if (!js.isUndefined(networkQuality)) __obj.updateDynamic("networkQuality")(networkQuality)
    if (preferredAudioCodecs != null) __obj.updateDynamic("preferredAudioCodecs")(preferredAudioCodecs)
    if (preferredVideoCodecs != null) __obj.updateDynamic("preferredVideoCodecs")(preferredVideoCodecs.asInstanceOf[js.Any])
    if (tracks != null) __obj.updateDynamic("tracks")(tracks.asInstanceOf[js.Any])
    if (video != null) __obj.updateDynamic("video")(video.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectOptions]
  }
}

