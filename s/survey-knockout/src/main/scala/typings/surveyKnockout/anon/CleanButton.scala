package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CleanButton extends StObject {
  
  var cleanButton: String
  
  var cleanButtonIconId: String
  
  var cleanButtonSvg: String
  
  var control: String
  
  var controlValue: String
  
  var filterStringInput: String
  
  var other: String
  
  var root: String
  
  var selectWrapper: String
}
object CleanButton {
  
  inline def apply(
    cleanButton: String,
    cleanButtonIconId: String,
    cleanButtonSvg: String,
    control: String,
    controlValue: String,
    filterStringInput: String,
    other: String,
    root: String,
    selectWrapper: String
  ): CleanButton = {
    val __obj = js.Dynamic.literal(cleanButton = cleanButton.asInstanceOf[js.Any], cleanButtonIconId = cleanButtonIconId.asInstanceOf[js.Any], cleanButtonSvg = cleanButtonSvg.asInstanceOf[js.Any], control = control.asInstanceOf[js.Any], controlValue = controlValue.asInstanceOf[js.Any], filterStringInput = filterStringInput.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any])
    __obj.asInstanceOf[CleanButton]
  }
  
  extension [Self <: CleanButton](x: Self) {
    
    inline def setCleanButton(value: String): Self = StObject.set(x, "cleanButton", value.asInstanceOf[js.Any])
    
    inline def setCleanButtonIconId(value: String): Self = StObject.set(x, "cleanButtonIconId", value.asInstanceOf[js.Any])
    
    inline def setCleanButtonSvg(value: String): Self = StObject.set(x, "cleanButtonSvg", value.asInstanceOf[js.Any])
    
    inline def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setControlValue(value: String): Self = StObject.set(x, "controlValue", value.asInstanceOf[js.Any])
    
    inline def setFilterStringInput(value: String): Self = StObject.set(x, "filterStringInput", value.asInstanceOf[js.Any])
    
    inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSelectWrapper(value: String): Self = StObject.set(x, "selectWrapper", value.asInstanceOf[js.Any])
  }
}
