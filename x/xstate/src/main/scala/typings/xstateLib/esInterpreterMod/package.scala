package typings
package xstateLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object esInterpreterMod {
  type ContextListener[TContext] = js.Function2[/* context */ TContext, /* prevContext */ js.UndefOr[TContext], scala.Unit]
  type EventListener = js.Function1[/* event */ xstateLib.esTypesMod.EventObject, scala.Unit]
  type Listener = js.Function0[scala.Unit]
  type StateListener[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */] = js.Function2[
    /* state */ xstateLib.esStateMod.State[TContext, TEvent], 
    /* event */ xstateLib.esTypesMod.OmniEventObject[TEvent], 
    scala.Unit
  ]
}
