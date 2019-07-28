package typings.atUirouterCore.libStateMod

import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import typings.atUirouterCore.libStateInterfaceMod.StateOrName
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state", "TargetState")
@js.native
class TargetState protected ()
  extends typings.atUirouterCore.libStateTargetStateMod.TargetState {
  /**
    * The TargetState constructor
    *
    * Note: Do not construct a `TargetState` manually.
    * To create a `TargetState`, use the [[StateService.target]] factory method.
    *
    * @param _stateRegistry The StateRegistry to use to look up the _definition
    * @param _identifier An identifier for a state.
    *    Either a fully-qualified state name, or the object used to define the state.
    * @param _params Parameters for the target state
    * @param _options Transition options.
    *
    * @internalapi
    */
  def this(
    _stateRegistry: typings.atUirouterCore.libStateStateRegistryMod.StateRegistry,
    _identifier: StateOrName
  ) = this()
  def this(
    _stateRegistry: typings.atUirouterCore.libStateStateRegistryMod.StateRegistry,
    _identifier: StateOrName,
    _params: RawParams
  ) = this()
  def this(
    _stateRegistry: typings.atUirouterCore.libStateStateRegistryMod.StateRegistry,
    _identifier: StateOrName,
    _params: RawParams,
    _options: TransitionOptions
  ) = this()
}

/* static members */
@JSImport("@uirouter/core/lib/state", "TargetState")
@js.native
object TargetState extends js.Object {
  /** Returns true if the object has a state property that might be a state or state name */
  def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean = js.native
}

