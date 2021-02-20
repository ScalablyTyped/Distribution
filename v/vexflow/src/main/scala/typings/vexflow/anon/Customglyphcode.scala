package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Customglyphcode extends StObject {
  
  var custom_glyph_code: js.UndefOr[String] = js.native
  
  var displaced: js.UndefOr[Boolean] = js.native
  
  var duration: String = js.native
  
  var glyph_font_scale: js.UndefOr[Double] = js.native
  
  var line: Double = js.native
  
  var note_type: js.UndefOr[String] = js.native
  
  var slashed: js.UndefOr[Boolean] = js.native
  
  var stem_direction: js.UndefOr[Double] = js.native
  
  var style: js.UndefOr[String] = js.native
  
  var x: js.UndefOr[Double] = js.native
  
  var x_shift: Double = js.native
  
  var y: js.UndefOr[Double] = js.native
}
object Customglyphcode {
  
  @scala.inline
  def apply(duration: String, line: Double, x_shift: Double): Customglyphcode = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any])
    __obj.asInstanceOf[Customglyphcode]
  }
  
  @scala.inline
  implicit class CustomglyphcodeMutableBuilder[Self <: Customglyphcode] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustom_glyph_code(value: String): Self = StObject.set(x, "custom_glyph_code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustom_glyph_codeUndefined: Self = StObject.set(x, "custom_glyph_code", js.undefined)
    
    @scala.inline
    def setDisplaced(value: Boolean): Self = StObject.set(x, "displaced", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplacedUndefined: Self = StObject.set(x, "displaced", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyph_font_scale(value: Double): Self = StObject.set(x, "glyph_font_scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGlyph_font_scaleUndefined: Self = StObject.set(x, "glyph_font_scale", js.undefined)
    
    @scala.inline
    def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote_type(value: String): Self = StObject.set(x, "note_type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote_typeUndefined: Self = StObject.set(x, "note_type", js.undefined)
    
    @scala.inline
    def setSlashed(value: Boolean): Self = StObject.set(x, "slashed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlashedUndefined: Self = StObject.set(x, "slashed", js.undefined)
    
    @scala.inline
    def setStem_direction(value: Double): Self = StObject.set(x, "stem_direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStem_directionUndefined: Self = StObject.set(x, "stem_direction", js.undefined)
    
    @scala.inline
    def setStyle(value: String): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    @scala.inline
    def setX_shift(value: Double): Self = StObject.set(x, "x_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
