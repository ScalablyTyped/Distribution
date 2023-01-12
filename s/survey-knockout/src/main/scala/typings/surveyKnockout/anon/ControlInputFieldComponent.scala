package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlInputFieldComponent extends StObject {
  
  var cleanButton: String
  
  var cleanButtonIconId: String
  
  var cleanButtonSvg: String
  
  var control: String
  
  var controlInputFieldComponent: String
  
  var controlValue: String
  
  var filterStringInput: String
  
  var onError: String
  
  var other: String
  
  var root: String
  
  var selectWrapper: String
  
  var small: String
}
object ControlInputFieldComponent {
  
  inline def apply(
    cleanButton: String,
    cleanButtonIconId: String,
    cleanButtonSvg: String,
    control: String,
    controlInputFieldComponent: String,
    controlValue: String,
    filterStringInput: String,
    onError: String,
    other: String,
    root: String,
    selectWrapper: String,
    small: String
  ): ControlInputFieldComponent = {
    val __obj = js.Dynamic.literal(cleanButton = cleanButton.asInstanceOf[js.Any], cleanButtonIconId = cleanButtonIconId.asInstanceOf[js.Any], cleanButtonSvg = cleanButtonSvg.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], controlInputFieldComponent = controlInputFieldComponent.asInstanceOf[js.Any], controlValue = controlValue.asInstanceOf[js.Any], filterStringInput = filterStringInput.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlInputFieldComponent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlInputFieldComponent] (val x: Self) extends AnyVal {
    
    inline def setCleanButton(value: String): Self = StObject.set(x, "cleanButton", value.asInstanceOf[js.Any])
    
    inline def setCleanButtonIconId(value: String): Self = StObject.set(x, "cleanButtonIconId", value.asInstanceOf[js.Any])
    
    inline def setCleanButtonSvg(value: String): Self = StObject.set(x, "cleanButtonSvg", value.asInstanceOf[js.Any])
    
    inline def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlInputFieldComponent(value: String): Self = StObject.set(x, "controlInputFieldComponent", value.asInstanceOf[js.Any])
    
    inline def setControlValue(value: String): Self = StObject.set(x, "controlValue", value.asInstanceOf[js.Any])
    
    inline def setFilterStringInput(value: String): Self = StObject.set(x, "filterStringInput", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSelectWrapper(value: String): Self = StObject.set(x, "selectWrapper", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
