package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncAction
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides helper methods for reading and writing a file using the absolute path or URI of the file. */
@JSGlobal("Windows.Storage.PathIO")
@js.native
abstract class PathIO ()
  extends StObject
     with typings.winrtUwp.Windows.Storage.PathIO
object PathIO {
  
  @JSGlobal("Windows.Storage.PathIO")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Appends lines of text to the file at the specified path or URI.
    * @param absolutePath The path or URI of the file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def appendLinesAsync(absolutePath: String, lines: IIterable[String]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Appends lines of text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def appendLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Appends text to the file at the specified path or URI.
    * @param absolutePath The path of the file that the text is appended to.
    * @param contents The text to append.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def appendTextAsync(absolutePath: String, contents: String): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Appends text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the text is appended to.
    * @param contents The text to append.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def appendTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("appendTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Reads the contents of the file at the specified path or URI and returns a buffer.
    * @param absolutePath The path of the file to read.
    * @return When this method completes, it returns an object (type IBuffer ) that represents the contents of the file.
    */
  /* static member */
  @scala.inline
  def readBufferAsync(absolutePath: String): IPromiseWithIAsyncOperation[IBuffer] = ^.asInstanceOf[js.Dynamic].applyDynamic("readBufferAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IBuffer]]
  
  /**
    * Reads the contents of the file at the specified path or URI and returns lines of text.
    * @param absolutePath The path of the file to read.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  @scala.inline
  def readLinesAsync(absolutePath: String): IPromiseWithIAsyncOperation[IVector[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[IVector[js.Any]]]
  /**
    * Reads the contents of the file at the specified path or URI using the specified character encoding and returns lines of text.
    * @param absolutePath The path of the file to read.
    * @param encoding The character encoding of the file.
    * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
    */
  /* static member */
  @scala.inline
  def readLinesAsync(absolutePath: String, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[IVector[js.Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("readLinesAsync")(absolutePath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[IVector[js.Any]]]
  
  /**
    * Reads the contents of the file at the specified path or URI and returns text.
    * @param absolutePath The path of the file to read.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  @scala.inline
  def readTextAsync(absolutePath: String): IPromiseWithIAsyncOperation[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(absolutePath.asInstanceOf[js.Any]).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  /**
    * Reads the contents of the file at the specified path or URI using the specified character encoding and returns text.
    * @param absolutePath The path of the file to read.
    * @param encoding The character encoding of the file.
    * @return When this method completes successfully, it returns the contents of the file as a text string.
    */
  /* static member */
  @scala.inline
  def readTextAsync(absolutePath: String, encoding: UnicodeEncoding): IPromiseWithIAsyncOperation[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("readTextAsync")(absolutePath.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperation[String]]
  
  /**
    * Writes data from a buffer to the file at the specified path or URI.
    * @param absolutePath The path of the file that the data is written to.
    * @param buffer The buffer that contains the data to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def writeBufferAsync(absolutePath: String, buffer: IBuffer): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBufferAsync")(absolutePath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Writes a single byte of data to the file at the specified path or URI.
    * @param absolutePath The path of the file that the byte is written to.
    * @param buffer An array of bytes to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def writeBytesAsync(absolutePath: String, buffer: js.Array[Double]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeBytesAsync")(absolutePath.asInstanceOf[js.Any], buffer.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Writes lines of text to the file at the specified path or URI.
    * @param absolutePath The path of the file that the lines are written to.
    * @param lines The list of text strings to append as lines.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def writeLinesAsync(absolutePath: String, lines: IIterable[String]): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Writes lines of text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the lines are appended to.
    * @param lines The list of text strings to append as lines.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def writeLinesAsync(absolutePath: String, lines: IIterable[String], encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeLinesAsync")(absolutePath.asInstanceOf[js.Any], lines.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  
  /**
    * Writes text to the file at the specified path or URI.
    * @param absolutePath The path of the file that the text is written to.
    * @param contents The text to write.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def writeTextAsync(absolutePath: String, contents: String): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
  /**
    * Writes text to the file at the specified path or URI using the specified character encoding.
    * @param absolutePath The path of the file that the text is written to.
    * @param contents The text to write.
    * @param encoding The character encoding of the file.
    * @return No object or value is returned when this method completes.
    */
  /* static member */
  @scala.inline
  def writeTextAsync(absolutePath: String, contents: String, encoding: UnicodeEncoding): IPromiseWithIAsyncAction = (^.asInstanceOf[js.Dynamic].applyDynamic("writeTextAsync")(absolutePath.asInstanceOf[js.Any], contents.asInstanceOf[js.Any], encoding.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncAction]
}
