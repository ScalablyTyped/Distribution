package typings.winjs.WinJS.UI.Animation

import typings.std.HTMLElement
import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.UI.Animation.drillOutIncoming")
@js.native
object drillOutIncoming extends js.Object {
  /**
    * Execute the incoming phase of the drill out animation, scaling down the incoming page while fading it in.
    * @param incomingPage Element to be scaled up and faded in.
    * @returns Promise object that completes when the animation is complete.
    **/
  def apply(incomingPage: HTMLElement): Promise[_] = js.native
}

