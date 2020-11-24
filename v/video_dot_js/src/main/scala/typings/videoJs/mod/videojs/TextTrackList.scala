package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current list of {@link TextTrack} for a media file.
  *
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttracklist}
  */
@js.native
trait TextTrackList extends TrackList {
  
  /**
    * Add a {@link TextTrack} to the `TextTrackList`
    *
    * @param track
    *        The text track to add to the list.
    *
    * @fires TrackList#addtrack
    */
  def addTrack(track: TextTrack): Unit = js.native
}
