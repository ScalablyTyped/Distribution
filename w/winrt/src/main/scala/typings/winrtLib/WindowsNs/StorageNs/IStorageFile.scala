package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStorageFile
  extends IStorageItem
     with winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStreamReference
     with winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStreamReference {
  var contentType: java.lang.String = js.native
  var fileType: java.lang.String = js.native
  def copyAndReplaceAsync(fileToReplace: IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def copyAsync(destinationFolder: IStorageFolder): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def copyAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String, option: NameCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageFile] = js.native
  def moveAndReplaceAsync(fileToReplace: IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def moveAsync(destinationFolder: IStorageFolder): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def moveAsync(destinationFolder: IStorageFolder, desiredNewName: java.lang.String, option: NameCollisionOption): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def openAsync(accessMode: FileAccessMode): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IRandomAccessStream] = js.native
  def openTransactedWriteAsync(): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[StorageStreamTransaction] = js.native
}

