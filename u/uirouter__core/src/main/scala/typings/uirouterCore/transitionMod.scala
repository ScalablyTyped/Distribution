package typings.uirouterCore

import typings.std.Error
import typings.uirouterCore.anon.TypeofTransition
import typings.uirouterCore.pathNodeMod.PathNode
import typings.uirouterCore.routerMod.UIRouter
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.targetStateMod.TargetState
import typings.uirouterCore.transitionHookMod.ErrorHandler
import typings.uirouterCore.transitionHookMod.GetErrorHandler
import typings.uirouterCore.transitionHookMod.GetResultHandler
import typings.uirouterCore.transitionHookMod.ResultHandler
import typings.uirouterCore.transitionInterfaceMod.HookFn
import typings.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typings.uirouterCore.transitionInterfaceMod.HookMatchCriterion
import typings.uirouterCore.transitionInterfaceMod.HookRegOptions
import typings.uirouterCore.transitionInterfaceMod.HookResult
import typings.uirouterCore.transitionInterfaceMod.IHookRegistry
import typings.uirouterCore.transitionInterfaceMod.PathType
import typings.uirouterCore.transitionInterfaceMod.TransitionHookOptions
import typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase
import typings.uirouterCore.transitionInterfaceMod.TransitionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionMod {
  
  @JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@uirouter/core/lib/transition", "HookBuilder")
  @js.native
  class HookBuilder protected ()
    extends typings.uirouterCore.hookBuilderMod.HookBuilder {
    def this(transition: typings.uirouterCore.transitionTransitionMod.Transition) = this()
  }
  
  @JSImport("@uirouter/core/lib/transition", "RegisteredHook")
  @js.native
  class RegisteredHook protected ()
    extends typings.uirouterCore.hookRegistryMod.RegisteredHook {
    def this(
      tranSvc: typings.uirouterCore.transitionServiceMod.TransitionService,
      eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.hookRegistryMod.RegisteredHook, Unit]
    ) = this()
    def this(
      tranSvc: typings.uirouterCore.transitionServiceMod.TransitionService,
      eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.hookRegistryMod.RegisteredHook, Unit],
      options: HookRegOptions
    ) = this()
  }
  
  @JSImport("@uirouter/core/lib/transition", "RejectType")
  @js.native
  object RejectType extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.rejectFactoryMod.RejectType & Double] = js.native
    
    /* 3 */ val ABORTED: typings.uirouterCore.rejectFactoryMod.RejectType.ABORTED & Double = js.native
    
    /* 6 */ val ERROR: typings.uirouterCore.rejectFactoryMod.RejectType.ERROR & Double = js.native
    
    /* 5 */ val IGNORED: typings.uirouterCore.rejectFactoryMod.RejectType.IGNORED & Double = js.native
    
    /* 4 */ val INVALID: typings.uirouterCore.rejectFactoryMod.RejectType.INVALID & Double = js.native
    
    /* 2 */ val SUPERSEDED: typings.uirouterCore.rejectFactoryMod.RejectType.SUPERSEDED & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition", "Rejection")
  @js.native
  class Rejection protected ()
    extends typings.uirouterCore.rejectFactoryMod.Rejection {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: String, detail: js.Any) = this()
    def this(`type`: Double, message: Unit, detail: js.Any) = this()
  }
  /* static members */
  object Rejection {
    
    @JSImport("@uirouter/core/lib/transition", "Rejection")
    @js.native
    val ^ : js.Any = js.native
    
    /** Returns a Rejection due to aborted transition */
    @scala.inline
    def aborted(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def aborted(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("aborted")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to aborted transition */
    @scala.inline
    def errored(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def errored(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("errored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to ignored transition */
    @scala.inline
    def ignored(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def ignored(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("ignored")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to invalid transition */
    @scala.inline
    def invalid(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def invalid(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("invalid")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    @scala.inline
    def isRejectionPromise(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejectionPromise")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
    
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    @scala.inline
    def normalize(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def normalize(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def normalize(detail: Error): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def normalize(detail: typings.uirouterCore.rejectFactoryMod.Rejection): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("normalize")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to redirected transition */
    @scala.inline
    def redirected(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def redirected(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("redirected")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    
    /** Returns a Rejection due to transition superseded */
    @scala.inline
    def superseded(): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")().asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def superseded(detail: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = ^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any]).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def superseded(detail: js.Any, options: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
    @scala.inline
    def superseded(detail: Unit, options: js.Any): typings.uirouterCore.rejectFactoryMod.Rejection = (^.asInstanceOf[js.Dynamic].applyDynamic("superseded")(detail.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[typings.uirouterCore.rejectFactoryMod.Rejection]
  }
  
  @JSImport("@uirouter/core/lib/transition", "Transition")
  @js.native
  class Transition protected ()
    extends typings.uirouterCore.transitionTransitionMod.Transition {
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
    @scala.inline
    def diToken_=(x: TypeofTransition): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("diToken")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionEventType")
  @js.native
  class TransitionEventType protected ()
    extends typings.uirouterCore.transitionEventTypeMod.TransitionEventType {
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
  class TransitionHook protected ()
    extends typings.uirouterCore.transitionHookMod.TransitionHook {
    def this(
      transition: typings.uirouterCore.transitionTransitionMod.Transition,
      stateContext: StateDeclaration,
      registeredHook: typings.uirouterCore.hookRegistryMod.RegisteredHook,
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
    @scala.inline
    def HANDLE_RESULT(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("HANDLE_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
    @scala.inline
    def HANDLE_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HANDLE_RESULT")(x.asInstanceOf[js.Any])
    
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
    @scala.inline
    def LOG_ERROR(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    @scala.inline
    def LOG_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_ERROR")(x.asInstanceOf[js.Any])
    
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
    @scala.inline
    def LOG_REJECTED_RESULT(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_REJECTED_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
    @scala.inline
    def LOG_REJECTED_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_REJECTED_RESULT")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition", "TransitionHook.REJECT_ERROR")
    @js.native
    def REJECT_ERROR: GetErrorHandler = js.native
    @scala.inline
    def REJECT_ERROR(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("REJECT_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    @scala.inline
    def REJECT_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition", "TransitionHook.THROW_ERROR")
    @js.native
    def THROW_ERROR: GetErrorHandler = js.native
    @scala.inline
    def THROW_ERROR(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("THROW_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    @scala.inline
    def THROW_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("THROW_ERROR")(x.asInstanceOf[js.Any])
    
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
    @scala.inline
    def chain(hooks: js.Array[typings.uirouterCore.transitionHookMod.TransitionHook]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(hooks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
    @scala.inline
    def chain(
      hooks: js.Array[typings.uirouterCore.transitionHookMod.TransitionHook],
      waitFor: js.Promise[js.Any]
    ): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(hooks.asInstanceOf[js.Any], waitFor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
    
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
    @scala.inline
    def invokeHooks[T](
      hooks: js.Array[typings.uirouterCore.transitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[js.Any] | T = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeHooks")(hooks.asInstanceOf[js.Any], doneCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | T]
    
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    @scala.inline
    def runAllHooks(hooks: js.Array[typings.uirouterCore.transitionHookMod.TransitionHook]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllHooks")(hooks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionHookPhase")
  @js.native
  object TransitionHookPhase extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase & Double] = js.native
    
    /* 1 */ val BEFORE: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase.BEFORE & Double = js.native
    
    /* 0 */ val CREATE: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase.CREATE & Double = js.native
    
    /* 4 */ val ERROR: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase.ERROR & Double = js.native
    
    /* 2 */ val RUN: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase.RUN & Double = js.native
    
    /* 3 */ val SUCCESS: typings.uirouterCore.transitionInterfaceMod.TransitionHookPhase.SUCCESS & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionHookScope")
  @js.native
  object TransitionHookScope extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.uirouterCore.transitionInterfaceMod.TransitionHookScope & Double] = js.native
    
    /* 1 */ val STATE: typings.uirouterCore.transitionInterfaceMod.TransitionHookScope.STATE & Double = js.native
    
    /* 0 */ val TRANSITION: typings.uirouterCore.transitionInterfaceMod.TransitionHookScope.TRANSITION & Double = js.native
  }
  
  @JSImport("@uirouter/core/lib/transition", "TransitionService")
  @js.native
  class TransitionService protected ()
    extends typings.uirouterCore.transitionServiceMod.TransitionService {
    /** @internal */
    def this(_router: UIRouter) = this()
  }
  
  @JSImport("@uirouter/core/lib/transition", "defaultTransOpts")
  @js.native
  def defaultTransOpts: TransitionOptions = js.native
  @scala.inline
  def defaultTransOpts_=(x: TransitionOptions): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultTransOpts")(x.asInstanceOf[js.Any])
  
  @scala.inline
  def makeEvent(
    registry: IHookRegistry,
    transitionService: typings.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("makeEvent")(registry.asInstanceOf[js.Any], transitionService.asInstanceOf[js.Any], eventType.asInstanceOf[js.Any])).asInstanceOf[js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    js.Any
  ]]
  
  @scala.inline
  def matchState(
    state: StateObject,
    criterion: HookMatchCriterion,
    transition: typings.uirouterCore.transitionTransitionMod.Transition
  ): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("matchState")(state.asInstanceOf[js.Any], criterion.asInstanceOf[js.Any], transition.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
