package typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs

import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemError")
@js.native
abstract class MediaPlaybackItemError () extends js.Object {
  /** Gets the error code associated with the playback item error. */
  var errorCode: MediaPlaybackItemErrorCode = js.native
  /** Gets the extended error code for the MediaPlaybackItem error. */
  var extendedError: WinRTError = js.native
}

