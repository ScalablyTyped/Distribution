package typings.tooltipster

import typings.tooltipster.JQueryTooltipster.ITooltipsterStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var tooltipster: ITooltipsterStatic
}
object JQueryStatic {
  
  inline def apply(tooltipster: ITooltipsterStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tooltipster = tooltipster.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  extension [Self <: JQueryStatic](x: Self) {
    
    inline def setTooltipster(value: ITooltipsterStatic): Self = StObject.set(x, "tooltipster", value.asInstanceOf[js.Any])
  }
}
