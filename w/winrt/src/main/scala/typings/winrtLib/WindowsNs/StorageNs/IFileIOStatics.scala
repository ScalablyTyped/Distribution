package typings
package winrtLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFileIOStatics extends js.Object {
  def appendLinesAsync(
    file: IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendLinesAsync(
    file: IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendTextAsync(file: IStorageFile, contents: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def appendTextAsync(
    file: IStorageFile,
    contents: java.lang.String,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def readBufferAsync(file: IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  def readLinesAsync(file: IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]] = js.native
  def readLinesAsync(file: IStorageFile, encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]] = js.native
  def readTextAsync(file: IStorageFile): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def readTextAsync(file: IStorageFile, encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[java.lang.String] = js.native
  def writeBufferAsync(file: IStorageFile, buffer: winrtLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeBytesAsync(file: IStorageFile, buffer: stdLib.Uint8Array): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeLinesAsync(
    file: IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeLinesAsync(
    file: IStorageFile,
    lines: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeTextAsync(file: IStorageFile, contents: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def writeTextAsync(
    file: IStorageFile,
    contents: java.lang.String,
    encoding: winrtLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

