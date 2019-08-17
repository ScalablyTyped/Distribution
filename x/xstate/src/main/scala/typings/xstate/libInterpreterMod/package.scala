package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterpreterMod {
  import typings.xstate.libStateMod.State
  import typings.xstate.libTypesMod.EventObject
  import typings.xstate.libTypesMod.InvokeCallback
  import typings.xstate.libTypesMod.OmniEventObject
  import typings.xstate.libTypesMod.StateMachine
  import typings.xstate.libTypesMod.Subscribable

  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], Unit]
  type EventListener[TEvent /* <: EventObject */] = js.Function1[/* event */ TEvent, Unit]
  type Listener = js.Function0[Unit]
  type Spawnable[TContext] = (StateMachine[TContext, js.Any, js.Any]) | js.Promise[TContext] | InvokeCallback | Subscribable[TContext]
  type StateListener[TContext, TEvent /* <: EventObject */] = js.Function2[/* state */ State[TContext, TEvent], /* event */ OmniEventObject[TEvent], Unit]
}
