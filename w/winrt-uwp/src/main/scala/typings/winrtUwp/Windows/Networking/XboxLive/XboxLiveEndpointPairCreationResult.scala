package typings.winrtUwp.Windows.Networking.XboxLive

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This API is not available to all apps. Unless your developer account is specially provisioned by Microsoft, calls to these APIs will fail at runtime. */
trait XboxLiveEndpointPairCreationResult extends js.Object {
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
}

