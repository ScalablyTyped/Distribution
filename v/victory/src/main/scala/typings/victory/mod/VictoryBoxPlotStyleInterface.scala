package typings.victory.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VictoryBoxPlotStyleInterface
  extends StObject
     with VictoryStyleInterface {
  
  var max: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var maxLabels: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var median: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var medianLabels: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var min: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var minLabels: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var q1: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var q1Labels: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var q3: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var q3Labels: js.UndefOr[VictoryStyleObject] = js.undefined
}
object VictoryBoxPlotStyleInterface {
  
  inline def apply(): VictoryBoxPlotStyleInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VictoryBoxPlotStyleInterface]
  }
  
  extension [Self <: VictoryBoxPlotStyleInterface](x: Self) {
    
    inline def setMax(value: VictoryStyleObject): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLabels(value: VictoryStyleObject): Self = StObject.set(x, "maxLabels", value.asInstanceOf[js.Any])
    
    inline def setMaxLabelsUndefined: Self = StObject.set(x, "maxLabels", js.undefined)
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMedian(value: VictoryStyleObject): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMedianLabels(value: VictoryStyleObject): Self = StObject.set(x, "medianLabels", value.asInstanceOf[js.Any])
    
    inline def setMedianLabelsUndefined: Self = StObject.set(x, "medianLabels", js.undefined)
    
    inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    inline def setMin(value: VictoryStyleObject): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLabels(value: VictoryStyleObject): Self = StObject.set(x, "minLabels", value.asInstanceOf[js.Any])
    
    inline def setMinLabelsUndefined: Self = StObject.set(x, "minLabels", js.undefined)
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setQ1(value: VictoryStyleObject): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    inline def setQ1Labels(value: VictoryStyleObject): Self = StObject.set(x, "q1Labels", value.asInstanceOf[js.Any])
    
    inline def setQ1LabelsUndefined: Self = StObject.set(x, "q1Labels", js.undefined)
    
    inline def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
    
    inline def setQ3(value: VictoryStyleObject): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    inline def setQ3Labels(value: VictoryStyleObject): Self = StObject.set(x, "q3Labels", value.asInstanceOf[js.Any])
    
    inline def setQ3LabelsUndefined: Self = StObject.set(x, "q3Labels", js.undefined)
    
    inline def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
  }
}
