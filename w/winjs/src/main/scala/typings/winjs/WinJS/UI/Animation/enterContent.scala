package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.enterContent")
@js.native
object enterContent extends js.Object {
  /**
    * Performs an animation that displays one or more elements on a page.
    * @param incoming Element or elements that compose the incoming content.
    * @param offset Initial offsets where the animated objects begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the incoming parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param options Optional. Set this value to { mechanism: "transition" } to play the animation using CSS transitions instead of the default CSS animations. In some cases this can result in improved performance.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(incoming: js.Any): Promise[_] = js.native
  def apply(incoming: js.Any, offset: js.Any): Promise[_] = js.native
  def apply(incoming: js.Any, offset: js.Any, options: js.Any): Promise[_] = js.native
}

