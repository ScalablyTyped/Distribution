package typings.uirouterCore

import typings.uirouterCore.anon.ActivateViews
import typings.uirouterCore.libInterfaceMod.Disposable
import typings.uirouterCore.libPathPathNodeMod.PathNode
import typings.uirouterCore.libRouterMod.UIRouter
import typings.uirouterCore.libStateTargetStateMod.TargetState
import typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook
import typings.uirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typings.uirouterCore.libTransitionInterfaceMod.HookRegOptions
import typings.uirouterCore.libTransitionInterfaceMod.IHookRegistry
import typings.uirouterCore.libTransitionInterfaceMod.PathType
import typings.uirouterCore.libTransitionInterfaceMod.PathTypes
import typings.uirouterCore.libTransitionInterfaceMod.RegisteredHooks
import typings.uirouterCore.libTransitionInterfaceMod.TransitionCreateHookFn
import typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typings.uirouterCore.libTransitionInterfaceMod.TransitionHookScope
import typings.uirouterCore.libTransitionInterfaceMod.TransitionOptions
import typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
import typings.uirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.uirouterCore.libTransitionTransitionHookMod.GetResultHandler
import typings.uirouterCore.libTransitionTransitionMod.Transition
import typings.uirouterCore.libViewViewMod.ViewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransitionTransitionServiceMod {
  
  @JSImport("@uirouter/core/lib/transition/transitionService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/transition/transitionService", "TransitionService")
  @js.native
  open class TransitionService protected ()
    extends StObject
       with IHookRegistry
       with Disposable {
    /** @internal */
    def this(_router: UIRouter) = this()
    
    /** @internal */
    @JSName("$view")
    var $view: ViewService = js.native
    
    /** The  paths on a criteria object */
    /* private */ var _criteriaPaths: Any = js.native
    
    /** @internal */
    /* private */ var _defineCoreEvents: Any = js.native
    
    /** @internal */
    /* private */ var _defineCorePaths: Any = js.native
    
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
    /* private */ var _definePathType: Any = js.native
    
    /**
      * This object has hook de-registration functions for the built-in hooks.
      * This can be used by third parties libraries that wish to customize the behaviors
      *
      * @internal
      */
    var _deregisterHookFns: ActivateViews = js.native
    
    /** The transition hook types, such as `onEnter`, `onStart`, etc */
    /* private */ var _eventTypes: Any = js.native
    
    /** @internal */
    /* private */ var _getEvents: Any = js.native
    
    /** @internal */
    /* private */ var _getPathTypes: Any = js.native
    
    /** @internal */
    var _pluginapi: TransitionServicePluginAPI = js.native
    
    /** @internal */
    /* private */ var _registerCoreTransitionHooks: Any = js.native
    
    /** @internal The registered transition hooks */
    @JSName("_registeredHooks")
    var _registeredHooks_TransitionService: RegisteredHooks = js.native
    
    /* private */ var _router: Any = js.native
    
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
  inline def defaultTransOpts_=(x: TransitionOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTransOpts")(x.asInstanceOf[js.Any])
  
  @js.native
  trait TransitionServicePluginAPI extends StObject {
    
    /**
      * Defines a transition hook type and returns a transition hook registration
      * function (which can then be used to register hooks of this type).
      */
    def _defineEvent(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ): Any = js.native
    def _defineEvent(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      rejectIfSuperseded: Boolean
    ): Any = js.native
    
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
    def _definePathType(name: String, hookScope: TransitionHookScope): Any = js.native
    
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
