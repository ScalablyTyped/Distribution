package typings.winrtDashUwp.Windows.ApplicationModel.DataTransfer

import typings.winrtDashUwp.Windows.Foundation.Collections.IVector
import typings.winrtDashUwp.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains the classes and events that a target app uses to complete share operations and create shortcuts, called QuickLinks, that the system can use to streamline future sharing operations to the app. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget")
@js.native
object ShareTarget extends js.Object {
  /** Represents shortcuts that help users share content with the apps they use most. */
  @js.native
  /** Creates a new instance of a QuickLink object. */
  class QuickLink () extends js.Object {
    /** Specifies an ID for the QuickLink. Your app receives this ID when the user selects its QuickLink. You can use this ID to further customize the sharing process for the user. */
    var id: String = js.native
    /** An array of strings that specify the data formats supported by the QuickLink app. The system shows the QuickLink only when the data that a user wants to share matches a format in this array. */
    var supportedDataFormats: IVector[String] = js.native
    /** An array of strings that specify the file types supported by a QuickLink app. The system shows the QuickLink only when the data that a user wants to share contains file items, and the file extensions for those file items match a file type in this array. */
    var supportedFileTypes: IVector[String] = js.native
    /** Specifies a thumbnail image for the QuickLink. The system displays this image when the user is presented with a list of possible apps to share content with. */
    var thumbnail: RandomAccessStreamReference = js.native
    /** Specifies the title of a QuickLink. The system displays this info when the user is presented with a list of possible apps to share content with. */
    var title: String = js.native
  }
  
  /** Handles the bulk of the work during a share operation. This includes the data that the user wants to share, setting or removing QuickLinks, and informing the system about the status of the operation. */
  @js.native
  abstract class ShareOperation () extends js.Object {
    /** Contains a DataPackage object with the data that the user wants to share. */
    var data: DataPackageView = js.native
    /** A string that contains the ID of a QuickLink. */
    var quickLinkId: String = js.native
    /** Closes the share pane. */
    def dismissUI(): Unit = js.native
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
  
}

