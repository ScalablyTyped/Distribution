package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextContent extends StObject {
  
  var isActive: Boolean
  
  var textContent: Null
  
  var textRendered: Boolean
}
object TextContent {
  
  inline def apply(isActive: Boolean, textContent: Null, textRendered: Boolean): TextContent = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any], textContent = textContent.asInstanceOf[js.Any], textRendered = textRendered.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextContent]
  }
  
  extension [Self <: TextContent](x: Self) {
    
    inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    
    inline def setTextContent(value: Null): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
    
    inline def setTextRendered(value: Boolean): Self = StObject.set(x, "textRendered", value.asInstanceOf[js.Any])
  }
}
