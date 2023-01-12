package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlDisabled extends StObject {
  
  var controlDisabled: String
  
  var onError: String
  
  var root: String
  
  var small: String
}
object ControlDisabled {
  
  inline def apply(controlDisabled: String, onError: String, root: String, small: String): ControlDisabled = {
    val __obj = js.Dynamic.literal(controlDisabled = controlDisabled.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[ControlDisabled]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlDisabled] (val x: Self) extends AnyVal {
    
    inline def setControlDisabled(value: String): Self = StObject.set(x, "controlDisabled", value.asInstanceOf[js.Any])
    
    inline def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
