package typings.svelteRangeSliderPips

import typings.std.CustomEvent
import typings.std.HTMLDivElement
import typings.svelte.mod.SvelteComponentTyped
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("svelte-range-slider-pips", JSImport.Namespace)
  @js.native
  open class ^ () extends SvelteComponentTyped[Props, Events, Slots]
  
  type Events = RangeSliderEvents
  
  type Formater = js.Function3[/* v */ Double, /* i */ js.UndefOr[Double], /* p */ js.UndefOr[Double], String]
  
  trait OnChange
    extends StObject
       with OnStop {
    
    var previousValue: Double
  }
  object OnChange {
    
    inline def apply(
      activeHandle: Double,
      previousValue: Double,
      startValue: Double,
      value: Double,
      values: js.Array[Double]
    ): OnChange = {
      val __obj = js.Dynamic.literal(activeHandle = activeHandle.asInstanceOf[js.Any], previousValue = previousValue.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnChange]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnChange] (val x: Self) extends AnyVal {
      
      inline def setPreviousValue(value: Double): Self = StObject.set(x, "previousValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnStart extends StObject {
    
    var activeHandle: Double
    
    var value: Double
    
    var values: js.Array[Double]
  }
  object OnStart {
    
    inline def apply(activeHandle: Double, value: Double, values: js.Array[Double]): OnStart = {
      val __obj = js.Dynamic.literal(activeHandle = activeHandle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnStart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnStart] (val x: Self) extends AnyVal {
      
      inline def setActiveHandle(value: Double): Self = StObject.set(x, "activeHandle", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
    }
  }
  
  trait OnStop
    extends StObject
       with OnStart {
    
    var startValue: Double
  }
  object OnStop {
    
    inline def apply(activeHandle: Double, startValue: Double, value: Double, values: js.Array[Double]): OnStop = {
      val __obj = js.Dynamic.literal(activeHandle = activeHandle.asInstanceOf[js.Any], startValue = startValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnStop]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OnStop] (val x: Self) extends AnyVal {
      
      inline def setStartValue(value: Double): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
    }
  }
  
  type Props = RangeSliderProps
  
  type RangeSlider = SvelteComponentTyped[Props, Events, Slots]
  
  trait RangeSliderEvents extends StObject {
    
    /**
      * Event fired when the user changes the value; returns the previous value, also
      */
    var change: CustomEvent[OnChange]
    
    /**
      * Event fired when the user begins interaction with the slider
      */
    var start: CustomEvent[OnStart]
    
    /**
      * Event fired when the user stops interacting with slider; returns the beginning value, also
      */
    var stop: CustomEvent[OnStop]
  }
  object RangeSliderEvents {
    
    inline def apply(change: CustomEvent[OnChange], start: CustomEvent[OnStart], stop: CustomEvent[OnStop]): RangeSliderEvents = {
      val __obj = js.Dynamic.literal(change = change.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
      __obj.asInstanceOf[RangeSliderEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeSliderEvents] (val x: Self) extends AnyVal {
      
      inline def setChange(value: CustomEvent[OnChange]): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
      
      inline def setStart(value: CustomEvent[OnStart]): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStop(value: CustomEvent[OnStop]): Self = StObject.set(x, "stop", value.asInstanceOf[js.Any])
    }
  }
  
  trait RangeSliderProps extends StObject {
    
    /**
      * Whether to show a pip or label for all values.
      * Same as combining first, last and rest. Use all='label' to show a label value
      */
    var all: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Determine if the slider is disabled, or enabled
      * (only disables interactions, and events)
      */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether to show a pip or label for the first value on slider.
      * Use first='label' to show a label value
      */
    var first: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Set true to add a floating label above focussed handles
      */
    var float: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A function to re-format values before they are displayed (v = value, i = pip index, p = percent)
      */
    var formatter: js.UndefOr[Formater] = js.undefined
    
    /**
      * A function to re-format values on the handle/float before they are displayed. Defaults to the same function given to the formatter property (v = value, i = handle index, p = percent)
      */
    var handleFormatter: js.UndefOr[Formater] = js.undefined
    
    /**
      * Whether hover styles are enabled for both handles and pips/values
      */
    var hoverable: js.UndefOr[Boolean] = js.undefined
    
    // formatting props
    /**
      * Give the slider a unique ID for use in styling
      */
    var id: js.UndefOr[String] = js.undefined
    
    /**
      * Whether to show a pip or label for the last value on slider.
      * Use last='label' to show a label value
      */
    var last: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Maximum value for the slider (should be > min)
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Minimum value for the slider (should be < max)
      */
    var min: js.UndefOr[Double] = js.undefined
    
    // range pips / values props
    /**
      * Whether to show pips/notches on the slider
      */
    var pips: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Every nth step to show a pip for.
      * This has multiple defaults depending on values property
      */
    var pipstep: js.UndefOr[Double] = js.undefined
    
    // stylistic props
    var precision: js.UndefOr[Double] = js.undefined
    
    /**
      * A string to prefix to all displayed values
      */
    var prefix: js.UndefOr[String] = js.undefined
    
    /**
      * If range is true, then this boolean decides if one handle will push the other along
      */
    var pushy: js.UndefOr[Boolean] = js.undefined
    
    // range slider props
    /**
      * Whether to style as a range picker.
      * Use range='min' or range='max' for min/max variants
      */
    var range: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Whether to show a pip or label for all other values.
      * Use rest='label' to show a label value
      */
    var rest: js.UndefOr[Boolean | String] = js.undefined
    
    /**
      * Reverse the orientation of min/max
      */
    var reversed: js.UndefOr[Boolean] = js.undefined
    
    // dom references
    /**
      * DOM reference for binding to the main <div /> of the component (bind:slider='ref')
      */
    var slider: js.UndefOr[HTMLDivElement | Null] = js.undefined
    
    /**
      * Svelte spring physics object to change the behaviour of the handle when moving
      */
    var springValues: js.UndefOr[SpringValues] = js.undefined
    
    /**
      * Every nth value to allow handle to stop at (should be a positive value)
      */
    var step: js.UndefOr[Double] = js.undefined
    
    /**
      * A string to suffix to all displayed values
      */
    var suffix: js.UndefOr[String] = js.undefined
    
    /**
      * Array of values to apply on the slider.
      * Multiple values creates multiple handles.
      * (note: A slider with range property set can only have two values max)
      */
    var values: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * Make the slider render vertically (lower value on bottom)
      */
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object RangeSliderProps {
    
    inline def apply(): RangeSliderProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RangeSliderProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RangeSliderProps] (val x: Self) extends AnyVal {
      
      inline def setAll(value: Boolean | String): Self = StObject.set(x, "all", value.asInstanceOf[js.Any])
      
      inline def setAllUndefined: Self = StObject.set(x, "all", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFirst(value: Boolean | String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      inline def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      inline def setFloat(value: Boolean): Self = StObject.set(x, "float", value.asInstanceOf[js.Any])
      
      inline def setFloatUndefined: Self = StObject.set(x, "float", js.undefined)
      
      inline def setFormatter(value: (/* v */ Double, /* i */ js.UndefOr[Double], /* p */ js.UndefOr[Double]) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction3(value))
      
      inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
      
      inline def setHandleFormatter(value: (/* v */ Double, /* i */ js.UndefOr[Double], /* p */ js.UndefOr[Double]) => String): Self = StObject.set(x, "handleFormatter", js.Any.fromFunction3(value))
      
      inline def setHandleFormatterUndefined: Self = StObject.set(x, "handleFormatter", js.undefined)
      
      inline def setHoverable(value: Boolean): Self = StObject.set(x, "hoverable", value.asInstanceOf[js.Any])
      
      inline def setHoverableUndefined: Self = StObject.set(x, "hoverable", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setLast(value: Boolean | String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
      
      inline def setLastUndefined: Self = StObject.set(x, "last", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setPips(value: Boolean): Self = StObject.set(x, "pips", value.asInstanceOf[js.Any])
      
      inline def setPipsUndefined: Self = StObject.set(x, "pips", js.undefined)
      
      inline def setPipstep(value: Double): Self = StObject.set(x, "pipstep", value.asInstanceOf[js.Any])
      
      inline def setPipstepUndefined: Self = StObject.set(x, "pipstep", js.undefined)
      
      inline def setPrecision(value: Double): Self = StObject.set(x, "precision", value.asInstanceOf[js.Any])
      
      inline def setPrecisionUndefined: Self = StObject.set(x, "precision", js.undefined)
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setPushy(value: Boolean): Self = StObject.set(x, "pushy", value.asInstanceOf[js.Any])
      
      inline def setPushyUndefined: Self = StObject.set(x, "pushy", js.undefined)
      
      inline def setRange(value: Boolean | String): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      inline def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      inline def setRest(value: Boolean | String): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
      
      inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      inline def setSlider(value: HTMLDivElement): Self = StObject.set(x, "slider", value.asInstanceOf[js.Any])
      
      inline def setSliderNull: Self = StObject.set(x, "slider", null)
      
      inline def setSliderUndefined: Self = StObject.set(x, "slider", js.undefined)
      
      inline def setSpringValues(value: SpringValues): Self = StObject.set(x, "springValues", value.asInstanceOf[js.Any])
      
      inline def setSpringValuesUndefined: Self = StObject.set(x, "springValues", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
      
      inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  type RangeSliderSlots = scala.Nothing
  
  type Slots = RangeSliderSlots
  
  trait SpringValues extends StObject {
    
    var damping: Double
    
    var stiffness: Double
  }
  object SpringValues {
    
    inline def apply(damping: Double, stiffness: Double): SpringValues = {
      val __obj = js.Dynamic.literal(damping = damping.asInstanceOf[js.Any], stiffness = stiffness.asInstanceOf[js.Any])
      __obj.asInstanceOf[SpringValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SpringValues] (val x: Self) extends AnyVal {
      
      inline def setDamping(value: Double): Self = StObject.set(x, "damping", value.asInstanceOf[js.Any])
      
      inline def setStiffness(value: Double): Self = StObject.set(x, "stiffness", value.asInstanceOf[js.Any])
    }
  }
}
