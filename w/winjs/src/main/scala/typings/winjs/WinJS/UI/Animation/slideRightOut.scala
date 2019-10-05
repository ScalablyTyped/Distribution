package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.slideRightOut")
@js.native
object slideRightOut extends js.Object {
  /**
    * Execute a slide out from left to right animation.
    * @param page The page containing all elements to slide.
    * @param first First element or collection of elements to animate sliding out.
    * @param second Second element or collection of elements to animate sliding out, which will be offset slightly farther than the first.
    * @param third Third element or collection of elements to animate sliding out, which will be offset slightly farther than the second.
    * @returns A Promise that completes when the animation is finished.
    **/
  def apply(page: js.Any, first: js.Any, second: js.Any, third: js.Any): Promise[_] = js.native
}

