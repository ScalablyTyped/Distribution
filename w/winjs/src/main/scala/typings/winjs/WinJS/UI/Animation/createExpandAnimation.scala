package typings.winjs.WinJS.UI.Animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.createExpandAnimation")
@js.native
object createExpandAnimation extends js.Object {
  /**
    * Creates an object that performs an animation that expands a list.
    * @param revealed Element or elements revealed by the expansion.
    * @param affected Element or elements affected by the newly revealed items. Typically, this is all other items displayed in the list.
    * @returns An object whose execute method is used to execute the animation. The execute method returns a Promise that completes when the animation is finished.
    **/
  def apply(revealed: js.Any, affected: js.Any): IAnimationMethodResponse = js.native
}

