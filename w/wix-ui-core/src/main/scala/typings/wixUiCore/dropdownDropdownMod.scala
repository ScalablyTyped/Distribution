package typings.wixUiCore

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLElement
import typings.wixUiCore.anon.IsOpen
import typings.wixUiCore.dropdownConstantsMod.OPEN_TRIGGER_TYPE
import typings.wixUiCore.dropdownContentDropdownContentMod.IDOMid
import typings.wixUiCore.getModifiersMod.MoveBy
import typings.wixUiCore.optionFactoryMod.Option
import typings.wixUiCore.popoverPopoverMod.AppendTo
import typings.wixUiCore.popoverPopoverMod.Placement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dropdownDropdownMod {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("wix-ui-core/dist/src/components/dropdown/Dropdown", "Dropdown")
  @js.native
  class Dropdown protected () extends DropdownComponent {
    def this(props: DropdownProps) = this()
  }
  object Dropdown {
    
    @JSImport("wix-ui-core/dist/src/components/dropdown/Dropdown", "Dropdown")
    @js.native
    val ^ : js.Any = js.native
    
    inline def areSelectedIdsEqual(selectedIds1: js.Any, selectedIds2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSelectedIdsEqual")(selectedIds1.asInstanceOf[js.Any], selectedIds2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("wix-ui-core/dist/src/components/dropdown/Dropdown", "Dropdown.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("wix-ui-core/dist/src/components/dropdown/Dropdown", "DropdownComponent")
  @js.native
  class DropdownComponent protected ()
    extends PureComponent[DropdownProps, DropdownState, js.Any] {
    def this(props: DropdownProps) = this()
    
    def _onContentMouseDown(e: js.Any): Unit = js.native
    
    def _onExpandedChange(): Unit = js.native
    
    def close(): Unit = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MDropdownComponent(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MDropdownComponent(prevProps: DropdownProps): Unit = js.native
    
    /* private */ var dropdownContentRef: js.Any = js.native
    
    def getSelectedOption(): Option & IDOMid = js.native
    
    def handleClickOutside(): Unit = js.native
    
    def initializeSelectedOptions(): Unit = js.native
    
    def isClosingKey(key: js.Any): Boolean = js.native
    
    def onKeyDown(evt: KeyboardEvent[HTMLElement]): Unit = js.native
    
    def onKeyboardSelect(): Unit = js.native
    
    def onOptionClick(): Unit = js.native
    def onOptionClick(option: Option): Unit = js.native
    
    def onOptionHover(): Unit = js.native
    def onOptionHover(option: Option & IDOMid): Unit = js.native
    
    def onPopoverClick(): Unit = js.native
    
    def open(): Unit = js.native
    def open(onOpen: js.Function0[Unit]): Unit = js.native
    
    @JSName("state")
    var state_DropdownComponent: IsOpen = js.native
  }
  /* static members */
  object DropdownComponent {
    
    @JSImport("wix-ui-core/dist/src/components/dropdown/Dropdown", "DropdownComponent")
    @js.native
    val ^ : js.Any = js.native
    
    inline def areSelectedIdsEqual(selectedIds1: js.Any, selectedIds2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("areSelectedIdsEqual")(selectedIds1.asInstanceOf[js.Any], selectedIds2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
    
    @JSImport("wix-ui-core/dist/src/components/dropdown/Dropdown", "DropdownComponent.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  /* Inlined std.Pick<wix-ui-core.wix-ui-core/dist/src/components/popover.PopoverProps, 'fixed' | 'flip' | 'moveBy'> & {  data-hook :string | undefined,   placement :wix-ui-core.wix-ui-core/dist/src/components/popover.Placement,   showArrow :boolean | undefined,   children :react.react.ReactNode,   options :std.Array<wix-ui-core.wix-ui-core/dist/src/components/dropdown-option.Option>,   openTrigger :wix-ui-core.wix-ui-core/dist/src/components/dropdown/constants.OPEN_TRIGGER_TYPE,   onOptionHover :(option : wix-ui-core.wix-ui-core/dist/src/components/dropdown-option.Option & wix-ui-core.wix-ui-core/dist/src/components/dropdown-content.IDOMid | null): void | undefined, onSelect (option : wix-ui-core.wix-ui-core/dist/src/components/dropdown-option.Option | null): void,   onContentMouseDown :(e : react.react.MouseEvent<std.Element, react.react.NativeMouseEvent>): void | undefined,   onDeselect :(option : wix-ui-core.wix-ui-core/dist/src/components/dropdown-option.Option | null): void | undefined,   onExpandedChange :(isExpanded : boolean): void | undefined,   initialSelectedIds :std.Array<string | number>,   onInitialSelectedOptionsSet :(options : std.Array<wix-ui-core.wix-ui-core/dist/src/components/dropdown-option.Option>): void | undefined,   multi :boolean | undefined,   fixedHeader :react.react.ReactNode | undefined,   fixedFooter :react.react.ReactNode | undefined,   disabled :boolean | undefined,   timeout :number | undefined,   forceContentElementVisibility :boolean | undefined,   style :object | undefined,   role :string | undefined,   id :string | undefined,   contentId :string | undefined,   allowReselect :boolean | undefined,   optionsContainerZIndex :number | undefined,   dynamicWidth :boolean | undefined,   appendTo :wix-ui-core.wix-ui-core/dist/src/components/popover.AppendTo | undefined,   className :string | undefined} */
  @js.native
  trait DropdownProps extends StObject {
    
    /** Allow onSelect event to be triggered upon re-selecting an option */
    var allowReselect: js.UndefOr[Boolean] = js.native
    
    /** Element to append the dropdown to */
    var appendTo: js.UndefOr[AppendTo] = js.native
    
    /** render function that renders the target element with the state */
    var children: ReactNode = js.native
    
    var className: js.UndefOr[String] = js.native
    
    /** DOM id of options list element */
    var contentId: js.UndefOr[String] = js.native
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.native
    
    /** Makes the component disabled */
    var disabled: js.UndefOr[Boolean] = js.native
    
    /** Make width fit container */
    var dynamicWidth: js.UndefOr[Boolean] = js.native
    
    var fixed: js.UndefOr[Boolean] = js.native
    
    /** An element that always appears at the bottom of the options */
    var fixedFooter: js.UndefOr[ReactNode] = js.native
    
    /** An element that always appears at the top of the options */
    var fixedHeader: js.UndefOr[ReactNode] = js.native
    
    var flip: js.UndefOr[Boolean] = js.native
    
    /** If set to true, content element will always be visible, used for preview mode */
    var forceContentElementVisibility: js.UndefOr[Boolean] = js.native
    
    /** Id */
    var id: js.UndefOr[String] = js.native
    
    /** initial selected option ids */
    var initialSelectedIds: js.Array[String | Double] = js.native
    
    var moveBy: js.UndefOr[MoveBy] = js.native
    
    /** set true for multiple selection, false for single */
    var multi: js.UndefOr[Boolean] = js.native
    
    /** Handler for when a mouse down event occurs on an option */
    var onContentMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
    
    /** Handler for when an option is deselected */
    var onDeselect: js.UndefOr[js.Function1[/* option */ Option | Null, Unit]] = js.native
    
    /** Handler for when dropdown becomes opened/closed */
    var onExpandedChange: js.UndefOr[js.Function1[/* isExpanded */ Boolean, Unit]] = js.native
    
    /** A callback for when initial selected options are set */
    var onInitialSelectedOptionsSet: js.UndefOr[js.Function1[/* options */ js.Array[Option], Unit]] = js.native
    
    /** Handler for when an option is hovered */
    var onOptionHover: js.UndefOr[js.Function1[/* option */ (Option & IDOMid) | Null, Unit]] = js.native
    
    /** Handler for when an option is selected */
    def onSelect(): Unit = js.native
    def onSelect(option: Option): Unit = js.native
    
    /** Trigger type to open the content */
    var openTrigger: OPEN_TRIGGER_TYPE = js.native
    
    /** The dropdown options array */
    var options: js.Array[Option] = js.native
    
    /** Options box z-index */
    var optionsContainerZIndex: js.UndefOr[Double] = js.native
    
    /** The location to display the content */
    var placement: Placement = js.native
    
    var role: js.UndefOr[String] = js.native
    
    /** Should display arrow with the content */
    var showArrow: js.UndefOr[Boolean] = js.native
    
    /** Inline styles */
    var style: js.UndefOr[js.Object] = js.native
    
    /** Animation timer */
    var timeout: js.UndefOr[Double] = js.native
  }
  
  trait DropdownState extends StObject {
    
    var isOpen: Boolean
    
    var selectedIds: js.Array[String | Double]
  }
  object DropdownState {
    
    inline def apply(isOpen: Boolean, selectedIds: js.Array[String | Double]): DropdownState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any], selectedIds = selectedIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownState]
    }
    
    extension [Self <: DropdownState](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      inline def setSelectedIds(value: js.Array[String | Double]): Self = StObject.set(x, "selectedIds", value.asInstanceOf[js.Any])
      
      inline def setSelectedIdsVarargs(value: (String | Double)*): Self = StObject.set(x, "selectedIds", js.Array(value :_*))
    }
  }
}
