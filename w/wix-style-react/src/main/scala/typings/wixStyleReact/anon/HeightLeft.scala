package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeightLeft extends StObject {
  
  var bottom: String
  
  var height: String
  
  var left: String
  
  var width: String
}
object HeightLeft {
  
  inline def apply(bottom: String, height: String, left: String, width: String): HeightLeft = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeightLeft]
  }
  
  extension [Self <: HeightLeft](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setLeft(value: String): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
