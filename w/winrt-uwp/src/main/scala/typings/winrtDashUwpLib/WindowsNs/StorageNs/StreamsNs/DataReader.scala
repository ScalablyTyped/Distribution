package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads data from an input stream. */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
class DataReader protected () extends js.Object {
  /**
                   * Creates and initializes a new instance of the data reader.
                   * @param inputStream The input stream.
                   */
  def this(inputStream: IInputStream) = this()
  /** Gets or sets the byte order of the data in the input stream. */
  var byteOrder: ByteOrder = js.native
  /** Gets or sets the read options for the input stream. */
  var inputStreamOptions: InputStreamOptions = js.native
  /** Gets the size of the buffer that has not been read. */
  var unconsumedBufferLength: scala.Double = js.native
  /** Gets or sets the Unicode character encoding for the input stream. */
  var unicodeEncoding: UnicodeEncoding = js.native
  /** Closes the current stream and releases system resources. */
  def close(): scala.Unit = js.native
  /**
                   * Detaches the buffer that is associated with the data reader.
                   * @return The detached buffer.
                   */
  def detachBuffer(): IBuffer = js.native
  /**
                   * Detaches the stream that is associated with the data reader.
                   * @return The detached stream.
                   */
  def detachStream(): IInputStream = js.native
  /**
                   * Loads data from the input stream.
                   * @param count The count of bytes to load into the intermediate buffer.
                   * @return The asynchronous load data request.
                   */
  def loadAsync(count: scala.Double): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithOperation[_, DataReaderLoadOperation] = js.native
  /**
                   * Reads a Boolean value from the input stream.
                   * @return The value.
                   */
  def readBoolean(): scala.Boolean = js.native
  /**
                   * Reads a buffer from the input stream.
                   * @param length The length of the buffer, in bytes.
                   * @return The buffer.
                   */
  def readBuffer(length: scala.Double): IBuffer = js.native
  /**
                   * Reads a byte value from the input stream.
                   * @return The value.
                   */
  def readByte(): scala.Double = js.native
  /**
                   * Reads an array of byte values from the input stream.
                   * @return The array that receives the byte values.
                   */
  def readBytes(): js.Array[scala.Double] = js.native
  /**
                   * Reads a date and time value from the input stream.
                   * @return The value.
                   */
  def readDateTime(): stdLib.Date = js.native
  /**
                   * Reads a floating-point value from the input stream.
                   * @return The value.
                   */
  def readDouble(): scala.Double = js.native
  /**
                   * Reads a GUID value from the input stream.
                   * @return The value.
                   */
  def readGuid(): java.lang.String = js.native
  /**
                   * Reads a 16-bit integer value from the input stream.
                   * @return The value.
                   */
  def readInt16(): scala.Double = js.native
  /**
                   * Reads a 32-bit integer value from the input stream.
                   * @return The value.
                   */
  def readInt32(): scala.Double = js.native
  /**
                   * Reads a 64-bit integer value from the input stream.
                   * @return The value.
                   */
  def readInt64(): scala.Double = js.native
  /**
                   * Reads a floating-point value from the input stream.
                   * @return The value.
                   */
  def readSingle(): scala.Double = js.native
  /**
                   * Reads a string value from the input stream.
                   * @param codeUnitCount The length of the string.
                   * @return The value.
                   */
  def readString(codeUnitCount: scala.Double): java.lang.String = js.native
  /**
                   * Reads a time-interval value from the input stream.
                   * @return The value.
                   */
  def readTimeSpan(): scala.Double = js.native
  /**
                   * Reads a 16-bit unsigned integer from the input stream.
                   * @return The value.
                   */
  def readUInt16(): scala.Double = js.native
  /**
                   * Reads a 32-bit unsigned integer from the input stream.
                   * @return The value.
                   */
  def readUInt32(): scala.Double = js.native
  /**
                   * Reads a 64-bit unsigned integer from the input stream.
                   * @return The value.
                   */
  def readUInt64(): scala.Double = js.native
}

/** Reads data from an input stream. */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
object DataReader extends js.Object {
  /**
                   * Creates a new instance of the data reader with data from the specified buffer.
                   * @param buffer The buffer.
                   * @return The data reader.
                   */
  def fromBuffer(buffer: winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.IBuffer): winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs.DataReader = js.native
}

