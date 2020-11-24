package typings.vueMarkdown.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Mdurl extends js.Object {
  
  var mdurl: Decode = js.native
  
  var ucmicro: Any = js.native
}
object Mdurl {
  
  @scala.inline
  def apply(mdurl: Decode, ucmicro: Any): Mdurl = {
    val __obj = js.Dynamic.literal(mdurl = mdurl.asInstanceOf[js.Any], ucmicro = ucmicro.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mdurl]
  }
  
  @scala.inline
  implicit class MdurlOps[Self <: Mdurl] (val x: Self) extends AnyVal {
    
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
    def setMdurl(value: Decode): Self = this.set("mdurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUcmicro(value: Any): Self = this.set("ucmicro", value.asInstanceOf[js.Any])
  }
}
