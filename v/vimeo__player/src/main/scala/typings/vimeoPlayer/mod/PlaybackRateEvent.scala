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
  
  extension [Self <: PlaybackRateEvent](x: Self) {
    
    inline def setPlaybackRate(value: Double): Self = StObject.set(x, "playbackRate", value.asInstanceOf[js.Any])
  }
}
