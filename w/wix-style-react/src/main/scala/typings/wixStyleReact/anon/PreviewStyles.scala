package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PreviewStyles extends StObject {
  
  var previewStyles: Any
}
object PreviewStyles {
  
  inline def apply(previewStyles: Any): PreviewStyles = {
    val __obj = js.Dynamic.literal(previewStyles = previewStyles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreviewStyles]
  }
  
  extension [Self <: PreviewStyles](x: Self) {
    
    inline def setPreviewStyles(value: Any): Self = StObject.set(x, "previewStyles", value.asInstanceOf[js.Any])
  }
}
