package typings.tooltipster

import typings.tooltipster.JQueryTooltipster.ITooltipsterStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JQueryStatic extends StObject {
  
  var tooltipster: ITooltipsterStatic
}
object JQueryStatic {
  
  @scala.inline
  def apply(tooltipster: ITooltipsterStatic): JQueryStatic = {
    val __obj = js.Dynamic.literal(tooltipster = tooltipster.asInstanceOf[js.Any])
    __obj.asInstanceOf[JQueryStatic]
  }
  
  @scala.inline
  implicit class JQueryStaticMutableBuilder[Self <: JQueryStatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTooltipster(value: ITooltipsterStatic): Self = StObject.set(x, "tooltipster", value.asInstanceOf[js.Any])
  }
}
