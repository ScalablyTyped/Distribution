package typings.tablesorter

import typings.jquery.JQueryEventObject
import typings.jqueryui.JQueryUI.SliderClasses
import typings.jqueryui.JQueryUI.SliderEvent
import typings.jqueryui.JQueryUI.SliderUIParams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uislideroptionsMod {
  
  /* Inlined parent tablesorter.tablesorter/Omit.Omit<tablesorter.tablesorter/Filtering/Formatter/Options/UIOptionsBase.UIOptionsBase<jqueryui.JQueryUI.SliderOptions>, 'values'> */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/RangeOptions.RangeOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ControlOptions.ControlOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DefaultValueOptions.DefaultValueOptions<number> */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/ComparableOptions.ComparableOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/PreviewableOptions.PreviewableOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/DelayableOptions.DelayableOptions */
  /* Inlined parent tablesorter.tablesorter/Filtering/Formatter/Options/StrictOptions.StrictOptions */
  @js.native
  trait UISliderOptions extends StObject {
    
    /**
      * The text indicating the whole range.
      */
    var allText: js.UndefOr[String] = js.native
    
    var animate: js.UndefOr[js.Any] = js.native
    
    /**
      * The label of the control.
      */
    var cellText: js.UndefOr[String] = js.native
    
    var change: js.UndefOr[SliderEvent] = js.native
    
    var classes: js.UndefOr[SliderClasses] = js.native
    
    /**
      * The compare-operators supported by the control.
      */
    var compare: js.UndefOr[String | js.Array[String]] = js.native
    
    var create: js.UndefOr[SliderEvent] = js.native
    
    /**
      * A value indicating whether the value of the filter should be set delayed.
      */
    var delayed: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    /**
      * A value indicatin whether only exact matching values should be included.
      */
    var exactMatch: js.UndefOr[Boolean] = js.native
    
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
    
    /**
      * The interval of the control.
      */
    var step: js.UndefOr[Double] = js.native
    
    var stop: js.UndefOr[SliderEvent] = js.native
    
    /**
      * The default value of the control.
      */
    var value: js.UndefOr[Double] = js.native
    
    /**
      * A value indicating whether the value should be visible in the table header.
      */
    var valueToHeader: js.UndefOr[Boolean] = js.native
  }
  object UISliderOptions {
    
    @scala.inline
    def apply(): UISliderOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UISliderOptions]
    }
    
    @scala.inline
    implicit class UISliderOptionsMutableBuilder[Self <: UISliderOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllText(value: String): Self = StObject.set(x, "allText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllTextUndefined: Self = StObject.set(x, "allText", js.undefined)
      
      @scala.inline
      def setAnimate(value: js.Any): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setCellText(value: String): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellTextUndefined: Self = StObject.set(x, "cellText", js.undefined)
      
      @scala.inline
      def setChange(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "change", js.Any.fromFunction2(value))
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setClasses(value: SliderClasses): Self = StObject.set(x, "classes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassesUndefined: Self = StObject.set(x, "classes", js.undefined)
      
      @scala.inline
      def setCompare(value: String | js.Array[String]): Self = StObject.set(x, "compare", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompareUndefined: Self = StObject.set(x, "compare", js.undefined)
      
      @scala.inline
      def setCompareVarargs(value: String*): Self = StObject.set(x, "compare", js.Array(value :_*))
      
      @scala.inline
      def setCreate(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCreateUndefined: Self = StObject.set(x, "create", js.undefined)
      
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
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOrientation(value: String): Self = StObject.set(x, "orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrientationUndefined: Self = StObject.set(x, "orientation", js.undefined)
      
      @scala.inline
      def setRange(value: js.Any): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setSlide(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "slide", js.Any.fromFunction2(value))
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setStart(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "start", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStop(value: (/* event */ JQueryEventObject, /* ui */ SliderUIParams) => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction2(value))
      
      @scala.inline
      def setStopUndefined: Self = StObject.set(x, "stop", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueToHeader(value: Boolean): Self = StObject.set(x, "valueToHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueToHeaderUndefined: Self = StObject.set(x, "valueToHeader", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
