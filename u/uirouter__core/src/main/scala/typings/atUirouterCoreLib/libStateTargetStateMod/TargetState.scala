package typings
package atUirouterCoreLib.libStateTargetStateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/targetState", "TargetState")
@js.native
class TargetState protected () extends js.Object {
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
  var _definition: js.Any = js.native
  var _identifier: js.Any = js.native
  var _options: js.Any = js.native
  var _params: js.Any = js.native
  var _stateRegistry: js.Any = js.native
  /** The internal state object (if it was found) */
  @JSName("$state")
  def $state(): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  /** If the object is invalid, returns the reason why */
  def error(): java.lang.String = js.native
  /** True if the target state was found */
  def exists(): scala.Boolean = js.native
  /** The identifier used when creating this TargetState */
  def identifier(): atUirouterCoreLib.libStateInterfaceMod.StateOrName = js.native
  /** The name of the state this object targets */
  def name(): java.lang.String = js.native
  /** The target options */
  def options(): atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions = js.native
  /** The target parameter values */
  def params(): atUirouterCoreLib.libParamsInterfaceMod.RawParams = js.native
  /** The internal state declaration (if it was found) */
  def state(): atUirouterCoreLib.libStateInterfaceMod.StateDeclaration = js.native
  /** True if the object is valid */
  def valid(): scala.Boolean = js.native
  /**
    * Returns a copy of this TargetState, using the specified Transition Options.
    *
    * @param options the new options to use
    * @param replace When false (default) the new options will be merged with the current options.
    *                When true the options will be used instead of the current options.
    */
  def withOptions(options: atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions): TargetState = js.native
  def withOptions(options: atUirouterCoreLib.libTransitionInterfaceMod.TransitionOptions, replace: scala.Boolean): TargetState = js.native
  /**
    * Returns a copy of this TargetState, using the specified parameter values.
    *
    * @param params the new parameter values to use
    * @param replace When false (default) the new parameter values will be merged with the current values.
    *                When true the parameter values will be used instead of the current values.
    */
  def withParams(params: atUirouterCoreLib.libParamsInterfaceMod.RawParams): TargetState = js.native
  def withParams(params: atUirouterCoreLib.libParamsInterfaceMod.RawParams, replace: scala.Boolean): TargetState = js.native
  /**
    * Returns a copy of this TargetState which targets a different state.
    * The new TargetState has the same parameter values and transition options.
    *
    * @param state The new state that should be targeted
    */
  def withState(state: atUirouterCoreLib.libStateInterfaceMod.StateOrName): TargetState = js.native
}

@JSImport("@uirouter/core/lib/state/targetState", "TargetState")
@js.native
object TargetState extends js.Object {
  /** Returns true if the object has a state property that might be a state or state name */
  def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ scala.Boolean = js.native
}

