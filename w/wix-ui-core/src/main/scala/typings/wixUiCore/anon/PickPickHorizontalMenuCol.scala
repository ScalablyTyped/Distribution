package typings.wixUiCore.anon

import typings.react.mod.CSSProperties
import typings.wixUiCore.horizontalMenuColumnsLayoutHorizontalMenuColumnsLayoutMod.ColumnsAlignment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<std.Pick<wix-ui-core.wix-ui-core/dist/src/components/horizontal-menu/horizontal-menu-columns-layout.HorizontalMenuColumnsLayoutProps, 'style' | 'className' | 'menuContext' | 'maxOverflowWidth' | 'columnGap' | 'columns' | 'columnsAlignment'>, 'style' | 'className' | 'maxOverflowWidth' | 'columnGap' | 'columns' | 'columnsAlignment'> */
trait PickPickHorizontalMenuCol extends StObject {
  
  var className: js.UndefOr[String] = js.undefined
  
  var columnGap: js.UndefOr[Double] = js.undefined
  
  var columns: js.UndefOr[Double] = js.undefined
  
  var columnsAlignment: js.UndefOr[ColumnsAlignment] = js.undefined
  
  var maxOverflowWidth: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[CSSProperties] = js.undefined
}
object PickPickHorizontalMenuCol {
  
  @scala.inline
  def apply(): PickPickHorizontalMenuCol = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickPickHorizontalMenuCol]
  }
  
  @scala.inline
  implicit class PickPickHorizontalMenuColMutableBuilder[Self <: PickPickHorizontalMenuCol] (val x: Self) extends AnyVal {
    
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
    def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
  }
}
