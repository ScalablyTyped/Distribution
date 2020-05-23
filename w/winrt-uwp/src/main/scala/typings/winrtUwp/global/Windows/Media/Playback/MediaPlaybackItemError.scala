package typings.winrtUwp.global.Windows.Media.Playback

import typings.winrtUwp.Windows.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an error that occurred trying to resolve a MediaPlaybackItem . */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemError")
@js.native
abstract class MediaPlaybackItemError ()
  extends typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItemError {
  /** Gets the error code associated with the playback item error. */
  /* CompleteClass */
  override var errorCode: typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItemErrorCode = js.native
  /** Gets the extended error code for the MediaPlaybackItem error. */
  /* CompleteClass */
  override var extendedError: WinRTError = js.native
}

