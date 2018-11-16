package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPackage extends js.Object {
  var ondestroyed: js.Any = js.native
  var onoperationcompleted: js.Any = js.native
  var properties: DataPackagePropertySet = js.native
  var requestedOperation: DataPackageOperation = js.native
  var resourceMap: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMap[
    java.lang.String, 
    winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
  ] = js.native
  def getView(): DataPackageView = js.native
  def setBitmap(value: winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference): scala.Unit = js.native
  def setData(formatId: java.lang.String, value: js.Any): scala.Unit = js.native
  def setDataProvider(formatId: java.lang.String, delayRenderer: DataProviderHandler): scala.Unit = js.native
  def setHtmlFormat(value: java.lang.String): scala.Unit = js.native
  def setRtf(value: java.lang.String): scala.Unit = js.native
  def setStorageItems(
    value: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageItem]
  ): scala.Unit = js.native
  def setStorageItems(
    value: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[winrtLib.WindowsNs.StorageNs.IStorageItem],
    readOnly: scala.Boolean
  ): scala.Unit = js.native
  def setText(value: java.lang.String): scala.Unit = js.native
  def setUri(value: winrtLib.WindowsNs.FoundationNs.Uri): scala.Unit = js.native
}

