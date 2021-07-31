package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tuyaPanelKit.anon.Value1
import typings.tuyaPanelKit.anon.Value2x
import typings.tuyaPanelKit.themeMod.StopsProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComposeProps
  extends StObject
     with GestureProps {
  
  var andDegree1: js.UndefOr[Double] = js.undefined
  
  var backColor: js.UndefOr[String] = js.undefined
  
  var backStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  var endColor: js.UndefOr[String] = js.undefined
  
  var foreColor: js.UndefOr[String | js.Array[StopsProps] | StringDictionary[String]] = js.undefined
  
  var foreStrokeOpacity: js.UndefOr[Double] = js.undefined
  
  var max1: js.UndefOr[Double] = js.undefined
  
  var max2: js.UndefOr[Double] = js.undefined
  
  var min1: js.UndefOr[Double] = js.undefined
  
  var min2: js.UndefOr[Double] = js.undefined
  
  var needCircle1: js.UndefOr[Boolean] = js.undefined
  
  var needCircle2: js.UndefOr[Boolean] = js.undefined
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* argus */ Value2x, Unit]] = js.undefined
  
  var onValueChange: js.UndefOr[js.Function1[/* argus */ Value1, Unit]] = js.undefined
  
  var reduceDegree2: js.UndefOr[Double] = js.undefined
  
  var scaleHeight1: js.UndefOr[Double] = js.undefined
  
  var scaleHeight2: js.UndefOr[Double] = js.undefined
  
  var startColor: js.UndefOr[String] = js.undefined
  
  var startDegree1: js.UndefOr[Double] = js.undefined
  
  var startDegree2: js.UndefOr[Double] = js.undefined
  
  var stepValue: js.UndefOr[Double] = js.undefined
  
  var thumbFill: js.UndefOr[String] = js.undefined
  
  var thumbFill2: js.UndefOr[String] = js.undefined
  
  var thumbRadius1: js.UndefOr[Double] = js.undefined
  
  var thumbRadius2: js.UndefOr[Double] = js.undefined
  
  var thumbStroke: js.UndefOr[String] = js.undefined
  
  var thumbStroke2: js.UndefOr[String] = js.undefined
  
  var thumbStrokeWidth: js.UndefOr[Double] = js.undefined
  
  var thumbStrokeWidth2: js.UndefOr[Double] = js.undefined
  
  var value1: js.UndefOr[Double] = js.undefined
  
  var value2: js.UndefOr[Double] = js.undefined
}
object ComposeProps {
  
  @scala.inline
  def apply(): ComposeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeProps]
  }
  
  @scala.inline
  implicit class ComposePropsMutableBuilder[Self <: ComposeProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAndDegree1(value: Double): Self = StObject.set(x, "andDegree1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAndDegree1Undefined: Self = StObject.set(x, "andDegree1", js.undefined)
    
    @scala.inline
    def setBackColor(value: String): Self = StObject.set(x, "backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackColorUndefined: Self = StObject.set(x, "backColor", js.undefined)
    
    @scala.inline
    def setBackStrokeOpacity(value: Double): Self = StObject.set(x, "backStrokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackStrokeOpacityUndefined: Self = StObject.set(x, "backStrokeOpacity", js.undefined)
    
    @scala.inline
    def setEndColor(value: String): Self = StObject.set(x, "endColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndColorUndefined: Self = StObject.set(x, "endColor", js.undefined)
    
    @scala.inline
    def setForeColor(value: String | js.Array[StopsProps] | StringDictionary[String]): Self = StObject.set(x, "foreColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeColorUndefined: Self = StObject.set(x, "foreColor", js.undefined)
    
    @scala.inline
    def setForeColorVarargs(value: StopsProps*): Self = StObject.set(x, "foreColor", js.Array(value :_*))
    
    @scala.inline
    def setForeStrokeOpacity(value: Double): Self = StObject.set(x, "foreStrokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForeStrokeOpacityUndefined: Self = StObject.set(x, "foreStrokeOpacity", js.undefined)
    
    @scala.inline
    def setMax1(value: Double): Self = StObject.set(x, "max1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax1Undefined: Self = StObject.set(x, "max1", js.undefined)
    
    @scala.inline
    def setMax2(value: Double): Self = StObject.set(x, "max2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMax2Undefined: Self = StObject.set(x, "max2", js.undefined)
    
    @scala.inline
    def setMin1(value: Double): Self = StObject.set(x, "min1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin1Undefined: Self = StObject.set(x, "min1", js.undefined)
    
    @scala.inline
    def setMin2(value: Double): Self = StObject.set(x, "min2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMin2Undefined: Self = StObject.set(x, "min2", js.undefined)
    
    @scala.inline
    def setNeedCircle1(value: Boolean): Self = StObject.set(x, "needCircle1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedCircle1Undefined: Self = StObject.set(x, "needCircle1", js.undefined)
    
    @scala.inline
    def setNeedCircle2(value: Boolean): Self = StObject.set(x, "needCircle2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNeedCircle2Undefined: Self = StObject.set(x, "needCircle2", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* argus */ Value2x => Unit): Self = StObject.set(x, "onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnSlidingCompleteUndefined: Self = StObject.set(x, "onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* argus */ Value1 => Unit): Self = StObject.set(x, "onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnValueChangeUndefined: Self = StObject.set(x, "onValueChange", js.undefined)
    
    @scala.inline
    def setReduceDegree2(value: Double): Self = StObject.set(x, "reduceDegree2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReduceDegree2Undefined: Self = StObject.set(x, "reduceDegree2", js.undefined)
    
    @scala.inline
    def setScaleHeight1(value: Double): Self = StObject.set(x, "scaleHeight1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleHeight1Undefined: Self = StObject.set(x, "scaleHeight1", js.undefined)
    
    @scala.inline
    def setScaleHeight2(value: Double): Self = StObject.set(x, "scaleHeight2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleHeight2Undefined: Self = StObject.set(x, "scaleHeight2", js.undefined)
    
    @scala.inline
    def setStartColor(value: String): Self = StObject.set(x, "startColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartColorUndefined: Self = StObject.set(x, "startColor", js.undefined)
    
    @scala.inline
    def setStartDegree1(value: Double): Self = StObject.set(x, "startDegree1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDegree1Undefined: Self = StObject.set(x, "startDegree1", js.undefined)
    
    @scala.inline
    def setStartDegree2(value: Double): Self = StObject.set(x, "startDegree2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartDegree2Undefined: Self = StObject.set(x, "startDegree2", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = StObject.set(x, "stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStepValueUndefined: Self = StObject.set(x, "stepValue", js.undefined)
    
    @scala.inline
    def setThumbFill(value: String): Self = StObject.set(x, "thumbFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbFill2(value: String): Self = StObject.set(x, "thumbFill2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbFill2Undefined: Self = StObject.set(x, "thumbFill2", js.undefined)
    
    @scala.inline
    def setThumbFillUndefined: Self = StObject.set(x, "thumbFill", js.undefined)
    
    @scala.inline
    def setThumbRadius1(value: Double): Self = StObject.set(x, "thumbRadius1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadius1Undefined: Self = StObject.set(x, "thumbRadius1", js.undefined)
    
    @scala.inline
    def setThumbRadius2(value: Double): Self = StObject.set(x, "thumbRadius2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbRadius2Undefined: Self = StObject.set(x, "thumbRadius2", js.undefined)
    
    @scala.inline
    def setThumbStroke(value: String): Self = StObject.set(x, "thumbStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStroke2(value: String): Self = StObject.set(x, "thumbStroke2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStroke2Undefined: Self = StObject.set(x, "thumbStroke2", js.undefined)
    
    @scala.inline
    def setThumbStrokeUndefined: Self = StObject.set(x, "thumbStroke", js.undefined)
    
    @scala.inline
    def setThumbStrokeWidth(value: Double): Self = StObject.set(x, "thumbStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStrokeWidth2(value: Double): Self = StObject.set(x, "thumbStrokeWidth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThumbStrokeWidth2Undefined: Self = StObject.set(x, "thumbStrokeWidth2", js.undefined)
    
    @scala.inline
    def setThumbStrokeWidthUndefined: Self = StObject.set(x, "thumbStrokeWidth", js.undefined)
    
    @scala.inline
    def setValue1(value: Double): Self = StObject.set(x, "value1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue1Undefined: Self = StObject.set(x, "value1", js.undefined)
    
    @scala.inline
    def setValue2(value: Double): Self = StObject.set(x, "value2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue2Undefined: Self = StObject.set(x, "value2", js.undefined)
  }
}
