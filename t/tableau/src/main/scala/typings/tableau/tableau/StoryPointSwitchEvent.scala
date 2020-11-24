package typings.tableau.tableau

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryPointSwitchEvent extends TableauEvent {
  
  /** Gets the StoryPoint that is currently active. */
  def getNewStoryPoint(): StoryPoint = js.native
  
  /**
    * Gets the StoryPointInfo that was active before the story point switch event occurred.
    * The returned object reflects the state of the story point before the switch occurred.
    * The returned object reflects the state of the story point after the switch occured.
    */
  def getOldStoryPointInfo(): StoryPointInfo = js.native
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
  
  @scala.inline
  implicit class StoryPointSwitchEventOps[Self <: StoryPointSwitchEvent] (val x: Self) extends AnyVal {
    
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
    def setGetNewStoryPoint(value: () => StoryPoint): Self = this.set("getNewStoryPoint", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetOldStoryPointInfo(value: () => StoryPointInfo): Self = this.set("getOldStoryPointInfo", js.Any.fromFunction0(value))
  }
}
