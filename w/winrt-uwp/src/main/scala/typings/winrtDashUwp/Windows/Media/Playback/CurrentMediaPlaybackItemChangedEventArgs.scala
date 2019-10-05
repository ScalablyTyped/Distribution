package typings.winrtDashUwp.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::CurrentItemChanged event. */
@JSGlobal("Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs")
@js.native
abstract class CurrentMediaPlaybackItemChangedEventArgs () extends js.Object {
  /** Gets the new current MediaPlaybackItem . */
  var newItem: MediaPlaybackItem = js.native
  /** Gets the previous current MediaPlaybackItem . */
  var oldItem: MediaPlaybackItem = js.native
}

