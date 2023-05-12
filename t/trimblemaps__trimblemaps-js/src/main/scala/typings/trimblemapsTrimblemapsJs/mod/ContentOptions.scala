package typings.trimblemapsTrimblemapsJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContentOptions extends StObject {
  
  var isVisible: Boolean
  
  var layerId: String
}
object ContentOptions {
  
  inline def apply(isVisible: Boolean, layerId: String): ContentOptions = {
    val __obj = js.Dynamic.literal(isVisible = isVisible.asInstanceOf[js.Any], layerId = layerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContentOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContentOptions] (val x: Self) extends AnyVal {
    
    inline def setIsVisible(value: Boolean): Self = StObject.set(x, "isVisible", value.asInstanceOf[js.Any])
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
  }
}
