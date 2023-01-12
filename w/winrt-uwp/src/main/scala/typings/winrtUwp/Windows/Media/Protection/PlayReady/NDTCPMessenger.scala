package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Sends PlayReady-ND messages and challenges using the TCP network protocol. */
trait NDTCPMessenger extends StObject {
  
  /**
    * Sends the specified data in an asynchronous license fetch request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the license fetch request.
    */
  def sendLicenseFetchRequestAsync(sessionIDBytes: js.Array[Double], challengeDataBytes: js.Array[Double]): IPromiseWithIAsyncOperation[INDSendResult]
  
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
  ): IPromiseWithIAsyncOperation[INDSendResult]
  
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
  ): IPromiseWithIAsyncOperation[INDSendResult]
  
  /**
    * Sends the specified data in an asynchronous registration request message.
    * @param sessionIDBytes The session identifier. The session identifier must be 16 bytes.
    * @param challengeDataBytes The data for the challenge message.
    * @return The result of the registration request.
    */
  def sendRegistrationRequestAsync(sessionIDBytes: js.Array[Double], challengeDataBytes: js.Array[Double]): IPromiseWithIAsyncOperation[INDSendResult]
}
object NDTCPMessenger {
  
  inline def apply(
    sendLicenseFetchRequestAsync: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult],
    sendProximityDetectionResponseAsync: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult],
    sendProximityDetectionStartAsync: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult],
    sendRegistrationRequestAsync: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]
  ): NDTCPMessenger = {
    val __obj = js.Dynamic.literal(sendLicenseFetchRequestAsync = js.Any.fromFunction2(sendLicenseFetchRequestAsync), sendProximityDetectionResponseAsync = js.Any.fromFunction4(sendProximityDetectionResponseAsync), sendProximityDetectionStartAsync = js.Any.fromFunction4(sendProximityDetectionStartAsync), sendRegistrationRequestAsync = js.Any.fromFunction2(sendRegistrationRequestAsync))
    __obj.asInstanceOf[NDTCPMessenger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NDTCPMessenger] (val x: Self) extends AnyVal {
    
    inline def setSendLicenseFetchRequestAsync(value: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]): Self = StObject.set(x, "sendLicenseFetchRequestAsync", js.Any.fromFunction2(value))
    
    inline def setSendProximityDetectionResponseAsync(
      value: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]
    ): Self = StObject.set(x, "sendProximityDetectionResponseAsync", js.Any.fromFunction4(value))
    
    inline def setSendProximityDetectionStartAsync(
      value: (NDProximityDetectionType, js.Array[Double], js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]
    ): Self = StObject.set(x, "sendProximityDetectionStartAsync", js.Any.fromFunction4(value))
    
    inline def setSendRegistrationRequestAsync(value: (js.Array[Double], js.Array[Double]) => IPromiseWithIAsyncOperation[INDSendResult]): Self = StObject.set(x, "sendRegistrationRequestAsync", js.Any.fromFunction2(value))
  }
}
