package typings.victoryCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChildComponents extends StObject {
  
  var childComponents: Any
  
  var children: Any
  
  var parentProps: Any
  
  var props: Any
}
object ChildComponents {
  
  inline def apply(childComponents: Any, children: Any, parentProps: Any, props: Any): ChildComponents = {
    val __obj = js.Dynamic.literal(childComponents = childComponents.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], parentProps = parentProps.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChildComponents]
  }
  
  extension [Self <: ChildComponents](x: Self) {
    
    inline def setChildComponents(value: Any): Self = StObject.set(x, "childComponents", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setParentProps(value: Any): Self = StObject.set(x, "parentProps", value.asInstanceOf[js.Any])
    
    inline def setProps(value: Any): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
  }
}
