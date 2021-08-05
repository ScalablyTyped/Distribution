package typings.wixUiCore

import typings.react.mod.CSSProperties
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.std.HTMLLIElement
import typings.wixUiCore.anon.IsOpenBoolean
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuItemHorizontalMenuItemMod {
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItem", "HorizontalMenuItem")
  @js.native
  class HorizontalMenuItem protected ()
    extends PureComponent[HorizontalMenuItemProps, HorizontalMenuItemState, js.Any] {
    def this(props: HorizontalMenuItemProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuItemProps, context: js.Any) = this()
    
    /* private */ val hideMenu: js.Any = js.native
    
    var hideTimeout: js.Any = js.native
    
    var menuItemRef: RefObject[HTMLLIElement] = js.native
    
    /* private */ var renderExpandIcon: js.Any = js.native
    
    /* private */ var renderLink: js.Any = js.native
    
    /* private */ val showMenu: js.Any = js.native
    
    var showTimeout: js.Any = js.native
    
    @JSName("state")
    var state_HorizontalMenuItem: IsOpenBoolean = js.native
  }
  /* static members */
  object HorizontalMenuItem {
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItem", "HorizontalMenuItem")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItem", "HorizontalMenuItem.defaultProps")
    @js.native
    def defaultProps: typings.wixUiCore.anon.ExpandSize = js.native
    inline def defaultProps_=(x: typings.wixUiCore.anon.ExpandSize): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-item/HorizontalMenuItem", "HorizontalMenuItem.displayName")
    @js.native
    def displayName: String = js.native
    inline def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait ExpandIconProps extends StObject {
    
    var isOpen: Boolean
  }
  object ExpandIconProps {
    
    inline def apply(isOpen: Boolean): ExpandIconProps = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExpandIconProps]
    }
    
    extension [Self <: ExpandIconProps](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.wixUiCore.wixUiCoreStrings.column
    - typings.wixUiCore.wixUiCoreStrings.menu
    - typings.wixUiCore.wixUiCoreStrings.fullWidth
  */
  trait ExpandSize extends StObject
  object ExpandSize {
    
    inline def column: typings.wixUiCore.wixUiCoreStrings.column = "column".asInstanceOf[typings.wixUiCore.wixUiCoreStrings.column]
    
    inline def fullWidth: typings.wixUiCore.wixUiCoreStrings.fullWidth = "fullWidth".asInstanceOf[typings.wixUiCore.wixUiCoreStrings.fullWidth]
    
    inline def menu: typings.wixUiCore.wixUiCoreStrings.menu = "menu".asInstanceOf[typings.wixUiCore.wixUiCoreStrings.menu]
  }
  
  trait HorizontalMenuItemProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var expandIcon: js.UndefOr[js.Function1[/* props */ ExpandIconProps, ReactNode]] = js.undefined
    
    var expandSize: js.UndefOr[ExpandSize] = js.undefined
    
    var hideDelay: js.UndefOr[Double] = js.undefined
    
    var href: js.UndefOr[String] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var isForceOpened: js.UndefOr[Boolean] = js.undefined
    
    var label: String
    
    var showDelay: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var target: js.UndefOr[String] = js.undefined
  }
  object HorizontalMenuItemProps {
    
    inline def apply(label: String): HorizontalMenuItemProps = {
      val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuItemProps]
    }
    
    extension [Self <: HorizontalMenuItemProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setExpandIcon(value: /* props */ ExpandIconProps => ReactNode): Self = StObject.set(x, "expandIcon", js.Any.fromFunction1(value))
      
      inline def setExpandIconUndefined: Self = StObject.set(x, "expandIcon", js.undefined)
      
      inline def setExpandSize(value: ExpandSize): Self = StObject.set(x, "expandSize", value.asInstanceOf[js.Any])
      
      inline def setExpandSizeUndefined: Self = StObject.set(x, "expandSize", js.undefined)
      
      inline def setHideDelay(value: Double): Self = StObject.set(x, "hideDelay", value.asInstanceOf[js.Any])
      
      inline def setHideDelayUndefined: Self = StObject.set(x, "hideDelay", js.undefined)
      
      inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      inline def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setIsForceOpened(value: Boolean): Self = StObject.set(x, "isForceOpened", value.asInstanceOf[js.Any])
      
      inline def setIsForceOpenedUndefined: Self = StObject.set(x, "isForceOpened", js.undefined)
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setShowDelay(value: Double): Self = StObject.set(x, "showDelay", value.asInstanceOf[js.Any])
      
      inline def setShowDelayUndefined: Self = StObject.set(x, "showDelay", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait HorizontalMenuItemState extends StObject {
    
    var isOpen: Boolean
  }
  object HorizontalMenuItemState {
    
    inline def apply(isOpen: Boolean): HorizontalMenuItemState = {
      val __obj = js.Dynamic.literal(isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuItemState]
    }
    
    extension [Self <: HorizontalMenuItemState](x: Self) {
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
