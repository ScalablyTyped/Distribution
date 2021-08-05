package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.IAsyncAction
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the service methods for content metering operations. */
trait PlayReadyMeteringReportServiceRequest extends StObject {
  
  /**
    * Begins an asynchronous service request operation.
    * @return The asynchronous service action.
    */
  def beginServiceRequest(): IAsyncAction
  
  /** Gets or sets the custom data of the request challenge. */
  var challengeCustomData: String
  
  /**
    * Begins the process of manually enabling.
    * @return The SOAP message to be used in a manual license acquisition challenge request.
    */
  def generateManualEnablingChallenge(): PlayReadySoapMessage
  
  /** Gets or sets the current metering certificate property. */
  var meteringCertificate: Double
  
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
  
  /** Gets the GUID for the type of operation that the PlayReady metering report service request performs. */
  var `type`: String
  
  /** Gets or sets the URI used to perform a service request action. */
  var uri: Uri
}
object PlayReadyMeteringReportServiceRequest {
  
  inline def apply(
    beginServiceRequest: () => IAsyncAction,
    challengeCustomData: String,
    generateManualEnablingChallenge: () => PlayReadySoapMessage,
    meteringCertificate: Double,
    nextServiceRequest: () => IPlayReadyServiceRequest,
    processManualEnablingResponse: js.Array[Double] => WinRTError,
    protectionSystem: String,
    responseCustomData: String,
    `type`: String,
    uri: Uri
  ): PlayReadyMeteringReportServiceRequest = {
    val __obj = js.Dynamic.literal(beginServiceRequest = js.Any.fromFunction0(beginServiceRequest), challengeCustomData = challengeCustomData.asInstanceOf[js.Any], generateManualEnablingChallenge = js.Any.fromFunction0(generateManualEnablingChallenge), meteringCertificate = meteringCertificate.asInstanceOf[js.Any], nextServiceRequest = js.Any.fromFunction0(nextServiceRequest), processManualEnablingResponse = js.Any.fromFunction1(processManualEnablingResponse), protectionSystem = protectionSystem.asInstanceOf[js.Any], responseCustomData = responseCustomData.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayReadyMeteringReportServiceRequest]
  }
  
  extension [Self <: PlayReadyMeteringReportServiceRequest](x: Self) {
    
    inline def setBeginServiceRequest(value: () => IAsyncAction): Self = StObject.set(x, "beginServiceRequest", js.Any.fromFunction0(value))
    
    inline def setChallengeCustomData(value: String): Self = StObject.set(x, "challengeCustomData", value.asInstanceOf[js.Any])
    
    inline def setGenerateManualEnablingChallenge(value: () => PlayReadySoapMessage): Self = StObject.set(x, "generateManualEnablingChallenge", js.Any.fromFunction0(value))
    
    inline def setMeteringCertificate(value: Double): Self = StObject.set(x, "meteringCertificate", value.asInstanceOf[js.Any])
    
    inline def setNextServiceRequest(value: () => IPlayReadyServiceRequest): Self = StObject.set(x, "nextServiceRequest", js.Any.fromFunction0(value))
    
    inline def setProcessManualEnablingResponse(value: js.Array[Double] => WinRTError): Self = StObject.set(x, "processManualEnablingResponse", js.Any.fromFunction1(value))
    
    inline def setProtectionSystem(value: String): Self = StObject.set(x, "protectionSystem", value.asInstanceOf[js.Any])
    
    inline def setResponseCustomData(value: String): Self = StObject.set(x, "responseCustomData", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Uri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
