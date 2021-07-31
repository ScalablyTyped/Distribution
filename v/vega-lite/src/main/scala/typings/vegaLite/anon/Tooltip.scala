package typings.vegaLite.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Tooltip extends StObject {
  
  var tooltip: Signal
}
object Tooltip {
  
  @scala.inline
  def apply(tooltip: Signal): Tooltip = {
    val __obj = js.Dynamic.literal(tooltip = tooltip.asInstanceOf[js.Any])
    __obj.asInstanceOf[Tooltip]
  }
  
  @scala.inline
  implicit class TooltipMutableBuilder[Self <: Tooltip] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltip(value: Signal): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
  }
}
