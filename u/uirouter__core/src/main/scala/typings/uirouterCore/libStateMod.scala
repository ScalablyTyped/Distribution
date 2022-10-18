package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.libParamsInterfaceMod.RawParams
import typings.uirouterCore.libResolveResolvableMod.Resolvable
import typings.uirouterCore.libRouterMod.UIRouter
import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import typings.uirouterCore.libStateInterfaceMod.StateOrName
import typings.uirouterCore.libStateInterfaceMod._StateDeclaration
import typings.uirouterCore.libStateStateRegistryMod.StateRegistryListener
import typings.uirouterCore.libTransitionInterfaceMod.TransitionOptions
import typings.uirouterCore.libUrlUrlMatcherFactoryMod.UrlMatcherFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libStateMod {
  
  @JSImport("@uirouter/core/lib/state", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/state", "StateBuilder")
  @js.native
  open class StateBuilder protected ()
    extends typings.uirouterCore.libStateStateBuilderMod.StateBuilder {
    def this(
      matcher: typings.uirouterCore.libStateStateMatcherMod.StateMatcher,
      urlMatcherFactory: UrlMatcherFactory
    ) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateMatcher")
  @js.native
  open class StateMatcher protected ()
    extends typings.uirouterCore.libStateStateMatcherMod.StateMatcher {
    def this(_states: StringDictionary[typings.uirouterCore.libStateStateObjectMod.StateObject]) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateObject")
  @js.native
  /** @deprecated use State.create() */
  open class StateObject ()
    extends typings.uirouterCore.libStateStateObjectMod.StateObject {
    def this(config: StateDeclaration) = this()
  }
  /* static members */
  object StateObject {
    
    @JSImport("@uirouter/core/lib/state", "StateObject")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Create a state object to put the private/internal implementation details onto.
      * The object's prototype chain looks like:
      * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
      *
      * @param stateDecl the user-supplied State Declaration
      * @returns {StateObject} an internal State object
      */
    inline def create(stateDecl: _StateDeclaration): typings.uirouterCore.libStateStateObjectMod.StateObject = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(stateDecl.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libStateStateObjectMod.StateObject]
    
    /** Predicate which returns true if the object is an internal [[StateObject]] object */
    inline def isState(obj: Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isState")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean]
    
    /** Predicate which returns true if the object is an class with @State() decorator */
    inline def isStateClass(stateDecl: _StateDeclaration): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateClass")(stateDecl.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /** Predicate which returns true if the object is a [[StateDeclaration]] object */
    inline def isStateDeclaration(obj: Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isStateDeclaration")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean]
  }
  
  @JSImport("@uirouter/core/lib/state", "StateQueueManager")
  @js.native
  open class StateQueueManager protected ()
    extends typings.uirouterCore.libStateStateQueueManagerMod.StateQueueManager {
    def this(
      router: UIRouter,
      states: StringDictionary[typings.uirouterCore.libStateStateObjectMod.StateObject],
      builder: typings.uirouterCore.libStateStateBuilderMod.StateBuilder,
      listeners: js.Array[StateRegistryListener]
    ) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateRegistry")
  @js.native
  open class StateRegistry protected ()
    extends typings.uirouterCore.libStateStateRegistryMod.StateRegistry {
    /** @internal */
    def this(router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "StateService")
  @js.native
  open class StateService protected ()
    extends typings.uirouterCore.libStateStateServiceMod.StateService {
    /** @internal */
    def this(/** @internal */ router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/state", "TargetState")
  @js.native
  open class TargetState protected ()
    extends typings.uirouterCore.libStateTargetStateMod.TargetState {
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
      * @internal
      */
    def this(
      _stateRegistry: typings.uirouterCore.libStateStateRegistryMod.StateRegistry,
      _identifier: StateOrName
    ) = this()
    def this(
      _stateRegistry: typings.uirouterCore.libStateStateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams
    ) = this()
    def this(
      _stateRegistry: typings.uirouterCore.libStateStateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: Unit,
      _options: TransitionOptions
    ) = this()
    def this(
      _stateRegistry: typings.uirouterCore.libStateStateRegistryMod.StateRegistry,
      _identifier: StateOrName,
      _params: RawParams,
      _options: TransitionOptions
    ) = this()
  }
  /* static members */
  object TargetState {
    
    @JSImport("@uirouter/core/lib/state", "TargetState")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns true if the object has a state property that might be a state or state name */
    inline def isDef(obj: Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isDef")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @uirouter/core.@uirouter/core/lib/state/interface.TargetStateDef */ Boolean]
  }
  
  inline def resolvablesBuilder(state: typings.uirouterCore.libStateStateObjectMod.StateObject): js.Array[Resolvable] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolvablesBuilder")(state.asInstanceOf[js.Any]).asInstanceOf[js.Array[Resolvable]]
}
