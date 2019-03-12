package typings
package winrtDashUwpLib.WindowsNs.MediaNs.ProtectionNs.PlayReadyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Sends registration, proximity detection, and license fetch messages between PlayReady-ND receivers and transmitters. */
trait INDMessenger extends js.Object {
  /**
    * Sends the specified data in an asynchronous license fetch request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the license fetch request.
    */
  def sendLicenseFetchRequestAsync(sessionIDBytes: js.Array[scala.Double], challengeDataBytes: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult]
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
    transmitterChannelBytes: js.Array[scala.Double],
    sessionIDBytes: js.Array[scala.Double],
    responseDataBytes: js.Array[scala.Double]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult]
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
    transmitterChannelBytes: js.Array[scala.Double],
    sessionIDBytes: js.Array[scala.Double],
    challengeDataBytes: js.Array[scala.Double]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult]
  /**
    * Sends the specified data in an asynchronous registration request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the license fetch request.
    */
  def sendRegistrationRequestAsync(sessionIDBytes: js.Array[scala.Double], challengeDataBytes: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult]
}

object INDMessenger {
  @scala.inline
  def apply(
    sendLicenseFetchRequestAsync: (js.Array[scala.Double], js.Array[scala.Double]) => winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult],
    sendProximityDetectionResponseAsync: (NDProximityDetectionType, js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]) => winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult],
    sendProximityDetectionStartAsync: (NDProximityDetectionType, js.Array[scala.Double], js.Array[scala.Double], js.Array[scala.Double]) => winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult],
    sendRegistrationRequestAsync: (js.Array[scala.Double], js.Array[scala.Double]) => winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[INDSendResult]
  ): INDMessenger = {
    val __obj = js.Dynamic.literal(sendLicenseFetchRequestAsync = js.Any.fromFunction2(sendLicenseFetchRequestAsync), sendProximityDetectionResponseAsync = js.Any.fromFunction4(sendProximityDetectionResponseAsync), sendProximityDetectionStartAsync = js.Any.fromFunction4(sendProximityDetectionStartAsync), sendRegistrationRequestAsync = js.Any.fromFunction2(sendRegistrationRequestAsync))
  
    __obj.asInstanceOf[INDMessenger]
  }
}

