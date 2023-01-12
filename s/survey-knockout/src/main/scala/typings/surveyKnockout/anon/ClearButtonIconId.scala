package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClearButtonIconId extends StObject {
  
  var clearButton: String
  
  var clearButtonIconId: String
  
  var controls: String
  
  var mainRoot: String
  
  var placeholder: String
  
  var root: String
  
  var small: String
}
object ClearButtonIconId {
  
  inline def apply(
    clearButton: String,
    clearButtonIconId: String,
    controls: String,
    mainRoot: String,
    placeholder: String,
    root: String,
    small: String
  ): ClearButtonIconId = {
    val __obj = js.Dynamic.literal(clearButton = clearButton.asInstanceOf[js.Any], clearButtonIconId = clearButtonIconId.asInstanceOf[js.Any], controls = controls.asInstanceOf[js.Any], mainRoot = mainRoot.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], small = small.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClearButtonIconId]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClearButtonIconId] (val x: Self) extends AnyVal {
    
    inline def setClearButton(value: String): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
    
    inline def setClearButtonIconId(value: String): Self = StObject.set(x, "clearButtonIconId", value.asInstanceOf[js.Any])
    
    inline def setControls(value: String): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
    
    inline def setMainRoot(value: String): Self = StObject.set(x, "mainRoot", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setSmall(value: String): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
  }
}
