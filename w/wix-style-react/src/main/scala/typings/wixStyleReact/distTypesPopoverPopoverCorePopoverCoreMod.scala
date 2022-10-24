package typings.wixStyleReact

import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.FunctionComponent
import typings.react.mod.RefObject
import typings.std.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.wixStyleReact.anon.ExcludeClass
import typings.wixStyleReact.anon.NewBrandingClass
import typings.wixStyleReact.distTypesPopoverPopoverCoreUtilsUtilsMod.ElementProps
import typings.wixStyleReact.distTypesPopoverPopoverDottypesMod.PopoverProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesPopoverPopoverCorePopoverCoreMod {
  
  @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore")
  @js.native
  open class PopoverCore protected () extends Component[PopoverProps, PopoverState, Any] {
    def this(props: PopoverProps) = this()
    
    def _handleClickOutside(event: Any): Unit = js.native
    
    var _hideTimeout: Any = js.native
    
    /**
      * Checks to see if the focused element is outside the Popover content
      */
    def _onDocumentKeyUp(e: Any): Unit = js.native
    
    def _onKeyDown(e: Any): Unit = js.native
    
    def _removeBlurListener(): Unit = js.native
    
    def _setBlurByKeyboardListener(): Unit = js.native
    
    var _showTimeout: Any = js.native
    
    var appendToNode: HTMLElement | Null = js.native
    
    def applyStylesToPortaledNode(): Unit = js.native
    
    var clickOutsideClass: String = js.native
    
    var clickOutsideRef: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MPopoverCore(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MPopoverCore(prevProps: Any): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MPopoverCore(): Unit = js.native
    
    var contentHook: String = js.native
    
    def focus(): Unit = js.native
    
    def getPopperContentStructure(childrenObject: Any): Any = js.native
    
    def hidePopover(): Unit = js.native
    
    def initAppendToNode(): Unit = js.native
    
    var popoverContentRef: RefObject[HTMLDivElement] = js.native
    
    var popperScheduleUpdate: js.UndefOr[js.Function0[Unit]] = js.native
    
    var portalClasses: String = js.native
    
    var portalNode: HTMLElement | Null = js.native
    
    def renderArrow(arrowProps: Any, moveArrowTo: Any, placement: Any, customArrow: Any): Any = js.native
    
    def renderPopperContent(childrenObject: Any): Any = js.native
    
    def showPopover(): Unit = js.native
    
    var targetRef: js.UndefOr[Element] = js.native
    
    def updatePosition(): Unit = js.native
    
    def wrapWithAnimations(popper: Any): Any = js.native
  }
  /* static members */
  object PopoverCore {
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore.Content")
    @js.native
    def Content: FunctionComponent[ElementProps] = js.native
    inline def Content_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Content")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore.Element")
    @js.native
    def Element: FunctionComponent[ElementProps] = js.native
    inline def Element_=(x: FunctionComponent[ElementProps]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Element")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore.contextType")
    @js.native
    def contextType: Context[NewBrandingClass] = js.native
    inline def contextType_=(x: Context[NewBrandingClass]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore.defaultProps")
    @js.native
    def defaultProps: ExcludeClass = js.native
    inline def defaultProps_=(x: ExcludeClass): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-style-react/dist/types/Popover/PopoverCore/PopoverCore", "PopoverCore.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait PopoverState extends StObject {
    
    var isMounted: Boolean
    
    var shown: Boolean
  }
  object PopoverState {
    
    inline def apply(isMounted: Boolean, shown: Boolean): PopoverState = {
      val __obj = js.Dynamic.literal(isMounted = isMounted.asInstanceOf[js.Any], shown = shown.asInstanceOf[js.Any])
      __obj.asInstanceOf[PopoverState]
    }
    
    extension [Self <: PopoverState](x: Self) {
      
      inline def setIsMounted(value: Boolean): Self = StObject.set(x, "isMounted", value.asInstanceOf[js.Any])
      
      inline def setShown(value: Boolean): Self = StObject.set(x, "shown", value.asInstanceOf[js.Any])
    }
  }
}
