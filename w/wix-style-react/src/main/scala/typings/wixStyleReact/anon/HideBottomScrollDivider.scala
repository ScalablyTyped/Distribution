package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HideBottomScrollDivider extends StObject {
  
  var children: Any
  
  var className: Any
  
  var dataHook: Any
  
  var hideBottomScrollDivider: Any
  
  var hideTopScrollDivider: Any
  
  var overflowY: Any
  
  var scrollProps: js.UndefOr[js.Object] = js.undefined
}
object HideBottomScrollDivider {
  
  inline def apply(
    children: Any,
    className: Any,
    dataHook: Any,
    hideBottomScrollDivider: Any,
    hideTopScrollDivider: Any,
    overflowY: Any
  ): HideBottomScrollDivider = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], hideBottomScrollDivider = hideBottomScrollDivider.asInstanceOf[js.Any], hideTopScrollDivider = hideTopScrollDivider.asInstanceOf[js.Any], overflowY = overflowY.asInstanceOf[js.Any])
    __obj.asInstanceOf[HideBottomScrollDivider]
  }
  
  extension [Self <: HideBottomScrollDivider](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setHideBottomScrollDivider(value: Any): Self = StObject.set(x, "hideBottomScrollDivider", value.asInstanceOf[js.Any])
    
    inline def setHideTopScrollDivider(value: Any): Self = StObject.set(x, "hideTopScrollDivider", value.asInstanceOf[js.Any])
    
    inline def setOverflowY(value: Any): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    inline def setScrollProps(value: js.Object): Self = StObject.set(x, "scrollProps", value.asInstanceOf[js.Any])
    
    inline def setScrollPropsUndefined: Self = StObject.set(x, "scrollProps", js.undefined)
  }
}
