package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import typings.winrt.Anon_First
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterator
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IKeyValuePair
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
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

