package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IMap
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageItem
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPackage extends js.Object {
  var ondestroyed: js.Any = js.native
  var onoperationcompleted: js.Any = js.native
  var properties: DataPackagePropertySet = js.native
  var requestedOperation: DataPackageOperation = js.native
  var resourceMap: IMap[String, RandomAccessStreamReference] = js.native
  def getView(): DataPackageView = js.native
  def setBitmap(value: RandomAccessStreamReference): Unit = js.native
  def setData(formatId: String, value: js.Any): Unit = js.native
  def setDataProvider(formatId: String, delayRenderer: DataProviderHandler): Unit = js.native
  def setHtmlFormat(value: String): Unit = js.native
  def setRtf(value: String): Unit = js.native
  def setStorageItems(value: IIterable[IStorageItem]): Unit = js.native
  def setStorageItems(value: IIterable[IStorageItem], readOnly: Boolean): Unit = js.native
  def setText(value: String): Unit = js.native
  def setUri(value: Uri): Unit = js.native
}

