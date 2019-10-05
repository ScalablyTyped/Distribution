package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.dragBetweenLeave")
@js.native
object dragBetweenLeave extends js.Object {
  /**
    * Performs an animation when a dragged object is moved away from items that it had previously involved in a dragBetweenEnter animation. The affected objects are animated back to their original positions.
    * @param target Element or elements that the dragged object would no longer cause to be displaced, due to its moving away. This should be the same element or element collection passed as the target parameter in the dragBetweenEnter animation.
    * @returns An object that completes when the animation is finished.
    **/
  def apply(target: js.Any): Promise[_] = js.native
}

