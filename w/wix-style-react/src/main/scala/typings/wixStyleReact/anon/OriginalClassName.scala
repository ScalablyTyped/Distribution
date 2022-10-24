package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OriginalClassName extends StObject {
  
  var className: Any
  
  var originalClassName: Any
  
  var pages: Any
}
object OriginalClassName {
  
  inline def apply(className: Any, originalClassName: Any, pages: Any): OriginalClassName = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], originalClassName = originalClassName.asInstanceOf[js.Any], pages = pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalClassName]
  }
  
  extension [Self <: OriginalClassName](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setOriginalClassName(value: Any): Self = StObject.set(x, "originalClassName", value.asInstanceOf[js.Any])
    
    inline def setPages(value: Any): Self = StObject.set(x, "pages", value.asInstanceOf[js.Any])
  }
}
