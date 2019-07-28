package typings.winrtDashUwp.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents shortcuts that help users share content with the apps they use most. */
@JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink")
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

