package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides helper methods for reading and writing a file using the absolute path or URI of the file. */
@JSGlobal("Windows.Storage.PathIO")
@js.native
abstract class PathIO ()
  extends typings.winrtUwp.Windows.Storage.PathIO
object PathIO {
  
  /**
    * Appends lines of text to the file at the specified path or URI.
    * @param absolutePath The path or URI of the file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(absolutePath: String, lines: IIterable[String]): IPromiseWithIAsyncAction = js.native
  /**
    * Appends lines of text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.appendLinesAsync")
  @js.native
  def appendLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
  
  /**
    * Appends text to the file at the specified path or URI.
    * @param absolutePath The path of the file that the text is appended to.
    * @param contents The text to append.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.appendTextAsync")
  @js.native
  def appendTextAsync(absolutePath: String, contents: String): IPromiseWithIAsyncAction = js.native
  /**
    * Appends text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the text is appended to.
    * @param contents The text to append.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.appendTextAsync")
  @js.native
  def appendTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
  
  /**
    * Reads the contents of the file at the specified path or URI and returns a buffer.
    * @param absolutePath The path of the file to read.
    * @return When this method completes, it returns an object (type IBuffer ) that represents the contents of the file.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.readBufferAsync")
  @js.native
  def readBufferAsync(absolutePath: String): IPromiseWithIAsyncOperation[IBuffer] = js.native
  
  /**
    * Reads the contents of the file at the specified path or URI and returns lines of text.
    * @param absolutePath The path of the file to read.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.readLinesAsync")
  @js.native
  def readLinesAsync(absolutePath: String): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  /**
    * Reads the contents of the file at the specified path or URI using the specified character encoding and returns lines of text.
    * @param absolutePath The path of the file to read.
    * @param encoding The character encoding of the file.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.readLinesAsync")
  @js.native
  def readLinesAsync(absolutePath: String, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[IVector[_]] = js.native
  
  /**
    * Reads the contents of the file at the specified path or URI and returns text.
    * @param absolutePath The path of the file to read.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.readTextAsync")
  @js.native
  def readTextAsync(absolutePath: String): IPromiseWithIAsyncOperation[String] = js.native
  /**
    * Reads the contents of the file at the specified path or URI using the specified character encoding and returns text.
    * @param absolutePath The path of the file to read.
    * @param encoding The character encoding of the file.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.readTextAsync")
  @js.native
  def readTextAsync(absolutePath: String, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Writes data from a buffer to the file at the specified path or URI.
    * @param absolutePath The path of the file that the data is written to.
    * @param buffer The buffer that contains the data to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.writeBufferAsync")
  @js.native
  def writeBufferAsync(absolutePath: String, buffer: IBuffer): IPromiseWithIAsyncAction = js.native
  
  /**
    * Writes a single byte of data to the file at the specified path or URI.
    * @param absolutePath The path of the file that the byte is written to.
    * @param buffer An array of bytes to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.writeBytesAsync")
  @js.native
  def writeBytesAsync(absolutePath: String, buffer: js.Array[Double]): IPromiseWithIAsyncAction = js.native
  
  /**
    * Writes lines of text to the file at the specified path or URI.
    * @param absolutePath The path of the file that the lines are written to.
    * @param lines The list of text strings to append as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String]): IPromiseWithIAsyncAction = js.native
  /**
    * Writes lines of text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.writeLinesAsync")
  @js.native
  def writeLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
  
  /**
    * Writes text to the file at the specified path or URI.
    * @param absolutePath The path of the file that the text is written to.
    * @param contents The text to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.writeTextAsync")
  @js.native
  def writeTextAsync(absolutePath: String, contents: String): IPromiseWithIAsyncAction = js.native
  /**
    * Writes text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the text is written to.
    * @param contents The text to write.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @JSGlobal("Windows.Storage.PathIO.writeTextAsync")
  @js.native
  def writeTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = js.native
}
