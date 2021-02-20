package typings.winrtUwp.Windows.Media.Playback

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlayerState extends StObject
/** Indicates the possible states that the player can be in. */
@JSGlobal("Windows.Media.Playback.MediaPlayerState")
@js.native
object MediaPlayerState extends StObject {
  
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
