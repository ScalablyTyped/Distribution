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
@js.native
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
  var length: Double = js.native
  /**
    * Get a `TextTrackCue` that is currently in the `TextTrackCueList` by id.
    *
    * @param id
    *        The id of the cue that should be searched for.
    *
    * @return A single cue or null if none was found.
    */
  def getCueById(id: String): TextTrackCue = js.native
}

object TextTrackCueList_ {
  @scala.inline
  def apply(getCueById: String => TextTrackCue, length: Double): TextTrackCueList_ = {
    val __obj = js.Dynamic.literal(getCueById = js.Any.fromFunction1(getCueById), length = length.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextTrackCueList_]
  }
  @scala.inline
  implicit class TextTrackCueList_Ops[Self <: TextTrackCueList_] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetCueById(value: String => TextTrackCue): Self = this.set("getCueById", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

