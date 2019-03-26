package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libInterpreterMod {
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], scala.Unit]
  type EventListener = js.Function1[/* event */ xstateLib.libTypesMod.EventObject, scala.Unit]
  type Listener = js.Function0[scala.Unit]
  type StateListener[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */] = js.Function2[
    /* state */ xstateLib.libStateMod.State[TContext, TEvent], 
    /* event */ xstateLib.libTypesMod.OmniEventObject[TEvent], 
    scala.Unit
  ]
}
