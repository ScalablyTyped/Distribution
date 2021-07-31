package typings.wixUiCore

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.FC
import typings.react.mod.RefObject
import typings.std.HTMLDivElement
import typings.wixUiCore.anon.ColumnsNumber
import typings.wixUiCore.anon.PickPickHorizontalMenuCol
import typings.wixUiCore.anon.Styles
import typings.wixUiCore.horizontalMenuContextMod.HorizontalMenuContextValue
import typings.wixUiCore.horizontalMenuItemContextMod.HorizontalMenuItemContextValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod extends Shortcut {
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", JSImport.Default)
  @js.native
  val default: FC[PickPickHorizontalMenuCol] = js.native
  
  @js.native
  sealed trait ColumnsAlignment extends StObject
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "ColumnsAlignment")
  @js.native
  object ColumnsAlignment extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ColumnsAlignment & String] = js.native
    
    @js.native
    sealed trait Center
      extends StObject
         with ColumnsAlignment
    /* "center" */ val Center: typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Center & String = js.native
    
    @js.native
    sealed trait Justify
      extends StObject
         with ColumnsAlignment
    /* "justify" */ val Justify: typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Justify & String = js.native
    
    @js.native
    sealed trait Left
      extends StObject
         with ColumnsAlignment
    /* "left" */ val Left: typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Left & String = js.native
    
    @js.native
    sealed trait Right
      extends StObject
         with ColumnsAlignment
    /* "right" */ val Right: typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment.Right & String = js.native
  }
  
  @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout")
  @js.native
  class HorizontalMenuColumnsLayout protected ()
    extends Component[HorizontalMenuColumnsLayoutProps, HorizontalMenuColumnsLayoutState, js.Any] {
    def this(props: HorizontalMenuColumnsLayoutProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HorizontalMenuColumnsLayoutProps, context: js.Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MHorizontalMenuColumnsLayout(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MHorizontalMenuColumnsLayout(prevProps: HorizontalMenuColumnsLayoutProps): Unit = js.native
    
    var layoutRef: RefObject[HTMLDivElement] = js.native
    
    def recalculatePositions(): Unit = js.native
    
    @JSName("state")
    var state_HorizontalMenuColumnsLayout: Styles = js.native
  }
  /* static members */
  object HorizontalMenuColumnsLayout {
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout.defaultProps")
    @js.native
    def defaultProps: ColumnsNumber = js.native
    @scala.inline
    def defaultProps_=(x: ColumnsNumber): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
    
    @JSImport("wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout/HorizontalMenuColumnsLayout", "HorizontalMenuColumnsLayout.displayName")
    @js.native
    def displayName: String = js.native
    @scala.inline
    def displayName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("displayName")(x.asInstanceOf[js.Any])
  }
  
  trait HorizontalMenuColumnsLayoutProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var columnGap: js.UndefOr[Double] = js.undefined
    
    var columns: js.UndefOr[Double] = js.undefined
    
    var columnsAlignment: js.UndefOr[ColumnsAlignment] = js.undefined
    
    var maxOverflowWidth: js.UndefOr[Double] = js.undefined
    
    var menuContext: HorizontalMenuContextValue
    
    var menuItemContext: HorizontalMenuItemContextValue
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HorizontalMenuColumnsLayoutProps {
    
    @scala.inline
    def apply(menuContext: HorizontalMenuContextValue, menuItemContext: HorizontalMenuItemContextValue): HorizontalMenuColumnsLayoutProps = {
      val __obj = js.Dynamic.literal(menuContext = menuContext.asInstanceOf[js.Any], menuItemContext = menuItemContext.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuColumnsLayoutProps]
    }
    
    @scala.inline
    implicit class HorizontalMenuColumnsLayoutPropsMutableBuilder[Self <: HorizontalMenuColumnsLayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
      
      @scala.inline
      def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsAlignment(value: ColumnsAlignment): Self = StObject.set(x, "columnsAlignment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColumnsAlignmentUndefined: Self = StObject.set(x, "columnsAlignment", js.undefined)
      
      @scala.inline
      def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
      
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
  
  trait HorizontalMenuColumnsLayoutState extends StObject {
    
    var styles: CSSProperties
  }
  object HorizontalMenuColumnsLayoutState {
    
    @scala.inline
    def apply(styles: CSSProperties): HorizontalMenuColumnsLayoutState = {
      val __obj = js.Dynamic.literal(styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[HorizontalMenuColumnsLayoutState]
    }
    
    @scala.inline
    implicit class HorizontalMenuColumnsLayoutStateMutableBuilder[Self <: HorizontalMenuColumnsLayoutState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: CSSProperties): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[PickPickHorizontalMenuCol]
  
  /* This means you don't have to write `default`, but can instead just say `horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.foo` */
  override def _to: FC[PickPickHorizontalMenuCol] = default
}
