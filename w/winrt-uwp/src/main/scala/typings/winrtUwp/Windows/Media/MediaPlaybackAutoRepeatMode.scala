package typings.winrtUwp.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlaybackAutoRepeatMode extends js.Object
/** Specifies the auto repeat mode for media playback. */
@JSGlobal("Windows.Media.MediaPlaybackAutoRepeatMode")
@js.native
object MediaPlaybackAutoRepeatMode extends js.Object {
  
  /** Repeat the current list of tracks. */
  @js.native
  sealed trait list extends MediaPlaybackAutoRepeatMode
  
  /** No repeating. */
  @js.native
  sealed trait none extends MediaPlaybackAutoRepeatMode
  
  /** Repeat the current track. */
  @js.native
  sealed trait track extends MediaPlaybackAutoRepeatMode
}
