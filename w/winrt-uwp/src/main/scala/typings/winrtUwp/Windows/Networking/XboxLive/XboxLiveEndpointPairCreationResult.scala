package typings.winrtUwp.Windows.Networking.XboxLive

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait XboxLiveEndpointPairCreationResult extends StObject {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddress: XboxLiveDeviceAddress
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var endpointPair: XboxLiveEndpointPair
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isExistingPathEvaluation: Boolean
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: XboxLiveEndpointPairCreationStatus
}
object XboxLiveEndpointPairCreationResult {
  
  inline def apply(
    deviceAddress: XboxLiveDeviceAddress,
    endpointPair: XboxLiveEndpointPair,
    isExistingPathEvaluation: Boolean,
    status: XboxLiveEndpointPairCreationStatus
  ): XboxLiveEndpointPairCreationResult = {
    val __obj = js.Dynamic.literal(deviceAddress = deviceAddress.asInstanceOf[js.Any], endpointPair = endpointPair.asInstanceOf[js.Any], isExistingPathEvaluation = isExistingPathEvaluation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveEndpointPairCreationResult]
  }
  
  extension [Self <: XboxLiveEndpointPairCreationResult](x: Self) {
    
    inline def setDeviceAddress(value: XboxLiveDeviceAddress): Self = StObject.set(x, "deviceAddress", value.asInstanceOf[js.Any])
    
    inline def setEndpointPair(value: XboxLiveEndpointPair): Self = StObject.set(x, "endpointPair", value.asInstanceOf[js.Any])
    
    inline def setIsExistingPathEvaluation(value: Boolean): Self = StObject.set(x, "isExistingPathEvaluation", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: XboxLiveEndpointPairCreationStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
