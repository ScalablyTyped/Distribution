package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextTrackChangeEvent extends StObject {
  
  var kind: TrackKind | Null
  
  var label: String | Null
  
  var language: String | Null
}
object TextTrackChangeEvent {
  
  inline def apply(): TextTrackChangeEvent = {
    val __obj = js.Dynamic.literal(kind = null, label = null, language = null)
    __obj.asInstanceOf[TextTrackChangeEvent]
  }
  
  extension [Self <: TextTrackChangeEvent](x: Self) {
    
    inline def setKind(value: TrackKind): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindNull: Self = StObject.set(x, "kind", null)
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelNull: Self = StObject.set(x, "label", null)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageNull: Self = StObject.set(x, "language", null)
  }
}
