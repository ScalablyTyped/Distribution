package typings.wixStyleReact

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.Component
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLInputElement
import typings.wixStyleReact.clientsMod.GoogleMapsClient
import typings.wixStyleReact.inputMod.InputSize
import typings.wixStyleReact.inputMod.InputStatus
import typings.wixStyleReact.wixStyleReactStrings.geocode
import typings.wixStyleReact.wixStyleReactStrings.places
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object googleAddressInputMod {
  
  @JSImport("wix-style-react/dist/es/src/GoogleAddressInput", JSImport.Default)
  @js.native
  class default () extends GoogleAddressInput
  
  @js.native
  trait GoogleAddressInput
    extends Component[GoogleAddressInputProps, js.Object, js.Any] {
    
    def focus(): Unit = js.native
    
    def select(): Unit = js.native
  }
  
  /* Inlined parent wix-style-react.wix-style-react/dist/es/src/common.OmitPolyfill<wix-style-react.wix-style-react/dist/es/src/Input.InputProps, 'onChange' | 'onBlur' | 'onFocus' | 'onKeyDown' | 'onKeyUp' | 'onPaste'> */
  trait GoogleAddressInputProps extends StObject {
    
    var Client: js.UndefOr[GoogleMapsClient] = js.undefined
    
    var ariaControls: js.UndefOr[String] = js.undefined
    
    var ariaDescribedby: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    var autocomplete: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var clearSuggestionsOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var customInput: js.UndefOr[ReactNode | js.Function] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var disableEditing: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var fallbackToManual: js.UndefOr[Boolean] = js.undefined
    
    var filterTypes: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var footer: js.UndefOr[String] = js.undefined
    
    var footerOptions: js.UndefOr[js.Object] = js.undefined
    
    var forceFocus: js.UndefOr[Boolean] = js.undefined
    
    var forceHover: js.UndefOr[Boolean] = js.undefined
    
    var handler: js.UndefOr[geocode | places] = js.undefined
    
    var hideStatusSuffix: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement, Unit]] = js.undefined
    
    var magnifyingGlass: js.UndefOr[Boolean] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var menuArrow: js.UndefOr[Boolean] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noLeftBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    var noRightBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClear: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionChange: js.UndefOr[js.Function1[/* isComposing */ Boolean, Unit]] = js.undefined
    
    var onEnterPressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onEscapePressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onInputClicked: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onSet: js.UndefOr[js.Function] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeDetailsFields: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var poweredByGoogle: js.UndefOr[Boolean] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var roundInput: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[InputSize] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var textOverflow: js.UndefOr[String] = js.undefined
    
    var tooltipPlacement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var types: js.UndefOr[js.Array[js.Any]] = js.undefined
    
    var value: js.UndefOr[String] = js.undefined
    
    var valuePrefix: js.UndefOr[String] = js.undefined
    
    var withSelection: js.UndefOr[Boolean] = js.undefined
  }
  object GoogleAddressInputProps {
    
    @scala.inline
    def apply(): GoogleAddressInputProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GoogleAddressInputProps]
    }
    
    @scala.inline
    implicit class GoogleAddressInputPropsMutableBuilder[Self <: GoogleAddressInputProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
      
      @scala.inline
      def setAriaDescribedby(value: String): Self = StObject.set(x, "ariaDescribedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaDescribedbyUndefined: Self = StObject.set(x, "ariaDescribedby", js.undefined)
      
      @scala.inline
      def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      @scala.inline
      def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      @scala.inline
      def setClearSuggestionsOnBlur(value: Boolean): Self = StObject.set(x, "clearSuggestionsOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearSuggestionsOnBlurUndefined: Self = StObject.set(x, "clearSuggestionsOnBlur", js.undefined)
      
      @scala.inline
      def setClient(value: GoogleMapsClient): Self = StObject.set(x, "Client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClientUndefined: Self = StObject.set(x, "Client", js.undefined)
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      @scala.inline
      def setCustomInput(value: ReactNode | js.Function): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEditingUndefined: Self = StObject.set(x, "disableEditing", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setFallbackToManual(value: Boolean): Self = StObject.set(x, "fallbackToManual", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackToManualUndefined: Self = StObject.set(x, "fallbackToManual", js.undefined)
      
      @scala.inline
      def setFilterTypes(value: js.Array[js.Any]): Self = StObject.set(x, "filterTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFilterTypesUndefined: Self = StObject.set(x, "filterTypes", js.undefined)
      
      @scala.inline
      def setFilterTypesVarargs(value: js.Any*): Self = StObject.set(x, "filterTypes", js.Array(value :_*))
      
      @scala.inline
      def setFooter(value: String): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterOptions(value: js.Object): Self = StObject.set(x, "footerOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFooterOptionsUndefined: Self = StObject.set(x, "footerOptions", js.undefined)
      
      @scala.inline
      def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      @scala.inline
      def setForceFocus(value: Boolean): Self = StObject.set(x, "forceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFocusUndefined: Self = StObject.set(x, "forceFocus", js.undefined)
      
      @scala.inline
      def setForceHover(value: Boolean): Self = StObject.set(x, "forceHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHoverUndefined: Self = StObject.set(x, "forceHover", js.undefined)
      
      @scala.inline
      def setHandler(value: geocode | places): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      @scala.inline
      def setHideStatusSuffix(value: Boolean): Self = StObject.set(x, "hideStatusSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideStatusSuffixUndefined: Self = StObject.set(x, "hideStatusSuffix", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* input */ HTMLInputElement => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setMagnifyingGlass(value: Boolean): Self = StObject.set(x, "magnifyingGlass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMagnifyingGlassUndefined: Self = StObject.set(x, "magnifyingGlass", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMenuArrow(value: Boolean): Self = StObject.set(x, "menuArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuArrowUndefined: Self = StObject.set(x, "menuArrow", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoLeftBorderRadius(value: Boolean): Self = StObject.set(x, "noLeftBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoLeftBorderRadiusUndefined: Self = StObject.set(x, "noLeftBorderRadius", js.undefined)
      
      @scala.inline
      def setNoRightBorderRadius(value: Boolean): Self = StObject.set(x, "noRightBorderRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoRightBorderRadiusUndefined: Self = StObject.set(x, "noRightBorderRadius", js.undefined)
      
      @scala.inline
      def setOnBlur(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClear(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnCompositionChange(value: /* isComposing */ Boolean => Unit): Self = StObject.set(x, "onCompositionChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionChangeUndefined: Self = StObject.set(x, "onCompositionChange", js.undefined)
      
      @scala.inline
      def setOnEnterPressed(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEnterPressed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEnterPressedUndefined: Self = StObject.set(x, "onEnterPressed", js.undefined)
      
      @scala.inline
      def setOnEscapePressed(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEscapePressed", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEscapePressedUndefined: Self = StObject.set(x, "onEscapePressed", js.undefined)
      
      @scala.inline
      def setOnFocus(value: FocusEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInputClicked(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onInputClicked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputClickedUndefined: Self = StObject.set(x, "onInputClicked", js.undefined)
      
      @scala.inline
      def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnSet(value: js.Function): Self = StObject.set(x, "onSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnSetUndefined: Self = StObject.set(x, "onSet", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceDetailsFields(value: js.Array[js.Any]): Self = StObject.set(x, "placeDetailsFields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceDetailsFieldsUndefined: Self = StObject.set(x, "placeDetailsFields", js.undefined)
      
      @scala.inline
      def setPlaceDetailsFieldsVarargs(value: js.Any*): Self = StObject.set(x, "placeDetailsFields", js.Array(value :_*))
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPoweredByGoogle(value: Boolean): Self = StObject.set(x, "poweredByGoogle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPoweredByGoogleUndefined: Self = StObject.set(x, "poweredByGoogle", js.undefined)
      
      @scala.inline
      def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setRoundInput(value: Boolean): Self = StObject.set(x, "roundInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundInputUndefined: Self = StObject.set(x, "roundInput", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSize(value: InputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTextOverflow(value: String): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      @scala.inline
      def setTooltipPlacement(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypes(value: js.Array[js.Any]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesUndefined: Self = StObject.set(x, "types", js.undefined)
      
      @scala.inline
      def setTypesVarargs(value: js.Any*): Self = StObject.set(x, "types", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePrefix(value: String): Self = StObject.set(x, "valuePrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuePrefixUndefined: Self = StObject.set(x, "valuePrefix", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setWithSelection(value: Boolean): Self = StObject.set(x, "withSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithSelectionUndefined: Self = StObject.set(x, "withSelection", js.undefined)
    }
  }
}
