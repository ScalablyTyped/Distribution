package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides helper methods for reading and writing files that are represented by objects of type IStorageFile . */
@JSGlobal("Windows.Storage.FileIO")
@js.native
abstract class FileIO ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.FileIO
object FileIO {
  
  @JSGlobal("Windows.Storage.FileIO")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Appends lines of text to the specified file.
    * @param file The file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def appendLinesAsync(file: IStorageFile, lines: IIterable[String]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Appends lines of text to the specified file using the specified character encoding.
    * @param file The file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def appendLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Appends text to the specified file.
    * @param file The file that the text is appended to.
    * @param contents The text to append.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def appendTextAsync(file: IStorageFile, contents: String): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Appends text to the specified file using the specified character encoding.
    * @param file The file that the text is appended to.
    * @param contents The text to append.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def appendTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Reads the contents of the specified file and returns a buffer.
    * @param file The file to read.
    * @return When this method completes, it returns an object (type IBuffer ) that represents the contents of the file.
    */
  /* static member */
  inline def readBufferAsync(file: IStorageFile): IPromiseWithIAsyncOperation[IBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBufferAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IBuffer]]
  
  /**
    * Reads the contents of the specified file and returns lines of text.
    * @param file The file to read.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  inline def readLinesAsync(file: IStorageFile): IPromiseWithIAsyncOperation[IVector[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVector[js.Any]]]
  /**
    * Reads the contents of the specified file using the specified character encoding and returns lines of text.
    * @param file The file to read.
    * @param encoding The character encoding to use.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  inline def readLinesAsync(file: IStorageFile, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[IVector[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVector[js.Any]]]
  
  /**
    * Reads the contents of the specified file and returns text.
    * @param file The file to read.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  inline def readTextAsync(file: IStorageFile): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(file.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  /**
    * Reads the contents of the specified file using the specified character encoding and returns text.
    * @param file The file to read.
    * @param encoding The character encoding to use.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  inline def readTextAsync(file: IStorageFile, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(file.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  
  /**
    * Writes data from a buffer to the specified file.
    * @param file The file that the buffer of data is written to.
    * @param buffer The buffer that contains the data to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def writeBufferAsync(file: IStorageFile, buffer: IBuffer): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBufferAsync")(file.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Writes an array of bytes of data to the specified file.
    * @param file The file that the byte is written to.
    * @param buffer The array of bytes to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def writeBytesAsync(file: IStorageFile, buffer: js.Array[Double]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBytesAsync")(file.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Writes lines of text to the specified file.
    * @param file The file that the lines are written to.
    * @param lines The list of text strings to write as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def writeLinesAsync(file: IStorageFile, lines: IIterable[String]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Writes lines of text to the specified file using the specified character encoding.
    * @param file The file that the lines are written to.
    * @param lines The list of text strings to write as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def writeLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(file.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Writes text to the specified file.
    * @param file The file that the text is written to.
    * @param contents The text to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def writeTextAsync(file: IStorageFile, contents: String): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Writes text to the specified file using the specified character encoding.
    * @param file The file that the text is written to.
    * @param contents The text to write.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  inline def writeTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(file.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
}
