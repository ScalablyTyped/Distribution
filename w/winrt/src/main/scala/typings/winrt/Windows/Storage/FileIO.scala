package typings.winrt.Windows.Storage

import typings.std.Uint8Array
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.UnicodeEncoding
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

