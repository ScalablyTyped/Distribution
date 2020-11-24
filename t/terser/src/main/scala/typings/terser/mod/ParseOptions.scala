package typings.terser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParseOptions extends js.Object {
  
  var bare_returns: js.UndefOr[Boolean] = js.native
  
  var ecma: js.UndefOr[ECMA] = js.native
  
  var html5_comments: js.UndefOr[Boolean] = js.native
  
  var shebang: js.UndefOr[Boolean] = js.native
}
object ParseOptions {
  
  @scala.inline
  def apply(): ParseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParseOptions]
  }
  
  @scala.inline
  implicit class ParseOptionsOps[Self <: ParseOptions] (val x: Self) extends AnyVal {
    
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
    def setBare_returns(value: Boolean): Self = this.set("bare_returns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBare_returns: Self = this.set("bare_returns", js.undefined)
    
    @scala.inline
    def setEcma(value: ECMA): Self = this.set("ecma", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEcma: Self = this.set("ecma", js.undefined)
    
    @scala.inline
    def setHtml5_comments(value: Boolean): Self = this.set("html5_comments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHtml5_comments: Self = this.set("html5_comments", js.undefined)
    
    @scala.inline
    def setShebang(value: Boolean): Self = this.set("shebang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShebang: Self = this.set("shebang", js.undefined)
  }
}
