package typings.teechart.Tee

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAxes extends StObject {
  
  def add(horizontal: Boolean, otherSide: Boolean): IAxis
  
  var bottom: IAxis
  
  var chart: IChart
  
  var items: js.Array[IAxis]
  
  var left: IAxis
  
  var right: IAxis
  
  var top: IAxis
  
  var visible: Boolean
}
object IAxes {
  
  inline def apply(
    add: (Boolean, Boolean) => IAxis,
    bottom: IAxis,
    chart: IChart,
    items: js.Array[IAxis],
    left: IAxis,
    right: IAxis,
    top: IAxis,
    visible: Boolean
  ): IAxes = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), bottom = bottom.asInstanceOf[js.Any], chart = chart.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAxes]
  }
  
  extension [Self <: IAxes](x: Self) {
    
    inline def setAdd(value: (Boolean, Boolean) => IAxis): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setBottom(value: IAxis): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
    
    inline def setChart(value: IChart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[IAxis]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: IAxis*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setLeft(value: IAxis): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
    
    inline def setRight(value: IAxis): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
    
    inline def setTop(value: IAxis): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    
    inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
  }
}
