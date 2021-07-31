package typings.uirouterCore

import typings.uirouterCore.anon.ActivateViews
import typings.uirouterCore.hookRegistryMod.RegisteredHook
import typings.uirouterCore.interfaceMod.Disposable
import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.targetStateMod.TargetState
import typings.uirouterCore.transitionEventTypeMod.TransitionEventType
import typings.uirouterCore.transitionHookMod.GetErrorHandler
import typings.uirouterCore.transitionHookMod.GetResultHandler
import typings.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typings.uirouterCore.transitionInterfaceMod.HookRegOptions
import typings.uirouterCore.transitionInterfaceMod.IHookRegistry
import typings.uirouterCore.transitionInterfaceMod.PathType
import typings.uirouterCore.transitionInterfaceMod.PathTypes
import typings.uirouterCore.transitionInterfaceMod.RegisteredHooks
import typings.uirouterCore.transitionInterfaceMod.TransitionCreateHookFn
import typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import typings.uirouterCore.transitionInterfaceMod.TransitionHookScope
import typings.uirouterCore.transitionInterfaceMod.TransitionOptions
import typings.uirouterCore.transitionTransitionMod.Transition
import typings.uirouterCore.viewViewMod.ViewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionServiceMod {
  
  @JSImport("@uirouter/core/lib/transition/transitionService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/transition/transitionService", "TransitionService")
  @js.native
  class TransitionService protected ()
    extends StObject
       with IHookRegistry
       with Disposable {
    /** @internal */
    def this(_router: UIRouter) = this()
    
    /** @internal */
    @JSName("$view")
    var $view: ViewService = js.native
    
    /** The  paths on a criteria object */
    var _criteriaPaths: js.Any = js.native
    
    /** @internal */
    var _defineCoreEvents: js.Any = js.native
    
    /** @internal */
    var _defineCorePaths: js.Any = js.native
    
    /** @internal */
    def _defineEvent(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      synchronous: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      synchronous: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      synchronous: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      synchronous: Boolean
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): Unit = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ): Unit = js.native
    
    /**
      * Adds a Path to be used as a criterion against a TreeChanges path
      *
      * For example: the `exiting` path in [[HookMatchCriteria]] is a STATE scoped path.
      * It was defined by calling `defineTreeChangesCriterion('exiting', TransitionHookScope.STATE)`
      * Each state in the exiting path is checked against the criteria and returned as part of the match.
      *
      * Another example: the `to` path in [[HookMatchCriteria]] is a TRANSITION scoped path.
      * It was defined by calling `defineTreeChangesCriterion('to', TransitionHookScope.TRANSITION)`
      * Only the tail of the `to` path is checked against the criteria and returned as part of the match.
      *
      * @internal
      */
    var _definePathType: js.Any = js.native
    
    /**
      * This object has hook de-registration functions for the built-in hooks.
      * This can be used by third parties libraries that wish to customize the behaviors
      *
      * @internal
      */
    var _deregisterHookFns: ActivateViews = js.native
    
    /** The transition hook types, such as `onEnter`, `onStart`, etc */
    var _eventTypes: js.Any = js.native
    
    /** @internal */
    var _getEvents: js.Any = js.native
    
    /** @internal */
    var _getPathTypes: js.Any = js.native
    
    /** @internal */
    var _pluginapi: TransitionServicePluginAPI = js.native
    
    /** @internal */
    var _registerCoreTransitionHooks: js.Any = js.native
    
    /** @internal The registered transition hooks */
    @JSName("_registeredHooks")
    var _registeredHooks_TransitionService: RegisteredHooks = js.native
    
    var _router: js.Any = js.native
    
    /** @internal */
    var _transitionCount: Double = js.native
    
    /**
      * Creates a new [[Transition]] object
      *
      * This is a factory function for creating new Transition objects.
      * It is used internally by the [[StateService]] and should generally not be called by application code.
      *
      * @internal
      * @param fromPath the path to the current state (the from state)
      * @param targetState the target state (destination)
      * @returns a Transition
      */
    def create(fromPath: js.Array[PathNode], targetState: TargetState): Transition = js.native
    
    /**
      * Registers a [[TransitionHookFn]], called *while a transition is being constructed*.
      *
      * Registers a transition lifecycle hook, which is invoked during transition construction.
      *
      * This low level hook should only be used by plugins.
      * This can be a useful time for plugins to add resolves or mutate the transition as needed.
      * The Sticky States plugin uses this hook to modify the treechanges.
      *
      * ### Lifecycle
      *
      * `onCreate` hooks are invoked *while a transition is being constructed*.
      *
      * ### Return value
      *
      * The hook's return value is ignored
      *
      * @internal
      * @param criteria defines which Transitions the Hook should be invoked for.
      * @param callback the hook function which will be invoked.
      * @param options the registration options
      * @returns a function which deregisters the hook.
      */
    def onCreate(criteria: HookMatchCriteria, callback: TransitionCreateHookFn): js.Function = js.native
    def onCreate(criteria: HookMatchCriteria, callback: TransitionCreateHookFn, options: HookRegOptions): js.Function = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition/transitionService", "defaultTransOpts")
  @js.native
  def defaultTransOpts: TransitionOptions = js.native
  @scala.inline
  def defaultTransOpts_=(x: TransitionOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTransOpts")(x.asInstanceOf[js.Any])
  
  @js.native
  trait TransitionServicePluginAPI extends StObject {
    
    /**
      * Defines a transition hook type and returns a transition hook registration
      * function (which can then be used to register hooks of this type).
      */
    def _defineEvent(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): js.Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): js.Any = js.native
    
    /**
      * Adds a Path to be used as a criterion against a TreeChanges path
      *
      * For example: the `exiting` path in [[HookMatchCriteria]] is a STATE scoped path.
      * It was defined by calling `defineTreeChangesCriterion('exiting', TransitionHookScope.STATE)`
      * Each state in the exiting path is checked against the criteria and returned as part of the match.
      *
      * Another example: the `to` path in [[HookMatchCriteria]] is a TRANSITION scoped path.
      * It was defined by calling `defineTreeChangesCriterion('to', TransitionHookScope.TRANSITION)`
      * Only the tail of the `to` path is checked against the criteria and returned as part of the match.
      */
    def _definePathType(name: String, hookScope: TransitionHookScope): js.Any = js.native
    
    /**
      * Returns the known event types, such as `onBefore`
      * If a phase argument is provided, returns only events for the given phase.
      */
    def _getEvents(): js.Array[TransitionEventType] = js.native
    def _getEvents(phase: TransitionHookPhase): js.Array[TransitionEventType] = js.native
    
    /**
      * Gets a Path definition used as a criterion against a TreeChanges path
      */
    def _getPathTypes(): PathTypes = js.native
    
    /** Returns the hooks registered for the given hook name */
    def getHooks(hookName: String): js.Array[RegisteredHook] = js.native
  }
}
