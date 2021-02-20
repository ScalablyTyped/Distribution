package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CheckedPath extends StObject {
  
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
  implicit class CheckedPathMutableBuilder[Self <: CheckedPath] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckedPath(value: String): Self = StObject.set(x, "checkedPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisabledLabel(value: String): Self = StObject.set(x, "disabledLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndeterminatePath(value: String): Self = StObject.set(x, "indeterminatePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemDisabled(value: String): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemIndeterminate(value: String): Self = StObject.set(x, "itemIndeterminate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaterialDecorator(value: String): Self = StObject.set(x, "materialDecorator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitch(value: String): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUncheckedPath(value: String): Self = StObject.set(x, "uncheckedPath", value.asInstanceOf[js.Any])
  }
}
