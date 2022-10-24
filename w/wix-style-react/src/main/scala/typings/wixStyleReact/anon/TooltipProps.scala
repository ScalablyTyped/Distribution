package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipProps
  extends StObject
     with /* key */ StringDictionary[Any] {
  
  var className: Any
  
  var tooltipProps: Any
}
object TooltipProps {
  
  inline def apply(className: Any, tooltipProps: Any): TooltipProps = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], tooltipProps = tooltipProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipProps]
  }
  
  extension [Self <: TooltipProps](x: Self) {
    
    inline def setClassName(value: Any): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setTooltipProps(value: Any): Self = StObject.set(x, "tooltipProps", value.asInstanceOf[js.Any])
  }
}
