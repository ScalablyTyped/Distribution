package typings.winrtUwp.global.Windows.Media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for the PlaybackPositionChangeRequested event. */
@JSGlobal("Windows.Media.PlaybackPositionChangeRequestedEventArgs")
@js.native
abstract class PlaybackPositionChangeRequestedEventArgs ()
  extends typings.winrtUwp.Windows.Media.PlaybackPositionChangeRequestedEventArgs {
  /** Gets a value indicating the requested offset into the media item. */
  /* CompleteClass */
  override var requestedPlaybackPosition: Double = js.native
}

