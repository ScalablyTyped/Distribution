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

object RTCConfiguration {
  @scala.inline
  def apply(
    bundlePolicy: stdLib.RTCBundlePolicy = null,
    certificates: js.Array[RTCCertificate] = null,
    iceCandidatePoolSize: scala.Int | scala.Double = null,
    iceServers: js.Array[RTCIceServer] = null,
    iceTransportPolicy: stdLib.RTCIceTransportPolicy = null,
    peerIdentity: java.lang.String = null,
    rtcpMuxPolicy: stdLib.RTCRtcpMuxPolicy = null
  ): RTCConfiguration = {
    val __obj = js.Dynamic.literal()
    if (bundlePolicy != null) __obj.updateDynamic("bundlePolicy")(bundlePolicy)
    if (certificates != null) __obj.updateDynamic("certificates")(certificates)
    if (iceCandidatePoolSize != null) __obj.updateDynamic("iceCandidatePoolSize")(iceCandidatePoolSize.asInstanceOf[js.Any])
    if (iceServers != null) __obj.updateDynamic("iceServers")(iceServers)
    if (iceTransportPolicy != null) __obj.updateDynamic("iceTransportPolicy")(iceTransportPolicy)
    if (peerIdentity != null) __obj.updateDynamic("peerIdentity")(peerIdentity)
    if (rtcpMuxPolicy != null) __obj.updateDynamic("rtcpMuxPolicy")(rtcpMuxPolicy)
    __obj.asInstanceOf[RTCConfiguration]
  }
}

