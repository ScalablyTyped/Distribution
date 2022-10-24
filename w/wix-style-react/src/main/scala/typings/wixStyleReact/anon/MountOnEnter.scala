package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountOnEnter extends StObject {
  
  var children: Any
  
  var dataHook: Any
  
  var mountOnEnter: Any
  
  var onCollapseAnimationEnd: Any
  
  var onExpandAnimationEnd: Any
  
  var open: Any
  
  var unmountOnExit: Any
}
object MountOnEnter {
  
  inline def apply(
    children: Any,
    dataHook: Any,
    mountOnEnter: Any,
    onCollapseAnimationEnd: Any,
    onExpandAnimationEnd: Any,
    open: Any,
    unmountOnExit: Any
  ): MountOnEnter = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], mountOnEnter = mountOnEnter.asInstanceOf[js.Any], onCollapseAnimationEnd = onCollapseAnimationEnd.asInstanceOf[js.Any], onExpandAnimationEnd = onExpandAnimationEnd.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], unmountOnExit = unmountOnExit.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOnEnter]
  }
  
  extension [Self <: MountOnEnter](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setMountOnEnter(value: Any): Self = StObject.set(x, "mountOnEnter", value.asInstanceOf[js.Any])
    
    inline def setOnCollapseAnimationEnd(value: Any): Self = StObject.set(x, "onCollapseAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def setOnExpandAnimationEnd(value: Any): Self = StObject.set(x, "onExpandAnimationEnd", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Any): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setUnmountOnExit(value: Any): Self = StObject.set(x, "unmountOnExit", value.asInstanceOf[js.Any])
  }
}
