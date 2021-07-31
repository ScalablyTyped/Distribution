package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Linethickness extends StObject {
  
  var line: Double
  
  var line_thickness: js.Any
  
  var number_glyph_point: js.Any
  
  var number_line: Double
  
  var padding_left: js.Any
  
  var padding_right: js.Any
  
  var semibrave_rest_glyph_scale: Double
  
  var serif_thickness: Double
  
  var show_number: Boolean
  
  var spacing_between_lines_px: Double
  
  var symbol_spacing: js.Any
  
  var use_symbols: Boolean
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
  implicit class LinethicknessMutableBuilder[Self <: Linethickness] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLine_thickness(value: js.Any): Self = StObject.set(x, "line_thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_glyph_point(value: js.Any): Self = StObject.set(x, "number_glyph_point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumber_line(value: Double): Self = StObject.set(x, "number_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding_left(value: js.Any): Self = StObject.set(x, "padding_left", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPadding_right(value: js.Any): Self = StObject.set(x, "padding_right", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSemibrave_rest_glyph_scale(value: Double): Self = StObject.set(x, "semibrave_rest_glyph_scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerif_thickness(value: Double): Self = StObject.set(x, "serif_thickness", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShow_number(value: Boolean): Self = StObject.set(x, "show_number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpacing_between_lines_px(value: Double): Self = StObject.set(x, "spacing_between_lines_px", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol_spacing(value: js.Any): Self = StObject.set(x, "symbol_spacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUse_symbols(value: Boolean): Self = StObject.set(x, "use_symbols", value.asInstanceOf[js.Any])
  }
}
