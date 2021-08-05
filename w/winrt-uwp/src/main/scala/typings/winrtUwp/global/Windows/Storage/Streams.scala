package typings.winrtUwp.global.Windows.Storage

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.AsyncOperationCompletedHandler
import typings.winrtUwp.Windows.Foundation.AsyncStatus
import typings.winrtUwp.Windows.Foundation.IAsyncOperation
import typings.winrtUwp.Windows.Foundation.IMemoryBuffer
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.IPromiseWithOperation
import typings.winrtUwp.Windows.Foundation.MemoryBuffer
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.ByteOrder
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStreamWithContentType
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding
import typings.winrtUwp.Windows.WinRTError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for reading to and writing from sequential and random access streams. */
object Streams {
  
  /** Provides a default implementation of the IBuffer interface and its related interfaces. */
  @JSGlobal("Windows.Storage.Streams.Buffer")
  @js.native
  class Buffer protected ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.Buffer {
    /**
      * Initializes a new instance of the Buffer class with the specified capacity.
      * @param capacity The maximum number of bytes that the buffer can hold.
      */
    def this(capacity: Double) = this()
    
    /* CompleteClass */
    var byteLength: js.Any = js.native
    
    /* unmapped type */
    /** Gets the maximum number of bytes that the buffer can hold. */
    /* CompleteClass */
    var capacity: Double = js.native
    
    /** Gets the number of bytes currently in use in the buffer. */
    /* CompleteClass */
    var length: Double = js.native
  }
  object Buffer {
    
    @JSGlobal("Windows.Storage.Streams.Buffer")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new buffer containing a copy of a specified buffer.
      * @param input The buffer to be copied.
      * @return The newly created copy.
      */
    /* static member */
    inline def createCopyFromMemoryBuffer(input: IMemoryBuffer): typings.winrtUwp.Windows.Storage.Streams.Buffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createCopyFromMemoryBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Storage.Streams.Buffer]
    
    /**
      * Creates a MemoryBuffer from an existing IBuffer .
      * @param input The input IBuffer .
      * @return The newly created MemoryBuffer .
      */
    /* static member */
    inline def createMemoryBufferOverIBuffer(input: IBuffer): MemoryBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("createMemoryBufferOverIBuffer")(input.asInstanceOf[js.Any]).asInstanceOf[MemoryBuffer]
  }
  
  /** Specifies the byte order of a stream. */
  @JSGlobal("Windows.Storage.Streams.ByteOrder")
  @js.native
  object ByteOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Streams.ByteOrder & Double] = js.native
    
    /* 1 */ val bigEndian: typings.winrtUwp.Windows.Storage.Streams.ByteOrder.bigEndian & Double = js.native
    
    /* 0 */ val littleEndian: typings.winrtUwp.Windows.Storage.Streams.ByteOrder.littleEndian & Double = js.native
  }
  
  /** Reads data from an input stream. */
  @JSGlobal("Windows.Storage.Streams.DataReader")
  @js.native
  class DataReader protected ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.DataReader {
    /**
      * Creates and initializes a new instance of the data reader.
      * @param inputStream The input stream.
      */
    def this(inputStream: IInputStream) = this()
    
    /** Gets or sets the byte order of the data in the input stream. */
    /* CompleteClass */
    var byteOrder: ByteOrder = js.native
    
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
    
    /** Gets or sets the read options for the input stream. */
    /* CompleteClass */
    var inputStreamOptions: InputStreamOptions = js.native
    
    /**
      * Loads data from the input stream.
      * @param count The count of bytes to load into the intermediate buffer.
      * @return The asynchronous load data request.
      */
    /* CompleteClass */
    override def loadAsync(count: Double): IPromiseWithOperation[js.Any, typings.winrtUwp.Windows.Storage.Streams.DataReaderLoadOperation] = js.native
    
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
    
    /** Gets the size of the buffer that has not been read. */
    /* CompleteClass */
    var unconsumedBufferLength: Double = js.native
    
    /** Gets or sets the Unicode character encoding for the input stream. */
    /* CompleteClass */
    var unicodeEncoding: UnicodeEncoding = js.native
  }
  object DataReader {
    
    @JSGlobal("Windows.Storage.Streams.DataReader")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a new instance of the data reader with data from the specified buffer.
      * @param buffer The buffer.
      * @return The data reader.
      */
    /* static member */
    inline def fromBuffer(buffer: IBuffer): typings.winrtUwp.Windows.Storage.Streams.DataReader = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Storage.Streams.DataReader]
  }
  
  /** Loads data from an input stream. */
  @JSGlobal("Windows.Storage.Streams.DataReaderLoadOperation")
  @js.native
  abstract class DataReaderLoadOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.DataReaderLoadOperation {
    
    /** Requests the cancellation of the data load operation. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Requests that work associated with the data load operation should stop. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets the handler to call when the data load operation is complete. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
    /** Gets or sets the handler to call when the data load operation is complete. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
    
    /** Gets the error code for the data load operation if it fails. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /**
      * Returns the result of the data load operation.
      * @return The result of the operation.
      */
    /* CompleteClass */
    override def getResults(): Double = js.native
    
    /** Gets a unique identifier that represents the data load operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Gets the current status of the data load operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Writes data to an output stream. */
  @JSGlobal("Windows.Storage.Streams.DataWriter")
  @js.native
  /** Creates and initializes a new instance of the data writer. */
  class DataWriter ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.DataWriter {
    /**
      * Creates and initializes a new instance of the data writer to an output stream.
      * @param outputStream The new output stream instance.
      */
    def this(outputStream: IOutputStream) = this()
  }
  
  /** Commits data in a buffer to a backing store. */
  @JSGlobal("Windows.Storage.Streams.DataWriterStoreOperation")
  @js.native
  abstract class DataWriterStoreOperation ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.DataWriterStoreOperation {
    
    /** Requests the cancellation of the data store operation. */
    /* CompleteClass */
    override def cancel(): Unit = js.native
    
    /** Requests that work associated with the data store operation should stop. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /** Gets or sets the handler to call when the data store operation is complete. */
    /* CompleteClass */
    override def completed(asyncInfo: IAsyncOperation[Double], asyncStatus: AsyncStatus): Unit = js.native
    /** Gets or sets the handler to call when the data store operation is complete. */
    /* CompleteClass */
    @JSName("completed")
    var completed_Original: AsyncOperationCompletedHandler[Double] = js.native
    
    /** Gets the error code for the data store operation if it fails. */
    /* CompleteClass */
    var errorCode: WinRTError = js.native
    
    /**
      * Returns the result of the data store operation.
      * @return The result of the operation.
      */
    /* CompleteClass */
    override def getResults(): Double = js.native
    
    /** Gets a unique identifier that represents the data store operation. */
    /* CompleteClass */
    var id: Double = js.native
    
    /** Gets the current status of the data store operation. */
    /* CompleteClass */
    var status: AsyncStatus = js.native
  }
  
  /** Reads data from a file. */
  @JSGlobal("Windows.Storage.Streams.FileInputStream")
  @js.native
  abstract class FileInputStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.FileInputStream {
    
    /** Closes the current stream and releases system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Returns an asynchronous byte reader object.
      * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
      * @param count The number of bytes to read that is less than or equal to the Capacity value.
      * @param options Specifies the type of the asynchronous read operation.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  /** Writes data to a file. */
  @JSGlobal("Windows.Storage.Streams.FileOutputStream")
  @js.native
  abstract class FileOutputStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.FileOutputStream {
    
    /** Closes the current stream and releases system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Flushes data asynchronously in a sequential stream.
      * @return The stream flush operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Writes data asynchronously to a file.
      * @param buffer The buffer into which the asynchronous writer operation writes.
      * @return The byte writer operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Supports reading and writing to a file at a specified position. */
  @JSGlobal("Windows.Storage.Streams.FileRandomAccessStream")
  @js.native
  abstract class FileRandomAccessStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.FileRandomAccessStream {
    
    /** Gets a value that indicates whether the stream can be read from. */
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /** Gets a value that indicates whether the file can be written to. */
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /**
      * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
      * @return The new stream. The initial, internal position of the stream is 0.
      */
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /** Closes the current stream and releases system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Flushes data asynchronously in a sequential stream.
      * @return The stream flush operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Returns an input stream at a specified location in a stream.
      * @param position The location in the stream at which to begin.
      * @return The input stream.
      */
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /**
      * Returns an output stream at a specified location in a stream.
      * @param position The location in the output stream at which to begin.
      * @return The output stream.
      */
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /** Gets the byte offset of the stream. */
    /* CompleteClass */
    var position: Double = js.native
    
    /**
      * Returns an asynchronous byte reader object.
      * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
      * @param count The number of bytes to read that is less than or equal to the Capacity value.
      * @param options Specifies the type of the asynchronous read operation.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /**
      * Sets the position of the stream to the specified value.
      * @param position The new position of the stream.
      */
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /** Gets or sets the size of the random access stream. */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * Writes data asynchronously to a file.
      * @param buffer The buffer into which the asynchronous writer operation writes.
      * @return The byte writer operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Provides random access of data in input and output streams that are stored in memory instead of on disk. */
  @JSGlobal("Windows.Storage.Streams.InMemoryRandomAccessStream")
  @js.native
  /** Creates a new instance of the InMemoryRandomAccessStream class. */
  class InMemoryRandomAccessStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.InMemoryRandomAccessStream {
    
    /** Gets a value that indicates whether the stream can be read from. */
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /** Gets a value that indicates whether the stream can be written to. */
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /**
      * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
      * @return The new stream. The initial, internal position of the stream is 0.
      */
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /** Closes the current stream and releases system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Flushes data asynchronously in a sequential stream.
      * @return The stream flush operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Returns an input stream at a specified location in a stream.
      * @param position The location in the stream at which to begin.
      * @return The input stream.
      */
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /**
      * Returns an output stream at a specified location in a stream.
      * @param position The location in the output stream at which to begin.
      * @return The output stream.
      */
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /** Gets the byte offset of the stream. */
    /* CompleteClass */
    var position: Double = js.native
    
    /**
      * Returns an asynchronous byte reader object.
      * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
      * @param count The number of bytes to read that is less than or equal to the Capacity value.
      * @param options Specifies the type of the asynchronous read operation.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /**
      * Sets the position of the stream to the specified value.
      * @param position The new position of the stream.
      */
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /** Gets or sets the size of the random access stream. */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * Writes data asynchronously in a sequential stream.
      * @param buffer The buffer into which the asynchronous writer operation writes.
      * @return The byte writer operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Specifies the read options for an input stream. */
  @JSGlobal("Windows.Storage.Streams.InputStreamOptions")
  @js.native
  object InputStreamOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions & Double] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions.none & Double = js.native
    
    /* 1 */ val partial: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions.partial & Double = js.native
    
    /* 2 */ val readAhead: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions.readAhead & Double = js.native
  }
  
  /** Provides a Windows Runtime input stream for an IStream base implementation. */
  @JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
  @js.native
  abstract class InputStreamOverStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.InputStreamOverStream {
    
    /** Closes the current stream and releases system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Returns an asynchronous byte reader object.
      * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
      * @param count The number of bytes to read that is less than or equal to the Capacity value.
      * @param options Specifies the type of the asynchronous read operation.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  /** Provides a Windows Runtime output stream for an IStream base implementation. */
  @JSGlobal("Windows.Storage.Streams.OutputStreamOverStream")
  @js.native
  abstract class OutputStreamOverStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.OutputStreamOverStream {
    
    /** Closes the current stream and releases system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Flushes data asynchronously in a sequential stream.
      * @return The stream flush operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Writes data asynchronously in a sequential stream.
      * @param buffer The buffer into which the asynchronous writer operation writes.
      * @return The byte writer operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Provides random access of data in input and output streams. */
  @JSGlobal("Windows.Storage.Streams.RandomAccessStream")
  @js.native
  abstract class RandomAccessStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.RandomAccessStream
  object RandomAccessStream {
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Copies a source stream to a destination stream and waits for the copy operation to complete.
      * @param source The stream to copy data from.
      * @param destination The stream to copy data to.
      * @return The asynchronous operation.
      */
    /* static member */
    inline def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAndCloseAsync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperationWithProgress[Double, Double]]
    
    /**
      * Copies a source stream to a destination stream.
      * @param source The stream to copy data from.
      * @param destination The stream to copy data to.
      * @return The asynchronous operation.
      */
    /* static member */
    inline def copyAsync(source: IInputStream, destination: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperationWithProgress[Double, Double]]
    /**
      * Copies the specified number of bytes from a source stream to a destination stream.
      * @param source The stream to copy data from.
      * @param destination The stream to copy data to.
      * @param bytesToCopy The number of bytes to copy.
      * @return The asynchronous operation.
      */
    /* static member */
    inline def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IPromiseWithIAsyncOperationWithProgress[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("copyAsync")(source.asInstanceOf[js.Any], destination.asInstanceOf[js.Any], bytesToCopy.asInstanceOf[js.Any])).asInstanceOf[IPromiseWithIAsyncOperationWithProgress[Double, Double]]
  }
  
  /** Provides a Windows Runtime random access stream for an IStream base implementation. */
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamOverStream")
  @js.native
  abstract class RandomAccessStreamOverStream ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamOverStream {
    
    /** Gets a value that indicates whether the stream can be read from. */
    /* CompleteClass */
    var canRead: Boolean = js.native
    
    /** Gets a value that indicates whether the stream can be written to. */
    /* CompleteClass */
    var canWrite: Boolean = js.native
    
    /**
      * Creates a new instance of a IRandomAccessStream over the same resource as the current stream.
      * @return The new stream. The initial, internal position of the stream is 0.
      */
    /* CompleteClass */
    override def cloneStream(): IRandomAccessStream = js.native
    
    /** Closes the current stream and releases system resources. */
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /**
      * Flushes data asynchronously in a sequential stream.
      * @return The stream flush operation.
      */
    /* CompleteClass */
    override def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    
    /**
      * Returns an input stream at a specified location in a stream.
      * @param position The location in the stream at which to begin.
      * @return The input stream.
      */
    /* CompleteClass */
    override def getInputStreamAt(position: Double): IInputStream = js.native
    
    /**
      * Returns an output stream at a specified location in a stream.
      * @param position The location in the output stream at which to begin.
      * @return The output stream.
      */
    /* CompleteClass */
    override def getOutputStreamAt(position: Double): IOutputStream = js.native
    
    /** Gets the byte offset of the stream. */
    /* CompleteClass */
    var position: Double = js.native
    
    /**
      * Returns an asynchronous byte reader object.
      * @param buffer The buffer into which the asynchronous read operation places the bytes that are read.
      * @param count The number of bytes to read that is less than or equal to the Capacity value.
      * @param options Specifies the type of the asynchronous read operation.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
    
    /**
      * Sets the position of the stream to the specified value.
      * @param position The new position of the stream.
      */
    /* CompleteClass */
    override def seek(position: Double): Unit = js.native
    
    /** Gets or sets the size of the random access stream. */
    /* CompleteClass */
    var size: Double = js.native
    
    /**
      * Writes data asynchronously in a sequential stream.
      * @param buffer The buffer into which the asynchronous writer operation writes.
      * @return The byte writer operation.
      */
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Provides random access of data in input and output streams for a file. */
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
  @js.native
  abstract class RandomAccessStreamReference ()
    extends StObject
       with typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference {
    
    /**
      * Opens a stream for random access.
      * @return The asynchronous operation.
      */
    /* CompleteClass */
    override def openReadAsync(): IPromiseWithIAsyncOperation[IRandomAccessStreamWithContentType] = js.native
  }
  object RandomAccessStreamReference {
    
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Creates a random access stream around a file.
      * @param file The file to create a stream around.
      * @return The stream that encapsulates file.
      */
    /* static member */
    inline def createFromFile(file: IStorageFile): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromFile")(file.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference]
    
    /**
      * Creates a random access stream around the specified stream.
      * @param stream The source stream.
      * @return The random access stream that encapsulates stream.
      */
    /* static member */
    inline def createFromStream(stream: IRandomAccessStream): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromStream")(stream.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference]
    
    /**
      * Creates a random access stream around the specified URI.
      * @param uri The URI to create the stream around. The valid URI schemes are http, https, ms-appx, and ms-appdata.
      * @return The random access stream that encapsulates uri.
      */
    /* static member */
    inline def createFromUri(uri: Uri): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromUri")(uri.asInstanceOf[js.Any]).asInstanceOf[typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference]
  }
  
  /** Specifies the type of character encoding for a stream. */
  @JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
  @js.native
  object UnicodeEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding & Double] = js.native
    
    /* 2 */ val utf16BE: typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding.utf16BE & Double = js.native
    
    /* 1 */ val utf16LE: typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding.utf16LE & Double = js.native
    
    /* 0 */ val utf8: typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding.utf8 & Double = js.native
  }
}
