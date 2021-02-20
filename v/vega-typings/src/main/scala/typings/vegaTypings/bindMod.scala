package typings.vegaTypings

import typings.vegaTypings.vegaTypingsStrings.checkbox
import typings.vegaTypings.vegaTypingsStrings.radio
import typings.vegaTypings.vegaTypingsStrings.range
import typings.vegaTypings.vegaTypingsStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bindMod {
  
  @js.native
  trait BaseBinding extends StObject {
    
    var debounce: js.UndefOr[Double] = js.native
    
    var element: js.UndefOr[Element] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object BaseBinding {
    
    @scala.inline
    def apply(): BaseBinding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseBinding]
    }
    
    @scala.inline
    implicit class BaseBindingMutableBuilder[Self <: BaseBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDebounce(value: Double): Self = StObject.set(x, "debounce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceUndefined: Self = StObject.set(x, "debounce", js.undefined)
      
      @scala.inline
      def setElement(value: Element): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  @js.native
  trait BindCheckbox
    extends BaseBinding
       with Binding {
    
    var input: checkbox = js.native
  }
  object BindCheckbox {
    
    @scala.inline
    def apply(input: checkbox): BindCheckbox = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindCheckbox]
    }
    
    @scala.inline
    implicit class BindCheckboxMutableBuilder[Self <: BindCheckbox] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: checkbox): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BindRadioSelect
    extends BaseBinding
       with Binding {
    
    var input: radio | select = js.native
    
    var labels: js.UndefOr[js.Array[String]] = js.native
    
    var options: js.Array[_] = js.native
  }
  object BindRadioSelect {
    
    @scala.inline
    def apply(input: radio | select, options: js.Array[_]): BindRadioSelect = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindRadioSelect]
    }
    
    @scala.inline
    implicit class BindRadioSelectMutableBuilder[Self <: BindRadioSelect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: radio | select): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabels(value: js.Array[String]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      @scala.inline
      def setLabelsVarargs(value: String*): Self = StObject.set(x, "labels", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: js.Array[_]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsVarargs(value: js.Any*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BindRange
    extends BaseBinding
       with Binding {
    
    var input: range = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var min: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double] = js.native
  }
  object BindRange {
    
    @scala.inline
    def apply(input: range): BindRange = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[BindRange]
    }
    
    @scala.inline
    implicit class BindRangeMutableBuilder[Self <: BindRange] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInput(value: range): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.vegaTypings.bindMod.BindCheckbox
    - typings.vegaTypings.bindMod.BindRadioSelect
    - typings.vegaTypings.bindMod.BindRange
    - typings.vegaTypings.bindMod.InputBinding
  */
  trait Binding extends StObject
  object Binding {
    
    @scala.inline
    def BindCheckbox(input: checkbox): typings.vegaTypings.bindMod.BindCheckbox = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindCheckbox]
    }
    
    @scala.inline
    def BindRadioSelect(input: radio | select, options: js.Array[_]): typings.vegaTypings.bindMod.BindRadioSelect = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindRadioSelect]
    }
    
    @scala.inline
    def BindRange(input: range): typings.vegaTypings.bindMod.BindRange = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.vegaTypings.bindMod.BindRange]
    }
    
    @scala.inline
    def InputBinding(): typings.vegaTypings.bindMod.InputBinding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[typings.vegaTypings.bindMod.InputBinding]
    }
  }
  
  type Element = String
  
  @js.native
  trait InputBinding
    extends BaseBinding
       with Binding {
    
    var autocomplete: js.UndefOr[String] = js.native
    
    var input: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
  }
  object InputBinding {
    
    @scala.inline
    def apply(): InputBinding = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InputBinding]
    }
    
    @scala.inline
    implicit class InputBindingMutableBuilder[Self <: InputBinding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setInput(value: String): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
    }
  }
}
