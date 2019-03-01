package typings
package videoDotJsLib.videoDotJsMod.videojsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Common functionaliy between {@link TextTrackList}, {@link AudioTrackList}, and
	 * {@link VideoTrackList}
	 */
@js.native
trait TrackList
  extends EventTarget
     with /* index */ org.scalablytyped.runtime.NumberDictionary[Track] {
  /**
  		 * The current number of `Track`s in the this Trackist.
  		 */
  var length: scala.Double = js.native
  /**
  		 * Add a {@link Track} to the `TrackList`
  		 *
  		 * @param track
  		 *        The audio, video, or text track to add to the list.
  		 *
  		 * @fires TrackList#addtrack
  		 */
  def addTrack(track: Track): scala.Unit = js.native
  /**
  		 * Remove a {@link Track} from the `TrackList`
  		 *
  		 * @param track
  		 *        The audio, video, or text track to remove from the list.
  		 *
  		 * @fires TrackList#removetrack
  		 */
  def removeTrack(track: Track): scala.Unit = js.native
}

