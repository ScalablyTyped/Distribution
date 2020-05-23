package typings.tableau.global.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.StoryPointSwitchEvent")
@js.native
class StoryPointSwitchEvent ()
  extends typings.tableau.tableau.StoryPointSwitchEvent {
  /** Gets the name of the event, which is a string, but is also one of the items in the TableauEventName enum. */
  /* CompleteClass */
  override def getEventName(): typings.tableau.tableau.TableauEventName = js.native
  /** Gets the StoryPoint that is currently active. */
  /* CompleteClass */
  override def getNewStoryPoint(): typings.tableau.tableau.StoryPoint = js.native
  /**
    * Gets the StoryPointInfo that was active before the story point switch event occurred.
    * The returned object reflects the state of the story point before the switch occurred.
    * The returned object reflects the state of the story point after the switch occured.
    */
  /* CompleteClass */
  override def getOldStoryPointInfo(): typings.tableau.tableau.StoryPointInfo = js.native
  /** Gets the Viz object associated with the event. */
  /* CompleteClass */
  override def getViz(): typings.tableau.tableau.Viz = js.native
}

