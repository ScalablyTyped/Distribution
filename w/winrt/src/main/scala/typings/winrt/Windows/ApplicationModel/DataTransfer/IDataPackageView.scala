package typings.winrt.Windows.ApplicationModel.DataTransfer

import typings.winrt.Windows.Foundation.Collections.IMapView
import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.Uri
import typings.winrt.Windows.Storage.IStorageItem
import typings.winrt.Windows.Storage.Streams.RandomAccessStreamReference
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDataPackageView extends StObject {
  
  var availableFormats: IVectorView[String] = js.native
  
  def contains(formatId: String): Boolean = js.native
  
  def getBitmapAsync(): IAsyncOperation[RandomAccessStreamReference] = js.native
  
  def getDataAsync(formatId: String): IAsyncOperation[js.Any] = js.native
  
  def getHtmlFormatAsync(): IAsyncOperation[String] = js.native
  
  def getResourceMapAsync(): IAsyncOperation[IMapView[String, RandomAccessStreamReference]] = js.native
  
  def getRtfAsync(): IAsyncOperation[String] = js.native
  
  def getStorageItemsAsync(): IAsyncOperation[IVectorView[IStorageItem]] = js.native
  
  def getTextAsync(): IAsyncOperation[String] = js.native
  def getTextAsync(formatId: String): IAsyncOperation[String] = js.native
  
  def getUriAsync(): IAsyncOperation[Uri] = js.native
  
  var properties: DataPackagePropertySetView = js.native
  
  def reportOperationCompleted(value: DataPackageOperation): Unit = js.native
  
  var requestedOperation: DataPackageOperation = js.native
}
