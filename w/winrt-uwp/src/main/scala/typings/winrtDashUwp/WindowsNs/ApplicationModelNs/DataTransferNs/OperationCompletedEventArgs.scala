package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info about the action that a target app completed during a paste operation. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs")
@js.native
abstract class OperationCompletedEventArgs () extends js.Object {
  var acceptedFormatId: js.Any = js.native
   /* unmapped type */ /** Specifies the operation that the target app completed. */
  var operation: DataPackageOperation = js.native
}

