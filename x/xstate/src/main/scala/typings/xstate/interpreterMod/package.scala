package typings.xstate

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object interpreterMod {
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], scala.Unit]
  type EventListener[TEvent /* <: typings.xstate.typesMod.EventObject */] = js.Function1[/* event */ TEvent, scala.Unit]
  type Listener = js.Function0[scala.Unit]
  type StateListener[TContext, TEvent /* <: typings.xstate.typesMod.EventObject */, TStateSchema /* <: typings.xstate.typesMod.StateSchema[TContext] */, TTypestate /* <: typings.xstate.typesMod.Typestate[TContext] */] = js.Function2[
    /* state */ typings.xstate.stateMod.State[TContext, TEvent, TStateSchema, TTypestate], 
    /* event */ TEvent, 
    scala.Unit
  ]
}
