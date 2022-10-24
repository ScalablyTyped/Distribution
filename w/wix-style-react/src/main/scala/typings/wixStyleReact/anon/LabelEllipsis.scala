package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelEllipsis extends StObject {
  
  var index: Any
  
  var label: Any
  
  var labelEllipsis: Any
}
object LabelEllipsis {
  
  inline def apply(index: Any, label: Any, labelEllipsis: Any): LabelEllipsis = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelEllipsis = labelEllipsis.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelEllipsis]
  }
  
  extension [Self <: LabelEllipsis](x: Self) {
    
    inline def setIndex(value: Any): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Any): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelEllipsis(value: Any): Self = StObject.set(x, "labelEllipsis", value.asInstanceOf[js.Any])
  }
}
