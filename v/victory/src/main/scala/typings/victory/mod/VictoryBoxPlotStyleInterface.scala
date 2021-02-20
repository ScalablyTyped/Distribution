package typings.victory.mod

import org.scalablytyped.runtime.StObject
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
  implicit class VictoryBoxPlotStyleInterfaceMutableBuilder[Self <: VictoryBoxPlotStyleInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMax(value: VictoryStyleObject): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLabels(value: VictoryStyleObject): Self = StObject.set(x, "maxLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxLabelsUndefined: Self = StObject.set(x, "maxLabels", js.undefined)
    
    @scala.inline
    def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    @scala.inline
    def setMedian(value: VictoryStyleObject): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianLabels(value: VictoryStyleObject): Self = StObject.set(x, "medianLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMedianLabelsUndefined: Self = StObject.set(x, "medianLabels", js.undefined)
    
    @scala.inline
    def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    @scala.inline
    def setMin(value: VictoryStyleObject): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLabels(value: VictoryStyleObject): Self = StObject.set(x, "minLabels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinLabelsUndefined: Self = StObject.set(x, "minLabels", js.undefined)
    
    @scala.inline
    def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    @scala.inline
    def setQ1(value: VictoryStyleObject): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1Labels(value: VictoryStyleObject): Self = StObject.set(x, "q1Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ1LabelsUndefined: Self = StObject.set(x, "q1Labels", js.undefined)
    
    @scala.inline
    def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
    
    @scala.inline
    def setQ3(value: VictoryStyleObject): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3Labels(value: VictoryStyleObject): Self = StObject.set(x, "q3Labels", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQ3LabelsUndefined: Self = StObject.set(x, "q3Labels", js.undefined)
    
    @scala.inline
    def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
  }
}
