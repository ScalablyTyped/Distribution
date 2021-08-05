package typings.wixUiCore.anon

import typings.react.mod.CSSProperties
import typings.wixUiCore.componentsHorizontalMenuHorizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Pick<wix-ui-core.wix-ui-core/src/components/horizontal-menu/horizontal-menu-columns-layout.HorizontalMenuColumnsLayoutProps, 'className' | 'style' | 'maxOverflowWidth' | 'menuContext' | 'columnGap' | 'columns' | 'columnsAlignment'>, 'className' | 'style' | 'maxOverflowWidth' | 'columnGap' | 'columns' | 'columnsAlignment'> */
trait PickPickHorizontalMenuColColumnGap extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var columnGap: js.UndefOr[Double] = js.undefined
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var columnsAlignment: js.UndefOr[ColumnsAlignment] = js.undefined
  
  var maxOverflowWidth: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PickPickHorizontalMenuColColumnGap {
  
  inline def apply(): PickPickHorizontalMenuColColumnGap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPickHorizontalMenuColColumnGap]
  }
  
  extension [Self <: PickPickHorizontalMenuColColumnGap](x: Self) {
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setColumnGap(value: Double): Self = StObject.set(x, "columnGap", value.asInstanceOf[js.Any])
    
    inline def setColumnGapUndefined: Self = StObject.set(x, "columnGap", js.undefined)
    
    inline def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
    
    inline def setColumnsAlignment(value: ColumnsAlignment): Self = StObject.set(x, "columnsAlignment", value.asInstanceOf[js.Any])
    
    inline def setColumnsAlignmentUndefined: Self = StObject.set(x, "columnsAlignment", js.undefined)
    
    inline def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
    
    inline def setMaxOverflowWidth(value: Double): Self = StObject.set(x, "maxOverflowWidth", value.asInstanceOf[js.Any])
    
    inline def setMaxOverflowWidthUndefined: Self = StObject.set(x, "maxOverflowWidth", js.undefined)
    
    inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
