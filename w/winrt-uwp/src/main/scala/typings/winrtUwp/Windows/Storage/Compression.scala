package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.TopLevel
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperationWithProgress
import typings.winrtUwp.Windows.Storage.Streams.IBuffer
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import typings.winrtUwp.Windows.Storage.Streams.InputStreamOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides a unified interface to the compression features included in Windows that frees developers from responsibility for managing block sizes, compression parameters, and other details that the native compression API requires. */
@JSGlobal("Windows.Storage.Compression")
@js.native
object Compression extends js.Object {
  @js.native
  sealed trait CompressAlgorithm extends js.Object
  
  /** A compressor takes information written to a stream and compresses it using a compression algorithm. */
  @js.native
  class Compressor protected () extends js.Object {
    /**
      * Creates an instance of a compressor.
      * @param underlyingStream The stream of compressed information to be written by the compressor.
      */
    def this(underlyingStream: IOutputStream) = this()
    /**
      * Creates an instance of a compressor.
      * @param underlyingStream The stream of compressed information to be written by the compressor.
      * @param algorithm The compression algorithm used by the compressor to write underlyingStream.
      * @param blockSize Size in bytes of the intermediate buffer used by the compression algorithm. A value of 0 specifies that the compression algorithm will use its default block size. Valid non-zero values for this parameter are 32Kb to 64Mb.
      */
    def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
    /** Closes a Compressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Compressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except for Compressor.Close, will fail. */
    def close(): Unit = js.native
    /**
      * Detaches the underlying stream from the Compressor object so that the object can be closed using the Compressor.Close method without also closing the underlying stream.
      * @return The stream of information.
      */
    def detachStream(): IOutputStream = js.native
    /**
      * Finishes writing the compression stream.
      * @return The asynchronous operation.
      */
    def finishAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    /**
      * Flushes the compression stream asynchronously.
      * @return The asynchronous operation.
      */
    def flushAsync(): IPromiseWithIAsyncOperation[Boolean] = js.native
    /**
      * Writes information to the compression stream asynchronously.
      * @param buffer The buffer that contains the information to be written to the stream.
      * @return The asynchronous operation.
      */
    def writeAsync(buffer: IBuffer): IPromiseWithIAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  /** A decompressor takes a stream compressed by a compressor and decompresses it. */
  @js.native
  class Decompressor protected () extends js.Object {
    /**
      * This method creates an instance of a decompressor.
      * @param underlyingStream The stream of compressed information to be read and decompressed by the decompressor.
      */
    def this(underlyingStream: IInputStream) = this()
    /** Closes a Decompressor object and synchronously discards any information in buffers. This will close the underlying stream as well unless the Decompressor.Detach method has been used to detach the stream from the object. Subsequent calls on a closed object, except Decompressor.Close, will fail. */
    def close(): Unit = js.native
    /**
      * Detaches the underlying stream from the Decompressor object so that the object can be closed using the Decompressor.Close method without also closing the underlying stream.
      * @return The stream of information.
      */
    def detachStream(): IInputStream = js.native
    /**
      * Reads from the compression stream asynchronously.
      * @param buffer The buffer that contains the information to be read from the stream.
      * @param count The number of bytes to read.
      * @param options Read options
      * @return The asynchronous operation.
      */
    def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IPromiseWithIAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
  
  /** Identifies a compression algorithm to use when creating an instance of a compressor. */
  @js.native
  object CompressAlgorithm extends js.Object {
    /** This value represents an invalid compression algorithm. It is useful primarily for error checking. */
    @js.native
    sealed trait invalidAlgorithm extends CompressAlgorithm
    
    /** The compressor will use the LZMS compression algorithm. */
    @js.native
    sealed trait lzms extends CompressAlgorithm
    
    /** The compressor will use the MSZIP compression algorithm. */
    @js.native
    sealed trait mszip extends CompressAlgorithm
    
    /** This value represents an algorithm that passes data through with no compression. It is useful primarily for testing. */
    @js.native
    sealed trait nullAlgorithm extends CompressAlgorithm
    
    /** The compressor will use the XPRESS compression algorithm. */
    @js.native
    sealed trait xpress extends CompressAlgorithm
    
    /** The compressor will use the XPRESS compression algorithm with Huffman encoding. */
    @js.native
    sealed trait xpressHuff extends CompressAlgorithm
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[CompressAlgorithm with Double] = js.native
    /* 0 */ @js.native
    object invalidAlgorithm extends TopLevel[invalidAlgorithm with Double]
    
    /* 5 */ @js.native
    object lzms extends TopLevel[lzms with Double]
    
    /* 2 */ @js.native
    object mszip extends TopLevel[mszip with Double]
    
    /* 1 */ @js.native
    object nullAlgorithm extends TopLevel[nullAlgorithm with Double]
    
    /* 3 */ @js.native
    object xpress extends TopLevel[xpress with Double]
    
    /* 4 */ @js.native
    object xpressHuff extends TopLevel[xpressHuff with Double]
    
  }
  
}

