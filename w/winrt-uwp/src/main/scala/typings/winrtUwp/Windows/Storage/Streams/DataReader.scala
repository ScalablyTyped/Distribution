package typings.winrtUwp.Windows.Storage.Streams

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IPromiseWithOperation
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
  var unconsumedBufferLength: Double = js.native
  /** Gets or sets the Unicode character encoding for the input stream. */
  var unicodeEncoding: UnicodeEncoding = js.native
  /** Closes the current stream and releases system resources. */
  def close(): Unit = js.native
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
  def loadAsync(count: Double): IPromiseWithOperation[_, DataReaderLoadOperation] = js.native
  /**
    * Reads a Boolean value from the input stream.
    * @return The value.
    */
  def readBoolean(): Boolean = js.native
  /**
    * Reads a buffer from the input stream.
    * @param length The length of the buffer, in bytes.
    * @return The buffer.
    */
  def readBuffer(length: Double): IBuffer = js.native
  /**
    * Reads a byte value from the input stream.
    * @return The value.
    */
  def readByte(): Double = js.native
  /**
    * Reads an array of byte values from the input stream.
    * @return The array that receives the byte values.
    */
  def readBytes(): js.Array[Double] = js.native
  /**
    * Reads a date and time value from the input stream.
    * @return The value.
    */
  def readDateTime(): Date = js.native
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readDouble(): Double = js.native
  /**
    * Reads a GUID value from the input stream.
    * @return The value.
    */
  def readGuid(): String = js.native
  /**
    * Reads a 16-bit integer value from the input stream.
    * @return The value.
    */
  def readInt16(): Double = js.native
  /**
    * Reads a 32-bit integer value from the input stream.
    * @return The value.
    */
  def readInt32(): Double = js.native
  /**
    * Reads a 64-bit integer value from the input stream.
    * @return The value.
    */
  def readInt64(): Double = js.native
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  def readSingle(): Double = js.native
  /**
    * Reads a string value from the input stream.
    * @param codeUnitCount The length of the string.
    * @return The value.
    */
  def readString(codeUnitCount: Double): String = js.native
  /**
    * Reads a time-interval value from the input stream.
    * @return The value.
    */
  def readTimeSpan(): Double = js.native
  /**
    * Reads a 16-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt16(): Double = js.native
  /**
    * Reads a 32-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt32(): Double = js.native
  /**
    * Reads a 64-bit unsigned integer from the input stream.
    * @return The value.
    */
  def readUInt64(): Double = js.native
}

/* static members */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
object DataReader extends js.Object {
  /**
    * Creates a new instance of the data reader with data from the specified buffer.
    * @param buffer The buffer.
    * @return The data reader.
    */
  def fromBuffer(buffer: IBuffer): DataReader = js.native
}

