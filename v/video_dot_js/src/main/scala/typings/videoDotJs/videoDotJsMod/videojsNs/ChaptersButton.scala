package typings.videoDotJs.videoDotJsMod.videojsNs

import typings.videoDotJs.videoDotJsMod.videojsNs.EventTargetNs.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The button component for toggling and selecting chapters
	 * Chapters act much differently than other text tracks
	 * Cues are navigation vs. other tracks of alternative languages
	 */
@js.native
trait ChaptersButton extends TextTrackButton {
  /**
  		 * Find the track object that is currently in use by this ChaptersButton
  		 *
  		 * @return The current track or undefined if none was found.
  		 */
  def findChaptersTrack(): js.UndefOr[TextTrack] = js.native
  /**
  		 * Get the caption for the ChaptersButton based on the track label. This will also
  		 * use the current tracks localized kind as a fallback if a label does not exist.
  		 *
  		 * @return The tracks current label or the localized track kind.
  		 */
  def getMenuCaption(): String = js.native
  /**
  		 * Set the currently selected track for the chapters button.
  		 *
  		 * @param track
  		 *        The new track to select. Nothing will change if this is the currently selected
  		 *        track.
  		 */
  def setTrack(track: TextTrack): Unit = js.native
  def update(event: Event): Unit = js.native
}

