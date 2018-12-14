package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcconfiguration

trait RTCConfiguration extends js.Object {
   // default = 'all'
  var bundlePolicy: js.UndefOr[stdLib.RTCBundlePolicy] = js.undefined
   // default = null
  var certificates: js.UndefOr[js.Array[RTCCertificate]] = js.undefined
  var iceCandidatePoolSize: js.UndefOr[scala.Double] = js.undefined
  var iceServers: js.UndefOr[js.Array[RTCIceServer]] = js.undefined
  var iceTransportPolicy: js.UndefOr[stdLib.RTCIceTransportPolicy] = js.undefined
   // default = 'require'
  var peerIdentity: js.UndefOr[java.lang.String] = js.undefined
   // default = 'balanced'
  var rtcpMuxPolicy: js.UndefOr[stdLib.RTCRtcpMuxPolicy] = js.undefined
}

