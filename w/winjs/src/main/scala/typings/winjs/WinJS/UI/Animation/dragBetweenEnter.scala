package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.dragBetweenEnter")
@js.native
object dragBetweenEnter extends js.Object {
  /**
    * Performs an animation when a dragged object is moved such that dropping it in that position would move other items. The potentially affected items are animated out of the way to show where the object would be dropped.
    * @param target Element or elements that the dragged object would cause to be moved if it were dropped.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(target: js.Any): Promise[_] = js.native
  def apply(target: js.Any, offset: js.Any): Promise[_] = js.native
}

