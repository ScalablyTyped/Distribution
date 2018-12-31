package typings
package atUirouterCoreLib.libStateStateRegistryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateRegistry", "StateRegistry")
@js.native
class StateRegistry protected () extends js.Object {
  /** @internalapi */
  def this(router: atUirouterCoreLib.libRouterMod.UIRouter) = this()
  /** @hidden */
  var _deregisterTree: js.Any = js.native
  /** @internalapi */
  var _registerRoot: js.Any = js.native
  var _root: js.Any = js.native
  var builder: js.Any = js.native
  var listeners: js.Array[StateRegistryListener] = js.native
  var matcher: atUirouterCoreLib.libStateStateMatcherMod.StateMatcher = js.native
  var router: js.Any = js.native
  var stateQueue: atUirouterCoreLib.libStateStateQueueManagerMod.StateQueueManager = js.native
  var states: js.Any = js.native
  def decorator(name: java.lang.String, func: atUirouterCoreLib.libStateStateBuilderMod.BuilderFunction): js.Function | atUirouterCoreLib.libStateStateBuilderMod.BuilderFunction | js.Array[atUirouterCoreLib.libStateStateBuilderMod.BuilderFunction] = js.native
  /**
    * Removes a state from the registry
    *
    * This removes a state from the registry.
    * If the state has children, they are are also removed from the registry.
    *
    * @param stateOrName the state's name or object representation
    * @returns {StateObject[]} a list of removed states
    */
  def deregister(stateOrName: atUirouterCoreLib.libStateInterfaceMod.StateOrName): js.Array[atUirouterCoreLib.libStateStateObjectMod.StateObject] = js.native
  /** @internalapi */
  def dispose(): scala.Unit = js.native
  /**
    * Gets all registered states
    *
    * Calling this method with no arguments will return a list of all the states that are currently registered.
    * Note: this does not return states that are *queued* but not yet registered.
    *
    * @return a list of [[StateDeclaration]]s
    */
  def get(): js.Array[atUirouterCoreLib.libStateInterfaceMod.StateDeclaration] = js.native
  /**
    * Gets a registered state
    *
    * Given a state or a name, finds and returns the [[StateDeclaration]] from the registry.
    * Note: this does not return states that are *queued* but not yet registered.
    *
    * @param stateOrName either the name of a state, or a state object.
    * @param base the base state to use when stateOrName is relative.
    * @return a registered [[StateDeclaration]] that matched the `stateOrName`, or null if the state isn't registered.
    */
  def get(stateOrName: atUirouterCoreLib.libStateInterfaceMod.StateOrName): atUirouterCoreLib.libStateInterfaceMod.StateDeclaration = js.native
  def get(
    stateOrName: atUirouterCoreLib.libStateInterfaceMod.StateOrName,
    base: atUirouterCoreLib.libStateInterfaceMod.StateOrName
  ): atUirouterCoreLib.libStateInterfaceMod.StateDeclaration = js.native
  /**
    * Listen for a State Registry events
    *
    * Adds a callback that is invoked when states are registered or deregistered with the StateRegistry.
    *
    * #### Example:
    * ```js
    * let allStates = registry.get();
    *
    * // Later, invoke deregisterFn() to remove the listener
    * let deregisterFn = registry.onStatesChanged((event, states) => {
    *   switch(event) {
    *     case: 'registered':
    *       states.forEach(state => allStates.push(state));
    *       break;
    *     case: 'deregistered':
    *       states.forEach(state => {
    *         let idx = allStates.indexOf(state);
    *         if (idx !== -1) allStates.splice(idx, 1);
    *       });
    *       break;
    *   }
    * });
    * ```
    *
    * @param listener a callback function invoked when the registered states changes.
    *        The function receives two parameters, `event` and `state`.
    *        See [[StateRegistryListener]]
    * @return a function that deregisters the listener
    */
  def onStatesChanged(listener: StateRegistryListener): js.Function0[scala.Unit] = js.native
  /**
    * Adds a state to the registry
    *
    * Registers a [[StateDeclaration]] or queues it for registration.
    *
    * Note: a state will be queued if the state's parent isn't yet registered.
    *
    * @param stateDefinition the definition of the state to register.
    * @returns the internal [[StateObject]] object.
    *          If the state was successfully registered, then the object is fully built (See: [[StateBuilder]]).
    *          If the state was only queued, then the object is not fully built.
    */
  def register(stateDefinition: atUirouterCoreLib.libStateInterfaceMod._StateDeclaration): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
  /**
    * Gets the implicit root state
    *
    * Gets the root of the state tree.
    * The root state is implicitly created by UI-Router.
    * Note: this returns the internal [[StateObject]] representation, not a [[StateDeclaration]]
    *
    * @return the root [[StateObject]]
    */
  def root(): atUirouterCoreLib.libStateStateObjectMod.StateObject = js.native
}

