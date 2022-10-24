package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsLastChild extends StObject {
  
  var isLastChild: js.UndefOr[Boolean] = js.undefined
  
  var isPlaceholder: Any
  
  var isPreview: js.UndefOr[Boolean] = js.undefined
}
object IsLastChild {
  
  inline def apply(isPlaceholder: Any): IsLastChild = {
    val __obj = js.Dynamic.literal(isPlaceholder = isPlaceholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsLastChild]
  }
  
  extension [Self <: IsLastChild](x: Self) {
    
    inline def setIsLastChild(value: Boolean): Self = StObject.set(x, "isLastChild", value.asInstanceOf[js.Any])
    
    inline def setIsLastChildUndefined: Self = StObject.set(x, "isLastChild", js.undefined)
    
    inline def setIsPlaceholder(value: Any): Self = StObject.set(x, "isPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setIsPreview(value: Boolean): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
    
    inline def setIsPreviewUndefined: Self = StObject.set(x, "isPreview", js.undefined)
  }
}
