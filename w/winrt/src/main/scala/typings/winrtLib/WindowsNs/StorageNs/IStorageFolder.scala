package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFolder extends IStorageItem {
  def createFileAsync(desiredName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def createFileAsync(desiredName: java.lang.String, options: CreationCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def createFolderAsync(desiredName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFolder] = js.native
  def createFolderAsync(desiredName: java.lang.String, options: CreationCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFolder] = js.native
  def getFileAsync(name: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def getFilesAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StorageFile]] = js.native
  def getFolderAsync(name: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFolder] = js.native
  def getFoldersAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[StorageFolder]] = js.native
  def getItemAsync(name: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[IStorageItem] = js.native
  def getItemsAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IStorageItem]] = js.native
  def getItemsAsync(startIndex: scala.Double, maxItemsToRetrieve: scala.Double): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[IStorageItem]] = js.native
}

