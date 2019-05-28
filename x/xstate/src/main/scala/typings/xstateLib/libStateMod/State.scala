package typings
package xstateLib.libStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/lib/State", "State")
@js.native
class State[TContext, TEvent /* <: xstateLib.libTypesMod.EventObject */] protected ()
  extends xstateLib.libTypesMod.StateInterface[TContext, xstateLib.libTypesMod.EventObject] {
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
  def this(config: xstateLib.libTypesMod.StateConfig[TContext, TEvent]) = this()
  /* CompleteClass */
  override var actions: js.Array[xstateLib.libTypesMod.ActionObject[TContext, xstateLib.libTypesMod.EventObject]] = js.native
  @JSName("actions")
  var actions_State: js.Array[xstateLib.libTypesMod.ActionObject[TContext, TEvent]] = js.native
  /* CompleteClass */
  override var activities: xstateLib.libTypesMod.ActivityMap = js.native
  /* CompleteClass */
  override var context: TContext = js.native
  /* CompleteClass */
  override var event: xstateLib.libTypesMod.OmniEventObject[xstateLib.libTypesMod.EventObject] = js.native
  @JSName("event")
  var event_State: xstateLib.libTypesMod.OmniEventObject[TEvent] = js.native
  /* CompleteClass */
  override var events: js.Array[xstateLib.libTypesMod.EventObject] = js.native
  @JSName("events")
  var events_State: js.Array[TEvent] = js.native
  /* CompleteClass */
  override var inert: js.Any = js.native
  /**
    * Returns a new `State` instance that is equal to this state no actions (side-effects).
    */
  @JSName("inert")
  val inert_State: State[TContext, TEvent] = js.native
  /* CompleteClass */
  override var meta: js.Any = js.native
  /* CompleteClass */
  override var nextEvents: js.Array[xstateLib.libTypesMod.EventType] = js.native
  /* CompleteClass */
  override var value: xstateLib.libTypesMod.StateValue = js.native
  /* CompleteClass */
  override def matches(parentStateValue: xstateLib.libTypesMod.StateValue): scala.Boolean = js.native
  /* CompleteClass */
  override def toStrings(): js.Array[java.lang.String] = js.native
  def toStrings(stateValue: xstateLib.libTypesMod.StateValue): js.Array[java.lang.String] = js.native
  def toStrings(stateValue: xstateLib.libTypesMod.StateValue, delimiter: java.lang.String): js.Array[java.lang.String] = js.native
}

/* static members */
@JSImport("xstate/lib/State", "State")
@js.native
object State extends js.Object {
  /**
    * Creates a new State instance for the given `config`.
    * @param config The state config
    */
  def create[TC, TE /* <: xstateLib.libTypesMod.EventObject */](config: xstateLib.libTypesMod.StateConfig[TC, TE]): xstateLib.libStateMod.State[TC, TE] = js.native
  /**
    * Creates a new State instance for the given `stateValue` and `context`.
    * @param stateValue
    * @param context
    */
  def from[TC, TE /* <: xstateLib.libTypesMod.EventObject */](stateValue: xstateLib.libStateMod.State[TC, TE]): xstateLib.libStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: xstateLib.libTypesMod.EventObject */](stateValue: xstateLib.libStateMod.State[TC, TE], context: TC): xstateLib.libStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: xstateLib.libTypesMod.EventObject */](stateValue: xstateLib.libTypesMod.StateValue): xstateLib.libStateMod.State[TC, TE] = js.native
  def from[TC, TE /* <: xstateLib.libTypesMod.EventObject */](stateValue: xstateLib.libTypesMod.StateValue, context: TC): xstateLib.libStateMod.State[TC, TE] = js.native
  /**
    * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
    * @param stateValue
    * @param context
    */
  def inert[TC, TE /* <: xstateLib.libTypesMod.EventObject */](stateValue: xstateLib.libStateMod.State[TC, xstateLib.libTypesMod.EventObject], context: TC): xstateLib.libStateMod.State[TC, TE] = js.native
  def inert[TC, TE /* <: xstateLib.libTypesMod.EventObject */](stateValue: xstateLib.libTypesMod.StateValue, context: TC): xstateLib.libStateMod.State[TC, TE] = js.native
}

