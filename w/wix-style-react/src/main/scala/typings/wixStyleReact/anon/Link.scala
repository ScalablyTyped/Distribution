package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Link extends StObject {
  
  var children: Any
  
  var link: Any
  
  var onClick: Any
  
  var target: Any
  
  var `type`: Any
}
object Link {
  
  inline def apply(children: Any, link: Any, onClick: Any, target: Any, `type`: Any): Link = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], onClick = onClick.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Link]
  }
  
  extension [Self <: Link](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setLink(value: Any): Self = StObject.set(x, "link", value.asInstanceOf[js.Any])
    
    inline def setOnClick(value: Any): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setTarget(value: Any): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setType(value: Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
