package typings.surveyKnockout.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AboveQuestion extends StObject {
  
  var aboveQuestion: String
  
  var belowQuestion: String
  
  var icon: String
  
  var item: String
  
  var locationBottom: String
  
  var locationTop: String
  
  var outsideQuestion: String
  
  var root: String
  
  var tooltip: String
}
object AboveQuestion {
  
  inline def apply(
    aboveQuestion: String,
    belowQuestion: String,
    icon: String,
    item: String,
    locationBottom: String,
    locationTop: String,
    outsideQuestion: String,
    root: String,
    tooltip: String
  ): AboveQuestion = {
    val __obj = js.Dynamic.literal(aboveQuestion = aboveQuestion.asInstanceOf[js.Any], belowQuestion = belowQuestion.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], locationBottom = locationBottom.asInstanceOf[js.Any], locationTop = locationTop.asInstanceOf[js.Any], outsideQuestion = outsideQuestion.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[AboveQuestion]
  }
  
  extension [Self <: AboveQuestion](x: Self) {
    
    inline def setAboveQuestion(value: String): Self = StObject.set(x, "aboveQuestion", value.asInstanceOf[js.Any])
    
    inline def setBelowQuestion(value: String): Self = StObject.set(x, "belowQuestion", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setItem(value: String): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setLocationBottom(value: String): Self = StObject.set(x, "locationBottom", value.asInstanceOf[js.Any])
    
    inline def setLocationTop(value: String): Self = StObject.set(x, "locationTop", value.asInstanceOf[js.Any])
    
    inline def setOutsideQuestion(value: String): Self = StObject.set(x, "outsideQuestion", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
