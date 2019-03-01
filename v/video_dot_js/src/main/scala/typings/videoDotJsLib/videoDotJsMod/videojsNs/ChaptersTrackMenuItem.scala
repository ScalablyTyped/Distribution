package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The chapter track menu item
	 */
@js.native
trait ChaptersTrackMenuItem extends MenuItem {
  var cue: videoDotJsLib.videoDotJsMod.videojsNs.TextTrackCueListNs.TextTrackCue = js.native
  var track: TextTrack = js.native
  /**
  		 * Update chapter menu item
  		 *
  		 * @param [event]
  		 *        The `cuechange` event that caused this function to run.
  		 *
  		 * @listens TextTrack#cuechange
  		 */
  def update(event: videoDotJsLib.videoDotJsMod.videojsNs.EventTargetNs.Event): scala.Unit = js.native
}

