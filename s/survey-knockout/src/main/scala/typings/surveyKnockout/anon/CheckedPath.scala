package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CheckedPath extends StObject {
  
  var checkedPath: String
  
  var control: String
  
  var controlCheckbox: String
  
  var disabledLabel: String
  
  var indeterminatePath: String
  
  var item: String
  
  var itemChecked: String
  
  var itemDecorator: String
  
  var itemDisabled: String
  
  var itemIndeterminate: String
  
  var label: String
  
  var materialDecorator: String
  
  var root: String
  
  var rootRadio: String
  
  var slider: String
  
  var switch: String
  
  var uncheckedPath: String
}
object CheckedPath {
  
  inline def apply(
    checkedPath: String,
    control: String,
    controlCheckbox: String,
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
    rootRadio: String,
    slider: String,
    switch: String,
    uncheckedPath: String
  ): CheckedPath = {
    val __obj = js.Dynamic.literal(checkedPath = checkedPath.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], controlCheckbox = controlCheckbox.asInstanceOf[js.Any], disabledLabel = disabledLabel.asInstanceOf[js.Any], indeterminatePath = indeterminatePath.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], itemChecked = itemChecked.asInstanceOf[js.Any], itemDecorator = itemDecorator.asInstanceOf[js.Any], itemDisabled = itemDisabled.asInstanceOf[js.Any], itemIndeterminate = itemIndeterminate.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], materialDecorator = materialDecorator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootRadio = rootRadio.asInstanceOf[js.Any], slider = slider.asInstanceOf[js.Any], switch = switch.asInstanceOf[js.Any], uncheckedPath = uncheckedPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckedPath]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CheckedPath] (val x: Self) extends AnyVal {
    
    inline def setCheckedPath(value: String): Self = StObject.set(x, "checkedPath", value.asInstanceOf[js.Any])
    
    inline def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlCheckbox(value: String): Self = StObject.set(x, "controlCheckbox", value.asInstanceOf[js.Any])
    
    inline def setDisabledLabel(value: String): Self = StObject.set(x, "disabledLabel", value.asInstanceOf[js.Any])
    
    inline def setIndeterminatePath(value: String): Self = StObject.set(x, "indeterminatePath", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemChecked(value: String): Self = StObject.set(x, "itemChecked", value.asInstanceOf[js.Any])
    
    inline def setItemDecorator(value: String): Self = StObject.set(x, "itemDecorator", value.asInstanceOf[js.Any])
    
    inline def setItemDisabled(value: String): Self = StObject.set(x, "itemDisabled", value.asInstanceOf[js.Any])
    
    inline def setItemIndeterminate(value: String): Self = StObject.set(x, "itemIndeterminate", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setMaterialDecorator(value: String): Self = StObject.set(x, "materialDecorator", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootRadio(value: String): Self = StObject.set(x, "rootRadio", value.asInstanceOf[js.Any])
    
    inline def setSlider(value: String): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
    
    inline def setSwitch(value: String): Self = StObject.set(x, "switch", value.asInstanceOf[js.Any])
    
    inline def setUncheckedPath(value: String): Self = StObject.set(x, "uncheckedPath", value.asInstanceOf[js.Any])
  }
}
