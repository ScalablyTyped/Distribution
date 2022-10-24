package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Description extends StObject {
  
  var description: Any
  
  var descriptionInfo: Any
  
  var label: Any
  
  var labelShort: Any
  
  var value: Any
}
object Description {
  
  inline def apply(description: Any, descriptionInfo: Any, label: Any, labelShort: Any, value: Any): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], descriptionInfo = descriptionInfo.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelShort = labelShort.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  
  extension [Self <: Description](x: Self) {
    
    inline def setDescription(value: Any): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionInfo(value: Any): Self = StObject.set(x, "descriptionInfo", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelShort(value: Any): Self = StObject.set(x, "labelShort", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
