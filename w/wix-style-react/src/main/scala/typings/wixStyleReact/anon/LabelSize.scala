package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LabelSize extends StObject {
  
  var labelSize: Any
}
object LabelSize {
  
  inline def apply(labelSize: Any): LabelSize = {
    val __obj = js.Dynamic.literal(labelSize = labelSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelSize]
  }
  
  extension [Self <: LabelSize](x: Self) {
    
    inline def setLabelSize(value: Any): Self = StObject.set(x, "labelSize", value.asInstanceOf[js.Any])
  }
}
