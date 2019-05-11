package typings
package xstateLib.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es", "State")
@js.native
class State[TContext, TEvent /* <: xstateLib.esTypesMod.EventObject */] protected ()
  extends xstateLib.esStateMod.State[TContext, TEvent] {
  /**
    * Creates a new State instance.
    * @param value The state value
    * @param context The extended state
    * @param historyValue The tree representing historical values of the state nodes
    * @param history The previous state
    * @param actions An array of action objects to execute as side-effects
    * @param activities A mapping of activities and whether they are started (`true`) or stopped (`false`).
    * @param meta
    * @param events Internal event queue. Should be empty with run-to-completion semantics.
    * @param tree
    */
  def this(config: xstateLib.esTypesMod.StateConfig[TContext, TEvent]) = this()
}

/* static members */
@JSImport("xstate/es", "State")
@js.native
object State extends js.Object {
  /**
    * Creates a new State instance for the given `config`.
    * @param config The state config
    */
  def create[TC, TE /* <: xstateLib.esTypesMod.EventObject */](config: xstateLib.esTypesMod.StateConfig[TC, TE]): xstateLib.esStateMod.State[TC, TE] = js.native
  /**
    * Creates a new State instance for the given `stateValue` and `context`.
    * @param stateValue
    * @param context
    */
  def from[TC, TE /* <: xstateLib.esTypesMod.EventObject */](stateValue: xstateLib.esStateMod.State[TC, TE]): xstateLib.esStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: xstateLib.esTypesMod.EventObject */](stateValue: xstateLib.esStateMod.State[TC, TE], context: TC): xstateLib.esStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: xstateLib.esTypesMod.EventObject */](stateValue: xstateLib.esTypesMod.StateValue): xstateLib.esStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: xstateLib.esTypesMod.EventObject */](stateValue: xstateLib.esTypesMod.StateValue, context: TC): xstateLib.esStateMod.State[TC, TE] = js.native
  /**
    * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
    * @param stateValue
    * @param context
    */
  def inert[TC, TE /* <: xstateLib.esTypesMod.EventObject */](stateValue: xstateLib.esStateMod.State[TC, xstateLib.esTypesMod.EventObject], context: TC): xstateLib.esStateMod.State[TC, TE] = js.native
  def inert[TC, TE /* <: xstateLib.esTypesMod.EventObject */](stateValue: xstateLib.esTypesMod.StateValue, context: TC): xstateLib.esStateMod.State[TC, TE] = js.native
}

