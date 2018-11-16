package typings
package winrtDashUwpLib.WindowsNs.StorageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides helper methods for reading and writing files that are represented by objects of type IStorageFile . */
@JSGlobal("Windows.Storage.FileIO")
@js.native
abstract class FileIO () extends js.Object

/** Provides helper methods for reading and writing files that are represented by objects of type IStorageFile . */
@JSGlobal("Windows.Storage.FileIO")
@js.native
object FileIO extends js.Object {
  /**
               * Appends lines of text to the specified file.
               * @param file The file that the lines are appended to.
               * @param lines The list of text strings to append as lines.
               * @return No object or value is returned when this method completes.
               */
  def appendLinesAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Appends lines of text to the specified file using the specified character encoding.
               * @param file The file that the lines are appended to.
               * @param lines The list of text strings to append as lines.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def appendLinesAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Appends text to the specified file.
               * @param file The file that the text is appended to.
               * @param contents The text to append.
               * @return No object or value is returned when this method completes.
               */
  def appendTextAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile, contents: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Appends text to the specified file using the specified character encoding.
               * @param file The file that the text is appended to.
               * @param contents The text to append.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def appendTextAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    contents: java.lang.String,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Reads the contents of the specified file and returns a buffer.
               * @param file The file to read.
               * @return When this method completes, it returns an object (type IBuffer ) that represents the contents of the file.
               */
  def readBufferAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer] = js.native
  /**
               * Reads the contents of the specified file and returns lines of text.
               * @param file The file to read.
               * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
               */
  def readLinesAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
  /**
               * Reads the contents of the specified file using the specified character encoding and returns lines of text.
               * @param file The file to read.
               * @param encoding The character encoding to use.
               * @return When this method completes successfully, it returns the contents of the file as a list (type IVector ) of lines of text. Each line of text in the list is represented by a String object.
               */
  def readLinesAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[_]] = js.native
  /**
               * Reads the contents of the specified file and returns text.
               * @param file The file to read.
               * @return When this method completes successfully, it returns the contents of the file as a text string.
               */
  def readTextAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
               * Reads the contents of the specified file using the specified character encoding and returns text.
               * @param file The file to read.
               * @param encoding The character encoding to use.
               * @return When this method completes successfully, it returns the contents of the file as a text string.
               */
  def readTextAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[java.lang.String] = js.native
  /**
               * Writes data from a buffer to the specified file.
               * @param file The file that the buffer of data is written to.
               * @param buffer The buffer that contains the data to write.
               * @return No object or value is returned when this method completes.
               */
  def writeBufferAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes an array of bytes of data to the specified file.
               * @param file The file that the byte is written to.
               * @param buffer The array of bytes to write.
               * @return No object or value is returned when this method completes.
               */
  def writeBytesAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile, buffer: js.Array[scala.Double]): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes lines of text to the specified file.
               * @param file The file that the lines are written to.
               * @param lines The list of text strings to write as lines.
               * @return No object or value is returned when this method completes.
               */
  def writeLinesAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String]
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes lines of text to the specified file using the specified character encoding.
               * @param file The file that the lines are written to.
               * @param lines The list of text strings to write as lines.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def writeLinesAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    lines: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IIterable[java.lang.String],
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes text to the specified file.
               * @param file The file that the text is written to.
               * @param contents The text to write.
               * @return No object or value is returned when this method completes.
               */
  def writeTextAsync(file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile, contents: java.lang.String): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
  /**
               * Writes text to the specified file using the specified character encoding.
               * @param file The file that the text is written to.
               * @param contents The text to write.
               * @param encoding The character encoding of the file.
               * @return No object or value is returned when this method completes.
               */
  def writeTextAsync(
    file: winrtDashUwpLib.WindowsNs.StorageNs.IStorageFile,
    contents: java.lang.String,
    encoding: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.UnicodeEncoding
  ): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncAction = js.native
}

