package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains information about a BackgroundTransferCompletionGroup that can be only accessed from the Run method on the IBackgroundTask . */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroupTriggerDetails")
@js.native
abstract class BackgroundTransferCompletionGroupTriggerDetails () extends js.Object {
  /** Gets the list of DownloadOperation objects associated with the BackgroundTransferCompletionGroup . */
  var downloads: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[DownloadOperation] = js.native
  /** Gets the list of UploadOperation objects associated with the BackgroundTransferCompletionGroup . */
  var uploads: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[UploadOperation] = js.native
}

