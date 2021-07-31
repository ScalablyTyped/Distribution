package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlaybackAutoRepeatMode extends StObject
/** Specifies the auto repeat mode for media playback. */
@JSGlobal("Windows.Media.MediaPlaybackAutoRepeatMode")
@js.native
object MediaPlaybackAutoRepeatMode extends StObject {
  
  /** Repeat the current list of tracks. */
  @js.native
  sealed trait list
    extends StObject
       with MediaPlaybackAutoRepeatMode
  
  /** No repeating. */
  @js.native
  sealed trait none
    extends StObject
       with MediaPlaybackAutoRepeatMode
  
  /** Repeat the current track. */
  @js.native
  sealed trait track
    extends StObject
       with MediaPlaybackAutoRepeatMode
}
