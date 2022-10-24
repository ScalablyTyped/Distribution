package typings.wixStyleReact.anon

import typings.propTypes.mod.ReactNodeLike
import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipText extends StObject {
  
  var onClick: Requireable[js.Function1[/* repeated */ Any, Any]]
  
  var tooltipText: Requireable[ReactNodeLike]
}
object TooltipText {
  
  inline def apply(
    onClick: Requireable[js.Function1[/* repeated */ Any, Any]],
    tooltipText: Requireable[ReactNodeLike]
  ): TooltipText = {
    val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any], tooltipText = tooltipText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipText]
  }
  
  extension [Self <: TooltipText](x: Self) {
    
    inline def setOnClick(value: Requireable[js.Function1[/* repeated */ Any, Any]]): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
    
    inline def setTooltipText(value: Requireable[ReactNodeLike]): Self = StObject.set(x, "tooltipText", value.asInstanceOf[js.Any])
  }
}
