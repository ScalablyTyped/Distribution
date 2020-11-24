package typings.tuyaPanelKit.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import typings.tuyaPanelKit.themeMod.StopsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressProps extends GestureProps {
  
  var andDegree: js.UndefOr[Double] = js.native
  
  var backColor: js.UndefOr[String] = js.native
  
  var backStrokeOpacity: js.UndefOr[Double] = js.native
  
  var foreColor: js.UndefOr[String | js.Array[StopsProps] | StringDictionary[String]] = js.native
  
  var foreStrokeOpacity: js.UndefOr[Double] = js.native
  
  var gradientId: js.UndefOr[String] = js.native
  
  var max: js.UndefOr[Double] = js.native
  
  var min: js.UndefOr[Double] = js.native
  
  var renderCenterView: js.UndefOr[ReactNode] = js.native
  
  var scaleHeight: js.UndefOr[Double] = js.native
  
  var startDegree: js.UndefOr[Double] = js.native
  
  var stepValue: js.UndefOr[Double] = js.native
  
  var x1: js.UndefOr[String] = js.native
  
  var x2: js.UndefOr[String] = js.native
  
  var y1: js.UndefOr[String] = js.native
  
  var y2: js.UndefOr[String] = js.native
}
object ProgressProps {
  
  @scala.inline
  def apply(): ProgressProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressProps]
  }
  
  @scala.inline
  implicit class ProgressPropsOps[Self <: ProgressProps] (val x: Self) extends AnyVal {
    
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
    def setAndDegree(value: Double): Self = this.set("andDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAndDegree: Self = this.set("andDegree", js.undefined)
    
    @scala.inline
    def setBackColor(value: String): Self = this.set("backColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackColor: Self = this.set("backColor", js.undefined)
    
    @scala.inline
    def setBackStrokeOpacity(value: Double): Self = this.set("backStrokeOpacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackStrokeOpacity: Self = this.set("backStrokeOpacity", js.undefined)
    
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
    def setGradientId(value: String): Self = this.set("gradientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGradientId: Self = this.set("gradientId", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setRenderCenterView(value: ReactNode): Self = this.set("renderCenterView", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRenderCenterView: Self = this.set("renderCenterView", js.undefined)
    
    @scala.inline
    def setScaleHeight(value: Double): Self = this.set("scaleHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScaleHeight: Self = this.set("scaleHeight", js.undefined)
    
    @scala.inline
    def setStartDegree(value: Double): Self = this.set("startDegree", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDegree: Self = this.set("startDegree", js.undefined)
    
    @scala.inline
    def setStepValue(value: Double): Self = this.set("stepValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStepValue: Self = this.set("stepValue", js.undefined)
    
    @scala.inline
    def setX1(value: String): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX1: Self = this.set("x1", js.undefined)
    
    @scala.inline
    def setX2(value: String): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteX2: Self = this.set("x2", js.undefined)
    
    @scala.inline
    def setY1(value: String): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY1: Self = this.set("y1", js.undefined)
    
    @scala.inline
    def setY2(value: String): Self = this.set("y2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY2: Self = this.set("y2", js.undefined)
  }
}
