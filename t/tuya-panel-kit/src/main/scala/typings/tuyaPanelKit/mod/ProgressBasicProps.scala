package typings.tuyaPanelKit.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProgressBasicProps extends ProgressProps {
  
  var endColor: js.UndefOr[String] = js.native
  
  var needMaxCircle: js.UndefOr[Boolean] = js.native
  
  var needMinCircle: js.UndefOr[Boolean] = js.native
  
  var onSlidingComplete: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var onValueChange: js.UndefOr[js.Function1[/* value */ Double, Unit]] = js.native
  
  var startColor: js.UndefOr[String] = js.native
  
  var thumbFill: js.UndefOr[String] = js.native
  
  var thumbRadius: js.UndefOr[Double] = js.native
  
  var thumbStroke: js.UndefOr[String] = js.native
  
  var thumbStrokeWidth: js.UndefOr[Double] = js.native
  
  var value: js.UndefOr[Double] = js.native
}
object ProgressBasicProps {
  
  @scala.inline
  def apply(): ProgressBasicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBasicProps]
  }
  
  @scala.inline
  implicit class ProgressBasicPropsOps[Self <: ProgressBasicProps] (val x: Self) extends AnyVal {
    
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
    def setNeedMaxCircle(value: Boolean): Self = this.set("needMaxCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedMaxCircle: Self = this.set("needMaxCircle", js.undefined)
    
    @scala.inline
    def setNeedMinCircle(value: Boolean): Self = this.set("needMinCircle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNeedMinCircle: Self = this.set("needMinCircle", js.undefined)
    
    @scala.inline
    def setOnSlidingComplete(value: /* value */ Double => Unit): Self = this.set("onSlidingComplete", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnSlidingComplete: Self = this.set("onSlidingComplete", js.undefined)
    
    @scala.inline
    def setOnValueChange(value: /* value */ Double => Unit): Self = this.set("onValueChange", js.Any.fromFunction1(value))
    
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
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
