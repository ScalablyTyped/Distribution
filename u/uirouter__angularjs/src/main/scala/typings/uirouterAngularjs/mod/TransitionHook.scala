package typings.uirouterAngularjs.mod

import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.transitionHookMod.ErrorHandler
import typings.uirouterCore.transitionHookMod.GetErrorHandler
import typings.uirouterCore.transitionHookMod.GetResultHandler
import typings.uirouterCore.transitionHookMod.ResultHandler
import typings.uirouterCore.transitionInterfaceMod.HookResult
import typings.uirouterCore.transitionInterfaceMod.TransitionHookOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uirouter/angularjs", "TransitionHook")
@js.native
class TransitionHook protected ()
  extends typings.uirouterCore.mod.TransitionHook {
  def this(
    transition: typings.uirouterCore.transitionTransitionMod.Transition,
    stateContext: StateDeclaration,
    registeredHook: typings.uirouterCore.hookRegistryMod.RegisteredHook,
    options: TransitionHookOptions
  ) = this()
}
/* static members */
object TransitionHook {
  
  @JSImport("@uirouter/angularjs", "TransitionHook")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * These GetResultHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
    */
  @JSImport("@uirouter/angularjs", "TransitionHook.HANDLE_RESULT")
  @js.native
  def HANDLE_RESULT: GetResultHandler = js.native
  /**
    * These GetResultHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
    */
  inline def HANDLE_RESULT(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("HANDLE_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
  inline def HANDLE_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("HANDLE_RESULT")(x.asInstanceOf[js.Any])
  
  /**
    * These GetErrorHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
    */
  @JSImport("@uirouter/angularjs", "TransitionHook.LOG_ERROR")
  @js.native
  def LOG_ERROR: GetErrorHandler = js.native
  /**
    * These GetErrorHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
    */
  inline def LOG_ERROR(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
  inline def LOG_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_ERROR")(x.asInstanceOf[js.Any])
  
  /**
    * If the result is a promise rejection, log it.
    * Otherwise, ignore the result.
    */
  @JSImport("@uirouter/angularjs", "TransitionHook.LOG_REJECTED_RESULT")
  @js.native
  def LOG_REJECTED_RESULT: GetResultHandler = js.native
  /**
    * If the result is a promise rejection, log it.
    * Otherwise, ignore the result.
    */
  inline def LOG_REJECTED_RESULT(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ResultHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("LOG_REJECTED_RESULT")(hook.asInstanceOf[js.Any]).asInstanceOf[ResultHandler]
  inline def LOG_REJECTED_RESULT_=(x: GetResultHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LOG_REJECTED_RESULT")(x.asInstanceOf[js.Any])
  
  @JSImport("@uirouter/angularjs", "TransitionHook.REJECT_ERROR")
  @js.native
  def REJECT_ERROR: GetErrorHandler = js.native
  inline def REJECT_ERROR(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("REJECT_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
  inline def REJECT_ERROR_=(x: GetErrorHandler): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("REJECT_ERROR")(x.asInstanceOf[js.Any])
  
  @JSImport("@uirouter/angularjs", "TransitionHook.THROW_ERROR")
  @js.native
  def THROW_ERROR: GetErrorHandler = js.native
  inline def THROW_ERROR(hook: typings.uirouterCore.transitionHookMod.TransitionHook): ErrorHandler = ^.asInstanceOf[js.Dynamic].applyDynamic("THROW_ERROR")(hook.asInstanceOf[js.Any]).asInstanceOf[ErrorHandler]
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
  inline def chain(hooks: js.Array[typings.uirouterCore.transitionHookMod.TransitionHook]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("chain")(hooks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def chain(
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
  inline def invokeHooks[T](
    hooks: js.Array[typings.uirouterCore.transitionHookMod.TransitionHook],
    doneCallback: js.Function1[/* result */ js.UndefOr[HookResult], T]
  ): js.Promise[js.Any] | T = (^.asInstanceOf[js.Dynamic].applyDynamic("invokeHooks")(hooks.asInstanceOf[js.Any], doneCallback.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any] | T]
  
  /**
    * Run all TransitionHooks, ignoring their return value.
    */
  inline def runAllHooks(hooks: js.Array[typings.uirouterCore.transitionHookMod.TransitionHook]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("runAllHooks")(hooks.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
