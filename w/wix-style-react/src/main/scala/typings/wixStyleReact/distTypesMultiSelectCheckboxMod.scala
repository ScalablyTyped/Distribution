package typings.wixStyleReact

import typings.react.mod.ChangeEvent
import typings.react.mod.ChangeEventHandler
import typings.react.mod.ClipboardEvent
import typings.react.mod.ClipboardEventHandler
import typings.react.mod.FocusEvent
import typings.react.mod.FocusEventHandler
import typings.react.mod.KeyboardEvent
import typings.react.mod.KeyboardEventHandler
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactElement
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.wixStyleReact.distTypesCommonMod.PopoverCommonProps
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutItemHeight
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutOption
import typings.wixStyleReact.distTypesDropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.distTypesDropdownLayoutMod.ListType
import typings.wixStyleReact.distTypesDropdownLayoutMod.Overflow
import typings.wixStyleReact.distTypesDropdownLayoutMod.RenderOptionFn
import typings.wixStyleReact.distTypesInputMod.InputSize
import typings.wixStyleReact.distTypesInputMod.InputStatus
import typings.wixStyleReact.distTypesInputMod.InputValue
import typings.wixStyleReact.distTypesInputMod.MaxValue
import typings.wixStyleReact.distTypesInputMod.MinValue
import typings.wixStyleReact.distTypesInputWithOptionsMod.ManualInputFnSignature
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.Placement
import typings.wixStyleReact.wixStyleReactStrings.bottomLine
import typings.wixStyleReact.wixStyleReactStrings.clip
import typings.wixStyleReact.wixStyleReactStrings.ellipsis
import typings.wixStyleReact.wixStyleReactStrings.none_
import typings.wixStyleReact.wixStyleReactStrings.round
import typings.wixStyleReact.wixStyleReactStrings.standard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMultiSelectCheckboxMod {
  
  @JSImport("wix-style-react/dist/types/MultiSelectCheckbox", JSImport.Default)
  @js.native
  open class default ()
    extends typings.wixStyleReact.distTypesInputWithOptionsMod.default[ManualInputFnSignature, MultiSelectOnSelectFnSignature, MultiSelectCheckboxProps]
  
  type MultiSelectCheckbox = typings.wixStyleReact.distTypesInputWithOptionsMod.default[ManualInputFnSignature, MultiSelectOnSelectFnSignature, MultiSelectCheckboxProps]
  
  /* Inlined parent wix-style-react.wix-style-react/dist/types/InputWithOptions.InputWithOptionsProps<wix-style-react.wix-style-react/dist/types/InputWithOptions.ManualInputFnSignature, wix-style-react.wix-style-react/dist/types/MultiSelectCheckbox.MultiSelectOnSelectFnSignature> */
  trait MultiSelectCheckboxProps extends StObject {
    
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
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var customInput: js.UndefOr[ReactNode | js.Function] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[InputValue] = js.undefined
    
    var delimiter: js.UndefOr[String] = js.undefined
    
    var disableEditing: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropDirectionUp: js.UndefOr[Boolean] = js.undefined
    
    var dropdownOffsetLeft: js.UndefOr[String] = js.undefined
    
    var dropdownWidth: js.UndefOr[String] = js.undefined
    
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
    var focusOnClearClick: js.UndefOr[Boolean] = js.undefined
    
    var focusOnOption: js.UndefOr[String | Double] = js.undefined
    
    var focusOnSelectedOption: js.UndefOr[Boolean] = js.undefined
    
    var forceFocus: js.UndefOr[Boolean] = js.undefined
    
    var forceHover: js.UndefOr[Boolean] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var hideStatusSuffix: js.UndefOr[Boolean] = js.undefined
    
    var highlight: js.UndefOr[Boolean] = js.undefined
    
    var id: js.UndefOr[String] = js.undefined
    
    var inContainer: js.UndefOr[Boolean] = js.undefined
    
    var infiniteScroll: js.UndefOr[Boolean] = js.undefined
    
    var inputElement: js.UndefOr[ReactElement] = js.undefined
    
    var inputRef: js.UndefOr[js.Function1[/* input */ HTMLInputElement, Unit]] = js.undefined
    
    var inputmode: js.UndefOr[String] = js.undefined
    
    var itemHeight: js.UndefOr[DropdownLayoutItemHeight] = js.undefined
    
    var listType: js.UndefOr[ListType] = js.undefined
    
    var loadMore: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    var markedOption: js.UndefOr[Boolean | String | Double] = js.undefined
    
    var max: js.UndefOr[MaxValue] = js.undefined
    
    var maxHeightPixels: js.UndefOr[String | Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var menuArrow: js.UndefOr[Boolean] = js.undefined
    
    var min: js.UndefOr[MinValue] = js.undefined
    
    var minWidthPixels: js.UndefOr[String | Double] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var native: js.UndefOr[Boolean] = js.undefined
    
    var noLeftBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    var noRightBorderRadius: js.UndefOr[Boolean] = js.undefined
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLInputElement]] = js.undefined
    
    var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
    
    var onClear: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onClickOutside: js.UndefOr[js.Function1[/* e */ TouchEvent | MouseEvent, Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onCompositionChange: js.UndefOr[js.Function1[/* isComposing */ Boolean, Unit]] = js.undefined
    
    var onDeselect: js.UndefOr[
        js.Function2[/* id */ String | Double, /* option */ DropdownLayoutValueOption, Unit]
      ] = js.undefined
    
    var onEnterPressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onEscapePressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]], Unit]] = js.undefined
    
    var onInputClicked: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onManuallyInput: js.UndefOr[ManualInputFnSignature] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onOptionMarked: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption | Null, Unit]] = js.undefined
    
    var onOptionsHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOptionsShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onSelect: js.UndefOr[MultiSelectOnSelectFnSignature] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var overflow: js.UndefOr[Overflow] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var scrollToOption: js.UndefOr[String | Double] = js.undefined
    
    var selectedHighlight: js.UndefOr[Boolean] = js.undefined
    
    var selectedId: js.UndefOr[String | Double] = js.undefined
    
    var selectedOptions: js.UndefOr[js.Array[js.UndefOr[String | Double]]] = js.undefined
    
    var showOptionsIfEmptyInput: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[InputSize] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var textOverflow: js.UndefOr[clip | ellipsis] = js.undefined
    
    var tooltipPlacement: js.UndefOr[Placement] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
    
    var valueParser: js.UndefOr[
        js.Function1[/* option */ DropdownLayoutValueOption, ReactNode | String | RenderOptionFn]
      ] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var withArrow: js.UndefOr[Boolean] = js.undefined
    
    var withSelection: js.UndefOr[Boolean] = js.undefined
  }
  object MultiSelectCheckboxProps {
    
    inline def apply(): MultiSelectCheckboxProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSelectCheckboxProps]
    }
    
    extension [Self <: MultiSelectCheckboxProps](x: Self) {
      
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
      
      inline def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      inline def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      inline def setCustomInput(value: ReactNode | js.Function): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      inline def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setDefaultValue(value: InputValue): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      inline def setDelimiter(value: String): Self = StObject.set(x, "delimiter", value.asInstanceOf[js.Any])
      
      inline def setDelimiterUndefined: Self = StObject.set(x, "delimiter", js.undefined)
      
      inline def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
      
      inline def setDisableEditingUndefined: Self = StObject.set(x, "disableEditing", js.undefined)
      
      inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      inline def setDropDirectionUp(value: Boolean): Self = StObject.set(x, "dropDirectionUp", value.asInstanceOf[js.Any])
      
      inline def setDropDirectionUpUndefined: Self = StObject.set(x, "dropDirectionUp", js.undefined)
      
      inline def setDropdownOffsetLeft(value: String): Self = StObject.set(x, "dropdownOffsetLeft", value.asInstanceOf[js.Any])
      
      inline def setDropdownOffsetLeftUndefined: Self = StObject.set(x, "dropdownOffsetLeft", js.undefined)
      
      inline def setDropdownWidth(value: String): Self = StObject.set(x, "dropdownWidth", value.asInstanceOf[js.Any])
      
      inline def setDropdownWidthUndefined: Self = StObject.set(x, "dropdownWidth", js.undefined)
      
      inline def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      inline def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      inline def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      inline def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      inline def setFocusOnClearClick(value: Boolean): Self = StObject.set(x, "focusOnClearClick", value.asInstanceOf[js.Any])
      
      inline def setFocusOnClearClickUndefined: Self = StObject.set(x, "focusOnClearClick", js.undefined)
      
      inline def setFocusOnOption(value: String | Double): Self = StObject.set(x, "focusOnOption", value.asInstanceOf[js.Any])
      
      inline def setFocusOnOptionUndefined: Self = StObject.set(x, "focusOnOption", js.undefined)
      
      inline def setFocusOnSelectedOption(value: Boolean): Self = StObject.set(x, "focusOnSelectedOption", value.asInstanceOf[js.Any])
      
      inline def setFocusOnSelectedOptionUndefined: Self = StObject.set(x, "focusOnSelectedOption", js.undefined)
      
      inline def setForceFocus(value: Boolean): Self = StObject.set(x, "forceFocus", value.asInstanceOf[js.Any])
      
      inline def setForceFocusUndefined: Self = StObject.set(x, "forceFocus", js.undefined)
      
      inline def setForceHover(value: Boolean): Self = StObject.set(x, "forceHover", value.asInstanceOf[js.Any])
      
      inline def setForceHoverUndefined: Self = StObject.set(x, "forceHover", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setHideStatusSuffix(value: Boolean): Self = StObject.set(x, "hideStatusSuffix", value.asInstanceOf[js.Any])
      
      inline def setHideStatusSuffixUndefined: Self = StObject.set(x, "hideStatusSuffix", js.undefined)
      
      inline def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInContainer(value: Boolean): Self = StObject.set(x, "inContainer", value.asInstanceOf[js.Any])
      
      inline def setInContainerUndefined: Self = StObject.set(x, "inContainer", js.undefined)
      
      inline def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      inline def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      inline def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      inline def setInputElementUndefined: Self = StObject.set(x, "inputElement", js.undefined)
      
      inline def setInputRef(value: /* input */ HTMLInputElement => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      inline def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      inline def setInputmode(value: String): Self = StObject.set(x, "inputmode", value.asInstanceOf[js.Any])
      
      inline def setInputmodeUndefined: Self = StObject.set(x, "inputmode", js.undefined)
      
      inline def setItemHeight(value: DropdownLayoutItemHeight): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      inline def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      inline def setListType(value: ListType): Self = StObject.set(x, "listType", value.asInstanceOf[js.Any])
      
      inline def setListTypeUndefined: Self = StObject.set(x, "listType", js.undefined)
      
      inline def setLoadMore(value: /* page */ Double => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction1(value))
      
      inline def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      inline def setMarkedOption(value: Boolean | String | Double): Self = StObject.set(x, "markedOption", value.asInstanceOf[js.Any])
      
      inline def setMarkedOptionUndefined: Self = StObject.set(x, "markedOption", js.undefined)
      
      inline def setMax(value: MaxValue): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightPixels(value: String | Double): Self = StObject.set(x, "maxHeightPixels", value.asInstanceOf[js.Any])
      
      inline def setMaxHeightPixelsUndefined: Self = StObject.set(x, "maxHeightPixels", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setMenuArrow(value: Boolean): Self = StObject.set(x, "menuArrow", value.asInstanceOf[js.Any])
      
      inline def setMenuArrowUndefined: Self = StObject.set(x, "menuArrow", js.undefined)
      
      inline def setMin(value: MinValue): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      inline def setMinWidthPixels(value: String | Double): Self = StObject.set(x, "minWidthPixels", value.asInstanceOf[js.Any])
      
      inline def setMinWidthPixelsUndefined: Self = StObject.set(x, "minWidthPixels", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      inline def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
      inline def setNoLeftBorderRadius(value: Boolean): Self = StObject.set(x, "noLeftBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNoLeftBorderRadiusUndefined: Self = StObject.set(x, "noLeftBorderRadius", js.undefined)
      
      inline def setNoRightBorderRadius(value: Boolean): Self = StObject.set(x, "noRightBorderRadius", value.asInstanceOf[js.Any])
      
      inline def setNoRightBorderRadiusUndefined: Self = StObject.set(x, "noRightBorderRadius", js.undefined)
      
      inline def setOnBlur(value: FocusEvent[HTMLInputElement, Element] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      inline def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      inline def setOnChange(value: ChangeEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      inline def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      inline def setOnClear(value: typings.react.mod.MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      inline def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      inline def setOnClickOutside(value: /* e */ TouchEvent | MouseEvent => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      inline def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnCompositionChange(value: /* isComposing */ Boolean => Unit): Self = StObject.set(x, "onCompositionChange", js.Any.fromFunction1(value))
      
      inline def setOnCompositionChangeUndefined: Self = StObject.set(x, "onCompositionChange", js.undefined)
      
      inline def setOnDeselect(value: (/* id */ String | Double, /* option */ DropdownLayoutValueOption) => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction2(value))
      
      inline def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      inline def setOnEnterPressed(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEnterPressed", js.Any.fromFunction1(value))
      
      inline def setOnEnterPressedUndefined: Self = StObject.set(x, "onEnterPressed", js.undefined)
      
      inline def setOnEscapePressed(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onEscapePressed", js.Any.fromFunction1(value))
      
      inline def setOnEscapePressedUndefined: Self = StObject.set(x, "onEscapePressed", js.undefined)
      
      inline def setOnFocus(value: /* e */ js.UndefOr[FocusEvent[HTMLInputElement, Element]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      inline def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      inline def setOnInputClicked(value: typings.react.mod.MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onInputClicked", js.Any.fromFunction1(value))
      
      inline def setOnInputClickedUndefined: Self = StObject.set(x, "onInputClicked", js.undefined)
      
      inline def setOnKeyDown(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyDown", js.Any.fromFunction1(value))
      
      inline def setOnKeyDownUndefined: Self = StObject.set(x, "onKeyDown", js.undefined)
      
      inline def setOnKeyUp(value: KeyboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      inline def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      inline def setOnManuallyInput(value: (/* inputValue */ String, /* suggestedOption */ DropdownLayoutValueOption) => Unit): Self = StObject.set(x, "onManuallyInput", js.Any.fromFunction2(value))
      
      inline def setOnManuallyInputUndefined: Self = StObject.set(x, "onManuallyInput", js.undefined)
      
      inline def setOnMouseEnter(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setOnOptionMarked(value: /* option */ DropdownLayoutValueOption | Null => Unit): Self = StObject.set(x, "onOptionMarked", js.Any.fromFunction1(value))
      
      inline def setOnOptionMarkedUndefined: Self = StObject.set(x, "onOptionMarked", js.undefined)
      
      inline def setOnOptionsHide(value: () => Unit): Self = StObject.set(x, "onOptionsHide", js.Any.fromFunction0(value))
      
      inline def setOnOptionsHideUndefined: Self = StObject.set(x, "onOptionsHide", js.undefined)
      
      inline def setOnOptionsShow(value: () => Unit): Self = StObject.set(x, "onOptionsShow", js.Any.fromFunction0(value))
      
      inline def setOnOptionsShowUndefined: Self = StObject.set(x, "onOptionsShow", js.undefined)
      
      inline def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      inline def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      inline def setOnSelect(value: (/* id */ String | Double, /* option */ DropdownLayoutValueOption) => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction2(value))
      
      inline def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      inline def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      inline def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setOverflow(value: Overflow): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      inline def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      inline def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      inline def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      inline def setPrefix(value: ReactNode): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      inline def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      inline def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      inline def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      inline def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      inline def setScrollToOption(value: String | Double): Self = StObject.set(x, "scrollToOption", value.asInstanceOf[js.Any])
      
      inline def setScrollToOptionUndefined: Self = StObject.set(x, "scrollToOption", js.undefined)
      
      inline def setSelectedHighlight(value: Boolean): Self = StObject.set(x, "selectedHighlight", value.asInstanceOf[js.Any])
      
      inline def setSelectedHighlightUndefined: Self = StObject.set(x, "selectedHighlight", js.undefined)
      
      inline def setSelectedId(value: String | Double): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      inline def setSelectedOptions(value: js.Array[js.UndefOr[String | Double]]): Self = StObject.set(x, "selectedOptions", value.asInstanceOf[js.Any])
      
      inline def setSelectedOptionsUndefined: Self = StObject.set(x, "selectedOptions", js.undefined)
      
      inline def setSelectedOptionsVarargs(value: (js.UndefOr[String | Double])*): Self = StObject.set(x, "selectedOptions", js.Array(value*))
      
      inline def setShowOptionsIfEmptyInput(value: Boolean): Self = StObject.set(x, "showOptionsIfEmptyInput", value.asInstanceOf[js.Any])
      
      inline def setShowOptionsIfEmptyInputUndefined: Self = StObject.set(x, "showOptionsIfEmptyInput", js.undefined)
      
      inline def setSize(value: InputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
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
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueParser(value: /* option */ DropdownLayoutValueOption => ReactNode | String | RenderOptionFn): Self = StObject.set(x, "valueParser", js.Any.fromFunction1(value))
      
      inline def setValueParserUndefined: Self = StObject.set(x, "valueParser", js.undefined)
      
      inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      inline def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
      
      inline def setWithArrowUndefined: Self = StObject.set(x, "withArrow", js.undefined)
      
      inline def setWithSelection(value: Boolean): Self = StObject.set(x, "withSelection", value.asInstanceOf[js.Any])
      
      inline def setWithSelectionUndefined: Self = StObject.set(x, "withSelection", js.undefined)
    }
  }
  
  type MultiSelectOnSelectFnSignature = js.Function2[/* id */ String | Double, /* option */ DropdownLayoutValueOption, Unit]
}
