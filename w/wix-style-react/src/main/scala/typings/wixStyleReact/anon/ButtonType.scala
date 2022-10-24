package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonType extends StObject {
  
  var buttonType: Requireable[String]
  
  var children: Requireable[ReactNodeLike]
  
  var collapseLabel: Requireable[ReactNodeLike]
  
  var disabled: Requireable[Boolean]
  
  var expandLabel: Requireable[ReactNodeLike]
  
  var icon: Requireable[ReactNodeLike]
  
  var initiallyOpen: Requireable[Boolean]
  
  var onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onMouseleave: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var onToggle: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var open: Requireable[Boolean]
  
  var showLabel: Requireable[String]
  
  var subtitle: Requireable[ReactNodeLike]
  
  var title: Requireable[ReactNodeLike]
}
object ButtonType {
  
  inline def apply(
    buttonType: Requireable[String],
    children: Requireable[ReactNodeLike],
    collapseLabel: Requireable[ReactNodeLike],
    disabled: Requireable[Boolean],
    expandLabel: Requireable[ReactNodeLike],
    icon: Requireable[ReactNodeLike],
    initiallyOpen: Requireable[Boolean],
    onMouseEnter: Requireable[js.Function1[/* repeated */ Any, Any]],
    onMouseleave: Requireable[js.Function1[/* repeated */ Any, Any]],
    onToggle: Requireable[js.Function1[/* repeated */ Any, Any]],
    open: Requireable[Boolean],
    showLabel: Requireable[String],
    subtitle: Requireable[ReactNodeLike],
    title: Requireable[ReactNodeLike]
  ): ButtonType = {
    val __obj = js.Dynamic.literal(buttonType = buttonType.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], collapseLabel = collapseLabel.asInstanceOf[js.Any], disabled = disabled.asInstanceOf[js.Any], expandLabel = expandLabel.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], initiallyOpen = initiallyOpen.asInstanceOf[js.Any], onMouseEnter = onMouseEnter.asInstanceOf[js.Any], onMouseleave = onMouseleave.asInstanceOf[js.Any], onToggle = onToggle.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], showLabel = showLabel.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonType]
  }
  
  extension [Self <: ButtonType](x: Self) {
    
    inline def setButtonType(value: Requireable[String]): Self = StObject.set(x, "buttonType", value.asInstanceOf[js.Any])
    
    inline def setChildren(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setCollapseLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "collapseLabel", value.asInstanceOf[js.Any])
    
    inline def setDisabled(value: Requireable[Boolean]): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setExpandLabel(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "expandLabel", value.asInstanceOf[js.Any])
    
    inline def setIcon(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setInitiallyOpen(value: Requireable[Boolean]): Self = StObject.set(x, "initiallyOpen", value.asInstanceOf[js.Any])
    
    inline def setOnMouseEnter(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
    
    inline def setOnMouseleave(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onMouseleave", value.asInstanceOf[js.Any])
    
    inline def setOnToggle(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onToggle", value.asInstanceOf[js.Any])
    
    inline def setOpen(value: Requireable[Boolean]): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    inline def setShowLabel(value: Requireable[String]): Self = StObject.set(x, "showLabel", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
