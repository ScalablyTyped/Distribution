package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Content extends StObject {
  
  var className: Any
  
  var content: Any
  
  var dataHook: Any
  
  var size: Any
  
  var tooltipProps: Any
}
object Content {
  
  inline def apply(className: Any, content: Any, dataHook: Any, size: Any, tooltipProps: Any): Content = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dataHook = dataHook.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
  
  extension [Self <: Content](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setContent(value: Any): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setDataHook(value: Any): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
    
    inline def setSize(value: Any): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setTooltipProps(value: Any): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
  }
}
