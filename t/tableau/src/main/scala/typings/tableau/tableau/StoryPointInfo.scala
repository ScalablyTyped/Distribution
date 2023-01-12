package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StoryPointInfo extends StObject {
  
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
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: StoryPointInfo] (val x: Self) extends AnyVal {
    
    inline def setGetCaption(value: () => String): Self = StObject.set(x, "getCaption", js.Any.fromFunction0(value))
    
    inline def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    inline def setGetIsActive(value: () => Boolean): Self = StObject.set(x, "getIsActive", js.Any.fromFunction0(value))
    
    inline def setGetIsUpdated(value: () => Boolean): Self = StObject.set(x, "getIsUpdated", js.Any.fromFunction0(value))
    
    inline def setGetParentStory(value: () => Story): Self = StObject.set(x, "getParentStory", js.Any.fromFunction0(value))
  }
}
