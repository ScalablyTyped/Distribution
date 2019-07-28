package typings.xstate.esStateMod

import typings.xstate.esTypesMod.ActionObject
import typings.xstate.esTypesMod.ActivityMap
import typings.xstate.esTypesMod.EventObject
import typings.xstate.esTypesMod.EventType
import typings.xstate.esTypesMod.OmniEventObject
import typings.xstate.esTypesMod.StateConfig
import typings.xstate.esTypesMod.StateInterface
import typings.xstate.esTypesMod.StateValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("xstate/es/State", "State")
@js.native
class State[TContext, TEvent /* <: EventObject */] protected () extends StateInterface[TContext, EventObject] {
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
  /* CompleteClass */
  override var actions: js.Array[ActionObject[TContext, EventObject]] = js.native
  @JSName("actions")
  var actions_State: js.Array[ActionObject[TContext, TEvent]] = js.native
  /* CompleteClass */
  override var activities: ActivityMap = js.native
  /* CompleteClass */
  override var context: TContext = js.native
  /* CompleteClass */
  override var event: OmniEventObject[EventObject] = js.native
  @JSName("event")
  var event_State: OmniEventObject[TEvent] = js.native
  /* CompleteClass */
  override var events: js.Array[EventObject] = js.native
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
  override var nextEvents: js.Array[EventType] = js.native
  /* CompleteClass */
  override var value: StateValue = js.native
  /* CompleteClass */
  override def matches(parentStateValue: StateValue): Boolean = js.native
  /* CompleteClass */
  override def toStrings(): js.Array[String] = js.native
  def toStrings(stateValue: StateValue): js.Array[String] = js.native
  def toStrings(stateValue: StateValue, delimiter: String): js.Array[String] = js.native
}

/* static members */
@JSImport("xstate/es/State", "State")
@js.native
object State extends js.Object {
  /**
    * Creates a new State instance for the given `config`.
    * @param config The state config
    */
  def create[TC, TE /* <: EventObject */](config: StateConfig[TC, TE]): State[TC, TE] = js.native
  /**
    * Creates a new State instance for the given `stateValue` and `context`.
    * @param stateValue
    * @param context
    */
  def from[TC, TE /* <: EventObject */](stateValue: State[TC, TE]): State[TC, TE] = js.native
  def from[TC, TE /* <: EventObject */](stateValue: State[TC, TE], context: TC): State[TC, TE] = js.native
  def from[TC, TE /* <: EventObject */](stateValue: StateValue): State[TC, TE] = js.native
  def from[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): State[TC, TE] = js.native
  /**
    * Creates a new `State` instance for the given `stateValue` and `context` with no actions (side-effects).
    * @param stateValue
    * @param context
    */
  def inert[TC, TE /* <: EventObject */](stateValue: State[TC, EventObject], context: TC): State[TC, TE] = js.native
  def inert[TC, TE /* <: EventObject */](stateValue: StateValue, context: TC): State[TC, TE] = js.native
}

