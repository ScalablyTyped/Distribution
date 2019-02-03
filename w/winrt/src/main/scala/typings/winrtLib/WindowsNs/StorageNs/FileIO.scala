package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Storage.FileIO")
@js.native
class FileIO () extends js.Object

/* static members */
@JSGlobal("Windows.Storage.FileIO")
@js.native
object FileIO extends js.Object {
  def appendLinesAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendLinesAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendTextAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile, contents: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendTextAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    contents: java.lang.String,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def readBufferAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  def readLinesAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]] = js.native
  def readLinesAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]] = js.native
  def readTextAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def readTextAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def writeBufferAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeBytesAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile, buffer: stdLib.Uint8Array): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeLinesAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeLinesAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeTextAsync(file: winrtLib.WindowsNs.StorageNs.IStorageFile, contents: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeTextAsync(
    file: winrtLib.WindowsNs.StorageNs.IStorageFile,
    contents: java.lang.String,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

