package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides helper methods for reading and writing a file using the absolute path or URI of the file. */
@JSGlobal("Windows.Storage.PathIO")
@js.native
abstract class PathIO () extends js.Object

/** Provides helper methods for reading and writing a file using the absolute path or URI of the file. */
@JSGlobal("Windows.Storage.PathIO")
@js.native
object PathIO extends js.Object {
  /**
               * Appends lines of text to the file at the specified path or URI.
               * @param absolutePath The path or URI of the file that the lines are appended to.
               * @param lines The list of text strings to append as lines.
               * @return No object or value is returned when this method completes.
               */
  def appendLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Appends lines of text to the file at the specified path or URI using the specified character encoding.
               * @param absolutePath The path of the file that the lines are appended to.
               * @param lines The list of text strings to append as lines.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def appendLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Appends text to the file at the specified path or URI.
               * @param absolutePath The path of the file that the text is appended to.
               * @param contents The text to append.
               * @return No object or value is returned when this method completes.
               */
  def appendTextAsync(absolutePath: java.lang.String, contents: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Appends text to the file at the specified path or URI using the specified character encoding.
               * @param absolutePath The path of the file that the text is appended to.
               * @param contents The text to append.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def appendTextAsync(
    absolutePath: java.lang.String,
    contents: java.lang.String,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Reads the contents of the file at the specified path or URI and returns a buffer.
               * @param absolutePath The path of the file to read.
               * @return When this method completes, it returns an object (type IBuffer ) that represents the contents of the file.
               */
  def readBufferAsync(absolutePath: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /**
               * Reads the contents of the file at the specified path or URI and returns lines of text.
               * @param absolutePath The path of the file to read.
               * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
               */
  def readLinesAsync(absolutePath: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
  /**
               * Reads the contents of the file at the specified path or URI using the specified character encoding and returns lines of text.
               * @param absolutePath The path of the file to read.
               * @param encoding The character encoding of the file.
               * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
               */
  def readLinesAsync(
    absolutePath: java.lang.String,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
  /**
               * Reads the contents of the file at the specified path or URI and returns text.
               * @param absolutePath The path of the file to read.
               * @return When this method completes successfully, it returns the contents of the file as a text string.
               */
  def readTextAsync(absolutePath: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
               * Reads the contents of the file at the specified path or URI using the specified character encoding and returns text.
               * @param absolutePath The path of the file to read.
               * @param encoding The character encoding of the file.
               * @return When this method completes successfully, it returns the contents of the file as a text string.
               */
  def readTextAsync(
    absolutePath: java.lang.String,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
               * Writes data from a buffer to the file at the specified path or URI.
               * @param absolutePath The path of the file that the data is written to.
               * @param buffer The buffer that contains the data to write.
               * @return No object or value is returned when this method completes.
               */
  def writeBufferAsync(absolutePath: java.lang.String, buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes a single byte of data to the file at the specified path or URI.
               * @param absolutePath The path of the file that the byte is written to.
               * @param buffer An array of bytes to write.
               * @return No object or value is returned when this method completes.
               */
  def writeBytesAsync(absolutePath: java.lang.String, buffer: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes lines of text to the file at the specified path or URI.
               * @param absolutePath The path of the file that the lines are written to.
               * @param lines The list of text strings to append as lines.
               * @return No object or value is returned when this method completes.
               */
  def writeLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes lines of text to the file at the specified path or URI using the specified character encoding.
               * @param absolutePath The path of the file that the lines are appended to.
               * @param lines The list of text strings to append as lines.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def writeLinesAsync(
    absolutePath: java.lang.String,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes text to the file at the specified path or URI.
               * @param absolutePath The path of the file that the text is written to.
               * @param contents The text to write.
               * @return No object or value is returned when this method completes.
               */
  def writeTextAsync(absolutePath: java.lang.String, contents: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes text to the file at the specified path or URI using the specified character encoding.
               * @param absolutePath The path of the file that the text is written to.
               * @param contents The text to write.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def writeTextAsync(
    absolutePath: java.lang.String,
    contents: java.lang.String,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

