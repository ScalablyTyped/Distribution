package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentAny extends StObject {
  
  var content: Any
}
object ContentAny {
  
  inline def apply(content: Any): ContentAny = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentAny]
  }
  
  extension [Self <: ContentAny](x: Self) {
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
