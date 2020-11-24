package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Linethickness extends js.Object {
  
  var line: Double = js.native
  
  var line_thickness: js.Any = js.native
  
  var number_glyph_point: js.Any = js.native
  
  var number_line: Double = js.native
  
  var padding_left: js.Any = js.native
  
  var padding_right: js.Any = js.native
  
  var semibrave_rest_glyph_scale: Double = js.native
  
  var serif_thickness: Double = js.native
  
  var show_number: Boolean = js.native
  
  var spacing_between_lines_px: Double = js.native
  
  var symbol_spacing: js.Any = js.native
  
  var use_symbols: Boolean = js.native
}
object Linethickness {
  
  @scala.inline
  def apply(
    line: Double,
    line_thickness: js.Any,
    number_glyph_point: js.Any,
    number_line: Double,
    padding_left: js.Any,
    padding_right: js.Any,
    semibrave_rest_glyph_scale: Double,
    serif_thickness: Double,
    show_number: Boolean,
    spacing_between_lines_px: Double,
    symbol_spacing: js.Any,
    use_symbols: Boolean
  ): Linethickness = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any], line_thickness = line_thickness.asInstanceOf[js.Any], number_glyph_point = number_glyph_point.asInstanceOf[js.Any], number_line = number_line.asInstanceOf[js.Any], padding_left = padding_left.asInstanceOf[js.Any], padding_right = padding_right.asInstanceOf[js.Any], semibrave_rest_glyph_scale = semibrave_rest_glyph_scale.asInstanceOf[js.Any], serif_thickness = serif_thickness.asInstanceOf[js.Any], show_number = show_number.asInstanceOf[js.Any], spacing_between_lines_px = spacing_between_lines_px.asInstanceOf[js.Any], symbol_spacing = symbol_spacing.asInstanceOf[js.Any], use_symbols = use_symbols.asInstanceOf[js.Any])
    __obj.asInstanceOf[Linethickness]
  }
  
  @scala.inline
  implicit class LinethicknessOps[Self <: Linethickness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLine(value: Double): Self = this.set("line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine_thickness(value: js.Any): Self = this.set("line_thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_glyph_point(value: js.Any): Self = this.set("number_glyph_point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_line(value: Double): Self = this.set("number_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding_left(value: js.Any): Self = this.set("padding_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding_right(value: js.Any): Self = this.set("padding_right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemibrave_rest_glyph_scale(value: Double): Self = this.set("semibrave_rest_glyph_scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerif_thickness(value: Double): Self = this.set("serif_thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_number(value: Boolean): Self = this.set("show_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing_between_lines_px(value: Double): Self = this.set("spacing_between_lines_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol_spacing(value: js.Any): Self = this.set("symbol_spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_symbols(value: Boolean): Self = this.set("use_symbols", value.asInstanceOf[js.Any])
  }
}
