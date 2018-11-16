package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webrtcLib {
  type EventHandler = js.Function1[/* event */ stdLib.Event, scala.Unit]
  type MediaStreamTrackEvent = stdLib.Event
  type NavigatorGetUserMedia = js.Function3[
    /* constraints */ MediaStreamConstraints, 
    /* successCallback */ js.Function1[/* stream */ MediaStream, scala.Unit], 
    /* errorCallback */ js.Function1[/* error */ MediaStreamError, scala.Unit], 
    scala.Unit
  ]
  // https://www.w3.org/TR/webrtc/#idl-def-rtcansweroptions
  type RTCAnswerOptions = RTCOfferAnswerOptions
  // https://www.w3.org/TR/websockets/#dom-websocket-binarytype
  type RTCBinaryType = webrtcLib.webrtcLibStrings.blob | webrtcLib.webrtcLibStrings.arraybuffer
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannelstate
  type RTCDataChannelState = webrtcLib.webrtcLibStrings.connecting | webrtcLib.webrtcLibStrings.open | webrtcLib.webrtcLibStrings.closing | webrtcLib.webrtcLibStrings.closed
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdtxstatus
  type RTCDtxStatus = webrtcLib.webrtcLibStrings.disabled | webrtcLib.webrtcLibStrings.enabled
  // https://www.w3.org/TR/webrtc/#idl-def-rtcicecredentialtype
  type RTCIceCredentialType = webrtcLib.webrtcLibStrings.password | webrtcLib.webrtcLibStrings.token
  // Compatibility for older definitions on DefinitelyTyped.
  type RTCPeerConnectionConfig = RTCConfiguration
  // https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnectionstate
  type RTCPeerConnectionState = webrtcLib.webrtcLibStrings.`new` | webrtcLib.webrtcLibStrings.connecting | webrtcLib.webrtcLibStrings.connected | webrtcLib.webrtcLibStrings.disconnected | webrtcLib.webrtcLibStrings.failed | webrtcLib.webrtcLibStrings.closed
  // https://www.w3.org/TR/webrtc/#idl-def-rtcprioritytype
  type RTCPriorityType = webrtcLib.webrtcLibStrings.`very-low` | webrtcLib.webrtcLibStrings.low | webrtcLib.webrtcLibStrings.medium | webrtcLib.webrtcLibStrings.high
  // https://www.w3.org/TR/webrtc/#idl-def-rtcrtcpmuxpolicy
  type RTCRtcpMuxPolicy = webrtcLib.webrtcLibStrings.negotiate | webrtcLib.webrtcLibStrings.require
  // https://www.w3.org/TR/webrtc/#idl-def-rtcrtptransceiverdirection
  type RTCRtpTransceiverDirection = webrtcLib.webrtcLibStrings.sendrecv | webrtcLib.webrtcLibStrings.sendonly | webrtcLib.webrtcLibStrings.recvonly | webrtcLib.webrtcLibStrings.inactive
}
