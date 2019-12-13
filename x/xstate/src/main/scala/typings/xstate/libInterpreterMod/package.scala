package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterpreterMod {
  import typings.xstate.libStateMod.State
  import typings.xstate.libTypesMod.EventObject

  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], Unit]
  type EventListener[TEvent /* <: EventObject */] = js.Function1[/* event */ TEvent, Unit]
  type Listener = js.Function0[Unit]
  type StateListener[TContext, TEvent /* <: EventObject */] = js.Function2[/* state */ State[TContext, TEvent, js.Any, js.Any], /* event */ TEvent, Unit]
}
