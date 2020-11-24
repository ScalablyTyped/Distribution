package typings.winrtUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlayerState extends js.Object
/** Indicates the possible states that the player can be in. */
@JSGlobal("Windows.Media.Playback.MediaPlayerState")
@js.native
object MediaPlayerState extends js.Object {
  
  /** The media player is buffering content. */
  @js.native
  sealed trait buffering extends MediaPlayerState
  
  /** The media player is closed. */
  @js.native
  sealed trait closed extends MediaPlayerState
  
  /** The media player is opening. */
  @js.native
  sealed trait opening extends MediaPlayerState
  
  /** The media player is paused. */
  @js.native
  sealed trait paused extends MediaPlayerState
  
  /** The media player is playing. */
  @js.native
  sealed trait playing extends MediaPlayerState
  
  /** Not implemented. */
  @js.native
  sealed trait stopped extends MediaPlayerState
}
