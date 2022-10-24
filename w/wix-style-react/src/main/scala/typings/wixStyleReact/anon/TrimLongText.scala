package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrimLongText extends StObject {
  
  var labelSize: Any
  
  var trimLongText: Any
}
object TrimLongText {
  
  inline def apply(labelSize: Any, trimLongText: Any): TrimLongText = {
    val __obj = js.Dynamic.literal(labelSize = labelSize.asInstanceOf[js.Any], trimLongText = trimLongText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TrimLongText]
  }
  
  extension [Self <: TrimLongText](x: Self) {
    
    inline def setLabelSize(value: Any): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
    
    inline def setTrimLongText(value: Any): Self = StObject.set(x, "trimLongText", value.asInstanceOf[js.Any])
  }
}
