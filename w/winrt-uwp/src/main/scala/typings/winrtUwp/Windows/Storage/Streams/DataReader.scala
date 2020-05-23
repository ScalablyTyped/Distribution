package typings.winrtUwp.Windows.Storage.Streams

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IPromiseWithOperation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads data from an input stream. */
trait DataReader extends js.Object {
  /** Gets or sets the byte order of the data in the input stream. */
  var byteOrder: ByteOrder
  /** Gets or sets the read options for the input stream. */
  var inputStreamOptions: InputStreamOptions
  /** Gets the size of the buffer that has not been read. */
  var unconsumedBufferLength: Double
  /** Gets or sets the Unicode character encoding for the input stream. */
  var unicodeEncoding: UnicodeEncoding
  /** Closes the current stream and releases system resources. */
  def close(): Unit
  /**
    * Detaches the buffer that is associated with the data reader.
    * @return The detached buffer.
    */
  def detachBuffer(): IBuffer
  /**
    * Detaches the stream that is associated with the data reader.
    * @return The detached stream.
    */
  def detachStream(): IInputStream
  /**
    * Loads data from the input stream.
    * @param count The count of bytes to load into the intermediate buffer.
    * @return The asynchronous load data request.
    */
  def loadAsync(count: Double): IPromiseWithOperation[_, DataReaderLoadOperation]
  /**
    * Reads a Boolean value from the input stream.
    * @return The value.
    */
  def readBoolean(): Boolean
  /**
    * Reads a buffer from the input stream.
    * @param length The length of the buffer, in bytes.
    * @return The buffer.
    */
  def readBuffer(length: Double): IBuffer
  /**
    * Reads a byte value from the input stream.
    * @return The value.
    */
  def readByte(): Double
  /**
    * Reads an array of byte values from the input stream.
    * @return The array that receives the byte values.
    */
  def readBytes(): js.Array[Double]
  /**
    * Reads a date and time value from the input stream.
    * @return The value.
    */
  def readDateTime(): Date
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readDouble(): Double
  /**
    * Reads a GUID value from the input stream.
    * @return The value.
    */
  def readGuid(): String
  /**
    * Reads a 16-bit integer value from the input stream.
    * @return The value.
    */
  def readInt16(): Double
  /**
    * Reads a 32-bit integer value from the input stream.
    * @return The value.
    */
  def readInt32(): Double
  /**
    * Reads a 64-bit integer value from the input stream.
    * @return The value.
    */
  def readInt64(): Double
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readSingle(): Double
  /**
    * Reads a string value from the input stream.
    * @param codeUnitCount The length of the string.
    * @return The value.
    */
  def readString(codeUnitCount: Double): String
  /**
    * Reads a time-interval value from the input stream.
    * @return The value.
    */
  def readTimeSpan(): Double
  /**
    * Reads a 16-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt16(): Double
  /**
    * Reads a 32-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt32(): Double
  /**
    * Reads a 64-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt64(): Double
}

object DataReader {
  @scala.inline
  def apply(
    byteOrder: ByteOrder,
    close: () => Unit,
    detachBuffer: () => IBuffer,
    detachStream: () => IInputStream,
    inputStreamOptions: InputStreamOptions,
    loadAsync: Double => IPromiseWithOperation[_, DataReaderLoadOperation],
    readBoolean: () => Boolean,
    readBuffer: Double => IBuffer,
    readByte: () => Double,
    readBytes: () => js.Array[Double],
    readDateTime: () => Date,
    readDouble: () => Double,
    readGuid: () => String,
    readInt16: () => Double,
    readInt32: () => Double,
    readInt64: () => Double,
    readSingle: () => Double,
    readString: Double => String,
    readTimeSpan: () => Double,
    readUInt16: () => Double,
    readUInt32: () => Double,
    readUInt64: () => Double,
    unconsumedBufferLength: Double,
    unicodeEncoding: UnicodeEncoding
  ): DataReader = {
    val __obj = js.Dynamic.literal(byteOrder = byteOrder.asInstanceOf[js.Any], close = js.Any.fromFunction0(close), detachBuffer = js.Any.fromFunction0(detachBuffer), detachStream = js.Any.fromFunction0(detachStream), inputStreamOptions = inputStreamOptions.asInstanceOf[js.Any], loadAsync = js.Any.fromFunction1(loadAsync), readBoolean = js.Any.fromFunction0(readBoolean), readBuffer = js.Any.fromFunction1(readBuffer), readByte = js.Any.fromFunction0(readByte), readBytes = js.Any.fromFunction0(readBytes), readDateTime = js.Any.fromFunction0(readDateTime), readDouble = js.Any.fromFunction0(readDouble), readGuid = js.Any.fromFunction0(readGuid), readInt16 = js.Any.fromFunction0(readInt16), readInt32 = js.Any.fromFunction0(readInt32), readInt64 = js.Any.fromFunction0(readInt64), readSingle = js.Any.fromFunction0(readSingle), readString = js.Any.fromFunction1(readString), readTimeSpan = js.Any.fromFunction0(readTimeSpan), readUInt16 = js.Any.fromFunction0(readUInt16), readUInt32 = js.Any.fromFunction0(readUInt32), readUInt64 = js.Any.fromFunction0(readUInt64), unconsumedBufferLength = unconsumedBufferLength.asInstanceOf[js.Any], unicodeEncoding = unicodeEncoding.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataReader]
  }
}

