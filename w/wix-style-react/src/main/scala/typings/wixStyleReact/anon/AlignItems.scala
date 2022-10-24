package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlignItems extends StObject {
  
  var alignItems: Any
  
  var children: Any
  
  var className: Any
  
  var cols: Any
  
  var dataHook: Any
  
  var gap: Any
  
  var justifyItems: Any
  
  var rowHeight: Any
}
object AlignItems {
  
  inline def apply(
    alignItems: Any,
    children: Any,
    className: Any,
    cols: Any,
    dataHook: Any,
    gap: Any,
    justifyItems: Any,
    rowHeight: Any
  ): AlignItems = {
    val __obj = js.Dynamic.literal(alignItems = alignItems.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], cols = cols.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], gap = gap.asInstanceOf[js.Any], justifyItems = justifyItems.asInstanceOf[js.Any], rowHeight = rowHeight.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignItems]
  }
  
  extension [Self <: AlignItems](x: Self) {
    
    inline def setAlignItems(value: Any): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setCols(value: Any): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setGap(value: Any): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
    
    inline def setJustifyItems(value: Any): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
    
    inline def setRowHeight(value: Any): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
  }
}
