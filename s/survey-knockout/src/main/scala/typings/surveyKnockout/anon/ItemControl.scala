package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemControl extends js.Object {
  
  var clearButton: String = js.native
  
  var image: String = js.native
  
  var item: String = js.native
  
  var itemChecked: String = js.native
  
  var itemControl: String = js.native
  
  var itemInline: String = js.native
  
  var itemText: String = js.native
  
  var label: String = js.native
  
  var root: String = js.native
}
object ItemControl {
  
  @scala.inline
  def apply(
    clearButton: String,
    image: String,
    item: String,
    itemChecked: String,
    itemControl: String,
    itemInline: String,
    itemText: String,
    label: String,
    root: String
  ): ItemControl = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemControl = itemControl.asInstanceOf[js.Any], itemInline = itemInline.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemControl]
  }
  
  @scala.inline
  implicit class ItemControlOps[Self <: ItemControl] (val x: Self) extends AnyVal {
    
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
    def setClearButton(value: String): Self = this.set("clearButton", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImage(value: String): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChecked(value: String): Self = this.set("itemChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemControl(value: String): Self = this.set("itemControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemInline(value: String): Self = this.set("itemInline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemText(value: String): Self = this.set("itemText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
  }
}
