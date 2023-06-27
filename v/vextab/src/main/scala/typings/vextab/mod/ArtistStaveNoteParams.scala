package typings.vextab.mod

import typings.vexflow.mod.Flow.Note
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ArtistStaveNoteParams extends StObject {
  
  var accidentals: js.Array[Null | String]
  
  var is_rest: Boolean
  
  var play_note: Note
  
  var spec: js.Array[String]
}
object ArtistStaveNoteParams {
  
  inline def apply(accidentals: js.Array[Null | String], is_rest: Boolean, play_note: Note, spec: js.Array[String]): ArtistStaveNoteParams = {
    val __obj = js.Dynamic.literal(accidentals = accidentals.asInstanceOf[js.Any], is_rest = is_rest.asInstanceOf[js.Any], play_note = play_note.asInstanceOf[js.Any], spec = spec.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtistStaveNoteParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ArtistStaveNoteParams] (val x: Self) extends AnyVal {
    
    inline def setAccidentals(value: js.Array[Null | String]): Self = StObject.set(x, "accidentals", value.asInstanceOf[js.Any])
    
    inline def setAccidentalsVarargs(value: (Null | String)*): Self = StObject.set(x, "accidentals", js.Array(value*))
    
    inline def setIs_rest(value: Boolean): Self = StObject.set(x, "is_rest", value.asInstanceOf[js.Any])
    
    inline def setPlay_note(value: Note): Self = StObject.set(x, "play_note", value.asInstanceOf[js.Any])
    
    inline def setSpec(value: js.Array[String]): Self = StObject.set(x, "spec", value.asInstanceOf[js.Any])
    
    inline def setSpecVarargs(value: String*): Self = StObject.set(x, "spec", js.Array(value*))
  }
}
