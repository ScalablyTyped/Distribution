package typings.swfobject.swfobject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISwfObjectParameter extends js.Object {
  
  var flashvars: js.UndefOr[String] = js.native
}
object ISwfObjectParameter {
  
  @scala.inline
  def apply(): ISwfObjectParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ISwfObjectParameter]
  }
  
  @scala.inline
  implicit class ISwfObjectParameterOps[Self <: ISwfObjectParameter] (val x: Self) extends AnyVal {
    
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
    def setFlashvars(value: String): Self = this.set("flashvars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlashvars: Self = this.set("flashvars", js.undefined)
  }
}
