package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Codehead extends StObject {
  
  var code_head: js.UndefOr[String] = js.undefined
  
  var dot_shiftY: Double
  
  var flag: Boolean
  
  var gracenote_stem_down_extension: Double
  
  var gracenote_stem_up_extension: Double
  
  var head_width: Double
  
  var line_above: Double
  
  var line_below: Double
  
  var position: js.UndefOr[String] = js.undefined
  
  var rest: js.UndefOr[Boolean] = js.undefined
  
  var stem: Boolean
  
  var stem_down_extension: Double
  
  var stem_offset: Double
  
  var stem_up_extension: Double
  
  var tabnote_stem_down_extension: Double
  
  var tabnote_stem_up_extension: Double
}
object Codehead {
  
  inline def apply(
    dot_shiftY: Double,
    flag: Boolean,
    gracenote_stem_down_extension: Double,
    gracenote_stem_up_extension: Double,
    head_width: Double,
    line_above: Double,
    line_below: Double,
    stem: Boolean,
    stem_down_extension: Double,
    stem_offset: Double,
    stem_up_extension: Double,
    tabnote_stem_down_extension: Double,
    tabnote_stem_up_extension: Double
  ): Codehead = {
    val __obj = js.Dynamic.literal(dot_shiftY = dot_shiftY.asInstanceOf[js.Any], flag = flag.asInstanceOf[js.Any], gracenote_stem_down_extension = gracenote_stem_down_extension.asInstanceOf[js.Any], gracenote_stem_up_extension = gracenote_stem_up_extension.asInstanceOf[js.Any], head_width = head_width.asInstanceOf[js.Any], line_above = line_above.asInstanceOf[js.Any], line_below = line_below.asInstanceOf[js.Any], stem = stem.asInstanceOf[js.Any], stem_down_extension = stem_down_extension.asInstanceOf[js.Any], stem_offset = stem_offset.asInstanceOf[js.Any], stem_up_extension = stem_up_extension.asInstanceOf[js.Any], tabnote_stem_down_extension = tabnote_stem_down_extension.asInstanceOf[js.Any], tabnote_stem_up_extension = tabnote_stem_up_extension.asInstanceOf[js.Any])
    __obj.asInstanceOf[Codehead]
  }
  
  extension [Self <: Codehead](x: Self) {
    
    inline def setCode_head(value: String): Self = StObject.set(x, "code_head", value.asInstanceOf[js.Any])
    
    inline def setCode_headUndefined: Self = StObject.set(x, "code_head", js.undefined)
    
    inline def setDot_shiftY(value: Double): Self = StObject.set(x, "dot_shiftY", value.asInstanceOf[js.Any])
    
    inline def setFlag(value: Boolean): Self = StObject.set(x, "flag", value.asInstanceOf[js.Any])
    
    inline def setGracenote_stem_down_extension(value: Double): Self = StObject.set(x, "gracenote_stem_down_extension", value.asInstanceOf[js.Any])
    
    inline def setGracenote_stem_up_extension(value: Double): Self = StObject.set(x, "gracenote_stem_up_extension", value.asInstanceOf[js.Any])
    
    inline def setHead_width(value: Double): Self = StObject.set(x, "head_width", value.asInstanceOf[js.Any])
    
    inline def setLine_above(value: Double): Self = StObject.set(x, "line_above", value.asInstanceOf[js.Any])
    
    inline def setLine_below(value: Double): Self = StObject.set(x, "line_below", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setRest(value: Boolean): Self = StObject.set(x, "rest", value.asInstanceOf[js.Any])
    
    inline def setRestUndefined: Self = StObject.set(x, "rest", js.undefined)
    
    inline def setStem(value: Boolean): Self = StObject.set(x, "stem", value.asInstanceOf[js.Any])
    
    inline def setStem_down_extension(value: Double): Self = StObject.set(x, "stem_down_extension", value.asInstanceOf[js.Any])
    
    inline def setStem_offset(value: Double): Self = StObject.set(x, "stem_offset", value.asInstanceOf[js.Any])
    
    inline def setStem_up_extension(value: Double): Self = StObject.set(x, "stem_up_extension", value.asInstanceOf[js.Any])
    
    inline def setTabnote_stem_down_extension(value: Double): Self = StObject.set(x, "tabnote_stem_down_extension", value.asInstanceOf[js.Any])
    
    inline def setTabnote_stem_up_extension(value: Double): Self = StObject.set(x, "tabnote_stem_up_extension", value.asInstanceOf[js.Any])
  }
}
