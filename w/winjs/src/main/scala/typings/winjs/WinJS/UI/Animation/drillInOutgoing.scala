package typings.winjs.WinJS.UI.Animation

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.drillInOutgoing")
@js.native
object drillInOutgoing extends js.Object {
  /**
    * Execute the outgoing phase of the drill in animation, scaling up the outgoing page while fading it out.
    * @param incomingPage Element to be scaled up and faded out.
    * @returns Promise object that completes when the animation is complete.
    **/
  def apply(outgoingPage: HTMLElement): Promise[_] = js.native
}

