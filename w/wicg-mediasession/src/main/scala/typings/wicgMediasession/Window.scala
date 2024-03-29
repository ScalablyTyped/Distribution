package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Window extends StObject {
  
  var MediaSession: js.UndefOr[typings.wicgMediasession.MediaSession] = js.undefined
}
object Window {
  
  inline def apply(): Window = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Window]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Window] (val x: Self) extends AnyVal {
    
    inline def setMediaSession(value: MediaSession): Self = StObject.set(x, "MediaSession", value.asInstanceOf[js.Any])
    
    inline def setMediaSessionUndefined: Self = StObject.set(x, "MediaSession", js.undefined)
  }
}
