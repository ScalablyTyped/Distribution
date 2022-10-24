package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipContent extends StObject {
  
  var color: Requireable[String]
  
  var label: Requireable[String]
  
  var tooltipContent: Requireable[ReactNodeLike]
  
  var value: Requireable[Double]
}
object TooltipContent {
  
  inline def apply(
    color: Requireable[String],
    label: Requireable[String],
    tooltipContent: Requireable[ReactNodeLike],
    value: Requireable[Double]
  ): TooltipContent = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], tooltipContent = tooltipContent.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipContent]
  }
  
  extension [Self <: TooltipContent](x: Self) {
    
    inline def setColor(value: Requireable[String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: Requireable[String]): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setTooltipContent(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "tooltipContent", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Requireable[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
