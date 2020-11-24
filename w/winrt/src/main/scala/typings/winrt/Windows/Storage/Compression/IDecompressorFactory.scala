package typings.winrt.Windows.Storage.Compression

import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDecompressorFactory extends js.Object {
  
  def createDecompressor(underlyingStream: IInputStream): Decompressor = js.native
}
object IDecompressorFactory {
  
  @scala.inline
  def apply(createDecompressor: IInputStream => Decompressor): IDecompressorFactory = {
    val __obj = js.Dynamic.literal(createDecompressor = js.Any.fromFunction1(createDecompressor))
    __obj.asInstanceOf[IDecompressorFactory]
  }
  
  @scala.inline
  implicit class IDecompressorFactoryOps[Self <: IDecompressorFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreateDecompressor(value: IInputStream => Decompressor): Self = this.set("createDecompressor", js.Any.fromFunction1(value))
  }
}
