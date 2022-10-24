package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPlaceholderItem extends StObject {
  
  var isPlaceholder: Any
  
  var item: Draggable
  
  var previewStyles: Any
}
object IsPlaceholderItem {
  
  inline def apply(isPlaceholder: Any, item: Draggable, previewStyles: Any): IsPlaceholderItem = {
    val __obj = js.Dynamic.literal(isPlaceholder = isPlaceholder.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], previewStyles = previewStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPlaceholderItem]
  }
  
  extension [Self <: IsPlaceholderItem](x: Self) {
    
    inline def setIsPlaceholder(value: Any): Self = StObject.set(x, "isPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setItem(value: Draggable): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPreviewStyles(value: Any): Self = StObject.set(x, "previewStyles", value.asInstanceOf[js.Any])
  }
}
