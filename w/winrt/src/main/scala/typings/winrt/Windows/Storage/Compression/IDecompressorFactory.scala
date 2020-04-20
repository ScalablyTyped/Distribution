package typings.winrt.Windows.Storage.Compression

import typings.winrt.Windows.Storage.Streams.IInputStream
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

