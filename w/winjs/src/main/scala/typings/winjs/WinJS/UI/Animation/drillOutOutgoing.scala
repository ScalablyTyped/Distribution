package typings.winjs.WinJS.UI.Animation

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.drillOutOutgoing")
@js.native
object drillOutOutgoing extends js.Object {
  /**
    * Execute the outgoing phase of the drill out animation, scaling down the outgoing page while fading it out.
    * @param outgoingPage Element to be scaled down and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  def apply(outgoingPage: HTMLElement): Promise[_] = js.native
}

