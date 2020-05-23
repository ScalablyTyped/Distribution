package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPointInfo extends js.Object {
  /** Gets the content of the textual description for this story point. */
  def getCaption(): String
  /** Gets the zero-based index of this story point within the parent Story sheet. */
  def getIndex(): Double
  /** Gets a value indicating whether the story point is the currently active point in the story. */
  def getIsActive(): Boolean
  /** Gets a value indicating whether the story point is updated, meaning that there are no changes from the last time the story point was “captured”. */
  def getIsUpdated(): Boolean
  /** Gets the Story object that contains the story point. */
  def getParentStory(): Story
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
}

