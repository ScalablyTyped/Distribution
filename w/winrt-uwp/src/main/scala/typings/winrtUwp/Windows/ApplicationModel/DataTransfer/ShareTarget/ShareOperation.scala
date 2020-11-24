package typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget

import typings.winrtUwp.Windows.ApplicationModel.DataTransfer.DataPackageView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Handles the bulk of the work during a share operation. This includes the data that the user wants to share, setting or removing QuickLinks, and informing the system about the status of the operation. */
@js.native
trait ShareOperation extends js.Object {
  
  /** Contains a DataPackage object with the data that the user wants to share. */
  var data: DataPackageView = js.native
  
  /** Closes the share pane. */
  def dismissUI(): Unit = js.native
  
  /** A string that contains the ID of a QuickLink. */
  var quickLinkId: String = js.native
  
  /** Removes the QuickLink from the list of QuickLinks that are available to the user. */
  def removeThisQuickLink(): Unit = js.native
  
  /** Specifies that the sharing operation is complete. */
  def reportCompleted(): Unit = js.native
  /**
    * Specifies that the sharing operation is complete. A QuickLink that the system can save as a shortcut for future sharing operations is included.
    * @param quicklink A QuickLink object that the system saves as a shortcut for future sharing operations.
    */
  def reportCompleted(quicklink: QuickLink): Unit = js.native
  
  /** Specifies that the app has acquired the content that the user wants to share. */
  def reportDataRetrieved(): Unit = js.native
  
  /**
    * Specifies that an error occurred during the sharing operation.
    * @param value Specifies the error message. The system displays this message to the user.
    */
  def reportError(value: String): Unit = js.native
  
  /** Specifies that the app has started to acquire the content that the user wants to share. */
  def reportStarted(): Unit = js.native
  
  /** Specifies that the app has requested that the system allow the sharing operation to run as a background task. */
  def reportSubmittedBackgroundTask(): Unit = js.native
}
