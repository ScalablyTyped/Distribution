package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Customglyphcode extends StObject {
  
  var custom_glyph_code: js.UndefOr[String] = js.undefined
  
  var displaced: js.UndefOr[Boolean] = js.undefined
  
  var duration: String
  
  var glyph_font_scale: js.UndefOr[Double] = js.undefined
  
  var line: Double
  
  var note_type: js.UndefOr[String] = js.undefined
  
  var slashed: js.UndefOr[Boolean] = js.undefined
  
  var stem_direction: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[String] = js.undefined
  
  var x: js.UndefOr[Double] = js.undefined
  
  var x_shift: Double
  
  var y: js.UndefOr[Double] = js.undefined
}
object Customglyphcode {
  
  inline def apply(duration: String, line: Double, x_shift: Double): Customglyphcode = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customglyphcode]
  }
  
  extension [Self <: Customglyphcode](x: Self) {
    
    inline def setCustom_glyph_code(value: String): Self = StObject.set(x, "custom_glyph_code", value.asInstanceOf[js.Any])
    
    inline def setCustom_glyph_codeUndefined: Self = StObject.set(x, "custom_glyph_code", js.undefined)
    
    inline def setDisplaced(value: Boolean): Self = StObject.set(x, "displaced", value.asInstanceOf[js.Any])
    
    inline def setDisplacedUndefined: Self = StObject.set(x, "displaced", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setGlyph_font_scale(value: Double): Self = StObject.set(x, "glyph_font_scale", value.asInstanceOf[js.Any])
    
    inline def setGlyph_font_scaleUndefined: Self = StObject.set(x, "glyph_font_scale", js.undefined)
    
    inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    inline def setNote_type(value: String): Self = StObject.set(x, "note_type", value.asInstanceOf[js.Any])
    
    inline def setNote_typeUndefined: Self = StObject.set(x, "note_type", js.undefined)
    
    inline def setSlashed(value: Boolean): Self = StObject.set(x, "slashed", value.asInstanceOf[js.Any])
    
    inline def setSlashedUndefined: Self = StObject.set(x, "slashed", js.undefined)
    
    inline def setStem_direction(value: Double): Self = StObject.set(x, "stem_direction", value.asInstanceOf[js.Any])
    
    inline def setStem_directionUndefined: Self = StObject.set(x, "stem_direction", js.undefined)
    
    inline def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setX_shift(value: Double): Self = StObject.set(x, "x_shift", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
