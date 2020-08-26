package typings.uirouterCore

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.anon.Inherit
import typings.uirouterCore.anon.NameGlob
import typings.uirouterCore.anon.State
import typings.uirouterCore.anon.`0`
import typings.uirouterCore.paramMod.Param
import typings.uirouterCore.resolvableMod.Resolvable
import typings.uirouterCore.stateInterfaceMod.LazyLoadResult
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateInterfaceMod.ViewDeclaration
import typings.uirouterCore.stateInterfaceMod._StateDeclaration
import typings.uirouterCore.stateInterfaceMod._StateOrName
import typings.uirouterCore.targetStateMod.TargetState
import typings.uirouterCore.transitionInterfaceMod.HookResult
import typings.uirouterCore.transitionInterfaceMod.TransitionStateHookFn
import typings.uirouterCore.transitionTransitionMod.Transition
import typings.uirouterCore.urlMatcherMod.UrlMatcher
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/state/stateObject", JSImport.Namespace)
@js.native
object stateObjectMod extends js.Object {
  @js.native
  /** @deprecated use State.create() */
  class StateObject () extends _StateOrName {
    def this(config: StateDeclaration) = this()
    /** @internal */
    var __stateObjectCache: NameGlob = js.native
    /** Prototypally inherits from [[StateDeclaration.abstract]] */
    var `abstract`: Boolean = js.native
    /**
      * Prototypally inherits from [[StateDeclaration.data]]
      * Note: This is the only field on the [[StateDeclaration]] which is mutated.
      * The definition object's `data` field is replaced with a new object
      * which prototypally inherits from the parent state definition's `data` field.
      */
    var data: js.Any = js.native
    /**
      * An object containing the parent States' names as keys and
      * true as their values.
      */
    var includes: StringDictionary[Boolean] = js.native
    /** The name used to register the state */
    var name: String = js.native
    /** The nearest parent [[StateObject]] which has a URL */
    var navigable: StateObject = js.native
    /** Prototypally inherits from [[StateDeclaration.onEnter]] */
    @JSName("onEnter")
    var onEnter_Original: TransitionStateHookFn = js.native
    /** Prototypally inherits from [[StateDeclaration.onExit]] */
    @JSName("onExit")
    var onExit_Original: TransitionStateHookFn = js.native
    /** Prototypally inherits from [[StateDeclaration.onRetain]] */
    @JSName("onRetain")
    var onRetain_Original: TransitionStateHookFn = js.native
    /** The parameters for the state, built from the URL and [[StateDeclaration.params]] */
    var params: StringDictionary[Param] = js.native
    /** The parent [[StateObject]] */
    var parent: StateObject = js.native
    /** The parent [[StateObject]] objects from this state up to the root */
    var path: js.Array[StateObject] = js.native
    /** Prototypally inherits from [[StateDeclaration.redirectTo]] */
    var redirectTo: String | (js.Function1[/* $transition$ */ Transition, TargetState]) | State = js.native
    /** A list of [[Resolvable]] objects.  The internal representation of [[resolve]]. */
    var resolvables: js.Array[Resolvable] = js.native
    /** Prototypally inherits from [[StateDeclaration.resolve]] */
    var resolve: (StringDictionary[String | js.Array[_] | js.Function]) | js.Array[_] = js.native
    /** Prototypally inherits from [[StateDeclaration.resolvePolicy]] */
    var resolvePolicy: js.Any = js.native
    /**
      * The original [[StateDeclaration]] used to build this [[StateObject]].
      * Note: `this` object also prototypally inherits from the `self` declaration object.
      */
    var self: StateDeclaration = js.native
    /** A compiled URLMatcher which detects when the state's URL is matched */
    var url: UrlMatcher = js.native
    /**
      * The views for the state.
      * Note: `@uirouter/core` does not register a builder for views.
      * The framework specific code should register a `views` builder.
      */
    var views: StringDictionary[ViewDeclaration] = js.native
    /**
      * @deprecated this does not properly handle dot notation
      * @returns Returns a dot-separated name of the state.
      */
    def fqn(): String = js.native
    def is(ref: String): Boolean = js.native
    def is(ref: StateDeclaration): Boolean = js.native
    /**
      * Returns true if the provided parameter is the same state.
      *
      * Compares the identity of the state against the passed value, which is either an object
      * reference to the actual `State` instance, the original definition object passed to
      * `$stateProvider.state()`, or the fully-qualified name.
      *
      * @param ref Can be one of (a) a `State` instance, (b) an object that was passed
      *        into `$stateProvider.state()`, (c) the fully-qualified name of a state as a string.
      * @returns Returns `true` if `ref` matches the current `State` instance.
      */
    def is(ref: StateObject): Boolean = js.native
    /** Prototypally inherits from [[StateDeclaration.lazyLoad]] */
    def lazyLoad(transition: Transition, state: StateDeclaration): js.Promise[LazyLoadResult] = js.native
    /** Prototypally inherits from [[StateDeclaration.onEnter]] */
    def onEnter(transition: Transition, state: StateDeclaration): HookResult = js.native
    /** Prototypally inherits from [[StateDeclaration.onExit]] */
    def onExit(transition: Transition, state: StateDeclaration): HookResult = js.native
    /** Prototypally inherits from [[StateDeclaration.onRetain]] */
    def onRetain(transition: Transition, state: StateDeclaration): HookResult = js.native
    /**
      * Returns a single [[Param]] that is owned by the state
      *
      * If `opts.inherit` is true, it also searches the ancestor states` [[Param]]s.
      * @param id the name of the [[Param]] to return
      * @param opts options
      */
    def parameter(id: String): Param = js.native
    def parameter(id: String, opts: `0`): Param = js.native
    /**
      * Gets the state's `Param` objects
      *
      * Gets the list of [[Param]] objects owned by the state.
      * If `opts.inherit` is true, it also includes the ancestor states' [[Param]] objects.
      * If `opts.matchingKeys` exists, returns only `Param`s whose `id` is a key on the `matchingKeys` object
      *
      * @param opts options
      */
    def parameters(): js.Array[Param] = js.native
    def parameters(opts: Inherit): js.Array[Param] = js.native
    /**
      * Returns the root node of this state's tree.
      *
      * @returns The root of this state's tree.
      */
    def root(): StateObject = js.native
  }
  
  /* static members */
  @js.native
  object StateObject extends js.Object {
    /**
      * Create a state object to put the private/internal implementation details onto.
      * The object's prototype chain looks like:
      * (Internal State Object) -> (Copy of State.prototype) -> (State Declaration object) -> (State Declaration's prototype...)
      *
      * @param stateDecl the user-supplied State Declaration
      * @returns {StateObject} an internal State object
      */
    def create(stateDecl: _StateDeclaration): StateObject = js.native
    /** Predicate which returns true if the object is an internal [[StateObject]] object */
    def isState(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/stateObject.StateObject */ Boolean = js.native
    /** Predicate which returns true if the object is an class with @State() decorator */
    def isStateClass(stateDecl: _StateDeclaration): Boolean = js.native
    /** Predicate which returns true if the object is a [[StateDeclaration]] object */
    def isStateDeclaration(obj: js.Any): /* is @uirouter/core.@uirouter/core/lib/state/interface.StateDeclaration */ Boolean = js.native
  }
  
}

