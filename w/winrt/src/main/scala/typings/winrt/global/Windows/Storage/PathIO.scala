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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.PathIO")
@js.native
class PathIO ()
  extends StObject
     with typings.winrt.Windows.Storage.PathIO
/* static members */
object PathIO {
  
  @JSGlobal("Windows.Storage.PathIO")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def appendLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  @scala.inline
  def appendLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  @scala.inline
  def appendTextAsync(absolutePath: String, contents: String): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  @scala.inline
  def appendTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  @scala.inline
  def readBufferAsync(absolutePath: String): IAsyncOperation[IBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBufferAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[IBuffer]]
  
  @scala.inline
  def readLinesAsync(absolutePath: String): IAsyncOperation[IVector[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[IVector[String]]]
  @scala.inline
  def readLinesAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(absolutePath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[IVector[String]]]
  
  @scala.inline
  def readTextAsync(absolutePath: String): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
  @scala.inline
  def readTextAsync(absolutePath: String, encoding: UnicodeEncoding): IAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(absolutePath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[String]]
  
  @scala.inline
  def writeBufferAsync(absolutePath: String, buffer: IBuffer): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBufferAsync")(absolutePath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  @scala.inline
  def writeBytesAsync(absolutePath: String, buffer: Uint8Array): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBytesAsync")(absolutePath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  @scala.inline
  def writeLinesAsync(absolutePath: String, lines: IIterable[String]): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  @scala.inline
  def writeLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  @scala.inline
  def writeTextAsync(absolutePath: String, contents: String): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  @scala.inline
  def writeTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
}
