package typings
package twilioDashVideoLib.twilioDashVideoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectOptions extends js.Object {
  var abortOnIceServersTimeout: js.UndefOr[scala.Boolean] = js.undefined
  var audio: js.UndefOr[scala.Boolean | CreateLocalTrackOptions] = js.undefined
  var iceServers: js.UndefOr[js.Array[stdLib.RTCIceServer]] = js.undefined
  var iceServersTimeout: js.UndefOr[scala.Double] = js.undefined
  var iceTransportPolicy: js.UndefOr[stdLib.RTCIceTransportPolicy] = js.undefined
  var insights: js.UndefOr[scala.Boolean] = js.undefined
  var logLevel: js.UndefOr[LogLevel | LogLevels] = js.undefined
  var maxAudioBitRate: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxVideoBitRate: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var name: js.UndefOr[java.lang.String | scala.Null] = js.undefined
  var preferredAudioCodecs: js.UndefOr[js.Array[AudioCodec]] = js.undefined
  var preferredVideoCodecs: js.UndefOr[js.Array[VideoCodec] | js.Array[VideoCodecSettings]] = js.undefined
  var tracks: js.UndefOr[js.Array[LocalTrack] | js.Array[stdLib.MediaStreamTrack]] = js.undefined
  var video: js.UndefOr[scala.Boolean | CreateLocalTrackOptions] = js.undefined
}

