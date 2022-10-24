package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowHeaderDivider extends StObject {
  
  var className: Any
  
  var dataHook: Any
  
  var showHeaderDivider: Any
  
  var titleAppearance: Any
}
object ShowHeaderDivider {
  
  inline def apply(className: Any, dataHook: Any, showHeaderDivider: Any, titleAppearance: Any): ShowHeaderDivider = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], showHeaderDivider = showHeaderDivider.asInstanceOf[js.Any], titleAppearance = titleAppearance.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowHeaderDivider]
  }
  
  extension [Self <: ShowHeaderDivider](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setShowHeaderDivider(value: Any): Self = StObject.set(x, "showHeaderDivider", value.asInstanceOf[js.Any])
    
    inline def setTitleAppearance(value: Any): Self = StObject.set(x, "titleAppearance", value.asInstanceOf[js.Any])
  }
}
