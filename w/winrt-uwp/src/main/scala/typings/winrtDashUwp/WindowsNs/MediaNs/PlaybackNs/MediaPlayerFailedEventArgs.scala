package typings.winrtDashUwp.WindowsNs.MediaNs.PlaybackNs

import typings.winrtDashUwp.WindowsNs.WinRTError
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides the data for MediaFailed events. */
@JSGlobal("Windows.Media.Playback.MediaPlayerFailedEventArgs")
@js.native
abstract class MediaPlayerFailedEventArgs () extends js.Object {
  /** Gets the MediaPlayerError value for the error that triggered the event. */
  var error: MediaPlayerError = js.native
  /** Gets a string describing the error that occurred. */
  var errorMessage: String = js.native
  /** Gets an HResult that indicates any extra data about the error that occurred. */
  var extendedErrorCode: WinRTError = js.native
}

