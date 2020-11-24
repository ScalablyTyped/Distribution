package typings.tablesorter.uirangeoptionsMod

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.SliderClasses
import typings.jqueryui.JQueryUI.SliderEvent
import typings.jqueryui.JQueryUI.SliderUIParams
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent tablesorter.tablesorter/Omit.Omit<tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'value'> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/NumericOptions.NumericOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/PreviewableOptions.PreviewableOptions */
@js.native
trait UIRangeOptions extends js.Object {
  
  var animate: js.UndefOr[js.Any] = js.native
  
  var change: js.UndefOr[SliderEvent] = js.native
  
  var classes: js.UndefOr[SliderClasses] = js.native
  
  var create: js.UndefOr[SliderEvent] = js.native
  
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.native
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  var highlight: js.UndefOr[Boolean] = js.native
  
  /**
    * The maximum value of the control.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value of the control.
    */
  var min: js.UndefOr[Double] = js.native
  
  var orientation: js.UndefOr[String] = js.native
  
  var range: js.UndefOr[js.Any] = js.native
  
  var slide: js.UndefOr[SliderEvent] = js.native
  
  var start: js.UndefOr[SliderEvent] = js.native
  
  var stop: js.UndefOr[SliderEvent] = js.native
  
  /**
    * A value indicating whether the value should be visible in the table header.
    */
  var valueToHeader: js.UndefOr[Boolean] = js.native
  
  var values: js.UndefOr[js.Array[Double]] = js.native
}
object UIRangeOptions {
  
  @scala.inline
  def apply(): UIRangeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIRangeOptions]
  }
  
  @scala.inline
  implicit class UIRangeOptionsOps[Self <: UIRangeOptions] (val x: Self) extends AnyVal {
    
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
    def setAnimate(value: js.Any): Self = this.set("animate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setClasses(value: SliderClasses): Self = this.set("classes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClasses: Self = this.set("classes", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setDelayed(value: Boolean): Self = this.set("delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayed: Self = this.set("delayed", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setHighlight(value: Boolean): Self = this.set("highlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlight: Self = this.set("highlight", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setOrientation(value: String): Self = this.set("orientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
    
    @scala.inline
    def setRange(value: js.Any): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setSlide(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = this.set("slide", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSlide: Self = this.set("slide", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setValueToHeader(value: Boolean): Self = this.set("valueToHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValueToHeader: Self = this.set("valueToHeader", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValues: Self = this.set("values", js.undefined)
  }
}
