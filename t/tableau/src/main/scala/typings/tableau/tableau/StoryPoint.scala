package typings.tableau.tableau

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StoryPoint extends StObject {
  
  /** Gets the content of the textual description for this story point. */
  def getCaption(): String = js.native
  
  /** Gets the sheet that this story point contains. This will be null if the story point does not have a contained sheet. */
  def getContainedSheet(): Sheet = js.native
  
  /** Gets the zero-based index of this story point within the parent Story sheet. */
  def getIndex(): Double = js.native
  
  /** Gets a value indicating whether the story point is the currently active point in the story. */
  def getIsActive(): Boolean = js.native
  
  /** Gets a value indicating whether the story point is updated, meaning that there are no changes from the last time the story point was “captured”. */
  def getIsUpdated(): Boolean = js.native
  
  /** Gets the Story object that contains the story point. */
  def getParentStory(): Story = js.native
}
object StoryPoint {
  
  @scala.inline
  def apply(
    getCaption: () => String,
    getContainedSheet: () => Sheet,
    getIndex: () => Double,
    getIsActive: () => Boolean,
    getIsUpdated: () => Boolean,
    getParentStory: () => Story
  ): StoryPoint = {
    val __obj = js.Dynamic.literal(getCaption = js.Any.fromFunction0(getCaption), getContainedSheet = js.Any.fromFunction0(getContainedSheet), getIndex = js.Any.fromFunction0(getIndex), getIsActive = js.Any.fromFunction0(getIsActive), getIsUpdated = js.Any.fromFunction0(getIsUpdated), getParentStory = js.Any.fromFunction0(getParentStory))
    __obj.asInstanceOf[StoryPoint]
  }
  
  @scala.inline
  implicit class StoryPointMutableBuilder[Self <: StoryPoint] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCaption(value: () => String): Self = StObject.set(x, "getCaption", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetContainedSheet(value: () => Sheet): Self = StObject.set(x, "getContainedSheet", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIndex(value: () => Double): Self = StObject.set(x, "getIndex", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsActive(value: () => Boolean): Self = StObject.set(x, "getIsActive", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetIsUpdated(value: () => Boolean): Self = StObject.set(x, "getIsUpdated", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetParentStory(value: () => Story): Self = StObject.set(x, "getParentStory", js.Any.fromFunction0(value))
  }
}
