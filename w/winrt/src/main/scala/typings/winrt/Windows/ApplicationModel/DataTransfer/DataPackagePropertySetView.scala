package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.Anon_First
import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySetView")
@js.native
class DataPackagePropertySetView () extends IDataPackagePropertySetView {
  /* CompleteClass */
  override var applicationListingUri: Uri = js.native
  /* CompleteClass */
  override var applicationName: String = js.native
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var fileTypes: IVectorView[String] = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var thumbnail: RandomAccessStreamReference = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  /* CompleteClass */
  override def split(): Anon_First[String, js.Any] = js.native
}

