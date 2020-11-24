package typings.winrtUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
@js.native
trait XboxLiveEndpointPairCreationResult extends js.Object {
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var deviceAddress: XboxLiveDeviceAddress = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var endpointPair: XboxLiveEndpointPair = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var isExistingPathEvaluation: Boolean = js.native
  
  /** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
  var status: XboxLiveEndpointPairCreationStatus = js.native
}
object XboxLiveEndpointPairCreationResult {
  
  @scala.inline
  def apply(
    deviceAddress: XboxLiveDeviceAddress,
    endpointPair: XboxLiveEndpointPair,
    isExistingPathEvaluation: Boolean,
    status: XboxLiveEndpointPairCreationStatus
  ): XboxLiveEndpointPairCreationResult = {
    val __obj = js.Dynamic.literal(deviceAddress = deviceAddress.asInstanceOf[js.Any], endpointPair = endpointPair.asInstanceOf[js.Any], isExistingPathEvaluation = isExistingPathEvaluation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[XboxLiveEndpointPairCreationResult]
  }
  
  @scala.inline
  implicit class XboxLiveEndpointPairCreationResultOps[Self <: XboxLiveEndpointPairCreationResult] (val x: Self) extends AnyVal {
    
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
    def setDeviceAddress(value: XboxLiveDeviceAddress): Self = this.set("deviceAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpointPair(value: XboxLiveEndpointPair): Self = this.set("endpointPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsExistingPathEvaluation(value: Boolean): Self = this.set("isExistingPathEvaluation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: XboxLiveEndpointPairCreationStatus): Self = this.set("status", value.asInstanceOf[js.Any])
  }
}
