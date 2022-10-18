package typings.uirouterCore

import typings.uirouterCore.anon.TypeofTransition
import typings.uirouterCore.libPathPathNodeMod.PathNode
import typings.uirouterCore.libRouterMod.UIRouter
import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import typings.uirouterCore.libStateStateObjectMod.StateObject
import typings.uirouterCore.libStateTargetStateMod.TargetState
import typings.uirouterCore.libTransitionInterfaceMod.HookFn
import typings.uirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typings.uirouterCore.libTransitionInterfaceMod.HookMatchCriterion
import typings.uirouterCore.libTransitionInterfaceMod.HookRegOptions
import typings.uirouterCore.libTransitionInterfaceMod.HookResult
import typings.uirouterCore.libTransitionInterfaceMod.IHookRegistry
import typings.uirouterCore.libTransitionInterfaceMod.PathType
import typings.uirouterCore.libTransitionInterfaceMod.TransitionHookOptions
import typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typings.uirouterCore.libTransitionInterfaceMod.TransitionOptions
import typings.uirouterCore.libTransitionTransitionHookMod.ErrorHandler
import typings.uirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.uirouterCore.libTransitionTransitionHookMod.GetResultHandler
import typings.uirouterCore.libTransitionTransitionHookMod.ResultHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransitionMod {
  
  @JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/transition", "HookBuilder")
  @js.native
  open class HookBuilder protected ()
    extends typings.uirouterCore.libTransitionHookBuilderMod.HookBuilder {
    def this(transition: typings.uirouterCore.libTransitionTransitionMod.Transition) = this()
  }
  
  @JSImport("@uirouter/core/lib/transition", "RegisteredHook")
  @js.native
  open class RegisteredHook protected ()
    extends typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook {
    def this(
      tranSvc: typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook, Unit]
    ) = this()
    def this(
      tranSvc: typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook, Unit],
      options: HookRegOptions
    ) = this()
  }
  
  @JSImport("@uirouter/core/lib/transition", "RejectType")
  @js.native
  object RejectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.libTransitionRejectFactoryMod.RejectType & Double] = js.native
    
    /* 3 */ val ABORTED: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.ABORTED & Double = js.native
    
    /* 6 */ val ERROR: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.ERROR & Double = js.native
    
    /* 5 */ val IGNORED: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.IGNORED & Double = js.native
    
    /* 4 */ val INVALID: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.INVALID & Double = js.native
    
    /* 2 */ val SUPERSEDED: typings.uirouterCore.libTransitionRejectFactoryMod.RejectType.SUPERSEDED & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition", "Rejection")
  @js.native
  open class Rejection protected ()
    extends typings.uirouterCore.libTransitionRejectFactoryMod.Rejection {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: String, detail: Any) = this()
    def this(`type`: Double, message: Unit, detail: Any) = this()
  }
  /* static members */
  object Rejection {
    
    @JSImport("@uirouter/core/lib/transition", "Rejection")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a Rejection due to aborted transition */
    inline def aborted(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def aborted(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to aborted transition */
    inline def errored(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def errored(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to ignored transition */
    inline def ignored(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def ignored(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to invalid transition */
    inline def invalid(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def invalid(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    inline def isRejectionPromise(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejectionPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    inline def normalize(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def normalize(detail: js.Error): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def normalize(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def normalize(detail: typings.uirouterCore.libTransitionRejectFactoryMod.Rejection): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to redirected transition */
    inline def redirected(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def redirected(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to transition superseded */
    inline def superseded(): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")().asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def superseded(detail: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def superseded(detail: Any, options: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
    inline def superseded(detail: Unit, options: Any): typings.uirouterCore.libTransitionRejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.libTransitionRejectFactoryMod.Rejection]
  }
  
  @JSImport("@uirouter/core/lib/transition", "Transition")
  @js.native
  open class Transition protected ()
    extends typings.uirouterCore.libTransitionTransitionMod.Transition {
    /**
      * Creates a new Transition object.
      *
      * If the target state is not valid, an error is thrown.
      *
      * @internal
      *
      * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
      *        encapsulates the "from state".
      * @param targetState The target state and parameters being transitioned to (also, the transition options)
      * @param router The [[UIRouter]] instance
      * @internal
      */
    def this(fromPath: js.Array[PathNode], targetState: TargetState, router: UIRouter) = this()
  }
  /* static members */
  object Transition {
    
    @JSImport("@uirouter/core/lib/transition", "Transition")
    @js.native
    val ^ : js.Any = js.native
    
    /** @internal */
    @JSImport("@uirouter/core/lib/transition", "Transition.diToken")
    @js.native
    def diToken: TypeofTransition = js.native
    inline def diToken_=(x: TypeofTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diToken")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionEventType")
  @js.native
  open class TransitionEventType protected ()
    extends typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType {
    def this(name: String, hookPhase: TransitionHookPhase, hookOrder: Double, criteriaMatchPath: PathType) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: Unit,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: Unit,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: Unit,
      synchronous: Boolean
    ) = this()
    def this(
      name: String,
      hookPhase: TransitionHookPhase,
      hookOrder: Double,
      criteriaMatchPath: PathType,
      reverseSort: Unit,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler,
      synchronous: Boolean
    ) = this()
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionHook")
  @js.native
  open class TransitionHook protected ()
    extends typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook {
    def this(
      transition: typings.uirouterCore.libTransitionTransitionMod.Transition,
      stateContext: StateDeclaration,
      registeredHook: typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook,
      options: TransitionHookOptions
    ) = this()
  }
  /* static members */
  object TransitionHook {
    
    @JSImport("@uirouter/core/lib/transition", "TransitionHook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSImport("@uirouter/core/lib/transition", "TransitionHook.HANDLE_RESULT")
    @js.native
    def HANDLE_RESULT: GetResultHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    inline def HANDLE_RESULT(hook: typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("HANDLE_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
    inline def HANDLE_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HANDLE_RESULT")(x.asInstanceOf[js.Any])
    
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSImport("@uirouter/core/lib/transition", "TransitionHook.LOG_ERROR")
    @js.native
    def LOG_ERROR: GetErrorHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    inline def LOG_ERROR(hook: typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    inline def LOG_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSImport("@uirouter/core/lib/transition", "TransitionHook.LOG_REJECTED_RESULT")
    @js.native
    def LOG_REJECTED_RESULT: GetResultHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    inline def LOG_REJECTED_RESULT(hook: typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_REJECTED_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
    inline def LOG_REJECTED_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_REJECTED_RESULT")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition", "TransitionHook.REJECT_ERROR")
    @js.native
    def REJECT_ERROR: GetErrorHandler = js.native
    inline def REJECT_ERROR(hook: typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("REJECT_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    inline def REJECT_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition", "TransitionHook.THROW_ERROR")
    @js.native
    def THROW_ERROR: GetErrorHandler = js.native
    inline def THROW_ERROR(hook: typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("THROW_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    inline def THROW_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROW_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * Chains together an array of TransitionHooks.
      *
      * Given a list of [[TransitionHook]] objects, chains them together.
      * Each hook is invoked after the previous one completes.
      *
      * #### Example:
      * ```js
      * var hooks: TransitionHook[] = getHooks();
      * let promise: Promise<any> = TransitionHook.chain(hooks);
      *
      * promise.then(handleSuccess, handleError);
      * ```
      *
      * @param hooks the list of hooks to chain together
      * @param waitFor if provided, the chain is `.then()`'ed off this promise
      * @returns a `Promise` for sequentially invoking the hooks (in order)
      */
    inline def chain(hooks: js.Array[typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(hooks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def chain(
      hooks: js.Array[typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook],
      waitFor: js.Promise[Any]
    ): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(hooks.asInstanceOf[js.Any], waitFor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
    /**
      * Invokes all the provided TransitionHooks, in order.
      * Each hook's return value is checked.
      * If any hook returns a promise, then the rest of the hooks are chained off that promise, and the promise is returned.
      * If no hook returns a promise, then all hooks are processed synchronously.
      *
      * @param hooks the list of TransitionHooks to invoke
      * @param doneCallback a callback that is invoked after all the hooks have successfully completed
      *
      * @returns a promise for the async result, or the result of the callback
      */
    inline def invokeHooks[T](
      hooks: js.Array[typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[Any] | T = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeHooks")(hooks.asInstanceOf[js.Any], doneCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any] | T]
    
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    inline def runAllHooks(hooks: js.Array[typings.uirouterCore.libTransitionTransitionHookMod.TransitionHook]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllHooks")(hooks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionHookPhase")
  @js.native
  object TransitionHookPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase & Double] = js.native
    
    /* 1 */ val BEFORE: typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase.BEFORE & Double = js.native
    
    /* 0 */ val CREATE: typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase.CREATE & Double = js.native
    
    /* 4 */ val ERROR: typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase.ERROR & Double = js.native
    
    /* 2 */ val RUN: typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase.RUN & Double = js.native
    
    /* 3 */ val SUCCESS: typings.uirouterCore.libTransitionInterfaceMod.TransitionHookPhase.SUCCESS & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionHookScope")
  @js.native
  object TransitionHookScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.libTransitionInterfaceMod.TransitionHookScope & Double] = js.native
    
    /* 1 */ val STATE: typings.uirouterCore.libTransitionInterfaceMod.TransitionHookScope.STATE & Double = js.native
    
    /* 0 */ val TRANSITION: typings.uirouterCore.libTransitionInterfaceMod.TransitionHookScope.TRANSITION & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionService")
  @js.native
  open class TransitionService protected ()
    extends typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService {
    /** @internal */
    def this(_router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/transition", "defaultTransOpts")
  @js.native
  def defaultTransOpts: TransitionOptions = js.native
  inline def defaultTransOpts_=(x: TransitionOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTransOpts")(x.asInstanceOf[js.Any])
  
  inline def makeEvent(
    registry: IHookRegistry,
    transitionService: typings.uirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[/* matchObject */ Any, /* callback */ Any, /* options */ js.UndefOr[js.Object], Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEvent")(registry.asInstanceOf[js.Any], transitionService.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[js.Function3[/* matchObject */ Any, /* callback */ Any, /* options */ js.UndefOr[js.Object], Any]]
  
  inline def matchState(
    state: StateObject,
    criterion: HookMatchCriterion,
    transition: typings.uirouterCore.libTransitionTransitionMod.Transition
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], criterion.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
