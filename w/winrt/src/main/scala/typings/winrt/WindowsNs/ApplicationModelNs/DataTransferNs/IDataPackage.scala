package typings.winrt.WindowsNs.ApplicationModelNs.DataTransferNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IMap
import typings.winrt.WindowsNs.FoundationNs.Uri
import typings.winrt.WindowsNs.StorageNs.IStorageItem
import typings.winrt.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
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

