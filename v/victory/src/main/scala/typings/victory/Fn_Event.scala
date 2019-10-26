package typings.victory

import typings.react.reactMod.SyntheticEvent
import typings.std.Event
import typings.victory.victoryMod.EventCallbackInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Event[TTarget, TEventKey] extends js.Object {
  def apply(event: SyntheticEvent[_, Event]): EventCallbackInterface[TTarget, TEventKey] = js.native
}

