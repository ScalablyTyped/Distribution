package typings.winrtUwp.Windows.Media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait MediaPlaybackStatus extends StObject
/** Defines values for the status of the media playback. */
@JSGlobal("Windows.Media.MediaPlaybackStatus")
@js.native
object MediaPlaybackStatus extends StObject {
  
  /** The media is changing. */
  @js.native
  sealed trait changing extends MediaPlaybackStatus
  
  /** The media is closd. */
  @js.native
  sealed trait closed extends MediaPlaybackStatus
  
  /** The media is paused. */
  @js.native
  sealed trait paused extends MediaPlaybackStatus
  
  /** The media is playing. */
  @js.native
  sealed trait playing extends MediaPlaybackStatus
  
  /** The media is stopped. */
  @js.native
  sealed trait stopped extends MediaPlaybackStatus
}
