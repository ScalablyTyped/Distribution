package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Media.Protection.IMediaProtectionServiceRequest
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Base interface for all service request interfaces. */
trait IPlayReadyServiceRequest
  extends StObject
     with IMediaProtectionServiceRequest {
  
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction
  
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String
  
  /**
    * Begins the process of manually enabling.
    * @return Begins the process of manually enabling.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage
  
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest
  
  /**
    * Processes the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError
  
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String
  
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri
}
object IPlayReadyServiceRequest {
  
  @scala.inline
  def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): IPlayReadyServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlayReadyServiceRequest]
  }
  
  @scala.inline
  implicit class IPlayReadyServiceRequestMutableBuilder[Self <: IPlayReadyServiceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeginServiceRequest(value: () => IAsyncAction): Self = StObject.set(x, "beginServiceRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChallengeCustomData(value: String): Self = StObject.set(x, "challengeCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerateManualEnablingChallenge(value: () => PlayReadySoapMessage): Self = StObject.set(x, "generateManualEnablingChallenge", js.Any.fromFunction0(value))
    
    @scala.inline
    def setNextServiceRequest(value: () => IPlayReadyServiceRequest): Self = StObject.set(x, "nextServiceRequest", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = StObject.set(x, "processManualEnablingResponse", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResponseCustomData(value: String): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
