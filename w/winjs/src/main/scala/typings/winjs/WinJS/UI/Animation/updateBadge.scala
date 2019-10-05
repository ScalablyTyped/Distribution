package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.updateBadge")
@js.native
object updateBadge extends js.Object {
  /**
    * Performs an animation that updates a badge.
    * @param incoming Element or elements that comprise the new badge.
    * @param offset Initial offsets where incoming animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(incoming: js.Any): Promise[_] = js.native
  def apply(incoming: js.Any, offset: js.Any): Promise[_] = js.native
}

