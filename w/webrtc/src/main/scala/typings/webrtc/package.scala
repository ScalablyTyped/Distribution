package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object webrtc {
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
  type DataChannelEventHandler[E /* <: typings.std.Event */] = (js.ThisFunction1[/* this */ typings.webrtc.RTCDataChannel, /* ev */ E, js.Any]) | scala.Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
  type DtlsTransportEventHandler = (js.ThisFunction1[/* this */ typings.webrtc.RTCDtlsTransport, /* ev */ typings.std.Event, js.Any]) | scala.Null
  // https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
  type IceTransportEventHandler = (js.ThisFunction1[/* this */ typings.webrtc.RTCIceTransport, /* ev */ typings.std.Event, js.Any]) | scala.Null
  type NavigatorGetUserMedia = js.Function3[
    /* constraints */ typings.webrtc.MediaStreamConstraints, 
    /* successCallback */ js.Function1[/* stream */ typings.webrtc.MediaStream, scala.Unit], 
    /* errorCallback */ js.Function1[/* error */ typings.std.MediaStreamError, scala.Unit], 
    scala.Unit
  ]
  // https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
  type PeerConnectionEventHandler[E /* <: typings.std.Event */] = (js.ThisFunction1[/* this */ typings.webrtc.RTCPeerConnection, /* ev */ E, js.Any]) | scala.Null
  // Compatibility for older definitions on DefinitelyTyped.
  type RTCPeerConnectionConfig = typings.webrtc.RTCConfiguration
}
