package typings.winrtUwp.global.Windows.Storage.Streams

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.IPromiseWithOperation
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Reads data from an input stream. */
@JSGlobal("Windows.Storage.Streams.DataReader")
@js.native
class DataReader protected ()
  extends typings.winrtUwp.Windows.Storage.Streams.DataReader {
  /**
    * Creates and initializes a new instance of the data reader.
    * @param inputStream The input stream.
    */
  def this(inputStream: IInputStream) = this()
  /** Gets or sets the byte order of the data in the input stream. */
  /* CompleteClass */
  override var byteOrder: typings.winrtUwp.Windows.Storage.Streams.ByteOrder = js.native
  /** Gets or sets the read options for the input stream. */
  /* CompleteClass */
  override var inputStreamOptions: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions = js.native
  /** Gets the size of the buffer that has not been read. */
  /* CompleteClass */
  override var unconsumedBufferLength: Double = js.native
  /** Gets or sets the Unicode character encoding for the input stream. */
  /* CompleteClass */
  override var unicodeEncoding: typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding = js.native
  /** Closes the current stream and releases system resources. */
  /* CompleteClass */
  override def close(): Unit = js.native
  /**
    * Detaches the buffer that is associated with the data reader.
    * @return The detached buffer.
    */
  /* CompleteClass */
  override def detachBuffer(): IBuffer = js.native
  /**
    * Detaches the stream that is associated with the data reader.
    * @return The detached stream.
    */
  /* CompleteClass */
  override def detachStream(): IInputStream = js.native
  /**
    * Loads data from the input stream.
    * @param count The count of bytes to load into the intermediate buffer.
    * @return The asynchronous load data request.
    */
  /* CompleteClass */
  override def loadAsync(count: Double): IPromiseWithOperation[_, typings.winrtUwp.Windows.Storage.Streams.DataReaderLoadOperation] = js.native
  /**
    * Reads a Boolean value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readBoolean(): Boolean = js.native
  /**
    * Reads a buffer from the input stream.
    * @param length The length of the buffer, in bytes.
    * @return The buffer.
    */
  /* CompleteClass */
  override def readBuffer(length: Double): IBuffer = js.native
  /**
    * Reads a byte value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readByte(): Double = js.native
  /**
    * Reads an array of byte values from the input stream.
    * @return The array that receives the byte values.
    */
  /* CompleteClass */
  override def readBytes(): js.Array[Double] = js.native
  /**
    * Reads a date and time value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readDateTime(): Date = js.native
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readDouble(): Double = js.native
  /**
    * Reads a GUID value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readGuid(): String = js.native
  /**
    * Reads a 16-bit integer value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readInt16(): Double = js.native
  /**
    * Reads a 32-bit integer value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readInt32(): Double = js.native
  /**
    * Reads a 64-bit integer value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readInt64(): Double = js.native
  /**
    * Reads a floating-point value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readSingle(): Double = js.native
  /**
    * Reads a string value from the input stream.
    * @param codeUnitCount The length of the string.
    * @return The value.
    */
  /* CompleteClass */
  override def readString(codeUnitCount: Double): String = js.native
  /**
    * Reads a time-interval value from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readTimeSpan(): Double = js.native
  /**
    * Reads a 16-bit unsigned integer from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readUInt16(): Double = js.native
  /**
    * Reads a 32-bit unsigned integer from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readUInt32(): Double = js.native
  /**
    * Reads a 64-bit unsigned integer from the input stream.
    * @return The value.
    */
  /* CompleteClass */
  override def readUInt64(): Double = js.native
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
  def fromBuffer(buffer: IBuffer): typings.winrtUwp.Windows.Storage.Streams.DataReader = js.native
}

