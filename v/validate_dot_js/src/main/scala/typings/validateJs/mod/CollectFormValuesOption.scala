package typings.validateJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectFormValuesOption extends js.Object {
  
  var nullify: js.UndefOr[Boolean] = js.native
  
  var trim: js.UndefOr[Boolean] = js.native
}
object CollectFormValuesOption {
  
  @scala.inline
  def apply(): CollectFormValuesOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectFormValuesOption]
  }
  
  @scala.inline
  implicit class CollectFormValuesOptionOps[Self <: CollectFormValuesOption] (val x: Self) extends AnyVal {
    
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
    def setNullify(value: Boolean): Self = this.set("nullify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNullify: Self = this.set("nullify", js.undefined)
    
    @scala.inline
    def setTrim(value: Boolean): Self = this.set("trim", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTrim: Self = this.set("trim", js.undefined)
  }
}
