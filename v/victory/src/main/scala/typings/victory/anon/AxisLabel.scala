package typings.victory.anon

import typings.react.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLabel extends StObject {
  
  var axis: js.UndefOr[CSSProperties] = js.native
  
  var axisLabel: js.UndefOr[CSSProperties] = js.native
  
  var grid: js.UndefOr[KinkeyofCSSPropertiesstri] = js.native
  
  var parent: js.UndefOr[CSSProperties] = js.native
  
  var tickLabels: js.UndefOr[KinkeyofCSSPropertiesstri] = js.native
  
  var ticks: js.UndefOr[KinkeyofCSSPropertiesstri] = js.native
}
object AxisLabel {
  
  @scala.inline
  def apply(): AxisLabel = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AxisLabel]
  }
  
  @scala.inline
  implicit class AxisLabelMutableBuilder[Self <: AxisLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: CSSProperties): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLabel(value: CSSProperties): Self = StObject.set(x, "axisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisLabelUndefined: Self = StObject.set(x, "axisLabel", js.undefined)
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
    
    @scala.inline
    def setGrid(value: KinkeyofCSSPropertiesstri): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
    
    @scala.inline
    def setParent(value: CSSProperties): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    
    @scala.inline
    def setTickLabels(value: KinkeyofCSSPropertiesstri): Self = StObject.set(x, "tickLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickLabelsUndefined: Self = StObject.set(x, "tickLabels", js.undefined)
    
    @scala.inline
    def setTicks(value: KinkeyofCSSPropertiesstri): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
  }
}
