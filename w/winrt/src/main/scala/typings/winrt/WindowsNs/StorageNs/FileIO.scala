package typings.winrt.WindowsNs.StorageNs

import typings.std.Uint8Array
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IIterable
import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IBuffer
import typings.winrt.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
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
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def appendTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  def appendTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
  def readBufferAsync(file: IStorageFile): IAsyncOperation[IBuffer] = js.native
  def readLinesAsync(file: IStorageFile): IAsyncOperation[IVector[String]] = js.native
  def readLinesAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = js.native
  def readTextAsync(file: IStorageFile): IAsyncOperation[String] = js.native
  def readTextAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[String] = js.native
  def writeBufferAsync(file: IStorageFile, buffer: IBuffer): IAsyncAction = js.native
  def writeBytesAsync(file: IStorageFile, buffer: Uint8Array): IAsyncAction = js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  def writeTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  def writeTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
}

