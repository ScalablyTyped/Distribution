package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webrtc {
  import typings.std.Event

  // https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
  type DataChannelEventHandler[E /* <: Event */] = (js.ThisFunction1[/* this */ RTCDataChannel, /* ev */ E, js.Any]) | Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
  type DtlsTransportEventHandler = (js.ThisFunction1[/* this */ RTCDtlsTransport, /* ev */ Event, js.Any]) | Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
  type IceTransportEventHandler = (js.ThisFunction1[/* this */ RTCIceTransport, /* ev */ Event, js.Any]) | Null
  type MediaStreamTrackEvent = Event
  type NavigatorGetUserMedia = js.Function3[
    /* constraints */ MediaStreamConstraints, 
    /* successCallback */ js.Function1[/* stream */ MediaStream, Unit], 
    /* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit], 
    Unit
  ]
  // https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
  type PeerConnectionEventHandler[E /* <: Event */] = (js.ThisFunction1[/* this */ RTCPeerConnection, /* ev */ E, js.Any]) | Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcansweroptions
  type RTCAnswerOptions = RTCOfferAnswerOptions
  // Compatibility for older definitions on DefinitelyTyped.
  type RTCPeerConnectionConfig = RTCConfiguration
}
