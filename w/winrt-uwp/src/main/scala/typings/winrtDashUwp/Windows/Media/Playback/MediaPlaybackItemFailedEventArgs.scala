package typings.winrtDashUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::ItemFailed event. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemFailedEventArgs")
@js.native
abstract class MediaPlaybackItemFailedEventArgs () extends js.Object {
  /** Gets a wrapper object for the MediaPlaybackItem error that provides high-level information about the cause of the error. */
  var error: MediaPlaybackItemError = js.native
  /** Gets the MediaPlaybackItem associated with the error. */
  var item: MediaPlaybackItem = js.native
}

