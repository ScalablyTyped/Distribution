package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShowFooterDivider extends StObject {
  
  var className: Any
  
  var dataHook: Any
  
  var showFooterDivider: Any
}
object ShowFooterDivider {
  
  inline def apply(className: Any, dataHook: Any, showFooterDivider: Any): ShowFooterDivider = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], showFooterDivider = showFooterDivider.asInstanceOf[js.Any])
    __obj.asInstanceOf[ShowFooterDivider]
  }
  
  extension [Self <: ShowFooterDivider](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setShowFooterDivider(value: Any): Self = StObject.set(x, "showFooterDivider", value.asInstanceOf[js.Any])
  }
}
