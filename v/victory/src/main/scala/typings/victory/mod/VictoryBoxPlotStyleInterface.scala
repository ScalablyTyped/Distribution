package typings.victory.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VictoryBoxPlotStyleInterface extends VictoryStyleInterface {
  
  var max: js.UndefOr[VictoryStyleObject] = js.native
  
  var maxLabels: js.UndefOr[VictoryStyleObject] = js.native
  
  var median: js.UndefOr[VictoryStyleObject] = js.native
  
  var medianLabels: js.UndefOr[VictoryStyleObject] = js.native
  
  var min: js.UndefOr[VictoryStyleObject] = js.native
  
  var minLabels: js.UndefOr[VictoryStyleObject] = js.native
  
  var q1: js.UndefOr[VictoryStyleObject] = js.native
  
  var q1Labels: js.UndefOr[VictoryStyleObject] = js.native
  
  var q3: js.UndefOr[VictoryStyleObject] = js.native
  
  var q3Labels: js.UndefOr[VictoryStyleObject] = js.native
}
object VictoryBoxPlotStyleInterface {
  
  @scala.inline
  def apply(): VictoryBoxPlotStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBoxPlotStyleInterface]
  }
  
  @scala.inline
  implicit class VictoryBoxPlotStyleInterfaceOps[Self <: VictoryBoxPlotStyleInterface] (val x: Self) extends AnyVal {
    
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
    def setMax(value: VictoryStyleObject): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMaxLabels(value: VictoryStyleObject): Self = this.set("maxLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxLabels: Self = this.set("maxLabels", js.undefined)
    
    @scala.inline
    def setMedian(value: VictoryStyleObject): Self = this.set("median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedian: Self = this.set("median", js.undefined)
    
    @scala.inline
    def setMedianLabels(value: VictoryStyleObject): Self = this.set("medianLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMedianLabels: Self = this.set("medianLabels", js.undefined)
    
    @scala.inline
    def setMin(value: VictoryStyleObject): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setMinLabels(value: VictoryStyleObject): Self = this.set("minLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinLabels: Self = this.set("minLabels", js.undefined)
    
    @scala.inline
    def setQ1(value: VictoryStyleObject): Self = this.set("q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ1: Self = this.set("q1", js.undefined)
    
    @scala.inline
    def setQ1Labels(value: VictoryStyleObject): Self = this.set("q1Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ1Labels: Self = this.set("q1Labels", js.undefined)
    
    @scala.inline
    def setQ3(value: VictoryStyleObject): Self = this.set("q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ3: Self = this.set("q3", js.undefined)
    
    @scala.inline
    def setQ3Labels(value: VictoryStyleObject): Self = this.set("q3Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQ3Labels: Self = this.set("q3Labels", js.undefined)
  }
}
