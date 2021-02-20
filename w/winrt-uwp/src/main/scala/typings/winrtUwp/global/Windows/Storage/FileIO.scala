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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides helper methods for reading and writing files that are represented by objects of type IStorageFile . */
@JSGlobal("Windows.Storage.FileIO")
@js.native
abstract class FileIO ()
  extends typings.winrtUwp.Windows.Storage.FileIO
object FileIO {
  
  /**
    * Appends lines of text to the specified file.
    * @param file The file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String]): IPromiseWithIAsyncAction = js.native
  /**
    * Appends lines of text to the specified file using the specified character encoding.
    * @param file The file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
  
  /**
    * Appends text to the specified file.
    * @param file The file that the text is appended to.
    * @param contents The text to append.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.appendTextAsync")
  @js.native
  def appendTextAsync(file: IStorageFile, contents: String): IPromiseWithIAsyncAction = js.native
  /**
    * Appends text to the specified file using the specified character encoding.
    * @param file The file that the text is appended to.
    * @param contents The text to append.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.appendTextAsync")
  @js.native
  def appendTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
  
  /**
    * Reads the contents of the specified file and returns a buffer.
    * @param file The file to read.
    * @return When this method completes, it returns an object (type IBuffer ) that represents the contents of the file.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.readBufferAsync")
  @js.native
  def readBufferAsync(file: IStorageFile): IPromiseWithIAsyncOperation[IBuffer] = js.native
  
  /**
    * Reads the contents of the specified file and returns lines of text.
    * @param file The file to read.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.readLinesAsync")
  @js.native
  def readLinesAsync(file: IStorageFile): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  /**
    * Reads the contents of the specified file using the specified character encoding and returns lines of text.
    * @param file The file to read.
    * @param encoding The character encoding to use.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.readLinesAsync")
  @js.native
  def readLinesAsync(file: IStorageFile, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  
  /**
    * Reads the contents of the specified file and returns text.
    * @param file The file to read.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.readTextAsync")
  @js.native
  def readTextAsync(file: IStorageFile): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Reads the contents of the specified file using the specified character encoding and returns text.
    * @param file The file to read.
    * @param encoding The character encoding to use.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.readTextAsync")
  @js.native
  def readTextAsync(file: IStorageFile, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Writes data from a buffer to the specified file.
    * @param file The file that the buffer of data is written to.
    * @param buffer The buffer that contains the data to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.writeBufferAsync")
  @js.native
  def writeBufferAsync(file: IStorageFile, buffer: IBuffer): IPromiseWithIAsyncAction = js.native
  
  /**
    * Writes an array of bytes of data to the specified file.
    * @param file The file that the byte is written to.
    * @param buffer The array of bytes to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.writeBytesAsync")
  @js.native
  def writeBytesAsync(file: IStorageFile, buffer: js.Array[Double]): IPromiseWithIAsyncAction = js.native
  
  /**
    * Writes lines of text to the specified file.
    * @param file The file that the lines are written to.
    * @param lines The list of text strings to write as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String]): IPromiseWithIAsyncAction = js.native
  /**
    * Writes lines of text to the specified file using the specified character encoding.
    * @param file The file that the lines are written to.
    * @param lines The list of text strings to write as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(file: IStorageFile, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
  
  /**
    * Writes text to the specified file.
    * @param file The file that the text is written to.
    * @param contents The text to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.writeTextAsync")
  @js.native
  def writeTextAsync(file: IStorageFile, contents: String): IPromiseWithIAsyncAction = js.native
  /**
    * Writes text to the specified file using the specified character encoding.
    * @param file The file that the text is written to.
    * @param contents The text to write.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.FileIO.writeTextAsync")
  @js.native
  def writeTextAsync(file: IStorageFile, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
}
