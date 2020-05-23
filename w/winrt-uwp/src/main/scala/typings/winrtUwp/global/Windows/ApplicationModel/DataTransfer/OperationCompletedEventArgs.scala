package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains info about the action that a target app completed during a paste operation. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs")
@js.native
abstract class OperationCompletedEventArgs ()
  extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.OperationCompletedEventArgs {
  /* CompleteClass */
  override var acceptedFormatId: js.Any = js.native
   /* unmapped type */ /** Specifies the operation that the target app completed. */
  /* CompleteClass */
  override var operation: typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageOperation = js.native
}

