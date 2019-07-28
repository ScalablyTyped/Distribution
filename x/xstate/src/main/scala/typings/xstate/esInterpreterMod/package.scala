package typings.xstate

import typings.xstate.esStateMod.State
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.InvokeCallback
import typings.xstate.esTypesMod.OmniEventObject
import typings.xstate.esTypesMod.StateMachine
import typings.xstate.esTypesMod.Subscribable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esInterpreterMod {
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], Unit]
  type EventListener[TEvent /* <: EventObject */] = js.Function1[/* event */ TEvent, Unit]
  type Listener = js.Function0[Unit]
  type Spawnable[TContext] = (StateMachine[TContext, js.Any, js.Any]) | js.Promise[TContext] | InvokeCallback | Subscribable[TContext]
  type StateListener[TContext, TEvent /* <: EventObject */] = js.Function2[/* state */ State[TContext, TEvent], /* event */ OmniEventObject[TEvent], Unit]
}
