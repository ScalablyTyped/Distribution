package typings.winrt.Windows.Storage

import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import typings.winrt.Windows.Storage.Streams.IBuffer
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import typings.winrt.Windows.Storage.Streams.InputStreamOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Compression {
  
  @js.native
  sealed trait CompressAlgorithm extends StObject
  @JSGlobal("Windows.Storage.Compression.CompressAlgorithm")
  @js.native
  object CompressAlgorithm extends StObject {
    
    @js.native
    sealed trait invalidAlgorithm
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait lzms
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait mszip
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait nullAlgorithm
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait xpress
      extends StObject
         with CompressAlgorithm
    
    @js.native
    sealed trait xpressHuff
      extends StObject
         with CompressAlgorithm
  }
  
  trait Compressor
    extends StObject
       with ICompressor {
    
    def dispose(): Unit
  }
  object Compressor {
    
    @scala.inline
    def apply(
      close: () => Unit,
      detachStream: () => IOutputStream,
      dispose: () => Unit,
      finishAsync: () => IAsyncOperation[Boolean],
      flushAsync: () => IAsyncOperation[Boolean],
      writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
    ): Compressor = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), dispose = js.Any.fromFunction0(dispose), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
      __obj.asInstanceOf[Compressor]
    }
    
    @scala.inline
    implicit class CompressorMutableBuilder[Self <: Compressor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  trait Decompressor
    extends StObject
       with IDecompressor {
    
    def dispose(): Unit
  }
  object Decompressor {
    
    @scala.inline
    def apply(
      close: () => Unit,
      detachStream: () => IInputStream,
      dispose: () => Unit,
      readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
    ): Decompressor = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), dispose = js.Any.fromFunction0(dispose), readAsync = js.Any.fromFunction3(readAsync))
      __obj.asInstanceOf[Decompressor]
    }
    
    @scala.inline
    implicit class DecompressorMutableBuilder[Self <: Decompressor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
    }
  }
  
  trait ICompressor
    extends StObject
       with IOutputStream {
    
    def detachStream(): IOutputStream
    
    def finishAsync(): IAsyncOperation[Boolean]
  }
  object ICompressor {
    
    @scala.inline
    def apply(
      close: () => Unit,
      detachStream: () => IOutputStream,
      finishAsync: () => IAsyncOperation[Boolean],
      flushAsync: () => IAsyncOperation[Boolean],
      writeAsync: IBuffer => IAsyncOperationWithProgress[Double, Double]
    ): ICompressor = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), finishAsync = js.Any.fromFunction0(finishAsync), flushAsync = js.Any.fromFunction0(flushAsync), writeAsync = js.Any.fromFunction1(writeAsync))
      __obj.asInstanceOf[ICompressor]
    }
    
    @scala.inline
    implicit class ICompressorMutableBuilder[Self <: ICompressor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetachStream(value: () => IOutputStream): Self = StObject.set(x, "detachStream", js.Any.fromFunction0(value))
      
      @scala.inline
      def setFinishAsync(value: () => IAsyncOperation[Boolean]): Self = StObject.set(x, "finishAsync", js.Any.fromFunction0(value))
    }
  }
  
  trait ICompressorFactory extends StObject {
    
    def createCompressor(underlyingStream: IOutputStream): Compressor
    
    def createCompressorEx(underlyingStream: IOutputStream, algorithm: CompressAlgorithm, blockSize: Double): Compressor
  }
  object ICompressorFactory {
    
    @scala.inline
    def apply(
      createCompressor: IOutputStream => Compressor,
      createCompressorEx: (IOutputStream, CompressAlgorithm, Double) => Compressor
    ): ICompressorFactory = {
      val __obj = js.Dynamic.literal(createCompressor = js.Any.fromFunction1(createCompressor), createCompressorEx = js.Any.fromFunction3(createCompressorEx))
      __obj.asInstanceOf[ICompressorFactory]
    }
    
    @scala.inline
    implicit class ICompressorFactoryMutableBuilder[Self <: ICompressorFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateCompressor(value: IOutputStream => Compressor): Self = StObject.set(x, "createCompressor", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCreateCompressorEx(value: (IOutputStream, CompressAlgorithm, Double) => Compressor): Self = StObject.set(x, "createCompressorEx", js.Any.fromFunction3(value))
    }
  }
  
  trait IDecompressor
    extends StObject
       with IInputStream {
    
    def detachStream(): IInputStream
  }
  object IDecompressor {
    
    @scala.inline
    def apply(
      close: () => Unit,
      detachStream: () => IInputStream,
      readAsync: (IBuffer, Double, InputStreamOptions) => IAsyncOperationWithProgress[IBuffer, Double]
    ): IDecompressor = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), detachStream = js.Any.fromFunction0(detachStream), readAsync = js.Any.fromFunction3(readAsync))
      __obj.asInstanceOf[IDecompressor]
    }
    
    @scala.inline
    implicit class IDecompressorMutableBuilder[Self <: IDecompressor] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDetachStream(value: () => IInputStream): Self = StObject.set(x, "detachStream", js.Any.fromFunction0(value))
    }
  }
  
  trait IDecompressorFactory extends StObject {
    
    def createDecompressor(underlyingStream: IInputStream): Decompressor
  }
  object IDecompressorFactory {
    
    @scala.inline
    def apply(createDecompressor: IInputStream => Decompressor): IDecompressorFactory = {
      val __obj = js.Dynamic.literal(createDecompressor = js.Any.fromFunction1(createDecompressor))
      __obj.asInstanceOf[IDecompressorFactory]
    }
    
    @scala.inline
    implicit class IDecompressorFactoryMutableBuilder[Self <: IDecompressorFactory] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreateDecompressor(value: IInputStream => Decompressor): Self = StObject.set(x, "createDecompressor", js.Any.fromFunction1(value))
    }
  }
}
