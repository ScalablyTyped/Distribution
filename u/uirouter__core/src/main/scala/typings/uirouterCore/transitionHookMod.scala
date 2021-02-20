package typings.uirouterCore

import typings.uirouterCore.hookRegistryMod.RegisteredHook
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.transitionEventTypeMod.TransitionEventType
import typings.uirouterCore.transitionInterfaceMod.HookResult
import typings.uirouterCore.transitionInterfaceMod.TransitionHookOptions
import typings.uirouterCore.transitionTransitionMod.Transition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionHookMod {
  
  @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook")
  @js.native
  class TransitionHook protected () extends StObject {
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
    var getNotCurrentRejection: js.Any = js.native
    
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
    
    var isSuperseded: js.Any = js.native
    
    def logError(err: js.Any): js.Any = js.native
    
    var options: js.Any = js.native
    
    var registeredHook: js.Any = js.native
    
    var stateContext: js.Any = js.native
    
    var transition: js.Any = js.native
    
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
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.HANDLE_RESULT")
    @js.native
    def HANDLE_RESULT(hook: TransitionHook): ResultHandler = js.native
    @scala.inline
    def HANDLE_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HANDLE_RESULT")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.LOG_ERROR")
    @js.native
    def LOG_ERROR(hook: TransitionHook): ErrorHandler = js.native
    @scala.inline
    def LOG_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_ERROR")(x.asInstanceOf[js.Any])
    
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
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.LOG_REJECTED_RESULT")
    @js.native
    def LOG_REJECTED_RESULT(hook: TransitionHook): ResultHandler = js.native
    @scala.inline
    def LOG_REJECTED_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_REJECTED_RESULT")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.REJECT_ERROR")
    @js.native
    def REJECT_ERROR: GetErrorHandler = js.native
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.REJECT_ERROR")
    @js.native
    def REJECT_ERROR(hook: TransitionHook): ErrorHandler = js.native
    @scala.inline
    def REJECT_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECT_ERROR")(x.asInstanceOf[js.Any])
    
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.THROW_ERROR")
    @js.native
    def THROW_ERROR: GetErrorHandler = js.native
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.THROW_ERROR")
    @js.native
    def THROW_ERROR(hook: TransitionHook): ErrorHandler = js.native
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
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.chain")
    @js.native
    def chain(hooks: js.Array[TransitionHook]): js.Promise[_] = js.native
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.chain")
    @js.native
    def chain(hooks: js.Array[TransitionHook], waitFor: js.Promise[_]): js.Promise[_] = js.native
    
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
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.invokeHooks")
    @js.native
    def invokeHooks[T](
      hooks: js.Array[TransitionHook],
      doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
    ): js.Promise[_] | T = js.native
    
    /**
      * Run all TransitionHooks, ignoring their return value.
      */
    @JSImport("@uirouter/core/lib/transition/transitionHook", "TransitionHook.runAllHooks")
    @js.native
    def runAllHooks(hooks: js.Array[TransitionHook]): Unit = js.native
  }
  
  type ErrorHandler = js.Function1[/* error */ js.Any, js.Promise[js.Any]]
  
  type GetErrorHandler = js.Function1[/* hook */ TransitionHook, ErrorHandler]
  
  type GetResultHandler = js.Function1[/* hook */ TransitionHook, ResultHandler]
  
  type ResultHandler = js.Function1[/* result */ HookResult, js.Promise[HookResult]]
}
