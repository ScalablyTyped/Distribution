package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Foundation.IMemoryBuffer
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Foundation.MemoryBuffer
import typings.winrtUwp.Windows.Foundation.Uri
import typings.winrtUwp.Windows.Storage.IStorageFile
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.IRandomAccessStream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides support for reading to and writing from sequential and random access streams. */
object Streams {
  
  /** Provides a default implementation of the IBuffer interface and its related interfaces. */
  @JSGlobal("Windows.Storage.Streams.Buffer")
  @js.native
  class Buffer protected ()
    extends typings.winrtUwp.Windows.Storage.Streams.Buffer {
    /**
      * Initializes a new instance of the Buffer class with the specified capacity.
      * @param capacity The maximum number of bytes that the buffer can hold.
      */
    def this(capacity: Double) = this()
  }
  object Buffer {
    
    /**
      * Creates a new buffer containing a copy of a specified buffer.
      * @param input The buffer to be copied.
      * @return The newly created copy.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.Buffer.createCopyFromMemoryBuffer")
    @js.native
    def createCopyFromMemoryBuffer(input: IMemoryBuffer): typings.winrtUwp.Windows.Storage.Streams.Buffer = js.native
    
    /**
      * Creates a MemoryBuffer from an existing IBuffer .
      * @param input The input IBuffer .
      * @return The newly created MemoryBuffer .
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.Buffer.createMemoryBufferOverIBuffer")
    @js.native
    def createMemoryBufferOverIBuffer(input: IBuffer): MemoryBuffer = js.native
  }
  
  /** Specifies the byte order of a stream. */
  @JSGlobal("Windows.Storage.Streams.ByteOrder")
  @js.native
  object ByteOrder extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Streams.ByteOrder with Double] = js.native
    
    /* 1 */ val bigEndian: typings.winrtUwp.Windows.Storage.Streams.ByteOrder.bigEndian with Double = js.native
    
    /* 0 */ val littleEndian: typings.winrtUwp.Windows.Storage.Streams.ByteOrder.littleEndian with Double = js.native
  }
  
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
  }
  object DataReader {
    
    /**
      * Creates a new instance of the data reader with data from the specified buffer.
      * @param buffer The buffer.
      * @return The data reader.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.DataReader.fromBuffer")
    @js.native
    def fromBuffer(buffer: IBuffer): typings.winrtUwp.Windows.Storage.Streams.DataReader = js.native
  }
  
  /** Loads data from an input stream. */
  @JSGlobal("Windows.Storage.Streams.DataReaderLoadOperation")
  @js.native
  abstract class DataReaderLoadOperation ()
    extends typings.winrtUwp.Windows.Storage.Streams.DataReaderLoadOperation
  
  /** Writes data to an output stream. */
  @JSGlobal("Windows.Storage.Streams.DataWriter")
  @js.native
  /** Creates and initializes a new instance of the data writer. */
  class DataWriter ()
    extends typings.winrtUwp.Windows.Storage.Streams.DataWriter {
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
    extends typings.winrtUwp.Windows.Storage.Streams.DataWriterStoreOperation
  
  /** Reads data from a file. */
  @JSGlobal("Windows.Storage.Streams.FileInputStream")
  @js.native
  abstract class FileInputStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.FileInputStream
  
  /** Writes data to a file. */
  @JSGlobal("Windows.Storage.Streams.FileOutputStream")
  @js.native
  abstract class FileOutputStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.FileOutputStream
  
  /** Supports reading and writing to a file at a specified position. */
  @JSGlobal("Windows.Storage.Streams.FileRandomAccessStream")
  @js.native
  abstract class FileRandomAccessStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.FileRandomAccessStream
  
  /** Provides random access of data in input and output streams that are stored in memory instead of on disk. */
  @JSGlobal("Windows.Storage.Streams.InMemoryRandomAccessStream")
  @js.native
  /** Creates a new instance of the InMemoryRandomAccessStream class. */
  class InMemoryRandomAccessStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.InMemoryRandomAccessStream
  
  /** Specifies the read options for an input stream. */
  @JSGlobal("Windows.Storage.Streams.InputStreamOptions")
  @js.native
  object InputStreamOptions extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions with Double] = js.native
    
    /* 0 */ val none: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions.none with Double = js.native
    
    /* 1 */ val partial: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions.partial with Double = js.native
    
    /* 2 */ val readAhead: typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions.readAhead with Double = js.native
  }
  
  /** Provides a Windows Runtime input stream for an IStream base implementation. */
  @JSGlobal("Windows.Storage.Streams.InputStreamOverStream")
  @js.native
  abstract class InputStreamOverStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.InputStreamOverStream
  
  /** Provides a Windows Runtime output stream for an IStream base implementation. */
  @JSGlobal("Windows.Storage.Streams.OutputStreamOverStream")
  @js.native
  abstract class OutputStreamOverStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.OutputStreamOverStream
  
  /** Provides random access of data in input and output streams. */
  @JSGlobal("Windows.Storage.Streams.RandomAccessStream")
  @js.native
  abstract class RandomAccessStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.RandomAccessStream
  object RandomAccessStream {
    
    /**
      * Copies a source stream to a destination stream and waits for the copy operation to complete.
      * @param source The stream to copy data from.
      * @param destination The stream to copy data to.
      * @return The asynchronous operation.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream.copyAndCloseAsync")
    @js.native
    def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
    
    /**
      * Copies a source stream to a destination stream.
      * @param source The stream to copy data from.
      * @param destination The stream to copy data to.
      * @return The asynchronous operation.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream.copyAsync")
    @js.native
    def copyAsync(source: IInputStream, destination: IOutputStream): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
    /**
      * Copies the specified number of bytes from a source stream to a destination stream.
      * @param source The stream to copy data from.
      * @param destination The stream to copy data to.
      * @param bytesToCopy The number of bytes to copy.
      * @return The asynchronous operation.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.RandomAccessStream.copyAsync")
    @js.native
    def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** Provides a Windows Runtime random access stream for an IStream base implementation. */
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamOverStream")
  @js.native
  abstract class RandomAccessStreamOverStream ()
    extends typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamOverStream
  
  /** Provides random access of data in input and output streams for a file. */
  @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference")
  @js.native
  abstract class RandomAccessStreamReference ()
    extends typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference
  object RandomAccessStreamReference {
    
    /**
      * Creates a random access stream around a file.
      * @param file The file to create a stream around.
      * @return The stream that encapsulates file.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference.createFromFile")
    @js.native
    def createFromFile(file: IStorageFile): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    /**
      * Creates a random access stream around the specified stream.
      * @param stream The source stream.
      * @return The random access stream that encapsulates stream.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference.createFromStream")
    @js.native
    def createFromStream(stream: IRandomAccessStream): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
    
    /**
      * Creates a random access stream around the specified URI.
      * @param uri The URI to create the stream around. The valid URI schemes are http, https, ms-appx, and ms-appdata.
      * @return The random access stream that encapsulates uri.
      */
    /* static member */
    @JSGlobal("Windows.Storage.Streams.RandomAccessStreamReference.createFromUri")
    @js.native
    def createFromUri(uri: Uri): typings.winrtUwp.Windows.Storage.Streams.RandomAccessStreamReference = js.native
  }
  
  /** Specifies the type of character encoding for a stream. */
  @JSGlobal("Windows.Storage.Streams.UnicodeEncoding")
  @js.native
  object UnicodeEncoding extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding with Double] = js.native
    
    /* 2 */ val utf16BE: typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding.utf16BE with Double = js.native
    
    /* 1 */ val utf16LE: typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding.utf16LE with Double = js.native
    
    /* 0 */ val utf8: typings.winrtUwp.Windows.Storage.Streams.UnicodeEncoding.utf8 with Double = js.native
  }
}
