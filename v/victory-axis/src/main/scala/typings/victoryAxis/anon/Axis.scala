package typings.victoryAxis.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis extends StObject {
  
  var axis: Any
  
  var axisLabel: Any
  
  var grid: Any
  
  var parent: Any
  
  var tickLabels: Any
  
  var ticks: Any
}
object Axis {
  
  inline def apply(axis: Any, axisLabel: Any, grid: Any, parent: Any, tickLabels: Any, ticks: Any): Axis = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], axisLabel = axisLabel.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], tickLabels = tickLabels.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Axis]
  }
  
  extension [Self <: Axis](x: Self) {
    
    inline def setAxis(value: Any): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisLabel(value: Any): Self = StObject.set(x, "axisLabel", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: Any): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTickLabels(value: Any): Self = StObject.set(x, "tickLabels", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: Any): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
