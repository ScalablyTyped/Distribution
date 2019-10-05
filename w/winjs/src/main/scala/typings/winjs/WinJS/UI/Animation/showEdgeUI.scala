package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.showEdgeUI")
@js.native
object showEdgeUI extends js.Object {
  /**
    * Performs an animation that slides a narrow, edge-based user interface (UI) into view.
    * @param element Element or elements that are being shown.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Offsets should be the chosen so that the elements begin the animation from just off-screen. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(element: js.Any): Promise[_] = js.native
  def apply(element: js.Any, offset: js.Any): Promise[_] = js.native
  def apply(element: js.Any, offset: js.Any, options: js.Any): Promise[_] = js.native
}

