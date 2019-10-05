package typings.winjs.WinJS.UI.Animation

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.continuumForwardIn")
@js.native
object continuumForwardIn extends js.Object {
  /**
    * Execute a continuum animation, scaling up the incoming page while scaling, rotating, and translating the incoming item.
    * @param page Single element to be scaled up that is the page root and does not contain the incoming item.
    * @param itemRoot Root of the item that will be translated as part of the continuum animation.
    * @param itemContent Content of the item that will be scaled and rotated as part of the continuum animation.
    * @returns A Promise that completes when the animation is finished.
    **/
  def apply(page: js.Any, itemRoot: js.Any, itemContent: js.Any): Promise[_] = js.native
}

