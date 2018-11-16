package typings
package wicgDashMediasessionLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MediaSession extends js.Object {
  // Current media session meta data.
  var metadata: MediaMetadata | scala.Null = js.native
  // Current media session playback state.
  var playbackState: MediaSessionPlaybackState = js.native
  // Set/Unset actions handlers.
  def setActionHandler(action: MediaSessionAction): scala.Unit = js.native
  // Set/Unset actions handlers.
  def setActionHandler(action: MediaSessionAction, listener: js.Function0[scala.Unit]): scala.Unit = js.native
}

