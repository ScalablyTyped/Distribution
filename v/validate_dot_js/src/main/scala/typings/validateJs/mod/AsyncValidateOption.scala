package typings.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncValidateOption extends js.Object {
  
  var cleanAttributes: js.UndefOr[Boolean] = js.native
  
  var prettify: js.UndefOr[js.Function] = js.native
  
  var wrapErrors: js.UndefOr[js.Function] = js.native
}
object AsyncValidateOption {
  
  @scala.inline
  def apply(): AsyncValidateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AsyncValidateOption]
  }
  
  @scala.inline
  implicit class AsyncValidateOptionOps[Self <: AsyncValidateOption] (val x: Self) extends AnyVal {
    
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
    def setCleanAttributes(value: Boolean): Self = this.set("cleanAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCleanAttributes: Self = this.set("cleanAttributes", js.undefined)
    
    @scala.inline
    def setPrettify(value: js.Function): Self = this.set("prettify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettify: Self = this.set("prettify", js.undefined)
    
    @scala.inline
    def setWrapErrors(value: js.Function): Self = this.set("wrapErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWrapErrors: Self = this.set("wrapErrors", js.undefined)
  }
}
