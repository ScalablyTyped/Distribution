package typings.tablesorter

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.SpinnerEvent
import typings.jqueryui.JQueryUI.SpinnerUIParam
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uispinneroptionsMod {
  
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SpinnerOptions> */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/IntervalOptions.IntervalOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ControlOptions.ControlOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DefaultValueOptions.DefaultValueOptions<number> */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ToggleableOptions.ToggleableOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ComparableOptions.ComparableOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/StrictOptions.StrictOptions */
  trait UISpinnerOptions extends StObject {
    
    /**
      * A value indicating whether to add a box for enabling/disabling the control.
      */
    var addToggle: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The label of the control.
      */
    var cellText: js.UndefOr[String] = js.undefined
    
    var change: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
    
    /**
      * The compare-operators supported by the control.
      */
    var compare: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var create: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
    
    var culture: js.UndefOr[String] = js.undefined
    
    /**
      * A value indicating whether the value of the filter should be set delayed.
      */
    var delayed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicating whether the control is initially disabled.
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A value indicatin whether only exact matching values should be included.
      */
    var exactMatch: js.UndefOr[Boolean] = js.undefined
    
    var icons: js.UndefOr[js.Any] = js.undefined
    
    var incremental: js.UndefOr[js.Any] = js.undefined
    
    /**
      * The maximum value of the control.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * The minimum value of the control.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    var numberFormat: js.UndefOr[String] = js.undefined
    
    var page: js.UndefOr[Double] = js.undefined
    
    var spin: js.UndefOr[SpinnerEvent[SpinnerUIParam]] = js.undefined
    
    var start: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
    
    /**
      * The interval of the control.
      */
    var step: js.UndefOr[Double] = js.undefined
    
    var stop: js.UndefOr[SpinnerEvent[js.Object]] = js.undefined
    
    /**
      * The default value of the control.
      */
    var value: js.UndefOr[Double] = js.undefined
  }
  object UISpinnerOptions {
    
    @scala.inline
    def apply(): UISpinnerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UISpinnerOptions]
    }
    
    @scala.inline
    implicit class UISpinnerOptionsMutableBuilder[Self <: UISpinnerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddToggle(value: Boolean): Self = StObject.set(x, "addToggle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddToggleUndefined: Self = StObject.set(x, "addToggle", js.undefined)
      
      @scala.inline
      def setCellText(value: String): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellTextUndefined: Self = StObject.set(x, "cellText", js.undefined)
      
      @scala.inline
      def setChange(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setCompare(value: String | js.Array[String]): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      @scala.inline
      def setCompareVarargs(value: String*): Self = StObject.set(x, "compare", js.Array(value :_*))
      
      @scala.inline
      def setCreate(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
      @scala.inline
      def setCulture(value: String): Self = StObject.set(x, "culture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCultureUndefined: Self = StObject.set(x, "culture", js.undefined)
      
      @scala.inline
      def setDelayed(value: Boolean): Self = StObject.set(x, "delayed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayedUndefined: Self = StObject.set(x, "delayed", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setExactMatch(value: Boolean): Self = StObject.set(x, "exactMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExactMatchUndefined: Self = StObject.set(x, "exactMatch", js.undefined)
      
      @scala.inline
      def setIcons(value: js.Any): Self = StObject.set(x, "icons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIconsUndefined: Self = StObject.set(x, "icons", js.undefined)
      
      @scala.inline
      def setIncremental(value: js.Any): Self = StObject.set(x, "incremental", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncrementalUndefined: Self = StObject.set(x, "incremental", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
      
      @scala.inline
      def setPage(value: Double): Self = StObject.set(x, "page", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPageUndefined: Self = StObject.set(x, "page", js.undefined)
      
      @scala.inline
      def setSpin(value: (/* event */ JQueryEventObject, SpinnerUIParam) => Unit): Self = StObject.set(x, "spin", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSpinUndefined: Self = StObject.set(x, "spin", js.undefined)
      
      @scala.inline
      def setStart(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStop(value: (/* event */ JQueryEventObject, js.Object) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
