package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs.ShareTargetNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.ShareTarget.QuickLink")
@js.native
class QuickLink () extends IQuickLink {
  /* CompleteClass */
  override var id: String = js.native
  /* CompleteClass */
  override var supportedDataFormats: IVector[String] = js.native
  /* CompleteClass */
  override var supportedFileTypes: IVector[String] = js.native
  /* CompleteClass */
  override var thumbnail: RandomAccessStreamReference = js.native
  /* CompleteClass */
  override var title: String = js.native
}

