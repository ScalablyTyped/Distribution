package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescriptionInfo extends StObject {
  
  var descriptionInfo: Any
  
  var label: Any
  
  var labelShort: Any
  
  var showText: Any
  
  var value: Any
}
object DescriptionInfo {
  
  inline def apply(descriptionInfo: Any, label: Any, labelShort: Any, showText: Any, value: Any): DescriptionInfo = {
    val __obj = js.Dynamic.literal(descriptionInfo = descriptionInfo.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelShort = labelShort.asInstanceOf[js.Any], showText = showText.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescriptionInfo]
  }
  
  extension [Self <: DescriptionInfo](x: Self) {
    
    inline def setDescriptionInfo(value: Any): Self = StObject.set(x, "descriptionInfo", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelShort(value: Any): Self = StObject.set(x, "labelShort", value.asInstanceOf[js.Any])
    
    inline def setShowText(value: Any): Self = StObject.set(x, "showText", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
