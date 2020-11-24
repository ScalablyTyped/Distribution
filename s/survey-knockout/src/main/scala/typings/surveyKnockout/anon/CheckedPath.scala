package typings.surveyKnockout.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedPath extends js.Object {
  
  var checkedPath: String = js.native
  
  var control: String = js.native
  
  var disabledLabel: String = js.native
  
  var indeterminatePath: String = js.native
  
  var item: String = js.native
  
  var itemChecked: String = js.native
  
  var itemDecorator: String = js.native
  
  var itemDisabled: String = js.native
  
  var itemIndeterminate: String = js.native
  
  var label: String = js.native
  
  var materialDecorator: String = js.native
  
  var root: String = js.native
  
  var slider: String = js.native
  
  var switch: String = js.native
  
  var uncheckedPath: String = js.native
}
object CheckedPath {
  
  @scala.inline
  def apply(
    checkedPath: String,
    control: String,
    disabledLabel: String,
    indeterminatePath: String,
    item: String,
    itemChecked: String,
    itemDecorator: String,
    itemDisabled: String,
    itemIndeterminate: String,
    label: String,
    materialDecorator: String,
    root: String,
    slider: String,
    switch: String,
    uncheckedPath: String
  ): CheckedPath = {
    val __obj = js.Dynamic.literal(checkedPath = checkedPath.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], disabledLabel = disabledLabel.asInstanceOf[js.Any], indeterminatePath = indeterminatePath.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemIndeterminate = itemIndeterminate.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], uncheckedPath = uncheckedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedPath]
  }
  
  @scala.inline
  implicit class CheckedPathOps[Self <: CheckedPath] (val x: Self) extends AnyVal {
    
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
    def setCheckedPath(value: String): Self = this.set("checkedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: String): Self = this.set("control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledLabel(value: String): Self = this.set("disabledLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminatePath(value: String): Self = this.set("indeterminatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = this.set("item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChecked(value: String): Self = this.set("itemChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDecorator(value: String): Self = this.set("itemDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDisabled(value: String): Self = this.set("itemDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndeterminate(value: String): Self = this.set("itemIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialDecorator(value: String): Self = this.set("materialDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider(value: String): Self = this.set("slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitch(value: String): Self = this.set("switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedPath(value: String): Self = this.set("uncheckedPath", value.asInstanceOf[js.Any])
  }
}
