package typings.winrt.Windows.ApplicationModel.DataTransfer.ShareTarget

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
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

