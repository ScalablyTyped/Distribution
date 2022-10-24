package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StickyStyle extends StObject {
  
  var children: Any
  
  var stickyStyle: Any
}
object StickyStyle {
  
  inline def apply(children: Any, stickyStyle: Any): StickyStyle = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], stickyStyle = stickyStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[StickyStyle]
  }
  
  extension [Self <: StickyStyle](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setStickyStyle(value: Any): Self = StObject.set(x, "stickyStyle", value.asInstanceOf[js.Any])
  }
}
