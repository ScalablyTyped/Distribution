package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.dragSourceStart")
@js.native
object dragSourceStart extends js.Object {
  /**
    * Performs an animation when the user begins to drag an object.
    * @param dragSource Element or elements being dragged.
    * @param affected Element or elements whose position is affected by the movement of the dragged object. Typically, this is all other items in a reorderable list.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(dragSource: js.Any): Promise[_] = js.native
  def apply(dragSource: js.Any, affected: js.Any): Promise[_] = js.native
}

