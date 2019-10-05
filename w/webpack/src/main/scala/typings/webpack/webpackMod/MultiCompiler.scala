package typings.webpack.webpackMod

import typings.tapable.tapableMod.Tapable
import typings.tapable.tapableMod.Tapable.CallbackFunction
import typings.webpack.webpackMod.ICompiler.Handler
import typings.webpack.webpackMod.compilation.MultiCompilerHooks
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("webpack", "MultiCompiler")
@js.native
abstract class MultiCompiler ()
  extends Tapable
     with ICompiler {
  var compilers: js.Array[Compiler] = js.native
  var hooks: MultiCompilerHooks = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * invoke all plugins with this attached.
    * This method is just to "apply" plugins' definition, so that the real event listeners can be registered into
    * registry. Mostly the `apply` method of a plugin is the main place to place extension logic.
    */
  /* InferMemberOverrides */
  @JSName("apply")
  override def apply(
    plugins: ((js.ThisFunction0[/* this */ this.type, _]) | typings.tapable.tapableMod.Tapable.Plugin)*
  ): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * synchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called with all the rest arguments.
    *
    * @param name - plugin group name
    * @param args
    */
  /* InferMemberOverrides */
  override def applyPlugins(name: String, args: js.Any*): Unit = js.native
  /* InferMemberOverrides */
  override def applyPlugins0(name: String): Unit = js.native
  /* InferMemberOverrides */
  override def applyPlugins1(name: String, param: js.Any): Unit = js.native
  /* InferMemberOverrides */
  override def applyPlugins2(name: String, param1: js.Any, param2: js.Any): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * asynchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called with all the rest arguments
    * and a callback function with the signature (err: Error) => void.
    *
    * The handlers are called in series, one at a time. After all handlers are applied, callback is called.
    *
    * If any handler invokes the (anonymous)callback with error, no more handlers will be called
    * and the real callback is call with that error.
    */
  /* InferMemberOverrides */
  override def applyPluginsAsync(name: String, args: js.Any*): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * same as `applyPluginsAsync`
    * @see applyPluginsAsync
    * @alias Tapable.applyPluginsAsync
    * @param name
    * @param args
    */
  /* InferMemberOverrides */
  override def applyPluginsAsyncSeries(name: String, args: js.Any*): Unit = js.native
  /* InferMemberOverrides */
  override def applyPluginsAsyncSeries1(name: String, param: js.Any, callback: CallbackFunction): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * asynchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called with all the rest arguments
    * and a callback function with the signature (...params) => void.
    *
    * Handlers must invoke the (anonymous)callback, otherwise the series is cut down and real callback won't be
    * invoked.
    *
    * The order is defined by registration order not by speed of the handler function.
    *
    * If a handler returns something !== undefined, that value is returned and no more handlers will be applied.
    */
  /* InferMemberOverrides */
  override def applyPluginsAsyncSeriesBailResult(name: String, args: js.Any*): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * asynchronously applies all registered handlers for target name(event id).
    *
    * @see applyPluginsAsyncSeriesBailResult
    *
    * Note: the fundamental difference with `{@link applyPluginsAsyncSeriesBailResult}`, is that,
    *       `{@link applyPluginsAsyncSeriesBailResult}` passes the arguments as arguments list for plugins
    *       while `{@link applyPluginsAsyncSeriesBailResult1}` passes the arguments as single param(any type)
    *       and a callback for plugins
    */
  /* InferMemberOverrides */
  override def applyPluginsAsyncSeriesBailResult1(name: String, param: js.Any, callback: CallbackFunction): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * Asynchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called with the current value and a callback function with the signature (err: Error,
    * nextValue: any) => void.
    *
    * `init` is used for the first handler. The rest handles are called with the value which previous handler uses
    * to invoke the (anonymous)callback invoked
    *
    * After all handlers are applied, callback is called with the last value.
    *
    * If any handler invokes the (anonymous)callback with error, no more handlers will be called
    * and the real callback is call with that error.
    */
  /* InferMemberOverrides */
  override def applyPluginsAsyncWaterfall(name: String, init: js.Any, callback: CallbackFunction): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * synchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called with all the rest arguments.
    *
    * If a handler returns something !== undefined, that value is returned and no more handlers will be applied.
    */
  /* InferMemberOverrides */
  override def applyPluginsBailResult(name: String, args: js.Any*): js.Any = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * synchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called with target param
    *
    * If a handler returns something !== undefined, the value is returned and no more handlers are applied.
    *
    * Note: the fundamental difference with `{@link applyPluginsBailResult}`, is that,
    *       `{@link applyPluginsBailResult}` passes the arguments as arguments list for plugins
    *       while `{@link applyPluginsBailResult1}` passes the arguments as single param(any type) for plugins
    */
  /* InferMemberOverrides */
  override def applyPluginsBailResult1(name: String, param: js.Any): js.Any = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * applies all registered handlers for target name(event id) in parallel.
    *
    * The handlers are called with all the rest arguments
    * and a callback function with the signature (err?: Error) => void.
    *
    * The callback function is called when all handlers call the callback without err.
    *
    * If any handler invokes the callback with err, callback is invoked with this error and the other handlers are
    * skipped.
    */
  /* InferMemberOverrides */
  override def applyPluginsParallel(name: String, args: js.Any*): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * applies all registered handlers for target name(event id) in parallel.
    *
    * The handlers are called with all the rest arguments
    * and a callback function with the signature (currentResult?: []) => void.
    *
    * Handlers must call the callback.
    *
    * The first result (either error or value) with is not undefined is passed to the callback.
    *
    * The order is defined by registration not by speed of the handler function.
    */
  /* InferMemberOverrides */
  override def applyPluginsParallelBailResult(name: String, args: js.Any*): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * applies all registered handlers for target name(event id) in parallel.
    *
    * @see applyPluginsParallelBailResult
    *
    * Note: the fundamental difference with `{@link applyPluginsParallelBailResult}`, is that,
    *       `{@link applyPluginsParallelBailResult}` passes the arguments as arguments list for plugins
    *       while `{@link applyPluginsParallelBailResult1}` passes the arguments as single param(any type)
    *       and a callback for plugins
    */
  /* InferMemberOverrides */
  override def applyPluginsParallelBailResult1(name: String, param: js.Any, callback: CallbackFunction): Unit = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * synchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called with the return value of the previous handler and all the rest arguments.
    *
    * `init` is used for the first handler.
    *
    * return the returned value of the last handler
    */
  /* InferMemberOverrides */
  override def applyPluginsWaterfall(name: String, init: js.Any, args: js.Any*): js.Any = js.native
  /**
    * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
    * synchronously applies all registered handlers for target name(event id).
    *
    * The handlers are called ONLY with the return value of the previous handler.
    *
    * `init` is used for the first handler.
    *
    * return the returned value of the last handler
    */
  /* InferMemberOverrides */
  override def applyPluginsWaterfall0(name: String, init: js.Any): js.Any = js.native
  /**
    * @deprecated Tapable.plugin is deprecated. Use new API on `.hooks` instead
    * Register plugin(s)
    * This acts as the same as on() of EventEmitter, for registering a handler/listener to do something when the
    * signal/event happens.
    *
    * @param names a string or an array of strings to generate the id(group name) of plugins
    * @param handler a function which provides the plugin functionality *
    */
  /* InferMemberOverrides */
  override def plugin(names: String, handler: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): Unit = js.native
  /** @deprecated Tapable.plugin is deprecated. Use new API on `.hooks` instead */
  /* InferMemberOverrides */
  override def plugin(
    names: js.Array[String],
    handler: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]
  ): Unit = js.native
  /* InferMemberOverrides */
  override def run(handler: Handler): Unit = js.native
  /* InferMemberOverrides */
  override def watch(watchOptions: typings.webpack.webpackMod.ICompiler.WatchOptions, handler: Handler): Watching = js.native
}

@JSImport("webpack", "MultiCompiler")
@js.native
object MultiCompiler extends js.Object {
  type Handler = typings.webpack.webpackMod.ICompiler.Handler
  type WatchOptions = typings.webpack.webpackMod.ICompiler.WatchOptions
}

