package typings.vis.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Graph2dBarChartOption extends StObject {
  
  var align: js.UndefOr[Graph2dBarChartAlign] = js.undefined
  
  var minWidth: js.UndefOr[Double] = js.undefined
  
  var sideBySide: js.UndefOr[Boolean] = js.undefined
  
  var width: js.UndefOr[Double] = js.undefined
}
object Graph2dBarChartOption {
  
  @scala.inline
  def apply(): Graph2dBarChartOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dBarChartOption]
  }
  
  @scala.inline
  implicit class Graph2dBarChartOptionMutableBuilder[Self <: Graph2dBarChartOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAlign(value: Graph2dBarChartAlign): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignUndefined: Self = StObject.set(x, "align", js.undefined)
    
    @scala.inline
    def setMinWidth(value: Double): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    
    @scala.inline
    def setSideBySide(value: Boolean): Self = StObject.set(x, "sideBySide", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSideBySideUndefined: Self = StObject.set(x, "sideBySide", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
