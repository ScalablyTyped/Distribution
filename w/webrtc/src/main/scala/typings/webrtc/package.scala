package typings.webrtc

import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


// https://www.w3.org/TR/webrtc/#idl-def-rtcdatachannel
type DataChannelEventHandler[E /* <: Event */] = (js.ThisFunction1[/* this */ RTCDataChannel, /* ev */ E, Any]) | Null

// https://www.w3.org/TR/webrtc/#idl-def-rtcdtlstransport
type DtlsTransportEventHandler[E /* <: Event */] = (js.ThisFunction1[/* this */ RTCDtlsTransport, /* ev */ E, Any]) | Null

// https://www.w3.org/TR/webrtc/#idl-def-rtcicetransport
type IceTransportEventHandler = (js.ThisFunction1[/* this */ RTCIceTransport, /* ev */ Event, Any]) | Null

type NavigatorGetUserMedia = js.Function3[
/* constraints */ MediaStreamConstraints, 
/* successCallback */ js.Function1[/* stream */ MediaStream, Unit], 
/* errorCallback */ js.Function1[/* error */ MediaStreamError, Unit], 
Unit]

// https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
type PeerConnectionEventHandler[E /* <: Event */] = (js.ThisFunction1[/* this */ RTCPeerConnection, /* ev */ E, Any]) | Null

// Compatibility for older definitions on DefinitelyTyped.
type RTCPeerConnectionConfig = RTCConfiguration
