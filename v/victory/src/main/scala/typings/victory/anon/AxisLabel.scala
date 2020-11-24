package typings.victory.anon

import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AxisLabel extends js.Object {
  
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
  implicit class AxisLabelOps[Self <: AxisLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxis(value: CSSProperties): Self = this.set("axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxis: Self = this.set("axis", js.undefined)
    
    @scala.inline
    def setAxisLabel(value: CSSProperties): Self = this.set("axisLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisLabel: Self = this.set("axisLabel", js.undefined)
    
    @scala.inline
    def setGrid(value: KinkeyofCSSPropertiesstri): Self = this.set("grid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGrid: Self = this.set("grid", js.undefined)
    
    @scala.inline
    def setParent(value: CSSProperties): Self = this.set("parent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    
    @scala.inline
    def setTickLabels(value: KinkeyofCSSPropertiesstri): Self = this.set("tickLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTickLabels: Self = this.set("tickLabels", js.undefined)
    
    @scala.inline
    def setTicks(value: KinkeyofCSSPropertiesstri): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
  }
}
