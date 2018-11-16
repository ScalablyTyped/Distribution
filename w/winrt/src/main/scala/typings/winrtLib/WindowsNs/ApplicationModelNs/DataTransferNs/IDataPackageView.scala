package typings
package winrtLib.WindowsNs.ApplicationModelNs.DataTransferNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDataPackageView extends js.Object {
  var availableFormats: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[java.lang.String] = js.native
  var properties: DataPackagePropertySetView = js.native
  var requestedOperation: DataPackageOperation = js.native
  def contains(formatId: java.lang.String): scala.Boolean = js.native
  def getBitmapAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference] = js.native
  def getDataAsync(formatId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[_] = js.native
  def getHtmlFormatAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getResourceMapAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IMapView[
      java.lang.String, 
      winrtLib.WindowsNs.StorageNs.StreamsNs.RandomAccessStreamReference
    ]
  ] = js.native
  def getRtfAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getStorageItemsAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.StorageNs.IStorageItem]
  ] = js.native
  def getTextAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getTextAsync(formatId: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def getUriAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.Uri] = js.native
  def reportOperationCompleted(value: DataPackageOperation): scala.Unit = js.native
}

