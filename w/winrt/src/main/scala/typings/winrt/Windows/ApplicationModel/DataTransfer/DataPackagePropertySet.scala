package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.Windows.Foundation.Collections.IIterator
import typings.winrt.Windows.Foundation.Collections.IKeyValuePair
import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.Streams.IRandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.ApplicationModel.DataTransfer.DataPackagePropertySet")
@js.native
class DataPackagePropertySet () extends IDataPackagePropertySet {
  /* CompleteClass */
  override var applicationListingUri: Uri = js.native
  /* CompleteClass */
  override var applicationName: String = js.native
  /* CompleteClass */
  override var description: String = js.native
  /* CompleteClass */
  override var fileTypes: IVector[String] = js.native
  /* CompleteClass */
  override var size: Double = js.native
  /* CompleteClass */
  override var thumbnail: IRandomAccessStreamReference = js.native
  /* CompleteClass */
  override var title: String = js.native
  /* CompleteClass */
  override def clear(): Unit = js.native
  /* CompleteClass */
  override def first(): IIterator[IKeyValuePair[String, js.Any]] = js.native
  /* CompleteClass */
  override def getView(): IMapView[String, js.Any] = js.native
  /* CompleteClass */
  override def hasKey(key: String): Boolean = js.native
  /* CompleteClass */
  override def insert(key: String, value: js.Any): Boolean = js.native
  /* CompleteClass */
  override def lookup(key: String): js.Any = js.native
  /* CompleteClass */
  override def remove(key: String): Unit = js.native
}

