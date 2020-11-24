package typings.winrt.Windows.Foundation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWwwFormUrlDecoderRuntimeClassFactory extends js.Object {
  
  def createWwwFormUrlDecoder(query: String): WwwFormUrlDecoder = js.native
}
object IWwwFormUrlDecoderRuntimeClassFactory {
  
  @scala.inline
  def apply(createWwwFormUrlDecoder: String => WwwFormUrlDecoder): IWwwFormUrlDecoderRuntimeClassFactory = {
    val __obj = js.Dynamic.literal(createWwwFormUrlDecoder = js.Any.fromFunction1(createWwwFormUrlDecoder))
    __obj.asInstanceOf[IWwwFormUrlDecoderRuntimeClassFactory]
  }
  
  @scala.inline
  implicit class IWwwFormUrlDecoderRuntimeClassFactoryOps[Self <: IWwwFormUrlDecoderRuntimeClassFactory] (val x: Self) extends AnyVal {
    
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
    def setCreateWwwFormUrlDecoder(value: String => WwwFormUrlDecoder): Self = this.set("createWwwFormUrlDecoder", js.Any.fromFunction1(value))
  }
}
