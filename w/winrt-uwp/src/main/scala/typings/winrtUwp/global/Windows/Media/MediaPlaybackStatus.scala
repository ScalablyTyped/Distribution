package typings.winrtUwp.global.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines values for the status of the media playback. */
@JSGlobal("Windows.Media.MediaPlaybackStatus")
@js.native
object MediaPlaybackStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Media.MediaPlaybackStatus & Double] = js.native
  
  /* 1 */ val changing: typings.winrtUwp.Windows.Media.MediaPlaybackStatus.changing & Double = js.native
  
  /* 0 */ val closed: typings.winrtUwp.Windows.Media.MediaPlaybackStatus.closed & Double = js.native
  
  /* 4 */ val paused: typings.winrtUwp.Windows.Media.MediaPlaybackStatus.paused & Double = js.native
  
  /* 3 */ val playing: typings.winrtUwp.Windows.Media.MediaPlaybackStatus.playing & Double = js.native
  
  /* 2 */ val stopped: typings.winrtUwp.Windows.Media.MediaPlaybackStatus.stopped & Double = js.native
}
