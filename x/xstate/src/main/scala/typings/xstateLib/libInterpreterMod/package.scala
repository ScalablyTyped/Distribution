package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterpreterMod {
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], scala.Unit]
  type EventListener[TEvent /* <: xstateLib.libTypesMod.EventObject */] = js.Function1[/* event */ TEvent, scala.Unit]
  type Listener = js.Function0[scala.Unit]
  type Spawnable[TContext] = (xstateLib.libTypesMod.StateMachine[TContext, js.Any, js.Any]) | js.Promise[TContext] | xstateLib.libTypesMod.InvokeCallback | xstateLib.libTypesMod.Subscribable[TContext]
  type StateListener[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */] = js.Function2[
    /* state */ xstateLib.libStateMod.State[TContext, TEvent], 
    /* event */ xstateLib.libTypesMod.OmniEventObject[TEvent], 
    scala.Unit
  ]
}
