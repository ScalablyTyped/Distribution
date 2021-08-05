package typings.wixUiCore

import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.wixUiCore.anon.HoveredIndex
import typings.wixUiCore.anon.PickOptionid
import typings.wixUiCore.componentsDropdownOptionOptionFactoryMod.Option
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcComponentsDropdownContentDropdownContentMod {
  
  @JSImport("wix-ui-core/src/components/dropdown-content/DropdownContent", "DropdownContent")
  @js.native
  class DropdownContent protected ()
    extends PureComponent[DropdownContentProps, DropdownContentState, js.Any] {
    def this(props: DropdownContentProps) = this()
    
    def getOptionDOMid(option: PickOptionid): String = js.native
    
    def getSelectedOption(): (Option & IDOMid) | Null = js.native
    
    def hoverNextItem(interval: Double): Unit = js.native
    
    def isValidOptionForSelection(option: Option): Boolean = js.native
    
    /* private */ val mouseCoords: js.Any = js.native
    
    def onKeyDown(eventKey: String, evt: KeyboardEvent[HTMLElement]): Unit = js.native
    
    def onMouseDown(e: js.Any): Unit = js.native
    
    def onMouseEnter(evt: MouseEvent[HTMLDivElement, NativeMouseEvent], index: Double): Unit = js.native
    
    def onMouseMove(evt: MouseEvent[HTMLDivElement, NativeMouseEvent]): Unit = js.native
    
    def onOptionHover(): Unit = js.native
    
    /* private */ var optionsContainerRef: js.Any = js.native
    
    def setHoveredIndex(index: Double): Unit = js.native
    
    @JSName("state")
    var state_DropdownContent: HoveredIndex = js.native
  }
  /* static members */
  object DropdownContent {
    
    @JSImport("wix-ui-core/src/components/dropdown-content/DropdownContent", "DropdownContent")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/dropdown-content/DropdownContent", "DropdownContent.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait DropdownContentProps extends StObject {
    
    /** Component class name */
    var className: js.UndefOr[String] = js.native
    
    /** hook for testing purposes */
    var `data-hook`: js.UndefOr[String] = js.native
    
    /** An element that always appears at the bottom of the options */
    var fixedFooter: js.UndefOr[ReactNode] = js.native
    
    /** An element that always appears at the top of the options */
    var fixedHeader: js.UndefOr[ReactNode] = js.native
    
    /** A callback for mouse down event */
    var onMouseDown: js.UndefOr[js.Function1[/* e */ MouseEvent[Element, NativeMouseEvent], Unit]] = js.native
    
    /** A callback for when clicking an option */
    def onOptionClick(): Unit = js.native
    def onOptionClick(option: Option): Unit = js.native
    
    /** A callback for when hovering an option */
    var onOptionHover: js.UndefOr[js.Function1[/* option */ (Option & IDOMid) | Null, Unit]] = js.native
    
    /** The dropdown options array */
    var options: js.Array[Option] = js.native
    
    /** DOM id of optionsContainer element */
    var optionsContainerId: js.UndefOr[String] = js.native
    
    /** Array of the selected ids */
    var selectedIds: js.Array[String | Double] = js.native
  }
  
  trait DropdownContentState extends StObject {
    
    var hoveredIndex: Double
  }
  object DropdownContentState {
    
    inline def apply(hoveredIndex: Double): DropdownContentState = {
      val __obj = js.Dynamic.literal(hoveredIndex = hoveredIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[DropdownContentState]
    }
    
    extension [Self <: DropdownContentState](x: Self) {
      
      inline def setHoveredIndex(value: Double): Self = StObject.set(x, "hoveredIndex", value.asInstanceOf[js.Any])
    }
  }
  
  trait IDOMid extends StObject {
    
    var _DOMid: String
  }
  object IDOMid {
    
    inline def apply(_DOMid: String): IDOMid = {
      val __obj = js.Dynamic.literal(_DOMid = _DOMid.asInstanceOf[js.Any])
      __obj.asInstanceOf[IDOMid]
    }
    
    extension [Self <: IDOMid](x: Self) {
      
      inline def set_DOMid(value: String): Self = StObject.set(x, "_DOMid", value.asInstanceOf[js.Any])
    }
  }
}
