package typings.winrt.WindowsNs.StorageNs.CompressionNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDecompressorFactory extends js.Object {
  def createDecompressor(underlyingStream: IInputStream): Decompressor
}

object IDecompressorFactory {
  @scala.inline
  def apply(createDecompressor: IInputStream => Decompressor): IDecompressorFactory = {
    val __obj = js.Dynamic.literal(createDecompressor = js.Any.fromFunction1(createDecompressor))
  
    __obj.asInstanceOf[IDecompressorFactory]
  }
}

