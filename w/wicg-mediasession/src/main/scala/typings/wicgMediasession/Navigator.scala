package typings.wicgMediasession

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigator extends StObject {
  
  val mediaSession: js.UndefOr[MediaSession] = js.native
}
object Navigator {
  
  @scala.inline
  def apply(): Navigator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Navigator]
  }
  
  @scala.inline
  implicit class NavigatorMutableBuilder[Self <: Navigator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMediaSession(value: MediaSession): Self = StObject.set(x, "mediaSession", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaSessionUndefined: Self = StObject.set(x, "mediaSession", js.undefined)
  }
}
