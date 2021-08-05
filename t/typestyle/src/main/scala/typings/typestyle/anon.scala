package typings.typestyle

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AutoGenerateTag extends StObject {
    
    var autoGenerateTag: Boolean
  }
  object AutoGenerateTag {
    
    inline def apply(autoGenerateTag: Boolean): AutoGenerateTag = {
      val __obj = js.Dynamic.literal(autoGenerateTag = autoGenerateTag.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutoGenerateTag]
    }
    
    extension [Self <: AutoGenerateTag](x: Self) {
      
      inline def setAutoGenerateTag(value: Boolean): Self = StObject.set(x, "autoGenerateTag", value.asInstanceOf[js.Any])
    }
  }
  
  trait TextContent extends StObject {
    
    var textContent: String | Null
  }
  object TextContent {
    
    inline def apply(): TextContent = {
      val __obj = js.Dynamic.literal(textContent = null)
      __obj.asInstanceOf[TextContent]
    }
    
    extension [Self <: TextContent](x: Self) {
      
      inline def setTextContent(value: String): Self = StObject.set(x, "textContent", value.asInstanceOf[js.Any])
      
      inline def setTextContentNull: Self = StObject.set(x, "textContent", null)
    }
  }
}
