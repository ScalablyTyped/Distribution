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

