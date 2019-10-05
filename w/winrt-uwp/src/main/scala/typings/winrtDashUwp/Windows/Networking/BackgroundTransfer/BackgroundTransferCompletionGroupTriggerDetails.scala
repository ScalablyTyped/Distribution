package typings.winrtDashUwp.Windows.Networking.BackgroundTransfer

import typings.winrtDashUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a BackgroundTransferCompletionGroup that can be only accessed from the Run method on the IBackgroundTask . */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails")
@js.native
abstract class BackgroundTransferCompletionGroupTriggerDetails () extends js.Object {
  /** Gets the list of DownloadOperation objects associated with the BackgroundTransferCompletionGroup . */
  var downloads: IVectorView[DownloadOperation] = js.native
  /** Gets the list of UploadOperation objects associated with the BackgroundTransferCompletionGroup . */
  var uploads: IVectorView[UploadOperation] = js.native
}

