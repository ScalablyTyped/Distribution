package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryPointSwitchEvent
  extends StObject
     with TableauEvent {
  
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
  
  inline def apply(
    getEventName: () => TableauEventName,
    getNewStoryPoint: () => StoryPoint,
    getOldStoryPointInfo: () => StoryPointInfo,
    getViz: () => Viz
  ): StoryPointSwitchEvent = {
    val __obj = js.Dynamic.literal(getEventName = js.Any.fromFunction0(getEventName), getNewStoryPoint = js.Any.fromFunction0(getNewStoryPoint), getOldStoryPointInfo = js.Any.fromFunction0(getOldStoryPointInfo), getViz = js.Any.fromFunction0(getViz))
    __obj.asInstanceOf[StoryPointSwitchEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StoryPointSwitchEvent] (val x: Self) extends AnyVal {
    
    inline def setGetNewStoryPoint(value: () => StoryPoint): Self = StObject.set(x, "getNewStoryPoint", js.Any.fromFunction0(value))
    
    inline def setGetOldStoryPointInfo(value: () => StoryPointInfo): Self = StObject.set(x, "getOldStoryPointInfo", js.Any.fromFunction0(value))
  }
}
