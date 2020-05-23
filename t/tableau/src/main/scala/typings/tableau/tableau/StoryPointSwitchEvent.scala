package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StoryPointSwitchEvent extends TableauEvent {
  /** Gets the StoryPoint that is currently active. */
  def getNewStoryPoint(): StoryPoint
  /**
    * Gets the StoryPointInfo that was active before the story point switch event occurred.
    * The returned object reflects the state of the story point before the switch occurred.
    * The returned object reflects the state of the story point after the switch occured.
    */
  def getOldStoryPointInfo(): StoryPointInfo
}

object StoryPointSwitchEvent {
  @scala.inline
  def apply(
    getEventName: () => TableauEventName,
    getNewStoryPoint: () => StoryPoint,
    getOldStoryPointInfo: () => StoryPointInfo,
    getViz: () => Viz
  ): StoryPointSwitchEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getNewStoryPoint = js.Any.fromFunction0(getNewStoryPoint), getOldStoryPointInfo = js.Any.fromFunction0(getOldStoryPointInfo), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[StoryPointSwitchEvent]
  }
}

