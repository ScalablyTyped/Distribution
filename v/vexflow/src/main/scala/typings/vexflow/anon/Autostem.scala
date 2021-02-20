package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Autostem extends StObject {
  
  var auto_stem: js.UndefOr[Boolean] = js.native
  
  var clef: js.UndefOr[String] = js.native
  
  var dots: js.UndefOr[Double] = js.native
  
  var duration: String = js.native
  
  var keys: js.Array[String] = js.native
  
  var octave_shift: js.UndefOr[Double] = js.native
  
  var slash: js.UndefOr[Boolean] = js.native
  
  var stem_direction: js.UndefOr[Double] = js.native
  
  var `type`: js.UndefOr[String] = js.native
}
object Autostem {
  
  @scala.inline
  def apply(duration: String, keys: js.Array[String]): Autostem = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any])
    __obj.asInstanceOf[Autostem]
  }
  
  @scala.inline
  implicit class AutostemMutableBuilder[Self <: Autostem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuto_stem(value: Boolean): Self = StObject.set(x, "auto_stem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuto_stemUndefined: Self = StObject.set(x, "auto_stem", js.undefined)
    
    @scala.inline
    def setClef(value: String): Self = StObject.set(x, "clef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClefUndefined: Self = StObject.set(x, "clef", js.undefined)
    
    @scala.inline
    def setDots(value: Double): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = StObject.set(x, "keys", js.Array(value :_*))
    
    @scala.inline
    def setOctave_shift(value: Double): Self = StObject.set(x, "octave_shift", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOctave_shiftUndefined: Self = StObject.set(x, "octave_shift", js.undefined)
    
    @scala.inline
    def setSlash(value: Boolean): Self = StObject.set(x, "slash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSlashUndefined: Self = StObject.set(x, "slash", js.undefined)
    
    @scala.inline
    def setStem_direction(value: Double): Self = StObject.set(x, "stem_direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStem_directionUndefined: Self = StObject.set(x, "stem_direction", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
