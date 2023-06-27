package typings.vextab.mod

import typings.vextab.vextabStrings.`false`
import typings.vextab.vextabStrings.`new`
import typings.vextab.vextabStrings.`true`
import typings.vextab.vextabStrings.alto
import typings.vextab.vextabStrings.bass
import typings.vextab.vextabStrings.bottom
import typings.vextab.vextabStrings.none
import typings.vextab.vextabStrings.percussion
import typings.vextab.vextabStrings.tenor
import typings.vextab.vextabStrings.top
import typings.vextab.vextabStrings.treble
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StaveOptions extends StObject {
  
  var clef: js.UndefOr[treble | bass | tenor | alto | percussion | none] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var notation: js.UndefOr[`true` | `false`] = js.undefined
  
  var strings: js.UndefOr[Double] = js.undefined
  
  var tablature: js.UndefOr[`true` | `false`] = js.undefined
  
  var time: js.UndefOr[String] = js.undefined
  
  var tuning: js.UndefOr[String] = js.undefined
  
  var voice: js.UndefOr[top | bottom | `new`] = js.undefined
}
object StaveOptions {
  
  inline def apply(): StaveOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaveOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StaveOptions] (val x: Self) extends AnyVal {
    
    inline def setClef(value: treble | bass | tenor | alto | percussion | none): Self = StObject.set(x, "clef", value.asInstanceOf[js.Any])
    
    inline def setClefUndefined: Self = StObject.set(x, "clef", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNotation(value: `true` | `false`): Self = StObject.set(x, "notation", value.asInstanceOf[js.Any])
    
    inline def setNotationUndefined: Self = StObject.set(x, "notation", js.undefined)
    
    inline def setStrings(value: Double): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setTablature(value: `true` | `false`): Self = StObject.set(x, "tablature", value.asInstanceOf[js.Any])
    
    inline def setTablatureUndefined: Self = StObject.set(x, "tablature", js.undefined)
    
    inline def setTime(value: String): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    
    inline def setTimeUndefined: Self = StObject.set(x, "time", js.undefined)
    
    inline def setTuning(value: String): Self = StObject.set(x, "tuning", value.asInstanceOf[js.Any])
    
    inline def setTuningUndefined: Self = StObject.set(x, "tuning", js.undefined)
    
    inline def setVoice(value: top | bottom | `new`): Self = StObject.set(x, "voice", value.asInstanceOf[js.Any])
    
    inline def setVoiceUndefined: Self = StObject.set(x, "voice", js.undefined)
  }
}
