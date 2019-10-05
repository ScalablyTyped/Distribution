package typings.winjs.WinJS.UI.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.createDeleteFromListAnimation")
@js.native
object createDeleteFromListAnimation extends js.Object {
  /**
    * Creates an object that performs an animation that removes an item or items from a list.
    * @param deleted Element or elements to delete from the list.
    * @param remaining Element or elements affected by the removal of the deleted items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def apply(deleted: js.Any, remaining: js.Any): IAnimationMethodResponse = js.native
}

