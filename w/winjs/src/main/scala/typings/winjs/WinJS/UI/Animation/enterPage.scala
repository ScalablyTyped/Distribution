package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.enterPage")
@js.native
object enterPage extends js.Object {
  /**
    * Performs an animation that shows a new page of content, either when transitioning between pages in a running app or when displaying the first content in a newly launched app.
    * @param element Element or an array of elements that represent the content. If element refers to an array of elements, the elements enter in array order.
    * @param offset An initial offset where the element or elements begin relative to their final position at the end of the animation. Set this parameter to null to use the recommended default offset. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(element: js.Any): Promise[_] = js.native
  def apply(element: js.Any, offset: js.Any): Promise[_] = js.native
}

