package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectWrapper extends StObject {
  
  var control: String
  
  var onError: String
  
  var other: String
  
  var root: String
  
  var selectWrapper: String
  
  var small: String
}
object SelectWrapper {
  
  inline def apply(
    control: String,
    onError: String,
    other: String,
    root: String,
    selectWrapper: String,
    small: String
  ): SelectWrapper = {
    val __obj = js.Dynamic.literal(control = control.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], other = other.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], selectWrapper = selectWrapper.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectWrapper]
  }
  
  extension [Self <: SelectWrapper](x: Self) {
    
    inline def setControl(value: String): Self = StObject.set(x, "control", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setOther(value: String): Self = StObject.set(x, "other", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSelectWrapper(value: String): Self = StObject.set(x, "selectWrapper", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
