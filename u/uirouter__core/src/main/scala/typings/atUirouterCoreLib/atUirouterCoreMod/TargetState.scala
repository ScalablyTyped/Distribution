package typings
package atUirouterCoreLib.atUirouterCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core", "TargetState")
@js.native
class TargetState protected ()
  extends atUirouterCoreLib.libStateMod.TargetState {
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
  def this(_stateRegistry: atUirouterCoreLib.libStateStateRegistryMod.StateRegistry, _identifier: atUirouterCoreLib.libStateInterfaceMod.StateOrName) = this()
  def this(_stateRegistry: atUirouterCoreLib.libStateStateRegistryMod.StateRegistry, _identifier: atUirouterCoreLib.libStateInterfaceMod.StateOrName, _params: atUirouterCoreLib.libParamsInterfaceMod.RawParams) = this()
  def this(_stateRegistry: atUirouterCoreLib.libStateStateRegistryMod.StateRegistry, _identifier: atUirouterCoreLib.libStateInterfaceMod.StateOrName, _params: atUirouterCoreLib.libParamsInterfaceMod.RawParams, _options: atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions) = this()
}

@JSImport("@uirouter/core", "TargetState")
@js.native
object TargetState extends js.Object {
  /** Returns true if the object has a state property that might be a state or state name */
  def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ scala.Boolean = js.native
}

