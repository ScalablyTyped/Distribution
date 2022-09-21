package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * The current list of {@link VideojsAudioTrack} for a media file.
  *
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/media.html#audiotracklist}
  */
@js.native
trait AudioTrackList
  extends StObject
     with TrackList {
  
  /**
    * Add a {@link VideojsAudioTrack} to the `AudioTrackList`
    *
    * @param track
    *        The audio track to add to the list.
    *
    * @fires TrackList#addtrack
    */
  def addTrack(track: VideojsAudioTrack): Unit = js.native
}
