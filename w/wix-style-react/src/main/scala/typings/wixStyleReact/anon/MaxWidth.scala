package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MaxWidth extends StObject {
  
  var maxWidth: String
  
  var paddingLeft: String
  
  var paddingRight: String
}
object MaxWidth {
  
  inline def apply(maxWidth: String, paddingLeft: String, paddingRight: String): MaxWidth = {
    val __obj = js.Dynamic.literal(maxWidth = maxWidth.asInstanceOf[js.Any], paddingLeft = paddingLeft.asInstanceOf[js.Any], paddingRight = paddingRight.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaxWidth]
  }
  
  extension [Self <: MaxWidth](x: Self) {
    
    inline def setMaxWidth(value: String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
    
    inline def setPaddingLeft(value: String): Self = StObject.set(x, "paddingLeft", value.asInstanceOf[js.Any])
    
    inline def setPaddingRight(value: String): Self = StObject.set(x, "paddingRight", value.asInstanceOf[js.Any])
  }
}
