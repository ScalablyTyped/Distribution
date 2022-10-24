package typings.wixStyleReact

import org.scalablytyped.runtime.Shortcut
import typings.csstype.mod.Property.AlignItems
import typings.csstype.mod.Property.Gap
import typings.csstype.mod.Property.GridAutoRows
import typings.csstype.mod.Property.JustifyItems
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesLayoutMod extends Shortcut {
  
  @JSImport("wix-style-react/dist/types/Layout", JSImport.Default)
  @js.native
  val default: FC[LayoutProps] = js.native
  
  @JSImport("wix-style-react/dist/types/Layout", "Cell")
  @js.native
  val Cell: FC[CellProps] = js.native
  
  @JSImport("wix-style-react/dist/types/Layout", "Layout")
  @js.native
  val Layout: FC[LayoutProps] = js.native
  
  trait CellProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var span: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object CellProps {
    
    inline def apply(): CellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CellProps]
    }
    
    extension [Self <: CellProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      inline def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait LayoutProps extends StObject {
    
    var alignItems: js.UndefOr[AlignItems] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cols: js.UndefOr[Double] = js.undefined
    
    var dataHook: js.UndefOr[String] = js.undefined
    
    var gap: js.UndefOr[Gap[String | Double]] = js.undefined
    
    var justifyItems: js.UndefOr[JustifyItems] = js.undefined
    
    var rowHeight: js.UndefOr[GridAutoRows[String | Double]] = js.undefined
  }
  object LayoutProps {
    
    inline def apply(): LayoutProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LayoutProps]
    }
    
    extension [Self <: LayoutProps](x: Self) {
      
      inline def setAlignItems(value: AlignItems): Self = StObject.set(x, "alignItems", value.asInstanceOf[js.Any])
      
      inline def setAlignItemsUndefined: Self = StObject.set(x, "alignItems", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      inline def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      inline def setDataHook(value: String): Self = StObject.set(x, "dataHook", value.asInstanceOf[js.Any])
      
      inline def setDataHookUndefined: Self = StObject.set(x, "dataHook", js.undefined)
      
      inline def setGap(value: Gap[String | Double]): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setGapUndefined: Self = StObject.set(x, "gap", js.undefined)
      
      inline def setJustifyItems(value: JustifyItems): Self = StObject.set(x, "justifyItems", value.asInstanceOf[js.Any])
      
      inline def setJustifyItemsUndefined: Self = StObject.set(x, "justifyItems", js.undefined)
      
      inline def setRowHeight(value: GridAutoRows[String | Double]): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
      
      inline def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
    }
  }
  
  type _To = FC[LayoutProps]
  
  /* This means you don't have to write `default`, but can instead just say `distTypesLayoutMod.foo` */
  override def _to: FC[LayoutProps] = default
}
