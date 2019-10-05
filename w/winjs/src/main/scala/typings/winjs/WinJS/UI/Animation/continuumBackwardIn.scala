package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.continuumBackwardIn")
@js.native
object continuumBackwardIn extends js.Object {
  /**
    * Execute a continuum animation, scaling down the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled down that is the page root and contains the incoming item.
    * @param item Single element to be scaled, rotated, and translated into its final position on the page.
    * @returns A Promise that completes when the animation is finished.
    **/
  def apply(page: js.Any, item: js.Any): Promise[_] = js.native
}

