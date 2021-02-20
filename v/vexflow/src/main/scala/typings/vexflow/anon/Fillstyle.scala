package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fillstyle extends StObject {
  
  var fill_style: js.UndefOr[String] = js.native
  
  var glyph_spacing_px: js.UndefOr[Double] = js.native
  
  var num_lines: js.UndefOr[Double] = js.native
  
  var space_above_staff_ln: js.UndefOr[Double] = js.native
  
  var space_below_staff_ln: js.UndefOr[Double] = js.native
  
  var spacing_between_lines_px: js.UndefOr[Double] = js.native
  
  var top_text_position: js.UndefOr[Double] = js.native
  
  var vertical_bar_width: js.UndefOr[Double] = js.native
}
object Fillstyle {
  
  @scala.inline
  def apply(): Fillstyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Fillstyle]
  }
  
  @scala.inline
  implicit class FillstyleMutableBuilder[Self <: Fillstyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFill_style(value: String): Self = StObject.set(x, "fill_style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFill_styleUndefined: Self = StObject.set(x, "fill_style", js.undefined)
    
    @scala.inline
    def setGlyph_spacing_px(value: Double): Self = StObject.set(x, "glyph_spacing_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyph_spacing_pxUndefined: Self = StObject.set(x, "glyph_spacing_px", js.undefined)
    
    @scala.inline
    def setNum_lines(value: Double): Self = StObject.set(x, "num_lines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_linesUndefined: Self = StObject.set(x, "num_lines", js.undefined)
    
    @scala.inline
    def setSpace_above_staff_ln(value: Double): Self = StObject.set(x, "space_above_staff_ln", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace_above_staff_lnUndefined: Self = StObject.set(x, "space_above_staff_ln", js.undefined)
    
    @scala.inline
    def setSpace_below_staff_ln(value: Double): Self = StObject.set(x, "space_below_staff_ln", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpace_below_staff_lnUndefined: Self = StObject.set(x, "space_below_staff_ln", js.undefined)
    
    @scala.inline
    def setSpacing_between_lines_px(value: Double): Self = StObject.set(x, "spacing_between_lines_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing_between_lines_pxUndefined: Self = StObject.set(x, "spacing_between_lines_px", js.undefined)
    
    @scala.inline
    def setTop_text_position(value: Double): Self = StObject.set(x, "top_text_position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTop_text_positionUndefined: Self = StObject.set(x, "top_text_position", js.undefined)
    
    @scala.inline
    def setVertical_bar_width(value: Double): Self = StObject.set(x, "vertical_bar_width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertical_bar_widthUndefined: Self = StObject.set(x, "vertical_bar_width", js.undefined)
  }
}
