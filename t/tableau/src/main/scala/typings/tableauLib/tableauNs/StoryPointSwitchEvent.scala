package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.StoryPointSwitchEvent")
@js.native
class StoryPointSwitchEvent () extends TableauEvent {
  /** Gets the StoryPoint that is currently active. */
  def getNewStoryPoint(): StoryPoint = js.native
  /**
    * Gets the StoryPointInfo that was active before the story point switch event occurred.
    * The returned object reflects the state of the story point before the switch occurred.
    * The returned object reflects the state of the story point after the switch occured.
    */
  def getOldStoryPointInfo(): StoryPointInfo = js.native
}

