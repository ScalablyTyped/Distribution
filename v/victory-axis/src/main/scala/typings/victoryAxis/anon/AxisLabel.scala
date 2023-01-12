package typings.victoryAxis.anon

import typings.propTypes.mod.Requireable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabel extends StObject {
  
  var axis: Requireable[js.Object]
  
  var axisLabel: Requireable[js.Object]
  
  var grid: Requireable[js.Object]
  
  var parent: Requireable[js.Object]
  
  var tickLabels: Requireable[js.Object]
  
  var ticks: Requireable[js.Object]
}
object AxisLabel {
  
  inline def apply(
    axis: Requireable[js.Object],
    axisLabel: Requireable[js.Object],
    grid: Requireable[js.Object],
    parent: Requireable[js.Object],
    tickLabels: Requireable[js.Object],
    ticks: Requireable[js.Object]
  ): AxisLabel = {
    val __obj = js.Dynamic.literal(axis = axis.asInstanceOf[js.Any], axisLabel = axisLabel.asInstanceOf[js.Any], grid = grid.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], tickLabels = tickLabels.asInstanceOf[js.Any], ticks = ticks.asInstanceOf[js.Any])
    __obj.asInstanceOf[AxisLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLabel] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: Requireable[js.Object]): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisLabel(value: Requireable[js.Object]): Self = StObject.set(x, "axisLabel", value.asInstanceOf[js.Any])
    
    inline def setGrid(value: Requireable[js.Object]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Requireable[js.Object]): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setTickLabels(value: Requireable[js.Object]): Self = StObject.set(x, "tickLabels", value.asInstanceOf[js.Any])
    
    inline def setTicks(value: Requireable[js.Object]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
  }
}
