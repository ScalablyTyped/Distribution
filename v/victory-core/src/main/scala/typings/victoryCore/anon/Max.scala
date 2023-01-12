package typings.victoryCore.anon

import typings.victoryCore.libVictoryThemeTypesMod.VictoryLabelStyleObject
import typings.victoryCore.libVictoryThemeTypesMod.VictoryStyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Max extends StObject {
  
  var max: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var maxLabels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
  
  var median: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var medianLabels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
  
  var min: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var minLabels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
  
  var q1: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var q1Labels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
  
  var q3: js.UndefOr[VictoryStyleObject] = js.undefined
  
  var q3Labels: js.UndefOr[VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]] = js.undefined
}
object Max {
  
  inline def apply(): Max = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Max]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Max] (val x: Self) extends AnyVal {
    
    inline def setMax(value: VictoryStyleObject): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxLabels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "maxLabels", value.asInstanceOf[js.Any])
    
    inline def setMaxLabelsUndefined: Self = StObject.set(x, "maxLabels", js.undefined)
    
    inline def setMaxLabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "maxLabels", js.Array(value*))
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMedian(value: VictoryStyleObject): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMedianLabels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "medianLabels", value.asInstanceOf[js.Any])
    
    inline def setMedianLabelsUndefined: Self = StObject.set(x, "medianLabels", js.undefined)
    
    inline def setMedianLabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "medianLabels", js.Array(value*))
    
    inline def setMedianUndefined: Self = StObject.set(x, "median", js.undefined)
    
    inline def setMin(value: VictoryStyleObject): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinLabels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "minLabels", value.asInstanceOf[js.Any])
    
    inline def setMinLabelsUndefined: Self = StObject.set(x, "minLabels", js.undefined)
    
    inline def setMinLabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "minLabels", js.Array(value*))
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setQ1(value: VictoryStyleObject): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    inline def setQ1Labels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "q1Labels", value.asInstanceOf[js.Any])
    
    inline def setQ1LabelsUndefined: Self = StObject.set(x, "q1Labels", js.undefined)
    
    inline def setQ1LabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "q1Labels", js.Array(value*))
    
    inline def setQ1Undefined: Self = StObject.set(x, "q1", js.undefined)
    
    inline def setQ3(value: VictoryStyleObject): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    inline def setQ3Labels(value: VictoryLabelStyleObject | js.Array[VictoryLabelStyleObject]): Self = StObject.set(x, "q3Labels", value.asInstanceOf[js.Any])
    
    inline def setQ3LabelsUndefined: Self = StObject.set(x, "q3Labels", js.undefined)
    
    inline def setQ3LabelsVarargs(value: VictoryLabelStyleObject*): Self = StObject.set(x, "q3Labels", js.Array(value*))
    
    inline def setQ3Undefined: Self = StObject.set(x, "q3", js.undefined)
  }
}
