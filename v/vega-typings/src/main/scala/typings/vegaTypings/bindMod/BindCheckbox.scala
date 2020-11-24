package typings.vegaTypings.bindMod

import typings.vegaTypings.vegaTypingsStrings.checkbox
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BindCheckbox
  extends BaseBinding
     with Binding {
  
  var input: checkbox = js.native
}
object BindCheckbox {
  
  @scala.inline
  def apply(input: checkbox): BindCheckbox = {
    val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
    __obj.asInstanceOf[BindCheckbox]
  }
  
  @scala.inline
  implicit class BindCheckboxOps[Self <: BindCheckbox] (val x: Self) extends AnyVal {
    
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
    def setInput(value: checkbox): Self = this.set("input", value.asInstanceOf[js.Any])
  }
}
