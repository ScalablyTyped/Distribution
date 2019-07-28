package typings.winrt.WindowsNs.StorageNs.CompressionNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressorFactory extends js.Object {
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
}

