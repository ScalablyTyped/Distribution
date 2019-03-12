package typings
package winrtLib.WindowsNs.StorageNs.CompressionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICompressorFactory extends js.Object {
  def createCompressor(underlyingStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream): Compressor
  def createCompressorEx(
    underlyingStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream,
    algorithm: CompressAlgorithm,
    blockSize: scala.Double
  ): Compressor
}

object ICompressorFactory {
  @scala.inline
  def apply(
    createCompressor: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream => Compressor,
    createCompressorEx: (winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream, CompressAlgorithm, scala.Double) => Compressor
  ): ICompressorFactory = {
    val __obj = js.Dynamic.literal(createCompressor = js.Any.fromFunction1(createCompressor), createCompressorEx = js.Any.fromFunction3(createCompressorEx))
  
    __obj.asInstanceOf[ICompressorFactory]
  }
}

