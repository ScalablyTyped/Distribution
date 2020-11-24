package typings.tuyaPanelKit.mod

import typings.tuyaPanelKit.anon.MaxValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DoubleProps extends ProgressProps {
  
  var endColor: js.UndefOr[String] = js.native
  
  var maxValue: js.UndefOr[Double] = js.native
  
  var minThumbFill: js.UndefOr[String] = js.native
  
  var minThumbStroke: js.UndefOr[String] = js.native
  
  var minValue: js.UndefOr[Double] = js.native
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* argus */ MaxValue, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* argus */ MaxValue, Unit]] = js.native
  
  var startColor: js.UndefOr[String] = js.native
  
  var thumbFill: js.UndefOr[String] = js.native
  
  var thumbRadius: js.UndefOr[Double] = js.native
  
  var thumbStroke: js.UndefOr[String] = js.native
  
  var thumbStrokeWidth: js.UndefOr[Double] = js.native
}
object DoubleProps {
  
  @scala.inline
  def apply(): DoubleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoubleProps]
  }
  
  @scala.inline
  implicit class DoublePropsOps[Self <: DoubleProps] (val x: Self) extends AnyVal {
    
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
    def setEndColor(value: String): Self = this.set("endColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndColor: Self = this.set("endColor", js.undefined)
    
    @scala.inline
    def setMaxValue(value: Double): Self = this.set("maxValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxValue: Self = this.set("maxValue", js.undefined)
    
    @scala.inline
    def setMinThumbFill(value: String): Self = this.set("minThumbFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinThumbFill: Self = this.set("minThumbFill", js.undefined)
    
    @scala.inline
    def setMinThumbStroke(value: String): Self = this.set("minThumbStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinThumbStroke: Self = this.set("minThumbStroke", js.undefined)
    
    @scala.inline
    def setMinValue(value: Double): Self = this.set("minValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinValue: Self = this.set("minValue", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* argus */ MaxValue => Unit): Self = this.set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* argus */ MaxValue => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnValueChange: Self = this.set("onValueChange", js.undefined)
    
    @scala.inline
    def setStartColor(value: String): Self = this.set("startColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartColor: Self = this.set("startColor", js.undefined)
    
    @scala.inline
    def setThumbFill(value: String): Self = this.set("thumbFill", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbFill: Self = this.set("thumbFill", js.undefined)
    
    @scala.inline
    def setThumbRadius(value: Double): Self = this.set("thumbRadius", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbRadius: Self = this.set("thumbRadius", js.undefined)
    
    @scala.inline
    def setThumbStroke(value: String): Self = this.set("thumbStroke", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStroke: Self = this.set("thumbStroke", js.undefined)
    
    @scala.inline
    def setThumbStrokeWidth(value: Double): Self = this.set("thumbStrokeWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumbStrokeWidth: Self = this.set("thumbStrokeWidth", js.undefined)
  }
}
