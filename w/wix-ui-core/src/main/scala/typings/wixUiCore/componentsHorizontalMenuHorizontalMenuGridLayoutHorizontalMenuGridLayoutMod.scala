package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.wixUiCore.anon.PickPickHorizontalMenuGriClassName
import typings.wixUiCore.anon.Styles
import typings.wixUiCore.componentsHorizontalMenuHorizontalMenuContextMod.HorizontalMenuContextValue
import typings.wixUiCore.horizontalMenuHorizontalMenuItemHorizontalMenuItemContextMod.HorizontalMenuItemContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsHorizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuGriClassName] = js.native
  
  @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", "HorizontalMenuGridLayout")
  @js.native
  class HorizontalMenuGridLayout protected ()
    extends Component[HorizontalMenuGridLayoutProps, HorizontalMenuGridLayoutState, js.Any] {
    def this(props: HorizontalMenuGridLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuGridLayoutProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MHorizontalMenuGridLayout(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHorizontalMenuGridLayout(prevProps: HorizontalMenuGridLayoutProps): Unit = js.native
    
    var layoutRef: RefObject[HTMLDivElement] = js.native
    
    def recalculatePositions(): Unit = js.native
    
    @JSName("state")
    var state_HorizontalMenuGridLayout: Styles = js.native
  }
  /* static members */
  object HorizontalMenuGridLayout {
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", "HorizontalMenuGridLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/src/components/horizontal-menu/horizontal-menu-grid-layout/HorizontalMenuGridLayout", "HorizontalMenuGridLayout.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait HorizontalMenuGridLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var maxOverflowWidth: js.UndefOr[Double] = js.undefined
    
    var menuContext: HorizontalMenuContextValue
    
    var menuItemContext: HorizontalMenuItemContextValue
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HorizontalMenuGridLayoutProps {
    
    @scala.inline
    def apply(menuContext: HorizontalMenuContextValue, menuItemContext: HorizontalMenuItemContextValue): HorizontalMenuGridLayoutProps = {
      val __obj = js.Dynamic.literal(menuContext = menuContext.asInstanceOf[js.Any], menuItemContext = menuItemContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuGridLayoutProps]
    }
    
    @scala.inline
    implicit class HorizontalMenuGridLayoutPropsMutableBuilder[Self <: HorizontalMenuGridLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setMaxOverflowWidth(value: Double): Self = StObject.set(x, "maxOverflowWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxOverflowWidthUndefined: Self = StObject.set(x, "maxOverflowWidth", js.undefined)
      
      @scala.inline
      def setMenuContext(value: HorizontalMenuContextValue): Self = StObject.set(x, "menuContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMenuItemContext(value: HorizontalMenuItemContextValue): Self = StObject.set(x, "menuItemContext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait HorizontalMenuGridLayoutState extends StObject {
    
    var styles: CSSProperties
  }
  object HorizontalMenuGridLayoutState {
    
    @scala.inline
    def apply(styles: CSSProperties): HorizontalMenuGridLayoutState = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuGridLayoutState]
    }
    
    @scala.inline
    implicit class HorizontalMenuGridLayoutStateMutableBuilder[Self <: HorizontalMenuGridLayoutState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[PickPickHorizontalMenuGriClassName]
  
  /* This means you don't have to write `default`, but can instead just say `componentsHorizontalMenuHorizontalMenuGridLayoutHorizontalMenuGridLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuGriClassName] = default
}
