package typings.xstate.esActorMod

import typings.xstate.Anon_Id
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.Subscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Actor[TContext, TEvent /* <: EventObject */] extends Subscribable[TContext] {
  var id: String = js.native
  var stop: js.UndefOr[js.Function0[js.UndefOr[_]]] = js.native
  def send(event: TEvent): js.Any = js.native
  def toJSON(): Anon_Id = js.native
}

