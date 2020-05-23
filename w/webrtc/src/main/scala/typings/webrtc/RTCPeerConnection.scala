package typings.webrtc

import typings.std.Event
import typings.std.EventTarget
import typings.std.RTCAnswerOptions
import typings.std.RTCIceCandidate
import typings.std.RTCIceCandidateInit
import typings.std.RTCPeerConnectionErrorCallback
import typings.std.RTCPeerConnectionState
import typings.std.RTCSessionDescription
import typings.std.RTCSessionDescriptionCallback
import typings.std.RTCSessionDescriptionInit
import typings.std.RTCSignalingState
import typings.std.RTCStatsCallback
import typings.std.RTCStatsReport
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RTCPeerConnection extends EventTarget {
  val connectionState: RTCPeerConnectionState = js.native
  val currentLocalDescription: RTCSessionDescription | Null = js.native
  val currentRemoteDescription: RTCSessionDescription | Null = js.native
  val localDescription: RTCSessionDescription | Null = js.native
  var onconnectionstatechange: PeerConnectionEventHandler[Event] = js.native
  var ondatachannel: PeerConnectionEventHandler[RTCDataChannelEvent] = js.native
  var onicecandidateerror: PeerConnectionEventHandler[RTCPeerConnectionIceErrorEvent] = js.native
  var ontrack: PeerConnectionEventHandler[RTCTrackEvent] = js.native
  val pendingLocalDescription: RTCSessionDescription | Null = js.native
  val pendingRemoteDescription: RTCSessionDescription | Null = js.native
  val remoteDescription: RTCSessionDescription | Null = js.native
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-1
  val sctp: RTCSctpTransport | Null = js.native
  val signalingState: RTCSignalingState = js.native
  def addIceCandidate(): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidate): js.Promise[Unit] = js.native
  def addIceCandidate(candidate: RTCIceCandidateInit): js.Promise[Unit] = js.native
  def addIceCandidate(
    candidate: RTCIceCandidateInit,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  def addIceCandidate(
    candidate: RTCIceCandidate,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  def addTrack(track: MediaStreamTrack, streams: MediaStream*): RTCRtpSender = js.native
  def addTransceiver(trackOrKind: String): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: String, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack): RTCRtpTransceiver = js.native
  def addTransceiver(trackOrKind: MediaStreamTrack, init: RTCRtpTransceiverInit): RTCRtpTransceiver = js.native
  def close(): Unit = js.native
  def createAnswer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(options: RTCAnswerOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  def createAnswer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  def createDataChannel(): RTCDataChannel = js.native
  def createDataChannel(label: String): RTCDataChannel = js.native
  def createDataChannel(label: String, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  def createDataChannel(label: Null, dataChannelDict: RTCDataChannelInit): RTCDataChannel = js.native
  def createOffer(): js.Promise[RTCSessionDescriptionInit] = js.native
  def createOffer(options: RTCOfferOptions): js.Promise[RTCSessionDescriptionInit] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#legacy-interface-extensions
  // Deprecated!
  def createOffer(successCallback: RTCSessionDescriptionCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  def createOffer(
    successCallback: RTCSessionDescriptionCallback,
    failureCallback: RTCPeerConnectionErrorCallback,
    options: RTCOfferOptions
  ): js.Promise[Unit] = js.native
  def getConfiguration(): RTCConfiguration = js.native
  def getReceivers(): js.Array[RTCRtpReceiver] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions
  def getSenders(): js.Array[RTCRtpSender] = js.native
  // Extension: https://www.w3.org/TR/webrtc/#h-rtcpeerconnection-interface-extensions-2
  def getStats(): js.Promise[RTCStatsReport] = js.native
  def getStats(selector: Null, successCallback: RTCStatsCallback, failureCallback: RTCPeerConnectionErrorCallback): js.Promise[Unit] = js.native
  def getStats(selector: MediaStreamTrack): js.Promise[RTCStatsReport] = js.native
  def getStats(
    selector: MediaStreamTrack,
    successCallback: RTCStatsCallback,
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  def getTransceivers(): js.Array[RTCRtpTransceiver] = js.native
  def removeTrack(sender: RTCRtpSender): Unit = js.native
  def setConfiguration(configuration: RTCConfiguration): Unit = js.native
  def setLocalDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  def setLocalDescription(
    description: RTCSessionDescriptionInit,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
  def setRemoteDescription(description: RTCSessionDescriptionInit): js.Promise[Unit] = js.native
  def setRemoteDescription(
    description: RTCSessionDescriptionInit,
    successCallback: js.Function0[Unit],
    failureCallback: RTCPeerConnectionErrorCallback
  ): js.Promise[Unit] = js.native
}

