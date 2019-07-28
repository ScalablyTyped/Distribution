package typings.xstate.xstateMod

import typings.xstate.libTypesMod.EventObject
import typings.xstate.libTypesMod.StateConfig
import typings.xstate.libTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate", "State")
@js.native
class State[TContext, TEvent /* <: EventObject */] protected ()
  extends typings.xstate.libStateMod.State[TContext, TEvent] {
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
  def this(config: StateConfig[TContext, TEvent]) = this()
}

/* static members */
@JSImport("xstate", "State")
@js.native
object State extends js.Object {
  /**
    * Creates a new State instance for the given `config`.
    * @param config The state config
    */
  def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): typings.xstate.libStateMod.State[TC, TE] = js.native
  /**
    * Creates a new State instance for the given `stateValue` and `context`.
    * @param stateValue
    * @param context
    */
  def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.libStateMod.State[TC, TE]): typings.xstate.libStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: EventObject */](stateValue: typings.xstate.libStateMod.State[TC, TE], context: TC): typings.xstate.libStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: EventObject */](stateValue: StateValue): typings.xstate.libStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.libStateMod.State[TC, TE] = js.native
  /**
    * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
    * @param stateValue
    * @param context
    */
  def inert[TC, TE /* <: EventObject */](stateValue: typings.xstate.libStateMod.State[TC, EventObject], context: TC): typings.xstate.libStateMod.State[TC, TE] = js.native
  def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): typings.xstate.libStateMod.State[TC, TE] = js.native
}

