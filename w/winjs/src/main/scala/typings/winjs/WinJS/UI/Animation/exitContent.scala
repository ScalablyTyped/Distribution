package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.exitContent")
@js.native
object exitContent extends js.Object {
  /**
    * Performs an animation that hides one or more elements on a page.
    * @param outgoing Element or elements that compose the outgoing content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(outgoing: js.Any): Promise[_] = js.native
  def apply(outgoing: js.Any, offset: js.Any): Promise[_] = js.native
}

