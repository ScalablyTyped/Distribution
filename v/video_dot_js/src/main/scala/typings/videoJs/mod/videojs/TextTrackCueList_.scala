package typings.videoJs.mod.videojs

import org.scalablytyped.runtime.NumberDictionary
import typings.videoJs.mod.videojs.TextTrackCueList.TextTrackCue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * A List of TextTrackCues.
  *
  * @see [Spec]{@link https://html.spec.whatwg.org/multipage/embedded-content.html#texttrackcuelist}
  */
trait TextTrackCueList_
  extends /**
  * Index getters for the cues.
  *
  * @param index
  */
/* index */ NumberDictionary[TextTrackCue] {
  /**
    * The current number of `TextTrackCue`s in the TextTrackCueList.
    */
  var length: Double
  /**
    * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
    *
    * @param id
    *        The id of the cue that should be searched for.
    *
    * @return A single cue or null if none was found.
    */
  def getCueById(id: String): TextTrackCue
}

object TextTrackCueList_ {
  @scala.inline
  def apply(
    getCueById: String => TextTrackCue,
    length: Double,
    NumberDictionary: /**
    * Index getters for the cues.
    *
    * @param index
    */
  /* index */ NumberDictionary[TextTrackCue] = null
  ): TextTrackCueList_ = {
    val __obj = js.Dynamic.literal(getCueById = js.Any.fromFunction1(getCueById), length = length.asInstanceOf[js.Any])
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    __obj.asInstanceOf[TextTrackCueList_]
  }
}

