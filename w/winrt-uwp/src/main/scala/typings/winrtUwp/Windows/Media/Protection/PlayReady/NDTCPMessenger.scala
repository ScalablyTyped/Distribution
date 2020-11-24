package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sends PlayReady-ND messages and challenges using the TCP network protocol. */
@js.native
trait NDTCPMessenger extends js.Object {
  
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
object NDTCPMessenger {
  
  @scala.inline
  def apply(
    sendLicenseFetchRequestAsync: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult],
    sendProximityDetectionResponseAsync: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult],
    sendProximityDetectionStartAsync: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult],
    sendRegistrationRequestAsync: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]
  ): NDTCPMessenger = {
    val __obj = js.Dynamic.literal(sendLicenseFetchRequestAsync = js.Any.fromFunction2(sendLicenseFetchRequestAsync), sendProximityDetectionResponseAsync = js.Any.fromFunction4(sendProximityDetectionResponseAsync), sendProximityDetectionStartAsync = js.Any.fromFunction4(sendProximityDetectionStartAsync), sendRegistrationRequestAsync = js.Any.fromFunction2(sendRegistrationRequestAsync))
    __obj.asInstanceOf[NDTCPMessenger]
  }
  
  @scala.inline
  implicit class NDTCPMessengerOps[Self <: NDTCPMessenger] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSendLicenseFetchRequestAsync(value: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]): Self = this.set("sendLicenseFetchRequestAsync", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSendProximityDetectionResponseAsync(
      value: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]
    ): Self = this.set("sendProximityDetectionResponseAsync", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSendProximityDetectionStartAsync(
      value: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]
    ): Self = this.set("sendProximityDetectionStartAsync", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSendRegistrationRequestAsync(value: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]): Self = this.set("sendRegistrationRequestAsync", js.Any.fromFunction2(value))
  }
}
