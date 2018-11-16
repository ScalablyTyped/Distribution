package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

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
  var errorMessage: java.lang.String = js.native
  /** Gets an HResult that indicates any extra data about the error that occurred. */
  var extendedErrorCode: winrtDashUwpLib.WindowsNs.WinRTError = js.native
}

