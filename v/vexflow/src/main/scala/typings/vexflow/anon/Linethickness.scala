package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Linethickness extends js.Object {
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
}

