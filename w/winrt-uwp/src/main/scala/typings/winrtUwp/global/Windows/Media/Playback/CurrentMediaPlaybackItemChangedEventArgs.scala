package typings.winrtUwp.global.Windows.Media.Playback

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the MediaPlaybackList::CurrentItemChanged event. */
@JSGlobal("Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs")
@js.native
abstract class CurrentMediaPlaybackItemChangedEventArgs ()
  extends typings.winrtUwp.Windows.Media.Playback.CurrentMediaPlaybackItemChangedEventArgs {
  /** Gets the new current MediaPlaybackItem . */
  /* CompleteClass */
  override var newItem: typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
  /** Gets the previous current MediaPlaybackItem . */
  /* CompleteClass */
  override var oldItem: typings.winrtUwp.Windows.Media.Playback.MediaPlaybackItem = js.native
}

