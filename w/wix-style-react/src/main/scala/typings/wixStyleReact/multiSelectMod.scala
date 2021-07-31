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
import typings.std.HTMLButtonElement
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.MouseEvent
import typings.std.TouchEvent
import typings.wixStyleReact.anon.RemovedIndex
import typings.wixStyleReact.commonMod.PopoverCommonProps
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutItemHeight
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutOption
import typings.wixStyleReact.dropdownLayoutMod.DropdownLayoutValueOption
import typings.wixStyleReact.dropdownLayoutMod.Overflow
import typings.wixStyleReact.dropdownLayoutMod.RenderOptionFn
import typings.wixStyleReact.inputMod.InputSize
import typings.wixStyleReact.inputMod.InputStatus
import typings.wixStyleReact.inputWithOptionsMod.OnSelectFnSignature
import typings.wixStyleReact.tagMod.TagSize
import typings.wixStyleReact.tagMod.TagTheme
import typings.wixStyleReact.wixStyleReactStrings.select
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object multiSelectMod {
  
  @JSImport("wix-style-react/dist/es/src/MultiSelect", JSImport.Default)
  @js.native
  class default ()
    extends typings.wixStyleReact.inputWithOptionsMod.default[
          js.Function1[/* values */ js.Array[String], Unit], 
          OnSelectFnSignature, 
          MultiSelectProps
        ]
  
  type MultiSelect = typings.wixStyleReact.inputWithOptionsMod.default[
    js.Function1[/* values */ js.Array[String], Unit], 
    OnSelectFnSignature, 
    MultiSelectProps
  ]
  
  type MultiSelectMode = select
  
  /* Inlined parent wix-style-react.wix-style-react/dist/es/src/InputWithOptions.InputWithOptionsProps<(values : std.Array<string>): void, wix-style-react.wix-style-react/dist/es/src/InputWithOptions.OnSelectFnSignature> */
  trait MultiSelectProps extends StObject {
    
    var ariaControls: js.UndefOr[String] = js.undefined
    
    var ariaDescribedby: js.UndefOr[String] = js.undefined
    
    var ariaLabel: js.UndefOr[String] = js.undefined
    
    var autoFocus: js.UndefOr[Boolean] = js.undefined
    
    var autoSelect: js.UndefOr[Boolean] = js.undefined
    
    var autocomplete: js.UndefOr[String] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var clearButton: js.UndefOr[Boolean] = js.undefined
    
    var clearOnBlur: js.UndefOr[Boolean] = js.undefined
    
    var closeOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var customInput: js.UndefOr[ReactNode | js.Function] = js.undefined
    
    var customSuffix: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var defaultValue: js.UndefOr[String] = js.undefined
    
    var delimiters: js.UndefOr[js.Array[String]] = js.undefined
    
    var disableEditing: js.UndefOr[Boolean] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var dropDirectionUp: js.UndefOr[Boolean] = js.undefined
    
    var dropdownOffsetLeft: js.UndefOr[String] = js.undefined
    
    var dropdownWidth: js.UndefOr[String] = js.undefined
    
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
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
    
    var itemHeight: js.UndefOr[DropdownLayoutItemHeight] = js.undefined
    
    var loadMore: js.UndefOr[js.Function1[/* page */ Double, Unit]] = js.undefined
    
    var markedOption: js.UndefOr[Boolean | String | Double] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxHeightPixels: js.UndefOr[String | Double] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var maxNumRows: js.UndefOr[Double] = js.undefined
    
    var menuArrow: js.UndefOr[Boolean] = js.undefined
    
    var min: js.UndefOr[Double] = js.undefined
    
    var minWidthPixels: js.UndefOr[String | Double] = js.undefined
    
    var mode: js.UndefOr[MultiSelectMode] = js.undefined
    
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
    
    var onEnterPressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onEscapePressed: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onFocus: js.UndefOr[js.Function1[/* e */ js.UndefOr[FocusEvent[HTMLInputElement]], Unit]] = js.undefined
    
    var onInputClicked: js.UndefOr[MouseEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyDown: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onManuallyInput: js.UndefOr[js.Function1[/* values */ js.Array[String], Unit]] = js.undefined
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLElement]] = js.undefined
    
    var onOptionMarked: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption | Null, Unit]] = js.undefined
    
    var onOptionsHide: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onOptionsShow: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLInputElement]] = js.undefined
    
    var onRemoveTag: js.UndefOr[js.Function1[/* tagId */ String, Unit]] = js.undefined
    
    var onReorder: js.UndefOr[OnReorderFn] = js.undefined
    
    var onSelect: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption, Unit]] = js.undefined
    
    var options: js.UndefOr[js.Array[DropdownLayoutOption]] = js.undefined
    
    var overflow: js.UndefOr[Overflow] = js.undefined
    
    var pattern: js.UndefOr[String] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var popoverProps: js.UndefOr[PopoverCommonProps] = js.undefined
    
    var predicate: js.UndefOr[js.Function1[/* option */ DropdownLayoutValueOption, Boolean]] = js.undefined
    
    var prefix: js.UndefOr[ReactNode] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var required: js.UndefOr[Boolean] = js.undefined
    
    var roundInput: js.UndefOr[Boolean] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var selectedHighlight: js.UndefOr[Boolean] = js.undefined
    
    var selectedId: js.UndefOr[String | Double] = js.undefined
    
    var showOptionsIfEmptyInput: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[InputSize] = js.undefined
    
    var status: js.UndefOr[MultiSelectStatus] = js.undefined
    
    var statusMessage: js.UndefOr[ReactNode] = js.undefined
    
    var step: js.UndefOr[Double] = js.undefined
    
    var suffix: js.UndefOr[ReactNode] = js.undefined
    
    var tabIndex: js.UndefOr[Double] = js.undefined
    
    var tags: js.UndefOr[js.Array[MultiSelectTag]] = js.undefined
    
    var textOverflow: js.UndefOr[String] = js.undefined
    
    var tooltipPlacement: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Placement */ js.Any
      ] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
    
    var value: js.UndefOr[String | Double] = js.undefined
    
    var valueParser: js.UndefOr[
        js.Function1[/* option */ DropdownLayoutValueOption, ReactNode | String | RenderOptionFn]
      ] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
    
    var withArrow: js.UndefOr[Boolean] = js.undefined
    
    var withSelection: js.UndefOr[Boolean] = js.undefined
  }
  object MultiSelectProps {
    
    @scala.inline
    def apply(): MultiSelectProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MultiSelectProps]
    }
    
    @scala.inline
    implicit class MultiSelectPropsMutableBuilder[Self <: MultiSelectProps] (val x: Self) extends AnyVal {
      
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
      def setClearOnBlur(value: Boolean): Self = StObject.set(x, "clearOnBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClearOnBlurUndefined: Self = StObject.set(x, "clearOnBlur", js.undefined)
      
      @scala.inline
      def setCloseOnSelect(value: Boolean): Self = StObject.set(x, "closeOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseOnSelectUndefined: Self = StObject.set(x, "closeOnSelect", js.undefined)
      
      @scala.inline
      def setCustomInput(value: ReactNode | js.Function): Self = StObject.set(x, "customInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomInputUndefined: Self = StObject.set(x, "customInput", js.undefined)
      
      @scala.inline
      def setCustomSuffix(value: ReactNode): Self = StObject.set(x, "customSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomSuffixUndefined: Self = StObject.set(x, "customSuffix", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDelimiters(value: js.Array[String]): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
      
      @scala.inline
      def setDelimitersVarargs(value: String*): Self = StObject.set(x, "delimiters", js.Array(value :_*))
      
      @scala.inline
      def setDisableEditing(value: Boolean): Self = StObject.set(x, "disableEditing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEditingUndefined: Self = StObject.set(x, "disableEditing", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDropDirectionUp(value: Boolean): Self = StObject.set(x, "dropDirectionUp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropDirectionUpUndefined: Self = StObject.set(x, "dropDirectionUp", js.undefined)
      
      @scala.inline
      def setDropdownOffsetLeft(value: String): Self = StObject.set(x, "dropdownOffsetLeft", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownOffsetLeftUndefined: Self = StObject.set(x, "dropdownOffsetLeft", js.undefined)
      
      @scala.inline
      def setDropdownWidth(value: String): Self = StObject.set(x, "dropdownWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropdownWidthUndefined: Self = StObject.set(x, "dropdownWidth", js.undefined)
      
      @scala.inline
      def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFocusOnSelectedOption(value: Boolean): Self = StObject.set(x, "focusOnSelectedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnSelectedOptionUndefined: Self = StObject.set(x, "focusOnSelectedOption", js.undefined)
      
      @scala.inline
      def setForceFocus(value: Boolean): Self = StObject.set(x, "forceFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceFocusUndefined: Self = StObject.set(x, "forceFocus", js.undefined)
      
      @scala.inline
      def setForceHover(value: Boolean): Self = StObject.set(x, "forceHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceHoverUndefined: Self = StObject.set(x, "forceHover", js.undefined)
      
      @scala.inline
      def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      @scala.inline
      def setHideStatusSuffix(value: Boolean): Self = StObject.set(x, "hideStatusSuffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideStatusSuffixUndefined: Self = StObject.set(x, "hideStatusSuffix", js.undefined)
      
      @scala.inline
      def setHighlight(value: Boolean): Self = StObject.set(x, "highlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInContainer(value: Boolean): Self = StObject.set(x, "inContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInContainerUndefined: Self = StObject.set(x, "inContainer", js.undefined)
      
      @scala.inline
      def setInfiniteScroll(value: Boolean): Self = StObject.set(x, "infiniteScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteScrollUndefined: Self = StObject.set(x, "infiniteScroll", js.undefined)
      
      @scala.inline
      def setInputElement(value: ReactElement): Self = StObject.set(x, "inputElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputElementUndefined: Self = StObject.set(x, "inputElement", js.undefined)
      
      @scala.inline
      def setInputRef(value: /* input */ HTMLInputElement => Unit): Self = StObject.set(x, "inputRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInputRefUndefined: Self = StObject.set(x, "inputRef", js.undefined)
      
      @scala.inline
      def setItemHeight(value: DropdownLayoutItemHeight): Self = StObject.set(x, "itemHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemHeightUndefined: Self = StObject.set(x, "itemHeight", js.undefined)
      
      @scala.inline
      def setLoadMore(value: /* page */ Double => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoadMoreUndefined: Self = StObject.set(x, "loadMore", js.undefined)
      
      @scala.inline
      def setMarkedOption(value: Boolean | String | Double): Self = StObject.set(x, "markedOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarkedOptionUndefined: Self = StObject.set(x, "markedOption", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightPixels(value: String | Double): Self = StObject.set(x, "maxHeightPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxHeightPixelsUndefined: Self = StObject.set(x, "maxHeightPixels", js.undefined)
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxNumRows(value: Double): Self = StObject.set(x, "maxNumRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNumRowsUndefined: Self = StObject.set(x, "maxNumRows", js.undefined)
      
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
      def setMinWidthPixels(value: String | Double): Self = StObject.set(x, "minWidthPixels", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthPixelsUndefined: Self = StObject.set(x, "minWidthPixels", js.undefined)
      
      @scala.inline
      def setMode(value: MultiSelectMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNative(value: Boolean): Self = StObject.set(x, "native", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNativeUndefined: Self = StObject.set(x, "native", js.undefined)
      
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
      def setOnClear(value: typings.react.mod.MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClear", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClearUndefined: Self = StObject.set(x, "onClear", js.undefined)
      
      @scala.inline
      def setOnClickOutside(value: /* e */ TouchEvent | MouseEvent => Unit): Self = StObject.set(x, "onClickOutside", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickOutsideUndefined: Self = StObject.set(x, "onClickOutside", js.undefined)
      
      @scala.inline
      def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
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
      def setOnFocus(value: /* e */ js.UndefOr[FocusEvent[HTMLInputElement]] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInputClicked(value: typings.react.mod.MouseEvent[HTMLInputElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onInputClicked", js.Any.fromFunction1(value))
      
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
      def setOnManuallyInput(value: /* values */ js.Array[String] => Unit): Self = StObject.set(x, "onManuallyInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnManuallyInputUndefined: Self = StObject.set(x, "onManuallyInput", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: typings.react.mod.MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnOptionMarked(value: /* option */ DropdownLayoutValueOption | Null => Unit): Self = StObject.set(x, "onOptionMarked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnOptionMarkedUndefined: Self = StObject.set(x, "onOptionMarked", js.undefined)
      
      @scala.inline
      def setOnOptionsHide(value: () => Unit): Self = StObject.set(x, "onOptionsHide", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOptionsHideUndefined: Self = StObject.set(x, "onOptionsHide", js.undefined)
      
      @scala.inline
      def setOnOptionsShow(value: () => Unit): Self = StObject.set(x, "onOptionsShow", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnOptionsShowUndefined: Self = StObject.set(x, "onOptionsShow", js.undefined)
      
      @scala.inline
      def setOnPaste(value: ClipboardEvent[HTMLInputElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnRemoveTag(value: /* tagId */ String => Unit): Self = StObject.set(x, "onRemoveTag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveTagUndefined: Self = StObject.set(x, "onRemoveTag", js.undefined)
      
      @scala.inline
      def setOnReorder(value: /* data */ RemovedIndex => Unit): Self = StObject.set(x, "onReorder", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnReorderUndefined: Self = StObject.set(x, "onReorder", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* option */ DropdownLayoutValueOption => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[DropdownLayoutOption]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: DropdownLayoutOption*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setOverflow(value: Overflow): Self = StObject.set(x, "overflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverflowUndefined: Self = StObject.set(x, "overflow", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPopoverProps(value: PopoverCommonProps): Self = StObject.set(x, "popoverProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverPropsUndefined: Self = StObject.set(x, "popoverProps", js.undefined)
      
      @scala.inline
      def setPredicate(value: /* option */ DropdownLayoutValueOption => Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPredicateUndefined: Self = StObject.set(x, "predicate", js.undefined)
      
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
      def setSelectedHighlight(value: Boolean): Self = StObject.set(x, "selectedHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedHighlightUndefined: Self = StObject.set(x, "selectedHighlight", js.undefined)
      
      @scala.inline
      def setSelectedId(value: String | Double): Self = StObject.set(x, "selectedId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIdUndefined: Self = StObject.set(x, "selectedId", js.undefined)
      
      @scala.inline
      def setShowOptionsIfEmptyInput(value: Boolean): Self = StObject.set(x, "showOptionsIfEmptyInput", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOptionsIfEmptyInputUndefined: Self = StObject.set(x, "showOptionsIfEmptyInput", js.undefined)
      
      @scala.inline
      def setSize(value: InputSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStatus(value: MultiSelectStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
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
      def setTags(value: js.Array[MultiSelectTag]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setTagsVarargs(value: MultiSelectTag*): Self = StObject.set(x, "tags", js.Array(value :_*))
      
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
      def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueParser(value: /* option */ DropdownLayoutValueOption => ReactNode | String | RenderOptionFn): Self = StObject.set(x, "valueParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setValueParserUndefined: Self = StObject.set(x, "valueParser", js.undefined)
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
      
      @scala.inline
      def setWithArrow(value: Boolean): Self = StObject.set(x, "withArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithArrowUndefined: Self = StObject.set(x, "withArrow", js.undefined)
      
      @scala.inline
      def setWithSelection(value: Boolean): Self = StObject.set(x, "withSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithSelectionUndefined: Self = StObject.set(x, "withSelection", js.undefined)
    }
  }
  
  type MultiSelectStatus = InputStatus
  
  /* Inlined wix-style-react.wix-style-react/dist/es/src/common.OmitPolyfill<wix-style-react.wix-style-react/dist/es/src/Tag.TagProps, 'children'> & {  label :string} */
  trait MultiSelectTag extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var disabled: js.UndefOr[Boolean] = js.undefined
    
    var id: String
    
    var label: String
    
    var maxWidth: js.UndefOr[Double] = js.undefined
    
    var onClick: js.UndefOr[
        js.Function2[
          /* id */ String, 
          /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, NativeMouseEvent], 
          Unit
        ]
      ] = js.undefined
    
    var onRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.undefined
    
    var removable: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[TagSize] = js.undefined
    
    var theme: js.UndefOr[TagTheme] = js.undefined
    
    var thumb: js.UndefOr[ReactElement] = js.undefined
  }
  object MultiSelectTag {
    
    @scala.inline
    def apply(id: String, label: String): MultiSelectTag = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[MultiSelectTag]
    }
    
    @scala.inline
    implicit class MultiSelectTagMutableBuilder[Self <: MultiSelectTag] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidth(value: Double): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (/* id */ String, /* event */ typings.react.mod.MouseEvent[HTMLButtonElement, NativeMouseEvent]) => Unit
      ): Self = StObject.set(x, "onClick", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setOnRemove(value: /* id */ String => Unit): Self = StObject.set(x, "onRemove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRemoveUndefined: Self = StObject.set(x, "onRemove", js.undefined)
      
      @scala.inline
      def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemovableUndefined: Self = StObject.set(x, "removable", js.undefined)
      
      @scala.inline
      def setSize(value: TagSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTheme(value: TagTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      @scala.inline
      def setThumb(value: ReactElement): Self = StObject.set(x, "thumb", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThumbUndefined: Self = StObject.set(x, "thumb", js.undefined)
    }
  }
  
  type OnReorderFn = js.Function1[/* data */ RemovedIndex, Unit]
}
