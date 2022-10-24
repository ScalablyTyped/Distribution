package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionsBar extends StObject {
  
  var actionsBar: Any
  
  var className: Any
  
  var dataHook: Any
  
  var showDivider: Any
  
  var subtitle: Any
  
  var title: Any
}
object ActionsBar {
  
  inline def apply(actionsBar: Any, className: Any, dataHook: Any, showDivider: Any, subtitle: Any, title: Any): ActionsBar = {
    val __obj = js.Dynamic.literal(actionsBar = actionsBar.asInstanceOf[js.Any], className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], showDivider = showDivider.asInstanceOf[js.Any], subtitle = subtitle.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionsBar]
  }
  
  extension [Self <: ActionsBar](x: Self) {
    
    inline def setActionsBar(value: Any): Self = StObject.set(x, "actionsBar", value.asInstanceOf[js.Any])
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setShowDivider(value: Any): Self = StObject.set(x, "showDivider", value.asInstanceOf[js.Any])
    
    inline def setSubtitle(value: Any): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: Any): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
