package typings
package webrtcLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// https://www.w3.org/TR/webrtc/#idl-def-rtcpeerconnection
@js.native
trait RTCPeerConnection
  extends stdLib.EventTarget {
  val connectionState: RTCPeerConnectionState = js.native
  val currentLocalDescription: stdLib.RTCSessionDescription | scala.Null = js.native
  val currentRemoteDescription: stdLib.RTCSessionDescription | scala.Null = js.native
  val localDescription: stdLib.RTCSessionDescription | scala.Null = js.native
  @JSName("onconnectionstatechange")
  var onconnectionstatechange_Original: EventHandler = js.native
  val pendingLocalDescription: stdLib.RTCSessionDescription | scala.Null = js.native
  val pendingRemoteDescription: stdLib.RTCSessionDescription | scala.Null = js.native
  val remoteDescription: stdLib.RTCSessionDescription | scala.Null = js.native
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-1
  val sctp: RTCSctpTransport | scala.Null = js.native
  val signalingState: stdLib.RTCSignalingState = js.native
  def addIceCandidate(): js.Promise[scala.Unit] = js.native
  def addIceCandidate(candidate: stdLib.RTCIceCandidate): js.Promise[scala.Unit] = js.native
  def addIceCandidate(candidate: stdLib.RTCIceCandidateInit): js.Promise[scala.Unit] = js.native
  def addIceCandidate(
    candidate: stdLib.RTCIceCandidateInit,
    successCallback: js.Function0[scala.Unit],
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
  def addIceCandidate(
    candidate: stdLib.RTCIceCandidate,
    successCallback: js.Function0[scala.Unit],
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
  def addTrack(track: MediaStreamTrack, streams: MediaStream*): RTCRtpSender = js.native
  def addTransceiver(trackOrKind: java.lang.String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: java.lang.String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def close(): scala.Unit = js.native
  def createAnswer(): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCAnswerOptions): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def createAnswer(
    successCallback: stdLib.RTCSessionDescriptionCallback,
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
  def createDataChannel(): RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String): RTCDataChannel = js.native
  def createDataChannel(label: java.lang.String, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  def createDataChannel(label: scala.Null, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  def createOffer(): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[stdLib.RTCSessionDescriptionInit] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#legacy-interface-extensions
  // Deprecated!
  def createOffer(
    successCallback: stdLib.RTCSessionDescriptionCallback,
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#legacy-interface-extensions
  // Deprecated!
  def createOffer(
    successCallback: stdLib.RTCSessionDescriptionCallback,
    failureCallback: stdLib.RTCPeerConnectionErrorCallback,
    options: RTCOfferOptions
  ): js.Promise[scala.Unit] = js.native
  def getConfiguration(): RTCConfiguration = js.native
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions
  def getSenders(): js.Array[RTCRtpSender] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-2
  def getStats(): js.Promise[stdLib.RTCStatsReport] = js.native
  def getStats(
    selector: scala.Null,
    successCallback: stdLib.RTCStatsCallback,
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-2
  def getStats(selector: MediaStreamTrack): js.Promise[stdLib.RTCStatsReport] = js.native
  def getStats(
    selector: MediaStreamTrack,
    successCallback: stdLib.RTCStatsCallback,
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  def onconnectionstatechange(event: stdLib.Event): scala.Unit = js.native
  def ondatachannel(event: RTCDataChannelEvent): scala.Unit = js.native
  def onicecandidateerror(event: RTCPeerConnectionIceErrorEvent): scala.Unit = js.native
  def ontrack(event: RTCTrackEvent): scala.Unit = js.native
  def removeTrack(sender: RTCRtpSender): scala.Unit = js.native
  def setConfiguration(configuration: RTCConfiguration): scala.Unit = js.native
  def setLocalDescription(description: stdLib.RTCSessionDescriptionInit): js.Promise[scala.Unit] = js.native
  def setLocalDescription(
    description: stdLib.RTCSessionDescriptionInit,
    successCallback: js.Function0[scala.Unit],
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
  def setRemoteDescription(description: stdLib.RTCSessionDescriptionInit): js.Promise[scala.Unit] = js.native
  def setRemoteDescription(
    description: stdLib.RTCSessionDescriptionInit,
    successCallback: js.Function0[scala.Unit],
    failureCallback: stdLib.RTCPeerConnectionErrorCallback
  ): js.Promise[scala.Unit] = js.native
}

