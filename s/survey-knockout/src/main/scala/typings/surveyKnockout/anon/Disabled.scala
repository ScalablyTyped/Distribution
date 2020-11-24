package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends js.Object {
  
  var disabled: String = js.native
  
  var item: String = js.native
  
  var itemText: String = js.native
  
  var maxText: String = js.native
  
  var minText: String = js.native
  
  var root: String = js.native
  
  var selected: String = js.native
}
object Disabled {
  
  @scala.inline
  def apply(
    disabled: String,
    item: String,
    itemText: String,
    maxText: String,
    minText: String,
    root: String,
    selected: String
  ): Disabled = {
    val __obj = js.Dynamic.literal(disabled = disabled.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], maxText = maxText.asInstanceOf[js.Any], minText = minText.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: String): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemText(value: String): Self = this.set("itemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxText(value: String): Self = this.set("maxText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinText(value: String): Self = this.set("minText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: String): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
