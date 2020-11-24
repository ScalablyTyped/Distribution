package typings.tablesorter.uispinneroptionsMod

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.SpinnerEvent
import typings.jqueryui.JQueryUI.SpinnerUIParam
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SpinnerOptions> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/IntervalOptions.IntervalOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ControlOptions.ControlOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DefaultValueOptions.DefaultValueOptions<number> */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ToggleableOptions.ToggleableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ComparableOptions.ComparableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
/* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/StrictOptions.StrictOptions */
@js.native
trait UISpinnerOptions extends js.Object {
  
  /**
    * A value indicating whether to add a box for enabling/disabling the control.
    */
  var addToggle: js.UndefOr[Boolean] = js.native
  
  /**
    * The label of the control.
    */
  var cellText: js.UndefOr[String] = js.native
  
  var change: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  
  /**
    * The compare-operators supported by the control.
    */
  var compare: js.UndefOr[String | js.Array[String]] = js.native
  
  var create: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  
  var culture: js.UndefOr[String] = js.native
  
  /**
    * A value indicating whether the value of the filter should be set delayed.
    */
  var delayed: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicating whether the control is initially disabled.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A value indicatin whether only exact matching values should be included.
    */
  var exactMatch: js.UndefOr[Boolean] = js.native
  
  var icons: js.UndefOr[js.Any] = js.native
  
  var incremental: js.UndefOr[js.Any] = js.native
  
  /**
    * The maximum value of the control.
    */
  var max: js.UndefOr[Double] = js.native
  
  /**
    * The minimum value of the control.
    */
  var min: js.UndefOr[Double] = js.native
  
  var numberFormat: js.UndefOr[String] = js.native
  
  var page: js.UndefOr[Double] = js.native
  
  var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.native
  
  var start: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  
  /**
    * The interval of the control.
    */
  var step: js.UndefOr[Double] = js.native
  
  var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.native
  
  /**
    * The default value of the control.
    */
  var value: js.UndefOr[Double] = js.native
}
object UISpinnerOptions {
  
  @scala.inline
  def apply(): UISpinnerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UISpinnerOptions]
  }
  
  @scala.inline
  implicit class UISpinnerOptionsOps[Self <: UISpinnerOptions] (val x: Self) extends AnyVal {
    
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
    def setAddToggle(value: Boolean): Self = this.set("addToggle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddToggle: Self = this.set("addToggle", js.undefined)
    
    @scala.inline
    def setCellText(value: String): Self = this.set("cellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellText: Self = this.set("cellText", js.undefined)
    
    @scala.inline
    def setChange(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("change", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteChange: Self = this.set("change", js.undefined)
    
    @scala.inline
    def setCompareVarargs(value: String*): Self = this.set("compare", js.Array(value :_*))
    
    @scala.inline
    def setCompare(value: String | js.Array[String]): Self = this.set("compare", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompare: Self = this.set("compare", js.undefined)
    
    @scala.inline
    def setCreate(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCreate: Self = this.set("create", js.undefined)
    
    @scala.inline
    def setCulture(value: String): Self = this.set("culture", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCulture: Self = this.set("culture", js.undefined)
    
    @scala.inline
    def setDelayed(value: Boolean): Self = this.set("delayed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelayed: Self = this.set("delayed", js.undefined)
    
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
    @scala.inline
    def setExactMatch(value: Boolean): Self = this.set("exactMatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExactMatch: Self = this.set("exactMatch", js.undefined)
    
    @scala.inline
    def setIcons(value: js.Any): Self = this.set("icons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    
    @scala.inline
    def setIncremental(value: js.Any): Self = this.set("incremental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIncremental: Self = this.set("incremental", js.undefined)
    
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    
    @scala.inline
    def setNumberFormat(value: String): Self = this.set("numberFormat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNumberFormat: Self = this.set("numberFormat", js.undefined)
    
    @scala.inline
    def setPage(value: Double): Self = this.set("page", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePage: Self = this.set("page", js.undefined)
    
    @scala.inline
    def setSpin(value: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit): Self = this.set("spin", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteSpin: Self = this.set("spin", js.undefined)
    
    @scala.inline
    def setStart(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("start", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    
    @scala.inline
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
    
    @scala.inline
    def setStop(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = this.set("stop", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteStop: Self = this.set("stop", js.undefined)
    
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
