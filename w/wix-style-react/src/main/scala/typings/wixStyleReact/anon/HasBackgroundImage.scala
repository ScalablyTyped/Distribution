package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasBackgroundImage extends StObject {
  
  var hasBackgroundImage: Boolean
  
  var minimized: Boolean
}
object HasBackgroundImage {
  
  inline def apply(hasBackgroundImage: Boolean, minimized: Boolean): HasBackgroundImage = {
    val __obj = js.Dynamic.literal(hasBackgroundImage = hasBackgroundImage.asInstanceOf[js.Any], minimized = minimized.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasBackgroundImage]
  }
  
  extension [Self <: HasBackgroundImage](x: Self) {
    
    inline def setHasBackgroundImage(value: Boolean): Self = StObject.set(x, "hasBackgroundImage", value.asInstanceOf[js.Any])
    
    inline def setMinimized(value: Boolean): Self = StObject.set(x, "minimized", value.asInstanceOf[js.Any])
  }
}
