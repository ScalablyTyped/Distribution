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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("Windows.Storage.FileIO")
@js.native
class FileIO ()
  extends StObject
     with typings.winrt.Windows.Storage.FileIO
/* static members */
object FileIO {
  
  @JSGlobal("Windows.Storage.FileIO")
  @js.native
  val ^ : js.Any = js.native
  
  inline def appendLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def appendLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def appendTextAsync(file: IStorageFile, contents: String): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def appendTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def readBufferAsync(file: IStorageFile): IAsyncOperation[IBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBufferAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[IBuffer]]
  
  inline def readLinesAsync(file: IStorageFile): IAsyncOperation[IVector[String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[IVector[String]]]
  inline def readLinesAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[IVector[String]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[IVector[String]]]
  
  inline def readTextAsync(file: IStorageFile): IAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IAsyncOperation[String]]
  inline def readTextAsync(file: IStorageFile, encoding: UnicodeEncoding): IAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncOperation[String]]
  
  inline def writeBufferAsync(file: IStorageFile, buffer: IBuffer): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBufferAsync")(file.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def writeBytesAsync(file: IStorageFile, buffer: Uint8Array): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBytesAsync")(file.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def writeLinesAsync(file: IStorageFile, lines: IIterable[String]): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def writeLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  
  inline def writeTextAsync(file: IStorageFile, contents: String): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
  inline def writeTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IAsyncAction]
}
