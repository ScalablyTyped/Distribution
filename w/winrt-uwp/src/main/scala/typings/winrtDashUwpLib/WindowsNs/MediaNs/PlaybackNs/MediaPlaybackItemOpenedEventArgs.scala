package typings
package winrtDashUwpLib.WindowsNs.MediaNs.PlaybackNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::ItemOpened event. */
@JSGlobal("Windows.Media.Playback.MediaPlaybackItemOpenedEventArgs")
@js.native
abstract class MediaPlaybackItemOpenedEventArgs () extends js.Object {
  /** Gets the MediaPlaybackItem that was successfully opened. */
  var item: MediaPlaybackItem = js.native
}

