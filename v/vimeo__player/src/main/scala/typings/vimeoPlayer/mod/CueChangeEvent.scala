package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CueChangeEvent extends StObject {
  
  var cues: js.Array[Cue]
  
  var kind: TrackKind
  
  var label: String
  
  var language: String
}
object CueChangeEvent {
  
  inline def apply(cues: js.Array[Cue], kind: TrackKind, label: String, language: String): CueChangeEvent = {
    val __obj = js.Dynamic.literal(cues = cues.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any])
    __obj.asInstanceOf[CueChangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CueChangeEvent] (val x: Self) extends AnyVal {
    
    inline def setCues(value: js.Array[Cue]): Self = StObject.set(x, "cues", value.asInstanceOf[js.Any])
    
    inline def setCuesVarargs(value: Cue*): Self = StObject.set(x, "cues", js.Array(value*))
    
    inline def setKind(value: TrackKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
  }
}
