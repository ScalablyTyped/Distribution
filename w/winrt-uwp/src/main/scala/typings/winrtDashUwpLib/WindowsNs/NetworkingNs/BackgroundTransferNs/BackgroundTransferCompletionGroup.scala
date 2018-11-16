package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.BackgroundTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a set of background transfer operations ( DownloadOperation or UploadOperation objects) that trigger a background task once all the operations are done (if the operations completed successfully) or fail with an error. */
@JSGlobal("Windows.Networking.BackgroundTransfer.BackgroundTransferCompletionGroup")
@js.native
class BackgroundTransferCompletionGroup () extends js.Object {
  /** Gets a value that indicates if Enable method on a BackgroundTransferCompletionGroup has already been called. */
  var isEnabled: scala.Boolean = js.native
  /** Gets the IBackgroundTrigger used to set up the background task associated with the BackgroundTransferCompletionGroup . */
  var trigger: winrtDashUwpLib.WindowsNs.ApplicationModelNs.BackgroundNs.IBackgroundTrigger = js.native
  /** Indicates that the BackgroundTransferCompletionGroup is complete and no more background transfer operations ( DownloadOperation or UploadOperation objects) will be added t the completion group. */
  def enable(): scala.Unit = js.native
}

