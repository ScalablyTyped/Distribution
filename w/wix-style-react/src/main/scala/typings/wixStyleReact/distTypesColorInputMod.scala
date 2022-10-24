package typings.wixStyleReact

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
import typings.std.Element
import typings.std.HTMLInputElement
import typings.wixStyleReact.anon.OmitPolyfillPopoverPropss
import typings.wixStyleReact.distTypesInputMod.InputSize
import typings.wixStyleReact.distTypesInputMod.InputStatus
import typings.wixStyleReact.distTypesInputMod.InputValue
import typings.wixStyleReact.distTypesInputMod.MaxValue
import typings.wixStyleReact.distTypesInputMod.MinValue
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typings.wixStyleReact.wixStyleReactStrings.bottomLine
import typings.wixStyleReact.wixStyleReactStrings.clip
import typings.wixStyleReact.wixStyleReactStrings.ellipsis
import typings.wixStyleReact.wixStyleReactStrings.none_
import typings.wixStyleReact.wixStyleReactStrings.parent
import typings.wixStyleReact.wixStyleReactStrings.round
import typings.wixStyleReact.wixStyleReactStrings.scrollParent
import typings.wixStyleReact.wixStyleReactStrings.standard
import typings.wixStyleReact.wixStyleReactStrings.viewport
import typings.wixStyleReact.wixStyleReactStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesColorInputMod {
  
  @JSImport("wix-style-react/dist/types/ColorInput", JSImport.Default)
  @js.native
  open class default ()
    extends Component[ColorInputProps, js.Object, Any]
  
  type ColorInput = Component[ColorInputProps, js.Object, Any]
  
  /* Inlined wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/Input.InputProps, 'onChange'> & {  value :string,   placeholder :string | undefined,   disabled :boolean | undefined,   status :wix-style-react.wix-style-react/dist/types/Input.InputProps['status'] | undefined,   statusMessage :wix-style-react.wix-style-react/dist/types/Input.InputProps['statusMessage'] | undefined,   size :wix-style-react.wix-style-react/dist/types/ColorInput.ColorInputSize | undefined,   popoverPlacement :wix-style-react.wix-style-react/dist/types/Popover.PopoverProps['placement'] | undefined,   popoverAppendTo :'window' | 'scrollParent' | 'viewport' | 'parent' | undefined,   onConfirm :(color : string | object): void | undefined,   onCancel :(color : string | object): void | undefined,   onChange :(color : string | object): void | undefined,   colorPickerChildren :react.react.ReactNode | undefined,   onAddColor :(color : string | object): void | undefined,   addTooltipContent :react.react.ReactNode | undefined,   popoverProps :wix-style-react.wix-style-react/dist/types/common.OmitPolyfill<wix-style-react.wix-style-react/dist/types/Popover.PopoverProps, 'showArrow' | 'fixed' | 'dataHook' | 'shown' | 'placement' | 'appendTo' | 'onClickOutside'> | undefined} */
  trait ColorInputProps extends StObject {
    
    var addTooltipContent: js.UndefOr[ReactNode] = js.undefined
    
    var ariaControls: js.UndefOr[String] = js.undefined
    
    var ariaDescribedby: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var ariaRoledescription: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    var autocomplete: js.UndefOr[String] = js.undefined
    
    var border: js.UndefOr[standard | round | bottomLine | none_] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var colorPickerChildren: js.UndefOr[ReactNode] = js.undefined
    
    var customInput: js.UndefOr[ReactNode | js.Function] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[InputValue] = js.undefined
    
    var disableEditing: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var focusOnClearClick: js.UndefOr[Boolean] = js.undefined
    
    var forceFocus: js.UndefOr[Boolean] = js.undefined
    
    var forceHover: js.UndefOr[Boolean] = js.undefined
    
    var hideStatusSuffix: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement, Unit]] = js.undefined
    
    var inputmode: js.UndefOr[String] = js.undefined
    
    var max: js.UndefOr[MaxValue] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var menuArrow: js.UndefOr[Boolean] = js.undefined
    
    var min: js.UndefOr[MinValue] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var noLeftBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    var noRightBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    var onAddColor: js.UndefOr[js.Function1[/* color */ String | js.Object, Unit]] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onCancel: js.UndefOr[js.Function1[/* color */ String | js.Object, Unit]] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* color */ String | js.Object, Unit]] = js.undefined
    
    var onClear: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onCompositionChange: js.UndefOr[js.Function1[/* isComposing */ Boolean, Unit]] = js.undefined
    
    var onConfirm: js.UndefOr[js.Function1[/* color */ String | js.Object, Unit]] = js.undefined
    
    var onEnterPressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onEscapePressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]], Unit]] = js.undefined
    
    var onInputClicked: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverAppendTo: js.UndefOr[window | scrollParent | viewport | parent] = js.undefined
    
    var popoverPlacement: js.UndefOr[Placement] = js.undefined
    
    var popoverProps: js.UndefOr[OmitPolyfillPopoverPropss] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[InputSize] & js.UndefOr[ColorInputSize]
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var textOverflow: js.UndefOr[clip | ellipsis] = js.undefined
    
    var tooltipPlacement: js.UndefOr[Placement] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: (js.UndefOr[String | Double]) & String
    
    var withSelection: js.UndefOr[Boolean] = js.undefined
  }
  object ColorInputProps {
    
    inline def apply(value: (js.UndefOr[String | Double]) & String): ColorInputProps = {
      val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColorInputProps]
    }
    
    extension [Self <: ColorInputProps](x: Self) {
      
      inline def setAddTooltipContent(value: ReactNode): Self = StObject.set(x, "addTooltipContent", value.asInstanceOf[js.Any])
      
      inline def setAddTooltipContentUndefined: Self = StObject.set(x, "addTooltipContent", js.undefined)
      
      inline def setAriaControls(value: String): Self = StObject.set(x, "ariaControls", value.asInstanceOf[js.Any])
      
      inline def setAriaControlsUndefined: Self = StObject.set(x, "ariaControls", js.undefined)
      
      inline def setAriaDescribedby(value: String): Self = StObject.set(x, "ariaDescribedby", value.asInstanceOf[js.Any])
      
      inline def setAriaDescribedbyUndefined: Self = StObject.set(x, "ariaDescribedby", js.undefined)
      
      inline def setAriaLabel(value: String): Self = StObject.set(x, "ariaLabel", value.asInstanceOf[js.Any])
      
      inline def setAriaLabelUndefined: Self = StObject.set(x, "ariaLabel", js.undefined)
      
      inline def setAriaRoledescription(value: String): Self = StObject.set(x, "ariaRoledescription", value.asInstanceOf[js.Any])
      
      inline def setAriaRoledescriptionUndefined: Self = StObject.set(x, "ariaRoledescription", js.undefined)
      
      inline def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      inline def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      inline def setAutoSelect(value: Boolean): Self = StObject.set(x, "autoSelect", value.asInstanceOf[js.Any])
      
      inline def setAutoSelectUndefined: Self = StObject.set(x, "autoSelect", js.undefined)
      
      inline def setAutocomplete(value: String): Self = StObject.set(x, "autocomplete", value.asInstanceOf[js.Any])
      
      inline def setAutocompleteUndefined: Self = StObject.set(x, "autocomplete", js.undefined)
      
      inline def setBorder(value: standard | round | bottomLine | none_): Self = StObject.set(x, "border", value.asInstanceOf[js.Any])
      
      inline def setBorderUndefined: Self = StObject.set(x, "border", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setClearButton(value: Boolean): Self = StObject.set(x, "clearButton", value.asInstanceOf[js.Any])
      
      inline def setClearButtonUndefined: Self = StObject.set(x, "clearButton", js.undefined)
      
      inline def setColorPickerChildren(value: ReactNode): Self = StObject.set(x, "colorPickerChildren", value.asInstanceOf[js.Any])
      
      inline def setColorPickerChildrenUndefined: Self = StObject.set(x, "colorPickerChildren", js.undefined)
      
      inline def setCustomInput(value: ReactNode | js.Function): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      inline def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDefaultValue(value: InputValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
      
      inline def setDisableEditingUndefined: Self = StObject.set(x, "disableEditing", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setFocusOnClearClick(value: Boolean): Self = StObject.set(x, "focusOnClearClick", value.asInstanceOf[js.Any])
      
      inline def setFocusOnClearClickUndefined: Self = StObject.set(x, "focusOnClearClick", js.undefined)
      
      inline def setForceFocus(value: Boolean): Self = StObject.set(x, "forceFocus", value.asInstanceOf[js.Any])
      
      inline def setForceFocusUndefined: Self = StObject.set(x, "forceFocus", js.undefined)
      
      inline def setForceHover(value: Boolean): Self = StObject.set(x, "forceHover", value.asInstanceOf[js.Any])
      
      inline def setForceHoverUndefined: Self = StObject.set(x, "forceHover", js.undefined)
      
      inline def setHideStatusSuffix(value: Boolean): Self = StObject.set(x, "hideStatusSuffix", value.asInstanceOf[js.Any])
      
      inline def setHideStatusSuffixUndefined: Self = StObject.set(x, "hideStatusSuffix", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInputRef(value: /* input */ HTMLInputElement => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setInputmode(value: String): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      inline def setMax(value: MaxValue): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMenuArrow(value: Boolean): Self = StObject.set(x, "menuArrow", value.asInstanceOf[js.Any])
      
      inline def setMenuArrowUndefined: Self = StObject.set(x, "menuArrow", js.undefined)
      
      inline def setMin(value: MinValue): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNoLeftBorderRadius(value: Boolean): Self = StObject.set(x, "noLeftBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNoLeftBorderRadiusUndefined: Self = StObject.set(x, "noLeftBorderRadius", js.undefined)
      
      inline def setNoRightBorderRadius(value: Boolean): Self = StObject.set(x, "noRightBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNoRightBorderRadiusUndefined: Self = StObject.set(x, "noRightBorderRadius", js.undefined)
      
      inline def setOnAddColor(value: /* color */ String | js.Object => Unit): Self = StObject.set(x, "onAddColor", js.Any.fromFunction1(value))
      
      inline def setOnAddColorUndefined: Self = StObject.set(x, "onAddColor", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnCancel(value: /* color */ String | js.Object => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction1(value))
      
      inline def setOnCancelUndefined: Self = StObject.set(x, "onCancel", js.undefined)
      
      inline def setOnChange(value: /* color */ String | js.Object => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnCompositionChange(value: /* isComposing */ Boolean => Unit): Self = StObject.set(x, "onCompositionChange", js.Any.fromFunction1(value))
      
      inline def setOnCompositionChangeUndefined: Self = StObject.set(x, "onCompositionChange", js.undefined)
      
      inline def setOnConfirm(value: /* color */ String | js.Object => Unit): Self = StObject.set(x, "onConfirm", js.Any.fromFunction1(value))
      
      inline def setOnConfirmUndefined: Self = StObject.set(x, "onConfirm", js.undefined)
      
      inline def setOnEnterPressed(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEnterPressed", js.Any.fromFunction1(value))
      
      inline def setOnEnterPressedUndefined: Self = StObject.set(x, "onEnterPressed", js.undefined)
      
      inline def setOnEscapePressed(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEscapePressed", js.Any.fromFunction1(value))
      
      inline def setOnEscapePressedUndefined: Self = StObject.set(x, "onEscapePressed", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInputClicked(value: MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onInputClicked", js.Any.fromFunction1(value))
      
      inline def setOnInputClickedUndefined: Self = StObject.set(x, "onInputClicked", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverAppendTo(value: window | scrollParent | viewport | parent): Self = StObject.set(x, "popoverAppendTo", value.asInstanceOf[js.Any])
      
      inline def setPopoverAppendToUndefined: Self = StObject.set(x, "popoverAppendTo", js.undefined)
      
      inline def setPopoverPlacement(value: Placement): Self = StObject.set(x, "popoverPlacement", value.asInstanceOf[js.Any])
      
      inline def setPopoverPlacementUndefined: Self = StObject.set(x, "popoverPlacement", js.undefined)
      
      inline def setPopoverProps(value: OmitPolyfillPopoverPropss): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setSize(value: js.UndefOr[InputSize] & js.UndefOr[ColorInputSize]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusMessage(value: ReactNode): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
      
      inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      inline def setSuffix(value: ReactNode): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      inline def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      inline def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      inline def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      inline def setTextOverflow(value: clip | ellipsis): Self = StObject.set(x, "textOverflow", value.asInstanceOf[js.Any])
      
      inline def setTextOverflowUndefined: Self = StObject.set(x, "textOverflow", js.undefined)
      
      inline def setTooltipPlacement(value: Placement): Self = StObject.set(x, "tooltipPlacement", value.asInstanceOf[js.Any])
      
      inline def setTooltipPlacementUndefined: Self = StObject.set(x, "tooltipPlacement", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setValue(value: (js.UndefOr[String | Double]) & String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setWithSelection(value: Boolean): Self = StObject.set(x, "withSelection", value.asInstanceOf[js.Any])
      
      inline def setWithSelectionUndefined: Self = StObject.set(x, "withSelection", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixStyleReact.wixStyleReactStrings.small
    - typings.wixStyleReact.wixStyleReactStrings.medium
    - typings.wixStyleReact.wixStyleReactStrings.large
  */
  trait ColorInputSize extends StObject
  object ColorInputSize {
    
    inline def large: typings.wixStyleReact.wixStyleReactStrings.large = "large".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.large]
    
    inline def medium: typings.wixStyleReact.wixStyleReactStrings.medium = "medium".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.medium]
    
    inline def small: typings.wixStyleReact.wixStyleReactStrings.small = "small".asInstanceOf[typings.wixStyleReact.wixStyleReactStrings.small]
  }
}
