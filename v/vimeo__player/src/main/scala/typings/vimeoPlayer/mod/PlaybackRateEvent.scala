package typings.vimeoPlayer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaybackRateEvent extends StObject {
  
  var playbackRate: Double
}
object PlaybackRateEvent {
  
  inline def apply(playbackRate: Double): PlaybackRateEvent = {
    val __obj = js.Dynamic.literal(playbackRate = playbackRate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlaybackRateEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PlaybackRateEvent] (val x: Self) extends AnyVal {
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
  }
}
