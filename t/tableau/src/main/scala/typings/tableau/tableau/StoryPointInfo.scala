package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StoryPointInfo extends js.Object {
  /** Gets the content of the textual description for this story point. */
  def getCaption(): String = js.native
  /** Gets the zero-based index of this story point within the parent Story sheet. */
  def getIndex(): Double = js.native
  /** Gets a value indicating whether the story point is the currently active point in the story. */
  def getIsActive(): Boolean = js.native
  /** Gets a value indicating whether the story point is updated, meaning that there are no changes from the last time the story point was “captured”. */
  def getIsUpdated(): Boolean = js.native
  /** Gets the Story object that contains the story point. */
  def getParentStory(): Story = js.native
}

object StoryPointInfo {
  @scala.inline
  def apply(
    getCaption: () => String,
    getIndex: () => Double,
    getIsActive: () => Boolean,
    getIsUpdated: () => Boolean,
    getParentStory: () => Story
  ): StoryPointInfo = {
    val __obj = js.Dynamic.literal(getCaption = js.Any.fromFunction0(getCaption), getIndex = js.Any.fromFunction0(getIndex), getIsActive = js.Any.fromFunction0(getIsActive), getIsUpdated = js.Any.fromFunction0(getIsUpdated), getParentStory = js.Any.fromFunction0(getParentStory))
    __obj.asInstanceOf[StoryPointInfo]
  }
  @scala.inline
  implicit class StoryPointInfoOps[Self <: StoryPointInfo] (val x: Self) extends AnyVal {
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
    def setGetCaption(value: () => String): Self = this.set("getCaption", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIndex(value: () => Double): Self = this.set("getIndex", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsActive(value: () => Boolean): Self = this.set("getIsActive", js.Any.fromFunction0(value))
    @scala.inline
    def setGetIsUpdated(value: () => Boolean): Self = this.set("getIsUpdated", js.Any.fromFunction0(value))
    @scala.inline
    def setGetParentStory(value: () => Story): Self = this.set("getParentStory", js.Any.fromFunction0(value))
  }
  
}

