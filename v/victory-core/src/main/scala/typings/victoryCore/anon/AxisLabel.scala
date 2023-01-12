package typings.victoryCore.anon

import typings.victoryCore.libVictoryThemeTypesMod.VictoryLabelStyleObject
import typings.victoryCore.libVictoryThemeTypesMod.VictoryStyleObject
import typings.victoryCore.libVictoryThemeTypesMod.VictoryTickStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AxisLabel extends StObject {
  
  var axis: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var axisLabel: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
  
  var grid: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var tickLabels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
  
  var ticks: js.UndefOr[VictoryTickStyleObject] = js.undefined
}
object AxisLabel {
  
  inline def apply(): AxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AxisLabel] (val x: Self) extends AnyVal {
    
    inline def setAxis(value: VictoryStyleObject): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisLabel(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "axisLabel", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelUndefined: Self = StObject.set(x, "axisLabel", js.undefined)
    
    inline def setAxisLabelVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "axisLabel", js.Array(value*))
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setGrid(value: VictoryStyleObject): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setTickLabels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "tickLabels", value.asInstanceOf[js.Any])
    
    inline def setTickLabelsUndefined: Self = StObject.set(x, "tickLabels", js.undefined)
    
    inline def setTickLabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "tickLabels", js.Array(value*))
    
    inline def setTicks(value: VictoryTickStyleObject): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
