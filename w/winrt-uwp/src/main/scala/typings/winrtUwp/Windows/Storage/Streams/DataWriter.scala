package typings.winrtUwp.Windows.Storage.Streams

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Writes data to an output stream. */
@js.native
trait DataWriter extends js.Object {
  /** Gets or sets the byte order of the data in the output stream. */
  var byteOrder: ByteOrder = js.native
  /** Gets or sets the Unicode character encoding for the output stream. */
  var unicodeEncoding: UnicodeEncoding = js.native
  /** Gets the size of the buffer that has not been used. */
  var unstoredBufferLength: Double = js.native
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
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
  def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
  /**
    * Gets the size of a string.
    * @param value The string.
    * @return The size of the string, in bytes.
    */
  def measureString(value: String): Double = js.native
  /**
    * Commits data in the buffer to a backing store.
    * @return The asynchronous store data operation.
    */
  def storeAsync(): IPromiseWithOperation[_, DataWriterStoreOperation] = js.native
  /**
    * Writes a Boolean value to the output stream.
    * @param value The value.
    */
  def writeBoolean(value: Boolean): Unit = js.native
  /**
    * Writes the contents of the specified buffer to the output stream.
    * @param buffer The buffer.
    */
  def writeBuffer(buffer: IBuffer): Unit = js.native
  /**
    * Writes the specified bytes from a buffer to the output stream.
    * @param buffer The buffer.
    * @param start The starting byte.
    * @param count The number of bytes to write.
    */
  def writeBuffer(buffer: IBuffer, start: Double, count: Double): Unit = js.native
  /**
    * Writes a byte value to the output stream.
    * @param value The value.
    */
  def writeByte(value: Double): Unit = js.native
  /**
    * Writes an array of byte values to the output stream.
    * @param value The array of values.
    */
  def writeBytes(value: js.Array[Double]): Unit = js.native
  /**
    * Writes a date and time value to the output stream.
    * @param value The value.
    */
  def writeDateTime(value: Date): Unit = js.native
  /**
    * Writes a floating-point value to the output stream.
    * @param value The value.
    */
  def writeDouble(value: Double): Unit = js.native
  /**
    * Writes a GUID value to the output stream.
    * @param value The value.
    */
  def writeGuid(value: String): Unit = js.native
  /**
    * Writes a 16-bit integer value to the output stream.
    * @param value The value.
    */
  def writeInt16(value: Double): Unit = js.native
  /**
    * Writes a 32-bit integer value to the output stream.
    * @param value The value.
    */
  def writeInt32(value: Double): Unit = js.native
  /**
    * Writes a 64-bit integer value to the output stream.
    * @param value The value.
    */
  def writeInt64(value: Double): Unit = js.native
  /**
    * Writes a floating-point value to the output stream.
    * @param value The value.
    */
  def writeSingle(value: Double): Unit = js.native
  /**
    * Writes a string value to the output stream.
    * @param value The value.
    * @return The length of the string, in bytes.
    */
  def writeString(value: String): Double = js.native
  /**
    * Writes a time-interval value to the output stream.
    * @param value The value.
    */
  def writeTimeSpan(value: Double): Unit = js.native
  /**
    * Writes a 16-bit unsigned integer value to the output stream.
    * @param value The value.
    */
  def writeUInt16(value: Double): Unit = js.native
  /**
    * Writes a 32-bit unsigned integer value to the output stream.
    * @param value The value.
    */
  def writeUInt32(value: Double): Unit = js.native
  /**
    * Writes a 64-bit unsigned integer value to the output stream.
    * @param value The value.
    */
  def writeUInt64(value: Double): Unit = js.native
}

