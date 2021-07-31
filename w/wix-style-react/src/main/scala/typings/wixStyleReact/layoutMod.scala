package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.AlignItemsProperty
import typings.csstype.mod.GapProperty
import typings.csstype.mod.GridAutoRowsProperty
import typings.csstype.mod.JustifyItemsProperty
import typings.react.mod.ReactNode
import typings.react.mod.SFC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/es/src/Layout", JSImport.Default)
  @js.native
  val default: SFC[LayoutProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/Layout", "Cell")
  @js.native
  val Cell: SFC[CellProps] = js.native
  
  @JSImport("wix-style-react/dist/es/src/Layout", "Layout")
  @js.native
  val Layout: SFC[LayoutProps] = js.native
  
  trait CellProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var span: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object CellProps {
    
    @scala.inline
    def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    @scala.inline
    implicit class CellPropsMutableBuilder[Self <: CellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait LayoutProps extends StObject {
    
    var alignItems: js.UndefOr[AlignItemsProperty] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var gap: js.UndefOr[GapProperty[String | Double]] = js.undefined
    
    var justifyItems: js.UndefOr[JustifyItemsProperty] = js.undefined
    
    var rowHeight: js.UndefOr[GridAutoRowsProperty[String | Double]] = js.undefined
  }
  object LayoutProps {
    
    @scala.inline
    def apply(): LayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutProps]
    }
    
    @scala.inline
    implicit class LayoutPropsMutableBuilder[Self <: LayoutProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlignItems(value: AlignItemsProperty): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      @scala.inline
      def setGap(value: GapProperty[String | Double]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      @scala.inline
      def setJustifyItems(value: JustifyItemsProperty): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      @scala.inline
      def setRowHeight(value: GridAutoRowsProperty[String | Double]): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  type _To = SFC[LayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `layoutMod.foo` */
  override def _to: SFC[LayoutProps] = default
}
