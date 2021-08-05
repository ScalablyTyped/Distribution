package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Autostem extends StObject {
  
  var auto_stem: js.UndefOr[Boolean] = js.undefined
  
  var clef: js.UndefOr[String] = js.undefined
  
  var dots: js.UndefOr[Double] = js.undefined
  
  var duration: String
  
  var keys: js.Array[String]
  
  var octave_shift: js.UndefOr[Double] = js.undefined
  
  var slash: js.UndefOr[Boolean] = js.undefined
  
  var stem_direction: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object Autostem {
  
  inline def apply(duration: String, keys: js.Array[String]): Autostem = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autostem]
  }
  
  extension [Self <: Autostem](x: Self) {
    
    inline def setAuto_stem(value: Boolean): Self = StObject.set(x, "auto_stem", value.asInstanceOf[js.Any])
    
    inline def setAuto_stemUndefined: Self = StObject.set(x, "auto_stem", js.undefined)
    
    inline def setClef(value: String): Self = StObject.set(x, "clef", value.asInstanceOf[js.Any])
    
    inline def setClefUndefined: Self = StObject.set(x, "clef", js.undefined)
    
    inline def setDots(value: Double): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    inline def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    inline def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    inline def setOctave_shift(value: Double): Self = StObject.set(x, "octave_shift", value.asInstanceOf[js.Any])
    
    inline def setOctave_shiftUndefined: Self = StObject.set(x, "octave_shift", js.undefined)
    
    inline def setSlash(value: Boolean): Self = StObject.set(x, "slash", value.asInstanceOf[js.Any])
    
    inline def setSlashUndefined: Self = StObject.set(x, "slash", js.undefined)
    
    inline def setStem_direction(value: Double): Self = StObject.set(x, "stem_direction", value.asInstanceOf[js.Any])
    
    inline def setStem_directionUndefined: Self = StObject.set(x, "stem_direction", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
