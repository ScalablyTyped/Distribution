package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Height
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var children: Any
  
  var className: Any
  
  var height: Any
  
  var maxHeight: Any
  
  var overflowY: Any
  
  var removeContentPadding: Any
  
  var showFooterDivider: Any
  
  var showHeaderDivider: Any
  
  var style: Any
  
  var width: Any
}
object Height {
  
  inline def apply(
    children: Any,
    className: Any,
    height: Any,
    maxHeight: Any,
    overflowY: Any,
    removeContentPadding: Any,
    showFooterDivider: Any,
    showHeaderDivider: Any,
    style: Any,
    width: Any
  ): Height = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], overflowY = overflowY.asInstanceOf[js.Any], removeContentPadding = removeContentPadding.asInstanceOf[js.Any], showFooterDivider = showFooterDivider.asInstanceOf[js.Any], showHeaderDivider = showHeaderDivider.asInstanceOf[js.Any], style = style.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Height]
  }
  
  extension [Self <: Height](x: Self) {
    
    inline def setChildren(value: Any): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setHeight(value: Any): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setMaxHeight(value: Any): Self = StObject.set(x, "maxHeight", value.asInstanceOf[js.Any])
    
    inline def setOverflowY(value: Any): Self = StObject.set(x, "overflowY", value.asInstanceOf[js.Any])
    
    inline def setRemoveContentPadding(value: Any): Self = StObject.set(x, "removeContentPadding", value.asInstanceOf[js.Any])
    
    inline def setShowFooterDivider(value: Any): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderDivider(value: Any): Self = StObject.set(x, "showHeaderDivider", value.asInstanceOf[js.Any])
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Any): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
  }
}
