package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsPlaceholder
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var isPlaceholder: Any
  
  var isPreview: Any
  
  var item: DictxId
  
  var previewStyles: Any
}
object IsPlaceholder {
  
  inline def apply(isPlaceholder: Any, isPreview: Any, item: DictxId, previewStyles: Any): IsPlaceholder = {
    val __obj = js.Dynamic.literal(isPlaceholder = isPlaceholder.asInstanceOf[js.Any], isPreview = isPreview.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any], previewStyles = previewStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsPlaceholder]
  }
  
  extension [Self <: IsPlaceholder](x: Self) {
    
    inline def setIsPlaceholder(value: Any): Self = StObject.set(x, "isPlaceholder", value.asInstanceOf[js.Any])
    
    inline def setIsPreview(value: Any): Self = StObject.set(x, "isPreview", value.asInstanceOf[js.Any])
    
    inline def setItem(value: DictxId): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setPreviewStyles(value: Any): Self = StObject.set(x, "previewStyles", value.asInstanceOf[js.Any])
  }
}
