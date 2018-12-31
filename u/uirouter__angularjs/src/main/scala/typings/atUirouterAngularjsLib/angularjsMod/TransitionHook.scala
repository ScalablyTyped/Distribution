package typings
package atUirouterAngularjsLib.angularjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "TransitionHook")
@js.native
class TransitionHook protected ()
  extends atUirouterCoreLib.coreMod.TransitionHook {
  def this(transition: atUirouterCoreLib.libTransitionTransitionMod.Transition, stateContext: atUirouterCoreLib.libStateInterfaceMod.StateDeclaration, registeredHook: atUirouterCoreLib.libTransitionHookRegistryMod.RegisteredHook, options: atUirouterCoreLib.libTransitionInterfaceMod.TransitionHookOptions) = this()
}

@JSImport("@uirouter/angularjs", "TransitionHook")
@js.native
object TransitionHook extends js.Object {
  /**
    * These GetResultHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
    */
  @JSName("HANDLE_RESULT")
  var HANDLE_RESULT_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler = js.native
  /**
    * These GetErrorHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
    */
  @JSName("LOG_ERROR")
  var LOG_ERROR_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler = js.native
  /**
    * If the result is a promise rejection, log it.
    * Otherwise, ignore the result.
    */
  @JSName("LOG_REJECTED_RESULT")
  var LOG_REJECTED_RESULT_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetResultHandler = js.native
  @JSName("REJECT_ERROR")
  var REJECT_ERROR_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler = js.native
  @JSName("THROW_ERROR")
  var THROW_ERROR_Original: atUirouterCoreLib.libTransitionTransitionHookMod.GetErrorHandler = js.native
  /**
    * These GetResultHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetResultHandler (See: [[TransitionService._defineCoreEvents]])
    */
  /* Expanded */ def HANDLE_RESULT(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ResultHandler = js.native
  /**
    * These GetErrorHandler(s) are used by [[invokeHook]] below
    * Each HookType chooses a GetErrorHandler (See: [[TransitionService._defineCoreEvents]])
    */
  /* Expanded */ def LOG_ERROR(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ErrorHandler = js.native
  /**
    * If the result is a promise rejection, log it.
    * Otherwise, ignore the result.
    */
  /* Expanded */ def LOG_REJECTED_RESULT(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ResultHandler = js.native
  /* Expanded */ def REJECT_ERROR(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ErrorHandler = js.native
  /* Expanded */ def THROW_ERROR(hook: atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook): atUirouterCoreLib.libTransitionTransitionHookMod.ErrorHandler = js.native
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
  def chain(hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook]): js.Promise[_] = js.native
  def chain(
    hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook],
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
    hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook],
    doneCallback: js.Function1[/* result */ js.UndefOr[atUirouterCoreLib.libTransitionInterfaceMod.HookResult], T]
  ): js.Promise[_] | T = js.native
  /**
    * Run all TransitionHooks, ignoring their return value.
    */
  def runAllHooks(hooks: js.Array[atUirouterCoreLib.libTransitionTransitionHookMod.TransitionHook]): scala.Unit = js.native
}

