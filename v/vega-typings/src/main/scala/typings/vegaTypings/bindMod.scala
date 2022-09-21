package typings.vegaTypings

import typings.std.EventTarget
import typings.vegaTypings.vegaTypingsStrings.checkbox
import typings.vegaTypings.vegaTypingsStrings.radio
import typings.vegaTypings.vegaTypingsStrings.range
import typings.vegaTypings.vegaTypingsStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod {
  
  trait BindBase extends StObject {
    
    /**
      * If defined, delays event handling until the specified milliseconds have
      * elapsed since the last event was fired.
      */
    var debounce: js.UndefOr[Double] = js.undefined
    
    /**
      * An optional CSS selector string indicating the parent element to which
      * the input element should be added. By default, all input elements are
      * added within the parent container of the Vega view.
      */
    var element: js.UndefOr[Element] = js.undefined
    
    /**
      * By default, the signal name is used to label input elements.
      * This `name` property can be used instead to specify a custom
      * label for the bound signal.
      */
    var name: js.UndefOr[String] = js.undefined
  }
  object BindBase {
    
    inline def apply(): BindBase = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindBase]
    }
    
    extension [Self <: BindBase](x: Self) {
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait BindCheckbox
    extends StObject
       with BindBase
       with Binding {
    
    var input: checkbox
  }
  object BindCheckbox {
    
    inline def apply(): BindCheckbox = {
      val __obj = js.Dynamic.literal(input = "checkbox")
      __obj.asInstanceOf[BindCheckbox]
    }
    
    extension [Self <: BindCheckbox](x: Self) {
      
      inline def setInput(value: checkbox): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  trait BindDirect
    extends StObject
       with Binding {
    
    /**
      * If defined, delays event handling until the specified milliseconds have
      * elapsed since the last event was fired.
      */
    var debounce: js.UndefOr[Double] = js.undefined
    
    /**
      * An input element that exposes a _value_ property and supports the
      * [EventTarget](https://developer.mozilla.org/en-US/docs/Web/API/EventTarget)
      * interface, or a CSS selector string to such an element. When the element
      * updates and dispatches an event, the _value_ property will be used as the
      * new, bound signal value. When the signal updates independent of the
      * element, the _value_ property will be set to the signal value and a new
      * event will be dispatched on the element.
      */
    var element: Element | EventTarget
    
    /**
      * The event (default `"input"`) to listen for to track changes on the
      * external element.
      */
    var event: js.UndefOr[String] = js.undefined
  }
  object BindDirect {
    
    inline def apply(element: Element | EventTarget): BindDirect = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindDirect]
    }
    
    extension [Self <: BindDirect](x: Self) {
      
      inline def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      inline def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      inline def setElement(value: Element | EventTarget): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
    }
  }
  
  trait BindInput
    extends StObject
       with BindBase
       with Binding {
    
    /**
      * A hint for form autofill.
      * See the [HTML autocomplete attribute](https://developer.mozilla.org/en-US/docs/Web/HTML/Attributes/autocomplete) for additional information.
      */
    var autocomplete: js.UndefOr[String] = js.undefined
    
    /**
      * The type of input element to use.
      * The valid values are `"checkbox"`, `"radio"`, `"range"`, `"select"`,
      * and any other legal [HTML form input type](https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input).
      */
    var input: js.UndefOr[String] = js.undefined
    
    /**
      * Text that appears in the form control when it has no value set.
      */
    var placeholder: js.UndefOr[String] = js.undefined
  }
  object BindInput {
    
    inline def apply(): BindInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BindInput]
    }
    
    extension [Self <: BindInput](x: Self) {
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
  
  trait BindRadioSelect
    extends StObject
       with BindBase
       with Binding {
    
    var input: radio | select
    
    /**
      * An array of label strings to represent the `options` values. If
      * unspecified, the `options` value will be coerced to a string and
      * used as the label.
      */
    var labels: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * An array of options to select from.
      */
    var options: js.Array[Any]
  }
  object BindRadioSelect {
    
    inline def apply(input: radio | select, options: js.Array[Any]): BindRadioSelect = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindRadioSelect]
    }
    
    extension [Self <: BindRadioSelect](x: Self) {
      
      inline def setInput(value: radio | select): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setOptions(value: js.Array[Any]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Any*): Self = StObject.set(x, "options", js.Array(value*))
    }
  }
  
  trait BindRange
    extends StObject
       with BindBase
       with Binding {
    
    var input: range
    
    /**
      * Sets the maximum slider value. Defaults to the larger of the signal value and `100`.
      */
    var max: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the minimum slider value. Defaults to the smaller of the signal value and `0`.
      */
    var min: js.UndefOr[Double] = js.undefined
    
    /**
      * Sets the minimum slider increment. If undefined, the step size will be
      * automatically determined based on the `min` and `max` values.
      */
    var step: js.UndefOr[Double] = js.undefined
  }
  object BindRange {
    
    inline def apply(): BindRange = {
      val __obj = js.Dynamic.literal(input = "range")
      __obj.asInstanceOf[BindRange]
    }
    
    extension [Self <: BindRange](x: Self) {
      
      inline def setInput(value: range): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.bindMod.BindCheckbox
    - typings.vegaTypings.bindMod.BindRadioSelect
    - typings.vegaTypings.bindMod.BindRange
    - typings.vegaTypings.bindMod.BindInput
    - typings.vegaTypings.bindMod.BindDirect
  */
  trait Binding extends StObject
  object Binding {
    
    inline def BindCheckbox(): typings.vegaTypings.bindMod.BindCheckbox = {
      val __obj = js.Dynamic.literal(input = "checkbox")
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindCheckbox]
    }
    
    inline def BindDirect(element: Element | EventTarget): typings.vegaTypings.bindMod.BindDirect = {
      val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindDirect]
    }
    
    inline def BindInput(): typings.vegaTypings.bindMod.BindInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindInput]
    }
    
    inline def BindRadioSelect(input: radio | select, options: js.Array[Any]): typings.vegaTypings.bindMod.BindRadioSelect = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindRadioSelect]
    }
    
    inline def BindRange(): typings.vegaTypings.bindMod.BindRange = {
      val __obj = js.Dynamic.literal(input = "range")
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindRange]
    }
  }
  
  type Element = String
}
