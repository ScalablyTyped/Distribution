package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the service methods for joining a PlayReady domain. */
trait PlayReadyDomainJoinServiceRequest extends StObject {
  
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction
  
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String
  
  /** Gets or sets the current domain account identifier property. */
  var domainAccountId: String
  
  /** Gets or sets the current domain friendly name property. */
  var domainFriendlyName: String
  
  /** Gets or sets the current domain service identifier property. */
  var domainServiceId: String
  
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage
  
  /**
    * Returns a new service request interface.
    * @return The new service request interface.
    */
  def nextServiceRequest(): IPlayReadyServiceRequest
  
  /**
    * Process the raw binary result of a manual enabling challenge.
    * @param responseBytes The response result to be processed.
    * @return If the methods succeeds, it returns S_OK. If it fails, it returns an error code.
    */
  def processManualEnablingResponse(responseBytes: js.Array[Double]): WinRTError
  
  /** Gets the vendor content protection system identifier. */
  var protectionSystem: String
  
  /** Gets the custom data that was returned in the response from the service. */
  var responseCustomData: String
  
  /** Gets the GUID for the type of operation that the PlayReady domain join service request performs. */
  var `type`: String
  
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri
}
object PlayReadyDomainJoinServiceRequest {
  
  inline def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    domainAccountId: String,
    domainFriendlyName: String,
    domainServiceId: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): PlayReadyDomainJoinServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], domainAccountId = domainAccountId.asInstanceOf[js.Any], domainFriendlyName = domainFriendlyName.asInstanceOf[js.Any], domainServiceId = domainServiceId.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyDomainJoinServiceRequest]
  }
  
  extension [Self <: PlayReadyDomainJoinServiceRequest](x: Self) {
    
    inline def setBeginServiceRequest(value: () => IAsyncAction): Self = StObject.set(x, "beginServiceRequest", js.Any.fromFunction0(value))
    
    inline def setChallengeCustomData(value: String): Self = StObject.set(x, "challengeCustomData", value.asInstanceOf[js.Any])
    
    inline def setDomainAccountId(value: String): Self = StObject.set(x, "domainAccountId", value.asInstanceOf[js.Any])
    
    inline def setDomainFriendlyName(value: String): Self = StObject.set(x, "domainFriendlyName", value.asInstanceOf[js.Any])
    
    inline def setDomainServiceId(value: String): Self = StObject.set(x, "domainServiceId", value.asInstanceOf[js.Any])
    
    inline def setGenerateManualEnablingChallenge(value: () => PlayReadySoapMessage): Self = StObject.set(x, "generateManualEnablingChallenge", js.Any.fromFunction0(value))
    
    inline def setNextServiceRequest(value: () => IPlayReadyServiceRequest): Self = StObject.set(x, "nextServiceRequest", js.Any.fromFunction0(value))
    
    inline def setProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = StObject.set(x, "processManualEnablingResponse", js.Any.fromFunction1(value))
    
    inline def setProtectionSystem(value: String): Self = StObject.set(x, "protectionSystem", value.asInstanceOf[js.Any])
    
    inline def setResponseCustomData(value: String): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
