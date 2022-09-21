package typings.winrt.global.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Compression.CompressAlgorithm
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compression {
  
  @JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
  @js.native
  object CompressAlgorithm extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.winrt.Windows.Storage.Compression.CompressAlgorithm & Double] = js.native
    
    /* 0 */ val invalidAlgorithm: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.invalidAlgorithm & Double = js.native
    
    /* 5 */ val lzms: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.lzms & Double = js.native
    
    /* 2 */ val mszip: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.mszip & Double = js.native
    
    /* 1 */ val nullAlgorithm: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.nullAlgorithm & Double = js.native
    
    /* 3 */ val xpress: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpress & Double = js.native
    
    /* 4 */ val xpressHuff: typings.winrt.Windows.Storage.Compression.CompressAlgorithm.xpressHuff & Double = js.native
  }
  
  @JSGlobal("Windows.Storage.Compression.Compressor")
  @js.native
  open class Compressor protected ()
    extends StObject
       with typings.winrt.Windows.Storage.Compression.Compressor {
    def this(underlyingStream: IOutputStream) = this()
    def this(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def detachStream(): IOutputStream = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def finishAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def flushAsync(): IAsyncOperation[Boolean] = js.native
    
    /* CompleteClass */
    override def writeAsync(buffer: IBuffer): IAsyncOperationWithProgress[Double, Double] = js.native
  }
  
  @JSGlobal("Windows.Storage.Compression.Decompressor")
  @js.native
  open class Decompressor protected ()
    extends StObject
       with typings.winrt.Windows.Storage.Compression.Decompressor {
    def this(underlyingStream: IInputStream) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def detachStream(): IInputStream = js.native
    
    /* CompleteClass */
    override def dispose(): Unit = js.native
    
    /* CompleteClass */
    override def readAsync(buffer: IBuffer, count: Double, options: InputStreamOptions): IAsyncOperationWithProgress[IBuffer, Double] = js.native
  }
}
