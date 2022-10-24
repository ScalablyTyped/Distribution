package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LeftWidth extends StObject {
  
  var height: String
  
  var left: String
  
  var width: String
}
object LeftWidth {
  
  inline def apply(height: String, left: String, width: String): LeftWidth = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[LeftWidth]
  }
  
  extension [Self <: LeftWidth](x: Self) {
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
