package typings
package winrtDashUwpLib.WindowsNs.StorageNs.StreamsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Writes data to an output stream. */
@JSGlobal("Windows.Storage.Streams.DataWriter")
@js.native
class DataWriter () extends js.Object {
  /**
                   * Creates and initializes a new instance of the data writer to an output stream.
                   * @param outputStream The new output stream instance.
                   */
  def this(outputStream: IOutputStream) = this()
  /** Gets or sets the byte order of the data in the output stream. */
  var byteOrder: ByteOrder = js.native
  /** Gets or sets the Unicode character encoding for the output stream. */
  var unicodeEncoding: UnicodeEncoding = js.native
  /** Gets the size of the buffer that has not been used. */
  var unstoredBufferLength: scala.Double = js.native
  /** Closes the current stream and releases system resources. */
  def close(): scala.Unit = js.native
  /**
                   * Detaches the buffer that is associated with the data writer.
                   * @return The detached buffer.
                   */
  def detachBuffer(): IBuffer = js.native
  /**
                   * Detaches the stream that is associated with the data writer.
                   * @return The detached stream.
                   */
  def detachStream(): IOutputStream = js.native
  /**
                   * Flushes data asynchronously.
                   * @return The stream flush operation.
                   */
  def flushAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithIAsyncOperation[scala.Boolean] = js.native
  /**
                   * Gets the size of a string.
                   * @param value The string.
                   * @return The size of the string, in bytes.
                   */
  def measureString(value: java.lang.String): scala.Double = js.native
  /**
                   * Commits data in the buffer to a backing store.
                   * @return The asynchronous store data operation.
                   */
  def storeAsync(): winrtDashUwpLib.WindowsNs.FoundationNs.IPromiseWithOperation[_, DataWriterStoreOperation] = js.native
  /**
                   * Writes a Boolean value to the output stream.
                   * @param value The value.
                   */
  def writeBoolean(value: scala.Boolean): scala.Unit = js.native
  /**
                   * Writes the contents of the specified buffer to the output stream.
                   * @param buffer The buffer.
                   */
  def writeBuffer(buffer: IBuffer): scala.Unit = js.native
  /**
                   * Writes the specified bytes from a buffer to the output stream.
                   * @param buffer The buffer.
                   * @param start The starting byte.
                   * @param count The number of bytes to write.
                   */
  def writeBuffer(buffer: IBuffer, start: scala.Double, count: scala.Double): scala.Unit = js.native
  /**
                   * Writes a byte value to the output stream.
                   * @param value The value.
                   */
  def writeByte(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes an array of byte values to the output stream.
                   * @param value The array of values.
                   */
  def writeBytes(value: js.Array[scala.Double]): scala.Unit = js.native
  /**
                   * Writes a date and time value to the output stream.
                   * @param value The value.
                   */
  def writeDateTime(value: stdLib.Date): scala.Unit = js.native
  /**
                   * Writes a floating-point value to the output stream.
                   * @param value The value.
                   */
  def writeDouble(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a GUID value to the output stream.
                   * @param value The value.
                   */
  def writeGuid(value: java.lang.String): scala.Unit = js.native
  /**
                   * Writes a 16-bit integer value to the output stream.
                   * @param value The value.
                   */
  def writeInt16(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a 32-bit integer value to the output stream.
                   * @param value The value.
                   */
  def writeInt32(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a 64-bit integer value to the output stream.
                   * @param value The value.
                   */
  def writeInt64(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a floating-point value to the output stream.
                   * @param value The value.
                   */
  def writeSingle(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a string value to the output stream.
                   * @param value The value.
                   * @return The length of the string, in bytes.
                   */
  def writeString(value: java.lang.String): scala.Double = js.native
  /**
                   * Writes a time-interval value to the output stream.
                   * @param value The value.
                   */
  def writeTimeSpan(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a 16-bit unsigned integer value to the output stream.
                   * @param value The value.
                   */
  def writeUInt16(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a 32-bit unsigned integer value to the output stream.
                   * @param value The value.
                   */
  def writeUInt32(value: scala.Double): scala.Unit = js.native
  /**
                   * Writes a 64-bit unsigned integer value to the output stream.
                   * @param value The value.
                   */
  def writeUInt64(value: scala.Double): scala.Unit = js.native
}

