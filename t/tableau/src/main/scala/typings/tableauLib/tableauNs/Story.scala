package typings
package tableauLib.tableauNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("tableau.Story")
@js.native
class Story () extends Sheet {
  /** Activates the next story point if there is one. If the current story point is the last one, then is stays active. */
  def activateNextStoryPointAsync(): js.Promise[StoryPoint] = js.native
  /** Activates the previous story point if there is one. If the current story point is the first one, then it stays active. */
  def activatePreviousStoryPointAsync(): js.Promise[StoryPoint] = js.native
  /**
           * Activates the story point at the specified index and returns a promise of the activated StoryPoint.
           * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
           */
  def activateStoryPointAsync(index: scala.Double): js.Promise[StoryPoint] = js.native
  /** Gets the currently active story point. */
  def getActiveStoryPoint(): StoryPoint = js.native
  /**
           * Gets an array (not a collection) of StoryPointInfo objects.
           * Note that this is not a collection, since we don’t have a unique string key for a story point.
           * We only need ordinal access to the story points (by index).
           */
  def getStoryPointsInfo(): js.Array[StoryPointInfo] = js.native
  /**
           * Reverts the story point at the specified index and returns a promise of the reverted StoryPoint.
           * Throws a tableau.ErrorCode.INDEX_OUT_OF_RANGE error if the index is less than zero or greater than or equal to the number of story points in the array.
           */
  def revertStoryPointAsync(index: scala.Double): js.Promise[StoryPoint] = js.native
}

