package typings.winrtUwp.global.Windows.Networking.BackgroundTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a BackgroundTransferCompletionGroup that can be only accessed from the Run method on the IBackgroundTask . */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails")
@js.native
abstract class BackgroundTransferCompletionGroupTriggerDetails ()
  extends typings.winrtUwp.Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails {
  /** Gets the list of DownloadOperation objects associated with the BackgroundTransferCompletionGroup . */
  /* CompleteClass */
  override var downloads: IVectorView[typings.winrtUwp.Windows.Networking.BackgroundTransfer.DownloadOperation] = js.native
  /** Gets the list of UploadOperation objects associated with the BackgroundTransferCompletionGroup . */
  /* CompleteClass */
  override var uploads: IVectorView[typings.winrtUwp.Windows.Networking.BackgroundTransfer.UploadOperation] = js.native
}

