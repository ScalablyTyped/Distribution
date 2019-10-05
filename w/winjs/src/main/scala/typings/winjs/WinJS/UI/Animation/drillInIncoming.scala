package typings.winjs.WinJS.UI.Animation

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.drillInIncoming")
@js.native
object drillInIncoming extends js.Object {
  /**
    * Execute the incoming phase of the drill in animation, scaling up the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  def apply(incomingPage: HTMLElement): Promise[_] = js.native
}

