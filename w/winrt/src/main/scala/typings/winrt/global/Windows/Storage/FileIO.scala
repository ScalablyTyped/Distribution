package typings.winrt.global.Windows.Storage

import typings.std.Uint8Array
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.IStorageFile
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.UnicodeEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.FileIO")
@js.native
class FileIO ()
  extends typings.winrt.Windows.Storage.FileIO
/* static members */
object FileIO {
  
  @JSGlobal("Windows.Storage.FileIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.appendTextAsync")
  @js.native
  def appendTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.appendTextAsync")
  @js.native
  def appendTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.readBufferAsync")
  @js.native
  def readBufferAsync(file: IStorageFile): IAsyncOperation[IBuffer] = js.native
  
  @JSGlobal("Windows.Storage.FileIO.readLinesAsync")
  @js.native
  def readLinesAsync(file: IStorageFile): IAsyncOperation[IVector[String]] = js.native
  @JSGlobal("Windows.Storage.FileIO.readLinesAsync")
  @js.native
  def readLinesAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = js.native
  
  @JSGlobal("Windows.Storage.FileIO.readTextAsync")
  @js.native
  def readTextAsync(file: IStorageFile): IAsyncOperation[String] = js.native
  @JSGlobal("Windows.Storage.FileIO.readTextAsync")
  @js.native
  def readTextAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[String] = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeBufferAsync")
  @js.native
  def writeBufferAsync(file: IStorageFile, buffer: IBuffer): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeBytesAsync")
  @js.native
  def writeBytesAsync(file: IStorageFile, buffer: Uint8Array): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.FileIO.writeTextAsync")
  @js.native
  def writeTextAsync(file: IStorageFile, contents: String): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.FileIO.writeTextAsync")
  @js.native
  def writeTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
}
