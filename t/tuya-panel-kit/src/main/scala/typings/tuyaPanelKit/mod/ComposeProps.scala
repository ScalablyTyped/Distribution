package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.tuyaPanelKit.anon.Value1
import typings.tuyaPanelKit.anon.Value2x
import typings.tuyaPanelKit.themeMod.StopsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ComposeProps extends GestureProps {
  
  var andDegree1: js.UndefOr[Double] = js.native
  
  var backColor: js.UndefOr[String] = js.native
  
  var backStrokeOpacity: js.UndefOr[Double] = js.native
  
  var endColor: js.UndefOr[String] = js.native
  
  var foreColor: js.UndefOr[String | js.Array[StopsProps] | StringDictionary[String]] = js.native
  
  var foreStrokeOpacity: js.UndefOr[Double] = js.native
  
  var max1: js.UndefOr[Double] = js.native
  
  var max2: js.UndefOr[Double] = js.native
  
  var min1: js.UndefOr[Double] = js.native
  
  var min2: js.UndefOr[Double] = js.native
  
  var needCircle1: js.UndefOr[Boolean] = js.native
  
  var needCircle2: js.UndefOr[Boolean] = js.native
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* argus */ Value2x, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* argus */ Value1, Unit]] = js.native
  
  var reduceDegree2: js.UndefOr[Double] = js.native
  
  var scaleHeight1: js.UndefOr[Double] = js.native
  
  var scaleHeight2: js.UndefOr[Double] = js.native
  
  var startColor: js.UndefOr[String] = js.native
  
  var startDegree1: js.UndefOr[Double] = js.native
  
  var startDegree2: js.UndefOr[Double] = js.native
  
  var stepValue: js.UndefOr[Double] = js.native
  
  var thumbFill: js.UndefOr[String] = js.native
  
  var thumbFill2: js.UndefOr[String] = js.native
  
  var thumbRadius1: js.UndefOr[Double] = js.native
  
  var thumbRadius2: js.UndefOr[Double] = js.native
  
  var thumbStroke: js.UndefOr[String] = js.native
  
  var thumbStroke2: js.UndefOr[String] = js.native
  
  var thumbStrokeWidth: js.UndefOr[Double] = js.native
  
  var thumbStrokeWidth2: js.UndefOr[Double] = js.native
  
  var value1: js.UndefOr[Double] = js.native
  
  var value2: js.UndefOr[Double] = js.native
}
object ComposeProps {
  
  @scala.inline
  def apply(): ComposeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComposeProps]
  }
  
  @scala.inline
  implicit class ComposePropsOps[Self <: ComposeProps] (val x: Self) extends AnyVal {
    
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
    def setAndDegree1(value: Double): Self = this.set("andDegree1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndDegree1: Self = this.set("andDegree1", js.undefined)
    
    @scala.inline
    def setBackColor(value: String): Self = this.set("backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackColor: Self = this.set("backColor", js.undefined)
    
    @scala.inline
    def setBackStrokeOpacity(value: Double): Self = this.set("backStrokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackStrokeOpacity: Self = this.set("backStrokeOpacity", js.undefined)
    
    @scala.inline
    def setEndColor(value: String): Self = this.set("endColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndColor: Self = this.set("endColor", js.undefined)
    
    @scala.inline
    def setForeColorVarargs(value: StopsProps*): Self = this.set("foreColor", js.Array(value :_*))
    
    @scala.inline
    def setForeColor(value: String | js.Array[StopsProps] | StringDictionary[String]): Self = this.set("foreColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeColor: Self = this.set("foreColor", js.undefined)
    
    @scala.inline
    def setForeStrokeOpacity(value: Double): Self = this.set("foreStrokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForeStrokeOpacity: Self = this.set("foreStrokeOpacity", js.undefined)
    
    @scala.inline
    def setMax1(value: Double): Self = this.set("max1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax1: Self = this.set("max1", js.undefined)
    
    @scala.inline
    def setMax2(value: Double): Self = this.set("max2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax2: Self = this.set("max2", js.undefined)
    
    @scala.inline
    def setMin1(value: Double): Self = this.set("min1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin1: Self = this.set("min1", js.undefined)
    
    @scala.inline
    def setMin2(value: Double): Self = this.set("min2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin2: Self = this.set("min2", js.undefined)
    
    @scala.inline
    def setNeedCircle1(value: Boolean): Self = this.set("needCircle1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedCircle1: Self = this.set("needCircle1", js.undefined)
    
    @scala.inline
    def setNeedCircle2(value: Boolean): Self = this.set("needCircle2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedCircle2: Self = this.set("needCircle2", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* argus */ Value2x => Unit): Self = this.set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* argus */ Value1 => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setReduceDegree2(value: Double): Self = this.set("reduceDegree2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReduceDegree2: Self = this.set("reduceDegree2", js.undefined)
    
    @scala.inline
    def setScaleHeight1(value: Double): Self = this.set("scaleHeight1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleHeight1: Self = this.set("scaleHeight1", js.undefined)
    
    @scala.inline
    def setScaleHeight2(value: Double): Self = this.set("scaleHeight2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleHeight2: Self = this.set("scaleHeight2", js.undefined)
    
    @scala.inline
    def setStartColor(value: String): Self = this.set("startColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartColor: Self = this.set("startColor", js.undefined)
    
    @scala.inline
    def setStartDegree1(value: Double): Self = this.set("startDegree1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDegree1: Self = this.set("startDegree1", js.undefined)
    
    @scala.inline
    def setStartDegree2(value: Double): Self = this.set("startDegree2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDegree2: Self = this.set("startDegree2", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = this.set("stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepValue: Self = this.set("stepValue", js.undefined)
    
    @scala.inline
    def setThumbFill(value: String): Self = this.set("thumbFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbFill: Self = this.set("thumbFill", js.undefined)
    
    @scala.inline
    def setThumbFill2(value: String): Self = this.set("thumbFill2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbFill2: Self = this.set("thumbFill2", js.undefined)
    
    @scala.inline
    def setThumbRadius1(value: Double): Self = this.set("thumbRadius1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbRadius1: Self = this.set("thumbRadius1", js.undefined)
    
    @scala.inline
    def setThumbRadius2(value: Double): Self = this.set("thumbRadius2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbRadius2: Self = this.set("thumbRadius2", js.undefined)
    
    @scala.inline
    def setThumbStroke(value: String): Self = this.set("thumbStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStroke: Self = this.set("thumbStroke", js.undefined)
    
    @scala.inline
    def setThumbStroke2(value: String): Self = this.set("thumbStroke2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStroke2: Self = this.set("thumbStroke2", js.undefined)
    
    @scala.inline
    def setThumbStrokeWidth(value: Double): Self = this.set("thumbStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStrokeWidth: Self = this.set("thumbStrokeWidth", js.undefined)
    
    @scala.inline
    def setThumbStrokeWidth2(value: Double): Self = this.set("thumbStrokeWidth2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStrokeWidth2: Self = this.set("thumbStrokeWidth2", js.undefined)
    
    @scala.inline
    def setValue1(value: Double): Self = this.set("value1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue1: Self = this.set("value1", js.undefined)
    
    @scala.inline
    def setValue2(value: Double): Self = this.set("value2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue2: Self = this.set("value2", js.undefined)
  }
}
