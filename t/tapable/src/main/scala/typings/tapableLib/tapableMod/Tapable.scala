package typings
package tapableLib.tapableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("tapable", "Tapable")
@js.native
abstract class Tapable () extends js.Object {
  /** @deprecated Private internals. Do not use directly */
  var _pluginCompat: Hook[_, _, _, _, _] = js.native
  var _plugins: org.scalablytyped.runtime.StringDictionary[js.Array[tapableLib.tapableMod.TapableNs.Handler]] = js.native
  /**
       * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
       * invoke all plugins with this attached.
       * This method is just to "apply" plugins' definition, so that the real event listeners can be registered into
       * registry. Mostly the `apply` method of a plugin is the main place to place extension logic.
       */
  @JSName("apply")
  def apply(plugins: ((js.ThisFunction0[/* this */ this.type, _]) | tapableLib.tapableMod.TapableNs.Plugin)*): scala.Unit = js.native
  /**
       * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
       * synchronously applies all registered handlers for target name(event id).
       *
       * The handlers are called with all the rest arguments.
       *
       * @param name - plugin group name
       * @param args
       */
  def applyPlugins(name: java.lang.String, args: js.Any*): scala.Unit = js.native
  def applyPlugins0(name: java.lang.String): scala.Unit = js.native
  def applyPlugins1(name: java.lang.String, param: js.Any): scala.Unit = js.native
  def applyPlugins2(name: java.lang.String, param1: js.Any, param2: js.Any): scala.Unit = js.native
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
  def applyPluginsAsync(name: java.lang.String, args: js.Any*): scala.Unit = js.native
  /**
       * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
       * same as `applyPluginsAsync`
       * @see applyPluginsAsync
       * @alias Tapable.applyPluginsAsync
       * @param name
       * @param args
       */
  def applyPluginsAsyncSeries(name: java.lang.String, args: js.Any*): scala.Unit = js.native
  def applyPluginsAsyncSeries1(name: java.lang.String, param: js.Any, callback: tapableLib.tapableMod.TapableNs.CallbackFunction): scala.Unit = js.native
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
  def applyPluginsAsyncSeriesBailResult(name: java.lang.String, args: js.Any*): scala.Unit = js.native
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
  def applyPluginsAsyncSeriesBailResult1(name: java.lang.String, param: js.Any, callback: tapableLib.tapableMod.TapableNs.CallbackFunction): scala.Unit = js.native
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
  def applyPluginsAsyncWaterfall(name: java.lang.String, init: js.Any, callback: tapableLib.tapableMod.TapableNs.CallbackFunction): scala.Unit = js.native
  /**
       * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
       * synchronously applies all registered handlers for target name(event id).
       *
       * The handlers are called with all the rest arguments.
       *
       * If a handler returns something !== undefined, that value is returned and no more handlers will be applied.
       */
  def applyPluginsBailResult(name: java.lang.String, args: js.Any*): js.Any = js.native
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
  def applyPluginsBailResult1(name: java.lang.String, param: js.Any): js.Any = js.native
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
  def applyPluginsParallel(name: java.lang.String, args: js.Any*): scala.Unit = js.native
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
  def applyPluginsParallelBailResult(name: java.lang.String, args: js.Any*): scala.Unit = js.native
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
  def applyPluginsParallelBailResult1(name: java.lang.String, param: js.Any, callback: tapableLib.tapableMod.TapableNs.CallbackFunction): scala.Unit = js.native
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
  def applyPluginsWaterfall(name: java.lang.String, init: js.Any, args: js.Any*): js.Any = js.native
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
  def applyPluginsWaterfall0(name: java.lang.String, init: js.Any): js.Any = js.native
  /**
       * @deprecated Tapable.plugin is deprecated. Use new API on `.hooks` instead
       * Register plugin(s)
       * This acts as the same as on() of EventEmitter, for registering a handler/listener to do something when the
       * signal/event happens.
       *
       * @param names a string or an array of strings to generate the id(group name) of plugins
       * @param handler a function which provides the plugin functionality *
       */
  def plugin(
    names: java.lang.String,
    handler: js.ThisFunction1[/* this */ this.type, /* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
  /** @deprecated Tapable.plugin is deprecated. Use new API on `.hooks` instead */
  def plugin(
    names: js.Array[java.lang.String],
    handler: js.ThisFunction1[/* this */ this.type, /* repeated */js.Any, scala.Unit]
  ): scala.Unit = js.native
}

@JSImport("tapable", "Tapable")
@js.native
object Tapable extends js.Object {
  def mixin(proto: js.Any): scala.Unit = js.native
}

