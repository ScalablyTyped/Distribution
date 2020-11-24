package typings.winrtUwp.global.Windows.Storage

import typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import typings.winrtUwp.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides a unified interface to the compression features included in Windows that frees developers from responsibility for managing block sizes, compression parameters, and other details that the native compression API requires. */
@JSGlobal("Windows.Storage.Compression")
@js.native
object Compression extends js.Object {
  
  /** Identifies a compression algorithm to use when creating an instance of a compressor. */
  @js.native
  object CompressAlgorithm extends js.Object {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm with Double] = js.native
    
    /* 0 */ val invalidAlgorithm: typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.invalidAlgorithm with Double = js.native
    
    /* 5 */ val lzms: typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.lzms with Double = js.native
    
    /* 2 */ val mszip: typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.mszip with Double = js.native
    
    /* 1 */ val nullAlgorithm: typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.nullAlgorithm with Double = js.native
    
    /* 3 */ val xpress: typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.xpress with Double = js.native
    
    /* 4 */ val xpressHuff: typings.winrtUwp.Windows.Storage.Compression.CompressAlgorithm.xpressHuff with Double = js.native
  }
  
  /** A compressor takes information written to a stream and compresses it using a compression algorithm. */
  @js.native
  class Compressor protected ()
    extends typings.winrtUwp.Windows.Storage.Compression.Compressor {
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
  }
  
  /** A decompressor takes a stream compressed by a compressor and decompresses it. */
  @js.native
  class Decompressor protected ()
    extends typings.winrtUwp.Windows.Storage.Compression.Decompressor {
    /**
      * This method creates an instance of a decompressor.
      * @param underlyingStream The stream of compressed information to be read and decompressed by the decompressor.
      */
    def this(underlyingStream: IInputStream) = this()
  }
}
