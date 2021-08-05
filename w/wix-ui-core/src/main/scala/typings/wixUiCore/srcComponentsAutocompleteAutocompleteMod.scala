package typings.wixUiCore

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.wixUiCore.anon.Alt
import typings.wixUiCore.anon.InputValue
import typings.wixUiCore.anon.PartialOption
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import typings.wixUiCore.srcComponentsInputInputMod.InputProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsAutocompleteAutocompleteMod {
  
  @JSImport("wix-ui-core/src/components/autocomplete/Autocomplete", "Autocomplete")
  @js.native
  class Autocomplete protected ()
    extends PureComponent[AutocompleteProps, AutocompleteState, js.Any] {
    def this(props: AutocompleteProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: AutocompleteProps, context: js.Any) = this()
    
    def _createInputProps(): Alt = js.native
    
    def _handleContentMouseDown(e: js.Any): Unit = js.native
    
    def _onInitialSelectedOptionsSet(options: js.Array[Option]): Unit = js.native
    
    def _onInputChange(event: ChangeEvent[HTMLInputElement]): Unit = js.native
    
    def _onSelect(option: Option): Unit = js.native
    
    @JSName("state")
    var state_Autocomplete: InputValue = js.native
  }
  /* static members */
  object Autocomplete {
    
    @JSImport("wix-ui-core/src/components/autocomplete/Autocomplete", "Autocomplete")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createDivider(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")().asInstanceOf[Option]
    inline def createDivider(value: js.Any): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createDivider")(value.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    inline def createOption(): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")().asInstanceOf[Option]
    inline def createOption(option: PartialOption): Option = ^.asInstanceOf[js.Dynamic].applyDynamic("createOption")(option.asInstanceOf[js.Any]).asInstanceOf[Option]
    
    @JSImport("wix-ui-core/src/components/autocomplete/Autocomplete", "Autocomplete.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait AutocompleteProps extends StObject {
    
    /** Standard React Input autoFocus (focus the element on mount) */
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Makes the component disabled */
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    /** Is in error state */
    var error: js.UndefOr[String | Boolean] = js.undefined
    
    /** An element that always appears at the bottom of the options */
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    /** An element that always appears at the top of the options */
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
    /** initial selected option id */
    var initialSelectedId: js.UndefOr[String | Double] = js.undefined
    
    /** DOM id for underlying input */
    var inputId: js.UndefOr[String] = js.undefined
    
    var inputProps: js.UndefOr[InputProps] = js.undefined
    
    /** Standard input onBlur callback */
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    /** Standard input onChange callback */
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    /** Standard input onFocus callback */
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    /** Callback when the user pressed the Enter key or Tab key after he wrote in the Input field - meaning the user selected something not in the list  */
    var onManualInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Handler for when an option is selected */
    var onSelect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** The dropdown options array */
    var options: js.Array[Option]
    
    /** Placeholder to display */
    var placeholder: js.UndefOr[String] = js.undefined
    
    /** Prefix */
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    /** Suffix */
    var suffix: js.UndefOr[ReactNode] = js.undefined
  }
  object AutocompleteProps {
    
    inline def apply(options: js.Array[Option]): AutocompleteProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteProps]
    }
    
    extension [Self <: AutocompleteProps](x: Self) {
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      inline def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setError(value: String | Boolean): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setInitialSelectedId(value: String | Double): Self = StObject.set(x, "initialSelectedId", value.asInstanceOf[js.Any])
      
      inline def setInitialSelectedIdUndefined: Self = StObject.set(x, "initialSelectedId", js.undefined)
      
      inline def setInputId(value: String): Self = StObject.set(x, "inputId", value.asInstanceOf[js.Any])
      
      inline def setInputIdUndefined: Self = StObject.set(x, "inputId", js.undefined)
      
      inline def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      inline def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnManualInput(value: /* value */ String => Unit): Self = StObject.set(x, "onManualInput", js.Any.fromFunction1(value))
      
      inline def setOnManualInputUndefined: Self = StObject.set(x, "onManualInput", js.undefined)
      
      inline def setOnSelect(value: /* option */ Option => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
    }
  }
  
  trait AutocompleteState extends StObject {
    
    var inputValue: String
  }
  object AutocompleteState {
    
    inline def apply(inputValue: String): AutocompleteState = {
      val __obj = js.Dynamic.literal(inputValue = inputValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[AutocompleteState]
    }
    
    extension [Self <: AutocompleteState](x: Self) {
      
      inline def setInputValue(value: String): Self = StObject.set(x, "inputValue", value.asInstanceOf[js.Any])
    }
  }
}
