package typings.atUirouterCore

import typings.atUirouterCore.libPathPathNodeMod.PathNode
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateInterfaceMod.StateDeclaration
import typings.atUirouterCore.libStateStateObjectMod.StateObject
import typings.atUirouterCore.libStateTargetStateMod.TargetState
import typings.atUirouterCore.libTransitionInterfaceMod.HookFn
import typings.atUirouterCore.libTransitionInterfaceMod.HookMatchCriteria
import typings.atUirouterCore.libTransitionInterfaceMod.HookMatchCriterion
import typings.atUirouterCore.libTransitionInterfaceMod.HookRegOptions
import typings.atUirouterCore.libTransitionInterfaceMod.HookResult
import typings.atUirouterCore.libTransitionInterfaceMod.IHookRegistry
import typings.atUirouterCore.libTransitionInterfaceMod.PathType
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookOptions
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase
import typings.atUirouterCore.libTransitionInterfaceMod.TransitionOptions
import typings.atUirouterCore.libTransitionTransitionHookMod.ErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetErrorHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.GetResultHandler
import typings.atUirouterCore.libTransitionTransitionHookMod.ResultHandler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/transition", JSImport.Namespace)
@js.native
object libTransitionMod extends js.Object {
  @js.native
  class HookBuilder protected ()
    extends typings.atUirouterCore.libTransitionHookBuilderMod.HookBuilder {
    def this(transition: typings.atUirouterCore.libTransitionTransitionMod.Transition) = this()
  }
  
  @js.native
  class RegisteredHook protected ()
    extends typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook {
    def this(
      tranSvc: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[
            /* hook */ typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
            Unit
          ]
    ) = this()
    def this(
      tranSvc: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
      eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType,
      callback: HookFn,
      matchCriteria: HookMatchCriteria,
      removeHookFromRegistry: js.Function1[
            /* hook */ typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook, 
            Unit
          ],
      options: HookRegOptions
    ) = this()
  }
  
  @js.native
  class Rejection protected ()
    extends typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection {
    def this(`type`: Double) = this()
    def this(`type`: Double, message: String) = this()
    def this(`type`: Double, message: String, detail: js.Any) = this()
  }
  
  @js.native
  class Transition protected ()
    extends typings.atUirouterCore.libTransitionTransitionMod.Transition {
    /**
      * Creates a new Transition object.
      *
      * If the target state is not valid, an error is thrown.
      *
      * @internalapi
      *
      * @param fromPath The path of [[PathNode]]s from which the transition is leaving.  The last node in the `fromPath`
      *        encapsulates the "from state".
      * @param targetState The target state and parameters being transitioned to (also, the transition options)
      * @param router The [[UIRouter]] instance
      */
    def this(fromPath: js.Array[PathNode], targetState: TargetState, router: UIRouter) = this()
  }
  
  @js.native
  class TransitionEventType protected ()
    extends typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType {
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
      reverseSort: Boolean,
      getResultHandler: GetResultHandler,
      getErrorHandler: GetErrorHandler
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
  }
  
  @js.native
  class TransitionHook protected ()
    extends typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook {
    def this(
      transition: typings.atUirouterCore.libTransitionTransitionMod.Transition,
      stateContext: StateDeclaration,
      registeredHook: typings.atUirouterCore.libTransitionHookRegistryMod.RegisteredHook,
      options: TransitionHookOptions
    ) = this()
  }
  
  @js.native
  class TransitionService protected ()
    extends typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService {
    /** @hidden */
    def this(_router: UIRouter) = this()
  }
  
  var defaultTransOpts: TransitionOptions = js.native
  def makeEvent(
    registry: IHookRegistry,
    transitionService: typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService,
    eventType: typings.atUirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
  ): js.Function3[
    /* matchObject */ js.Any, 
    /* callback */ js.Any, 
    /* options */ js.UndefOr[js.Object], 
    _
  ] = js.native
  def matchState(
    state: StateObject,
    criterion: HookMatchCriterion,
    transition: typings.atUirouterCore.libTransitionTransitionMod.Transition
  ): Boolean = js.native
  @js.native
  object RejectType extends js.Object {
    /* 3 */ val ABORTED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ABORTED with Double = js.native
    /* 6 */ val ERROR: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.ERROR with Double = js.native
    /* 5 */ val IGNORED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.IGNORED with Double = js.native
    /* 4 */ val INVALID: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.INVALID with Double = js.native
    /* 2 */ val SUPERSEDED: typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType.SUPERSEDED with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libTransitionRejectFactoryMod.RejectType with Double] = js.native
  }
  
  /* static members */
  @js.native
  object Rejection extends js.Object {
    /** Returns a Rejection due to aborted transition */
    def aborted(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def aborted(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to aborted transition */
    def errored(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def errored(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to ignored transition */
    def ignored(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def ignored(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to invalid transition */
    def invalid(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def invalid(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns true if the obj is a rejected promise created from the `asPromise` factory */
    def isRejectionPromise(obj: js.Any): Boolean = js.native
    /**
      * Returns a Rejection
      *
      * Normalizes a value as a Rejection.
      * If the value is already a Rejection, returns it.
      * Otherwise, wraps and returns the value as a Rejection (Rejection type: ERROR).
      *
      * @returns `detail` if it is already a `Rejection`, else returns an ERROR Rejection.
      */
    def normalize(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def normalize(detail: Error): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to redirected transition */
    def redirected(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def redirected(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    /** Returns a Rejection due to transition superseded */
    def superseded(): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
    def superseded(detail: js.Any, options: js.Any): typings.atUirouterCore.libTransitionRejectFactoryMod.Rejection = js.native
  }
  
  /* static members */
  @js.native
  object Transition extends js.Object {
    /** @hidden */
    var diToken: TypeofClassTransition = js.native
  }
  
  /* static members */
  @js.native
  object TransitionHook extends js.Object {
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("HANDLE_RESULT")
    var HANDLE_RESULT_Original: GetResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSName("LOG_ERROR")
    var LOG_ERROR_Original: GetErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSName("LOG_REJECTED_RESULT")
    var LOG_REJECTED_RESULT_Original: GetResultHandler = js.native
    @JSName("REJECT_ERROR")
    var REJECT_ERROR_Original: GetErrorHandler = js.native
    @JSName("THROW_ERROR")
    var THROW_ERROR_Original: GetErrorHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def HANDLE_RESULT(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    def LOG_ERROR(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    def LOG_REJECTED_RESULT(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ResultHandler = js.native
    def REJECT_ERROR(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
    def THROW_ERROR(hook: typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook): ErrorHandler = js.native
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
    def chain(hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook]): js.Promise[_] = js.native
    def chain(
      hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook],
      waitFor: js.Promise[_]
    ): js.Promise[_] = js.native
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
    def invokeHooks[T](
      hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[_] | T = js.native
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    def runAllHooks(hooks: js.Array[typings.atUirouterCore.libTransitionTransitionHookMod.TransitionHook]): Unit = js.native
  }
  
  @js.native
  object TransitionHookPhase extends js.Object {
    /* 1 */ val BEFORE: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.BEFORE with Double = js.native
    /* 0 */ val CREATE: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.CREATE with Double = js.native
    /* 4 */ val ERROR: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.ERROR with Double = js.native
    /* 2 */ val RUN: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.RUN with Double = js.native
    /* 3 */ val SUCCESS: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase.SUCCESS with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookPhase with Double] = js.native
  }
  
  @js.native
  object TransitionHookScope extends js.Object {
    /* 1 */ val STATE: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.STATE with Double = js.native
    /* 0 */ val TRANSITION: typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope.TRANSITION with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.atUirouterCore.libTransitionInterfaceMod.TransitionHookScope with Double] = js.native
  }
  
}

