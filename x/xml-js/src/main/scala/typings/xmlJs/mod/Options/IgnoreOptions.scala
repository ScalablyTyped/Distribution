package typings.xmlJs.mod.Options

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IgnoreOptions extends js.Object {
  
  var ignoreAttributes: js.UndefOr[Boolean] = js.native
  
  var ignoreCdata: js.UndefOr[Boolean] = js.native
  
  var ignoreComment: js.UndefOr[Boolean] = js.native
  
  var ignoreDeclaration: js.UndefOr[Boolean] = js.native
  
  var ignoreDoctype: js.UndefOr[Boolean] = js.native
  
  var ignoreInstruction: js.UndefOr[Boolean] = js.native
  
  var ignoreText: js.UndefOr[Boolean] = js.native
}
object IgnoreOptions {
  
  @scala.inline
  def apply(): IgnoreOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IgnoreOptions]
  }
  
  @scala.inline
  implicit class IgnoreOptionsOps[Self <: IgnoreOptions] (val x: Self) extends AnyVal {
    
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
    def setIgnoreAttributes(value: Boolean): Self = this.set("ignoreAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreAttributes: Self = this.set("ignoreAttributes", js.undefined)
    
    @scala.inline
    def setIgnoreCdata(value: Boolean): Self = this.set("ignoreCdata", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreCdata: Self = this.set("ignoreCdata", js.undefined)
    
    @scala.inline
    def setIgnoreComment(value: Boolean): Self = this.set("ignoreComment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreComment: Self = this.set("ignoreComment", js.undefined)
    
    @scala.inline
    def setIgnoreDeclaration(value: Boolean): Self = this.set("ignoreDeclaration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDeclaration: Self = this.set("ignoreDeclaration", js.undefined)
    
    @scala.inline
    def setIgnoreDoctype(value: Boolean): Self = this.set("ignoreDoctype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDoctype: Self = this.set("ignoreDoctype", js.undefined)
    
    @scala.inline
    def setIgnoreInstruction(value: Boolean): Self = this.set("ignoreInstruction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreInstruction: Self = this.set("ignoreInstruction", js.undefined)
    
    @scala.inline
    def setIgnoreText(value: Boolean): Self = this.set("ignoreText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreText: Self = this.set("ignoreText", js.undefined)
  }
}
