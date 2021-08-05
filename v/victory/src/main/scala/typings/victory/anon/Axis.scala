package typings.victory.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Axis extends StObject {
  
  var axis: js.UndefOr[CSSProperties] = js.undefined
  
  var axisLabel: js.UndefOr[CSSProperties] = js.undefined
  
  var grid: js.UndefOr[CSSProperties] = js.undefined
  
  var tickLabels: js.UndefOr[CSSProperties] = js.undefined
  
  var ticks: js.UndefOr[CSSProperties] = js.undefined
}
object Axis {
  
  inline def apply(): Axis = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Axis]
  }
  
  extension [Self <: Axis](x: Self) {
    
    inline def setAxis(value: CSSProperties): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisLabel(value: CSSProperties): Self = StObject.set(x, "axisLabel", value.asInstanceOf[js.Any])
    
    inline def setAxisLabelUndefined: Self = StObject.set(x, "axisLabel", js.undefined)
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    inline def setGrid(value: CSSProperties): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    inline def setTickLabels(value: CSSProperties): Self = StObject.set(x, "tickLabels", value.asInstanceOf[js.Any])
    
    inline def setTickLabelsUndefined: Self = StObject.set(x, "tickLabels", js.undefined)
    
    inline def setTicks(value: CSSProperties): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    inline def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
