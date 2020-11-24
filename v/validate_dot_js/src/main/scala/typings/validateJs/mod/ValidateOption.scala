package typings.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateOption extends js.Object {
  
  var format: js.UndefOr[String] = js.native
  
  var fullMessages: js.UndefOr[Boolean] = js.native
  
  var prettify: js.UndefOr[js.Function] = js.native
}
object ValidateOption {
  
  @scala.inline
  def apply(): ValidateOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateOption]
  }
  
  @scala.inline
  implicit class ValidateOptionOps[Self <: ValidateOption] (val x: Self) extends AnyVal {
    
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormat: Self = this.set("format", js.undefined)
    
    @scala.inline
    def setFullMessages(value: Boolean): Self = this.set("fullMessages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFullMessages: Self = this.set("fullMessages", js.undefined)
    
    @scala.inline
    def setPrettify(value: js.Function): Self = this.set("prettify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrettify: Self = this.set("prettify", js.undefined)
  }
}
