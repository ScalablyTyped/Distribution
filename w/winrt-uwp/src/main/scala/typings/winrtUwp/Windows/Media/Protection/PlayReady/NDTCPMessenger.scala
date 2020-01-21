package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sends PlayReady-ND messages and challenges using the TCP network protocol. */
@JSGlobal("Windows.Media.Protection.PlayReady.NDTCPMessenger")
@js.native
class NDTCPMessenger protected () extends js.Object {
  /**
    * Creates a new instance of the NDTCPMessenger class.
    * @param remoteHostName The IP address of the remote host that will receive messages. The format is either an IPv4 address in dotted-decimal notation or an IPv6 address in colon-hex notation.
    * @param remoteHostPort The TCP port of the remote host that will receive messages.
    */
  def this(remoteHostName: String, remoteHostPort: Double) = this()
  /**
    * Sends the specified data in an asynchronous license fetch request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the license fetch request.
    */
  def sendLicenseFetchRequestAsync(sessionIDBytes: js.Array[Double], challengeDataBytes: js.Array[Double]): IPromiseWithIAsyncOperation[INDSendResult] = js.native
  /**
    * Sends the specified data in an asynchronous proximity detection response message.
    * @param pdType The type of proximity detection operation. This value can be UDP, TCP, or Transport-Agnostic.
    * @param transmitterChannelBytes The transmitter channel data.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param responseDataBytes The data for the response message.
    * @return The result of the proximity detection response operation.
    */
  def sendProximityDetectionResponseAsync(
    pdType: NDProximityDetectionType,
    transmitterChannelBytes: js.Array[Double],
    sessionIDBytes: js.Array[Double],
    responseDataBytes: js.Array[Double]
  ): IPromiseWithIAsyncOperation[INDSendResult] = js.native
  /**
    * Sends the specified data in an asynchronous proximity detection start message.
    * @param pdType The type of proximity detection operation. This value can be UDP, TCP, or Transport-Agnostic.
    * @param transmitterChannelBytes The transmitter channel data.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the proximity detection start operation.
    */
  def sendProximityDetectionStartAsync(
    pdType: NDProximityDetectionType,
    transmitterChannelBytes: js.Array[Double],
    sessionIDBytes: js.Array[Double],
    challengeDataBytes: js.Array[Double]
  ): IPromiseWithIAsyncOperation[INDSendResult] = js.native
  /**
    * Sends the specified data in an asynchronous registration request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the registration request.
    */
  def sendRegistrationRequestAsync(sessionIDBytes: js.Array[Double], challengeDataBytes: js.Array[Double]): IPromiseWithIAsyncOperation[INDSendResult] = js.native
}

