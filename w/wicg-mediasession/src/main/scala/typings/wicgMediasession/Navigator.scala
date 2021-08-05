package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val mediaSession: js.UndefOr[MediaSession] = js.undefined
}
object Navigator {
  
  inline def apply(): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setMediaSession(value: MediaSession): Self = StObject.set(x, "mediaSession", value.asInstanceOf[js.Any])
    
    inline def setMediaSessionUndefined: Self = StObject.set(x, "mediaSession", js.undefined)
  }
}
