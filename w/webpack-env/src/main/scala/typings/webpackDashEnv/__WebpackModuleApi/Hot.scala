package typings.webpackDashEnv.__WebpackModuleApi

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Hot extends js.Object {
  var active: Boolean = js.native
  var data: js.Any = js.native
  /**
    * Accept code updates for this module without notification of parents.
    * This should only be used if the module doesn’t export anything.
    * The errHandler can be used to handle errors that occur while loading the updated module.
    * @param errHandler
    */
  def accept(): Unit = js.native
  /**
    * Accept code updates for the specified dependencies. The callback is called when dependencies were replaced.
    * @param dependencies
    * @param callback
    */
  def accept(dependencies: js.Array[String]): Unit = js.native
  def accept(
    dependencies: js.Array[String],
    callback: js.Function1[/* updatedDependencies */ js.Array[ModuleId], Unit]
  ): Unit = js.native
  /**
    * Accept code updates for the specified dependencies. The callback is called when dependencies were replaced.
    * @param dependency
    * @param callback
    */
  def accept(dependency: String): Unit = js.native
  def accept(dependency: String, callback: js.Function0[Unit]): Unit = js.native
  def accept(errHandler: js.Function1[/* err */ Error, Unit]): Unit = js.native
  /**
    * Add a one time handler, which is executed when the current module code is replaced.
    * Here you should destroy/remove any persistent resource you have claimed/created.
    * If you want to transfer state to the new module, add it to data object.
    * The data will be available at module.hot.data on the new module.
    * @param callback
    */
  def addDisposeHandler(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  @JSName("addDisposeHandler")
  def addDisposeHandler_T[T](callback: js.Function1[/* data */ T, Unit]): Unit = js.native
  /** Register a callback on status change. */
  def addStatusHandler(callback: js.Function1[/* status */ String, Unit]): Unit = js.native
  /**
    * If status() != "ready" it throws an error.
    * Continue the update process.
    * @param callback
    */
  @JSName("apply")
  def apply(callback: js.Function2[/* err */ Error, /* outdatedModules */ js.Array[ModuleId], Unit]): Unit = js.native
  /**
    * If status() != "ready" it throws an error.
    * Continue the update process.
    * @param options
    * @param callback
    */
  @JSName("apply")
  def apply(
    options: AcceptOptions,
    callback: js.Function2[/* err */ Error, /* outdatedModules */ js.Array[ModuleId], Unit]
  ): Unit = js.native
  /**
    * Throws an exceptions if status() is not idle.
    * Check all currently loaded modules for updates and apply updates if found.
    * If no update was found, the callback is called with null.
    * If autoApply is truthy the callback will be called with all modules that were disposed.
    * apply() is automatically called with autoApply as options parameter.
    * If autoApply is not set the callback will be called with all modules that will be disposed on apply().
    * @param autoApply
    * @param callback
    */
  def check(
    autoApply: Boolean,
    callback: js.Function2[/* err */ Error, /* outdatedModules */ js.Array[ModuleId], Unit]
  ): Unit = js.native
  /**
    * Throws an exceptions if status() is not idle.
    * Check all currently loaded modules for updates and apply updates if found.
    * If no update was found, the callback is called with null.
    * The callback will be called with all modules that will be disposed on apply().
    * @param callback
    */
  def check(callback: js.Function2[/* err */ Error, /* outdatedModules */ js.Array[ModuleId], Unit]): Unit = js.native
  /**
    * Flag the current module as not update-able. If updated the update code would fail with code "decline".
    */
  def decline(): Unit = js.native
  /**
    * Do not accept updates for the specified dependencies. If any dependencies is updated, the code update fails with code "decline".
    */
  def decline(dependencies: js.Array[String]): Unit = js.native
  /**
    * Do not accept updates for the specified dependencies. If any dependencies is updated, the code update fails with code "decline".
    */
  def decline(dependency: String): Unit = js.native
  /**
    * Add a one time handler, which is executed when the current module code is replaced.
    * Here you should destroy/remove any persistent resource you have claimed/created.
    * If you want to transfer state to the new module, add it to data object.
    * The data will be available at module.hot.data on the new module.
    * @param callback
    */
  def dispose(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  /**
    * Remove a handler.
    * This can useful to add a temporary dispose handler. You could i. e. replace code while in the middle of a multi-step async function.
    * @param callback
    */
  def removeDisposeHandler(callback: js.Function1[/* data */ js.Any, Unit]): Unit = js.native
  @JSName("removeDisposeHandler")
  def removeDisposeHandler_T[T](callback: js.Function1[/* data */ T, Unit]): Unit = js.native
  /**
    * Remove a registered status change handler.
    * @param callback
    */
  def removeStatusHandler(callback: js.Function1[/* status */ String, Unit]): Unit = js.native
  /**
    * Return one of idle, check, watch, watch-delay, prepare, ready, dispose, apply, abort or fail.
    */
  def status(): String = js.native
  /** Register a callback on status change. */
  def status(callback: js.Function1[/* status */ String, Unit]): Unit = js.native
}

