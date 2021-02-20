package typings.winrt.global.Windows.Storage

import typings.std.Uint8Array
import typings.winrt.Windows.Foundation.Collections.IIterable
import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.UnicodeEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.PathIO")
@js.native
class PathIO ()
  extends typings.winrt.Windows.Storage.PathIO
/* static members */
object PathIO {
  
  @JSGlobal("Windows.Storage.PathIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.PathIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.PathIO.appendTextAsync")
  @js.native
  def appendTextAsync(absolutePath: String, contents: String): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.PathIO.appendTextAsync")
  @js.native
  def appendTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.PathIO.readBufferAsync")
  @js.native
  def readBufferAsync(absolutePath: String): IAsyncOperation[IBuffer] = js.native
  
  @JSGlobal("Windows.Storage.PathIO.readLinesAsync")
  @js.native
  def readLinesAsync(absolutePath: String): IAsyncOperation[IVector[String]] = js.native
  @JSGlobal("Windows.Storage.PathIO.readLinesAsync")
  @js.native
  def readLinesAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = js.native
  
  @JSGlobal("Windows.Storage.PathIO.readTextAsync")
  @js.native
  def readTextAsync(absolutePath: String): IAsyncOperation[String] = js.native
  @JSGlobal("Windows.Storage.PathIO.readTextAsync")
  @js.native
  def readTextAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[String] = js.native
  
  @JSGlobal("Windows.Storage.PathIO.writeBufferAsync")
  @js.native
  def writeBufferAsync(absolutePath: String, buffer: IBuffer): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.PathIO.writeBytesAsync")
  @js.native
  def writeBytesAsync(absolutePath: String, buffer: Uint8Array): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.PathIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.PathIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = js.native
  
  @JSGlobal("Windows.Storage.PathIO.writeTextAsync")
  @js.native
  def writeTextAsync(absolutePath: String, contents: String): IAsyncAction = js.native
  @JSGlobal("Windows.Storage.PathIO.writeTextAsync")
  @js.native
  def writeTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = js.native
}
