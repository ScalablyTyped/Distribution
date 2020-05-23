package typings.winrtUwp.global.Windows.ApplicationModel.DataTransfer

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
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
  class QuickLink ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink {
    /** Specifies an ID for the QuickLink. Your app receives this ID when the user selects its QuickLink. You can use this ID to further customize the sharing process for the user. */
    /* CompleteClass */
    override var id: String = js.native
    /** An array of strings that specify the data formats supported by the QuickLink app. The system shows the QuickLink only when the data that a user wants to share matches a format in this array. */
    /* CompleteClass */
    override var supportedDataFormats: IVector[String] = js.native
    /** An array of strings that specify the file types supported by a QuickLink app. The system shows the QuickLink only when the data that a user wants to share contains file items, and the file extensions for those file items match a file type in this array. */
    /* CompleteClass */
    override var supportedFileTypes: IVector[String] = js.native
    /** Specifies a thumbnail image for the QuickLink. The system displays this image when the user is presented with a list of possible apps to share content with. */
    /* CompleteClass */
    override var thumbnail: RandomAccessStreamReference = js.native
    /** Specifies the title of a QuickLink. The system displays this info when the user is presented with a list of possible apps to share content with. */
    /* CompleteClass */
    override var title: String = js.native
  }
  
  /** Handles the bulk of the work during a share operation. This includes the data that the user wants to share, setting or removing QuickLinks, and informing the system about the status of the operation. */
  @js.native
  abstract class ShareOperation ()
    extends typings.winrtUwp.Windows.ApplicationModel.DataTransfer.ShareTarget.ShareOperation
  
}

