package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Navigator extends StObject {
  
  val mediaSession: MediaSession
}
object Navigator {
  
  inline def apply(mediaSession: MediaSession): Navigator = {
    val __obj = js.Dynamic.literal(mediaSession = mediaSession.asInstanceOf[js.Any])
    __obj.asInstanceOf[Navigator]
  }
  
  extension [Self <: Navigator](x: Self) {
    
    inline def setMediaSession(value: MediaSession): Self = StObject.set(x, "mediaSession", value.asInstanceOf[js.Any])
  }
}
