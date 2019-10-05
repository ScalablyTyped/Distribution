package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.dragSourceEnd")
@js.native
object dragSourceEnd extends js.Object {
  /**
    * Performs an animation when the user finishes dragging an object.
    * @param dragSource Element or elements that were dragged.
    * @param offset Initial offset from the drop point. The dropped object begins at the offset and animates to its final position at the drop point. Note When the element parameter specifies an array of elements, the offset parameter can specify an offset array with each item specified for its corresponding element array item. If the array of offsets is smaller than the array of elements, the last offset is applied to all remaining elements.
    * @param affected Element or elements whose position the dropped object affects. Typically, this is all other items in a reorderable list. This should be the same element or element collection passed as the affected parameter in the dragSourceStart animation.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(dragSource: js.Any): Promise[_] = js.native
  def apply(dragSource: js.Any, offset: js.Any): Promise[_] = js.native
  def apply(dragSource: js.Any, offset: js.Any, affected: js.Any): Promise[_] = js.native
}

