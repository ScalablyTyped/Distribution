package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.FocusEvent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLInputElement
import typings.std.InstanceType
import typings.wixUiCore.anon.AriaActivedescendant
import typings.wixUiCore.anon.FilterPredicate
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import typings.wixUiCore.popoverUtilsGetModifiersMod.MoveBy
import typings.wixUiCore.srcComponentsDropdownContentDropdownContentMod.IDOMid
import typings.wixUiCore.srcComponentsDropdownDropdownMod.DropdownComponent
import typings.wixUiCore.srcComponentsInputInputMod.InputProps
import typings.wixUiCore.srcComponentsPopoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsInputWithOptionsInputWithOptionsMod {
  
  object DataHooks {
    
    @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "DataHooks")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "DataHooks.emptyState")
    @js.native
    def emptyState: String = js.native
    @scala.inline
    def emptyState_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("emptyState")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "DataHooks.input")
    @js.native
    def input: String = js.native
    @scala.inline
    def input_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("input")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "InputWithOptions")
  @js.native
  class InputWithOptions protected ()
    extends PureComponent[InputWithOptionsProps, InputWithOptionsState, js.Any] {
    def this(props: InputWithOptionsProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: InputWithOptionsProps, context: js.Any) = this()
    
    def _filterOptions(): js.Array[Option] = js.native
    
    def _onBlur(event: FocusEvent[HTMLInputElement]): Unit = js.native
    
    def _onContentMouseDown(e: js.Any): Unit = js.native
    
    def _onFocus(event: FocusEvent[HTMLInputElement]): Unit = js.native
    
    def _onKeyDown(event: KeyboardEvent[HTMLInputElement]): Unit = js.native
    
    def _onSelect(option: Option): Unit = js.native
    
    def _setDropDownRef(ref: DropdownComponent): Unit = js.native
    
    def changeExpanded(isExpanded: Boolean): Unit = js.native
    
    def close(): Unit = js.native
    
    var dropDownRef: (InstanceType[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof DropdownComponent */ js.Any
      ]) | Null = js.native
    
    var isEditing: Boolean = js.native
    
    def onOptionHover(option: Option & IDOMid): Unit = js.native
    
    def open(): Unit = js.native
    
    @JSName("state")
    var state_InputWithOptions: AriaActivedescendant = js.native
  }
  /* static members */
  object InputWithOptions {
    
    @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "InputWithOptions")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "InputWithOptions.bypassDefaultPropsTypecheck")
    @js.native
    def bypassDefaultPropsTypecheck: js.Any = js.native
    @scala.inline
    def bypassDefaultPropsTypecheck_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bypassDefaultPropsTypecheck")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "InputWithOptions.defaultProps")
    @js.native
    def defaultProps: FilterPredicate = js.native
    @scala.inline
    def defaultProps_=(x: FilterPredicate): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/src/components/input-with-options/InputWithOptions", "InputWithOptions.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Pick<wix-ui-core.wix-ui-core/src/components/popover.PopoverProps, 'fixed' | 'flip' | 'moveBy'> & std.Pick<wix-ui-core.wix-ui-core/src/components/dropdown.DropdownProps, 'onContentMouseDown'> & {  data-hook :string | undefined,   placement :wix-ui-core.wix-ui-core/src/components/popover.Placement | undefined,   options :std.Array<wix-ui-core.wix-ui-core/src/components/dropdown-option.Option>,   openTrigger :/ * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OPEN_TRIGGER_TYPE * / any | undefined,   onSelect :(option : wix-ui-core.wix-ui-core/src/components/dropdown-option.Option): void | undefined,   onDeselect :(option : wix-ui-core.wix-ui-core/src/components/dropdown-option.Option): void | undefined,   initialSelectedIds :std.Array<string | number> | undefined,   onInitialSelectedOptionsSet :(options : std.Array<wix-ui-core.wix-ui-core/src/components/dropdown-option.Option>): void | undefined,   multi :boolean | undefined,   fixedHeader :react.react.ReactNode | undefined,   fixedFooter :react.react.ReactNode | undefined,   timeout :number | undefined,   onManualInput :(value : string): void | undefined,   highlightMatches :boolean | undefined,   forceContentElementVisibility :boolean | undefined,   inputProps :wix-ui-core.wix-ui-core/src/components/input.InputProps | undefined,   style :object | undefined,   id :string | undefined,   allowReselect :boolean | undefined,   filterPredicate :(inputValue : string, optionValue : string): std.Boolean | undefined,   emptyStateMessage :string | undefined,   emptyStateStyle :react.react.CSSProperties | undefined,   optionsContainerZIndex :number | undefined,   className :string | undefined} */
  trait InputWithOptionsProps extends StObject {
    
    /** Allow onSelect event to be triggered upon re-selecting an option */
    var allowReselect: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.undefined
    
    /** Empty state message to be displayed in case all options are filtered out */
    var emptyStateMessage: js.UndefOr[String] = js.undefined
    
    /** Inline style to be passed to empty state message */
    var emptyStateStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** Filter by predicate */
    var filterPredicate: js.UndefOr[js.Function2[/* inputValue */ String, /* optionValue */ String, Boolean]] = js.undefined
    
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /** An element that always appears at the bottom of the options */
    var fixedFooter: js.UndefOr[ReactNode] = js.undefined
    
    /** An element that always appears at the top of the options */
    var fixedHeader: js.UndefOr[ReactNode] = js.undefined
    
    var flip: js.UndefOr[Boolean] = js.undefined
    
    /** If set to true, content element will always be visible, used for preview mode */
    var forceContentElementVisibility: js.UndefOr[Boolean] = js.undefined
    
    /** Should mark the text that matched the filter */
    var highlightMatches: js.UndefOr[Boolean] = js.undefined
    
    /** Id */
    var id: js.UndefOr[String] = js.undefined
    
    /** initial selected option ids */
    var initialSelectedIds: js.UndefOr[js.Array[String | Double]] = js.undefined
    
    /** Input prop types */
    var inputProps: js.UndefOr[InputProps] = js.undefined
    
    var moveBy: js.UndefOr[MoveBy] = js.undefined
    
    /** set true for multiple selection, false for single */
    var multi: js.UndefOr[Boolean] = js.undefined
    
    var onContentMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.undefined
    
    /** Handler for when an option is deselected */
    var onDeselect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** A callback for when initial selected options are set */
    var onInitialSelectedOptionsSet: js.UndefOr[js.Function1[/* options */ js.Array[Option], Unit]] = js.undefined
    
    /** Callback when the user pressed the Enter key or Tab key after he wrote in the Input field - meaning the user selected something not in the list  */
    var onManualInput: js.UndefOr[js.Function1[/* value */ String, Unit]] = js.undefined
    
    /** Handler for when an option is selected */
    var onSelect: js.UndefOr[js.Function1[/* option */ Option, Unit]] = js.undefined
    
    /** Trigger type to open the content */
    var openTrigger: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OPEN_TRIGGER_TYPE */ js.Any
      ] = js.undefined
    
    /** The dropdown options array */
    var options: js.Array[Option]
    
    /** Options box z-index */
    var optionsContainerZIndex: js.UndefOr[Double] = js.undefined
    
    /** The location to display the content */
    var placement: js.UndefOr[Placement] = js.undefined
    
    /** Inline styles */
    var style: js.UndefOr[js.Object] = js.undefined
    
    /** Animation timer */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object InputWithOptionsProps {
    
    @scala.inline
    def apply(options: js.Array[Option]): InputWithOptionsProps = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any])
      __obj.asInstanceOf[InputWithOptionsProps]
    }
    
    @scala.inline
    implicit class InputWithOptionsPropsMutableBuilder[Self <: InputWithOptionsProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowReselect(value: Boolean): Self = StObject.set(x, "allowReselect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowReselectUndefined: Self = StObject.set(x, "allowReselect", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def `setData-hook`(value: String): Self = StObject.set(x, "data-hook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setData-hookUndefined`: Self = StObject.set(x, "data-hook", js.undefined)
      
      @scala.inline
      def setEmptyStateMessage(value: String): Self = StObject.set(x, "emptyStateMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyStateMessageUndefined: Self = StObject.set(x, "emptyStateMessage", js.undefined)
      
      @scala.inline
      def setEmptyStateStyle(value: CSSProperties): Self = StObject.set(x, "emptyStateStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEmptyStateStyleUndefined: Self = StObject.set(x, "emptyStateStyle", js.undefined)
      
      @scala.inline
      def setFilterPredicate(value: (/* inputValue */ String, /* optionValue */ String) => Boolean): Self = StObject.set(x, "filterPredicate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setFilterPredicateUndefined: Self = StObject.set(x, "filterPredicate", js.undefined)
      
      @scala.inline
      def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooter(value: ReactNode): Self = StObject.set(x, "fixedFooter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedFooterUndefined: Self = StObject.set(x, "fixedFooter", js.undefined)
      
      @scala.inline
      def setFixedHeader(value: ReactNode): Self = StObject.set(x, "fixedHeader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedHeaderUndefined: Self = StObject.set(x, "fixedHeader", js.undefined)
      
      @scala.inline
      def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      @scala.inline
      def setFlip(value: Boolean): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      @scala.inline
      def setForceContentElementVisibility(value: Boolean): Self = StObject.set(x, "forceContentElementVisibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceContentElementVisibilityUndefined: Self = StObject.set(x, "forceContentElementVisibility", js.undefined)
      
      @scala.inline
      def setHighlightMatches(value: Boolean): Self = StObject.set(x, "highlightMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightMatchesUndefined: Self = StObject.set(x, "highlightMatches", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInitialSelectedIds(value: js.Array[String | Double]): Self = StObject.set(x, "initialSelectedIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSelectedIdsUndefined: Self = StObject.set(x, "initialSelectedIds", js.undefined)
      
      @scala.inline
      def setInitialSelectedIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "initialSelectedIds", js.Array(value :_*))
      
      @scala.inline
      def setInputProps(value: InputProps): Self = StObject.set(x, "inputProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPropsUndefined: Self = StObject.set(x, "inputProps", js.undefined)
      
      @scala.inline
      def setMoveBy(value: MoveBy): Self = StObject.set(x, "moveBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMoveByUndefined: Self = StObject.set(x, "moveBy", js.undefined)
      
      @scala.inline
      def setMulti(value: Boolean): Self = StObject.set(x, "multi", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultiUndefined: Self = StObject.set(x, "multi", js.undefined)
      
      @scala.inline
      def setOnContentMouseDown(value: /* e */ MouseEvent[Element, NativeMouseEvent] => Unit): Self = StObject.set(x, "onContentMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContentMouseDownUndefined: Self = StObject.set(x, "onContentMouseDown", js.undefined)
      
      @scala.inline
      def setOnDeselect(value: /* option */ Option => Unit): Self = StObject.set(x, "onDeselect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDeselectUndefined: Self = StObject.set(x, "onDeselect", js.undefined)
      
      @scala.inline
      def setOnInitialSelectedOptionsSet(value: /* options */ js.Array[Option] => Unit): Self = StObject.set(x, "onInitialSelectedOptionsSet", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInitialSelectedOptionsSetUndefined: Self = StObject.set(x, "onInitialSelectedOptionsSet", js.undefined)
      
      @scala.inline
      def setOnManualInput(value: /* value */ String => Unit): Self = StObject.set(x, "onManualInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnManualInputUndefined: Self = StObject.set(x, "onManualInput", js.undefined)
      
      @scala.inline
      def setOnSelect(value: /* option */ Option => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOpenTrigger(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify OPEN_TRIGGER_TYPE */ js.Any
      ): Self = StObject.set(x, "openTrigger", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenTriggerUndefined: Self = StObject.set(x, "openTrigger", js.undefined)
      
      @scala.inline
      def setOptions(value: js.Array[Option]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsContainerZIndex(value: Double): Self = StObject.set(x, "optionsContainerZIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsContainerZIndexUndefined: Self = StObject.set(x, "optionsContainerZIndex", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: Option*): Self = StObject.set(x, "options", js.Array(value :_*))
      
      @scala.inline
      def setPlacement(value: Placement): Self = StObject.set(x, "placement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlacementUndefined: Self = StObject.set(x, "placement", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Object): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait InputWithOptionsState extends StObject {
    
    var ariaActivedescendant: String | Null
    
    var ariaExpanded: Boolean
  }
  object InputWithOptionsState {
    
    @scala.inline
    def apply(ariaExpanded: Boolean): InputWithOptionsState = {
      val __obj = js.Dynamic.literal(ariaExpanded = ariaExpanded.asInstanceOf[js.Any], ariaActivedescendant = null)
      __obj.asInstanceOf[InputWithOptionsState]
    }
    
    @scala.inline
    implicit class InputWithOptionsStateMutableBuilder[Self <: InputWithOptionsState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAriaActivedescendant(value: String): Self = StObject.set(x, "ariaActivedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaActivedescendantNull: Self = StObject.set(x, "ariaActivedescendant", null)
      
      @scala.inline
      def setAriaExpanded(value: Boolean): Self = StObject.set(x, "ariaExpanded", value.asInstanceOf[js.Any])
    }
  }
}
