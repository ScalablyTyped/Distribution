package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BottomHeight extends StObject {
  
  var bottom: String
  
  var height: String
  
  var width: String
}
object BottomHeight {
  
  inline def apply(bottom: String, height: String, width: String): BottomHeight = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BottomHeight]
  }
  
  extension [Self <: BottomHeight](x: Self) {
    
    inline def setBottom(value: String): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
