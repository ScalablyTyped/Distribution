package typings.winrtUwp.Windows.Management.Deployment

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the result of a deployment request. */
@JSGlobal("Windows.Management.Deployment.DeploymentResult")
@js.native
abstract class DeploymentResult () extends js.Object {
  /** Gets the activity identifier used to look up an event in Windows Event Viewer. Gets the activity identifier used to look up an event. All events of a deployment operation are logged with the same activityId. */
  var activityId: String = js.native
  /** Gets extended error text for the error if the deployment operation is not successful. */
  var errorText: String = js.native
  /** The extended error code can be used to distinguish a specific error condition which needs to be handled differently from the general error indicated by the return code. The extended error code may provide a more specific reason for the failure that caused the general error. Also, it usually corresponds directly to the specific message in the ErrorText . */
  var extendedErrorCode: WinRTError = js.native
}

