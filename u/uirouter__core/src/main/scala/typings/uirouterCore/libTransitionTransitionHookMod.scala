package typings.uirouterCore

import typings.uirouterCore.libStateInterfaceMod.StateDeclaration
import typings.uirouterCore.libTransitionHookRegistryMod.RegisteredHook
import typings.uirouterCore.libTransitionInterfaceMod.HookResult
import typings.uirouterCore.libTransitionInterfaceMod.TransitionHookOptions
import typings.uirouterCore.libTransitionTransitionEventTypeMod.TransitionEventType
import typings.uirouterCore.libTransitionTransitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTransitionTransitionHookMod {
  
  @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook")
  @js.native
  open class TransitionHook protected () extends StObject {
    def this(
      transition: Transition,
      stateContext: StateDeclaration,
      registeredHook: RegisteredHook,
      options: TransitionHookOptions
    ) = this()
    
    /**
      * Return a Rejection promise if the transition is no longer current due
      * to a stopped router (disposed), or a new transition has started and superseded this one.
      */
    /* private */ var getNotCurrentRejection: Any = js.native
    
    /**
      * This method handles the return value of a Transition Hook.
      *
      * A hook can return false (cancel), a TargetState (redirect),
      * or a promise (which may later resolve to false or a redirect)
      *
      * This also handles "transition superseded" -- when a new transition
      * was started while the hook was still running
      */
    def handleHookResult(result: HookResult): js.Promise[HookResult] = js.native
    
    def invokeHook(): js.Promise[HookResult] | Unit = js.native
    
    /* private */ var isSuperseded: Any = js.native
    
    def logError(err: Any): Any = js.native
    
    /* private */ var options: Any = js.native
    
    /* private */ var registeredHook: Any = js.native
    
    /* private */ var stateContext: Any = js.native
    
    /* private */ var transition: Any = js.native
    
    var `type`: TransitionEventType = js.native
  }
  /* static members */
  object TransitionHook {
    
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.HANDLE_RESULT")
    @js.native
    def HANDLE_RESULT: GetResultHandler = js.native
    /**
      * These GetResultHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
      */
    inline def HANDLE_RESULT(hook: TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("HANDLE_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
    inline def HANDLE_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HANDLE_RESULT")(x.asInstanceOf[js.Any])
    
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.LOG_ERROR")
    @js.native
    def LOG_ERROR: GetErrorHandler = js.native
    /**
      * These GetErrorHandler(s) are used by [[invokeHook]] below
      * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
      */
    inline def LOG_ERROR(hook: TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    inline def LOG_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_ERROR")(x.asInstanceOf[js.Any])
    
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.LOG_REJECTED_RESULT")
    @js.native
    def LOG_REJECTED_RESULT: GetResultHandler = js.native
    /**
      * If the result is a promise rejection, log it.
      * Otherwise, ignore the result.
      */
    inline def LOG_REJECTED_RESULT(hook: TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_REJECTED_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
    inline def LOG_REJECTED_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_REJECTED_RESULT")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.REJECT_ERROR")
    @js.native
    def REJECT_ERROR: GetErrorHandler = js.native
    inline def REJECT_ERROR(hook: TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("REJECT_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
    inline def REJECT_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.THROW_ERROR")
    @js.native
    def THROW_ERROR: GetErrorHandler = js.native
    inline def THROW_ERROR(hook: TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("THROW_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
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
    inline def chain(hooks: js.Array[TransitionHook]): js.Promise[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(hooks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Any]]
    inline def chain(hooks: js.Array[TransitionHook], waitFor: js.Promise[Any]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("chain")(hooks.asInstanceOf[js.Any], waitFor.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
    
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
      hooks: js.Array[TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[Any] | T = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeHooks")(hooks.asInstanceOf[js.Any], doneCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any] | T]
    
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    inline def runAllHooks(hooks: js.Array[TransitionHook]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllHooks")(hooks.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  type ErrorHandler = js.Function1[/* error */ Any, js.Promise[Any]]
  
  type GetErrorHandler = js.Function1[/* hook */ TransitionHook, ErrorHandler]
  
  type GetResultHandler = js.Function1[/* hook */ TransitionHook, ResultHandler]
  
  type ResultHandler = js.Function1[/* result */ HookResult, js.Promise[HookResult]]
}
