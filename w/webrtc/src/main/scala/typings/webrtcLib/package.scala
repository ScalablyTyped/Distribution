package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webrtcLib {
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
  type DataChannelEventHandler[E /* <: stdLib.Event */] = (js.ThisFunction1[/* this */ RTCDataChannel, /* ev */ E, js.Any]) | scala.Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
  type DtlsTransportEventHandler = (js.ThisFunction1[/* this */ RTCDtlsTransport, /* ev */ stdLib.Event, js.Any]) | scala.Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
  type IceTransportEventHandler = (js.ThisFunction1[/* this */ RTCIceTransport, /* ev */ stdLib.Event, js.Any]) | scala.Null
  type MediaStreamTrackEvent = stdLib.Event
  type NavigatorGetUserMedia = js.Function3[
    /* constraints */ MediaStreamConstraints, 
    /* successCallback */ js.Function1[/* stream */ MediaStream, scala.Unit], 
    /* errorCallback */ js.Function1[/* error */ MediaStreamError, scala.Unit], 
    scala.Unit
  ]
  // https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
  type PeerConnectionEventHandler[E /* <: stdLib.Event */] = (js.ThisFunction1[/* this */ RTCPeerConnection, /* ev */ E, js.Any]) | scala.Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcansweroptions
  type RTCAnswerOptions = RTCOfferAnswerOptions
  // Compatibility for older definitions on DefinitelyTyped.
  type RTCPeerConnectionConfig = RTCConfiguration
}
