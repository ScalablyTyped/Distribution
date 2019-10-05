package typings.atUirouterCore

import typings.atUirouterCore.libParamsInterfaceMod.RawParams
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typings.atUirouterCore.libStateInterfaceMod.StateOrName
import typings.atUirouterCore.libStateInterfaceMod._RedirectToResult
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libStateStateRegistryMod.StateRegistry
import typings.atUirouterCore.libStateTargetStateMod.TargetState
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/targetState", JSImport.Namespace)
@js.native
object libStateTargetStateMod extends js.Object {
  @js.native
  class TargetState protected () extends _RedirectToResult {
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
    def this(_stateRegistry: StateRegistry, _identifier: StateOrName) = this()
    def this(_stateRegistry: StateRegistry, _identifier: StateOrName, _params: RawParams) = this()
    def this(
      _stateRegistry: StateRegistry,
      _identifier: StateOrName,
      _params: RawParams,
      _options: TransitionOptions
    ) = this()
    var _definition: js.Any = js.native
    var _identifier: js.Any = js.native
    var _options: js.Any = js.native
    var _params: js.Any = js.native
    var _stateRegistry: js.Any = js.native
    /** The internal state object (if it was found) */
    @JSName("$state")
    def $state(): StateObject = js.native
    /** If the object is invalid, returns the reason why */
    def error(): String = js.native
    /** True if the target state was found */
    def exists(): Boolean = js.native
    /** The identifier used when creating this TargetState */
    def identifier(): StateOrName = js.native
    /** The name of the state this object targets */
    def name(): String = js.native
    /** The target options */
    def options(): TransitionOptions = js.native
    /** The target parameter values */
    def params(): RawParams = js.native
    /** The internal state declaration (if it was found) */
    def state(): StateDeclaration = js.native
    /** True if the object is valid */
    def valid(): Boolean = js.native
    /**
      * Returns a copy of this TargetState, using the specified Transition Options.
      *
      * @param options the new options to use
      * @param replace When false (default) the new options will be merged with the current options.
      *                When true the options will be used instead of the current options.
      */
    def withOptions(options: TransitionOptions): TargetState = js.native
    def withOptions(options: TransitionOptions, replace: Boolean): TargetState = js.native
    /**
      * Returns a copy of this TargetState, using the specified parameter values.
      *
      * @param params the new parameter values to use
      * @param replace When false (default) the new parameter values will be merged with the current values.
      *                When true the parameter values will be used instead of the current values.
      */
    def withParams(params: RawParams): TargetState = js.native
    def withParams(params: RawParams, replace: Boolean): TargetState = js.native
    /**
      * Returns a copy of this TargetState which targets a different state.
      * The new TargetState has the same parameter values and transition options.
      *
      * @param state The new state that should be targeted
      */
    def withState(state: StateOrName): TargetState = js.native
  }
  
  /* static members */
  @js.native
  object TargetState extends js.Object {
    /** Returns true if the object has a state property that might be a state or state name */
    def isDef(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean = js.native
  }
  
}

