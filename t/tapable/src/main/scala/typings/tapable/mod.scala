package typings.tapable

import org.scalablytyped.runtime.StringDictionary
import typings.std.Error
import typings.tapable.anon.Before
import typings.tapable.anon.Fn
import typings.tapable.anon.FnType
import typings.tapable.anon.Type
import typings.tapable.anon.`0`
import typings.tapable.mod.Tapable.CallbackFunction
import typings.tapable.mod.Tapable.Handler
import typings.tapable.mod.Tapable.Plugin
import typings.tapable.tapableStrings.async
import typings.tapable.tapableStrings.promise
import typings.tapable.tapableStrings.sync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tapable", "AsyncParallelBailHook")
  @js.native
  class AsyncParallelBailHook[T1, T2, T3, THookResult] ()
    extends Hook[T1, T2, T3, js.UndefOr[THookResult], js.UndefOr[THookResult]] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "AsyncParallelHook")
  @js.native
  class AsyncParallelHook[T1, T2, T3] ()
    extends Hook[T1, T2, T3, js.Any, Unit] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "AsyncSeriesBailHook")
  @js.native
  class AsyncSeriesBailHook[T1, T2, T3, THookResult] ()
    extends Hook[T1, T2, T3, js.UndefOr[THookResult], js.UndefOr[THookResult]] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "AsyncSeriesHook")
  @js.native
  class AsyncSeriesHook[T1, T2, T3] ()
    extends Hook[T1, T2, T3, js.Any, Unit] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "AsyncSeriesWaterfallHook")
  @js.native
  class AsyncSeriesWaterfallHook[T1, T2, T3] () extends Hook[T1, T2, T3, T1, T1] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "Hook")
  @js.native
  class Hook[TArg1, TArg2, TArg3, TTabResult, THookResult] () extends StObject {
    def this(tapArgumentNames: js.Array[String]) = this()
    
    def call(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
    def call(arg1: TArg1, arg2: TArg2, arg3: Unit, args: js.Any*): THookResult = js.native
    def call(arg1: TArg1, arg2: Unit, arg3: TArg3, args: js.Any*): THookResult = js.native
    def call(arg1: TArg1, arg2: Unit, arg3: Unit, args: js.Any*): THookResult = js.native
    def call(arg1: Unit, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
    def call(arg1: Unit, arg2: TArg2, arg3: Unit, args: js.Any*): THookResult = js.native
    def call(arg1: Unit, arg2: Unit, arg3: TArg3, args: js.Any*): THookResult = js.native
    def call(arg1: Unit, arg2: Unit, arg3: Unit, args: js.Any*): THookResult = js.native
    
    def callAsync(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
    def callAsync(arg1: TArg1, arg2: TArg2, arg3: Unit, args: js.Any*): THookResult = js.native
    def callAsync(arg1: TArg1, arg2: Unit, arg3: TArg3, args: js.Any*): THookResult = js.native
    def callAsync(arg1: TArg1, arg2: Unit, arg3: Unit, args: js.Any*): THookResult = js.native
    def callAsync(arg1: Unit, arg2: TArg2, arg3: TArg3, args: js.Any*): THookResult = js.native
    def callAsync(arg1: Unit, arg2: TArg2, arg3: Unit, args: js.Any*): THookResult = js.native
    def callAsync(arg1: Unit, arg2: Unit, arg3: TArg3, args: js.Any*): THookResult = js.native
    def callAsync(arg1: Unit, arg2: Unit, arg3: Unit, args: js.Any*): THookResult = js.native
    
    def compile(options: HookCompileOptions): js.Function = js.native
    
    def intercept(interceptor: HookInterceptor): Unit = js.native
    
    var interceptors: js.Array[HookInterceptor] = js.native
    
    def isUsed(): Boolean = js.native
    
    def promise(arg1: TArg1, arg2: TArg2, arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
    def promise(arg1: TArg1, arg2: TArg2, arg3: Unit, args: js.Any*): js.Promise[THookResult] = js.native
    def promise(arg1: TArg1, arg2: Unit, arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
    def promise(arg1: TArg1, arg2: Unit, arg3: Unit, args: js.Any*): js.Promise[THookResult] = js.native
    def promise(arg1: Unit, arg2: TArg2, arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
    def promise(arg1: Unit, arg2: TArg2, arg3: Unit, args: js.Any*): js.Promise[THookResult] = js.native
    def promise(arg1: Unit, arg2: Unit, arg3: TArg3, args: js.Any*): js.Promise[THookResult] = js.native
    def promise(arg1: Unit, arg2: Unit, arg3: Unit, args: js.Any*): js.Promise[THookResult] = js.native
    
    def tap(
      name: String,
      fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, TTabResult]
    ): Unit = js.native
    
    def tapAsync(
      name: String,
      fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, Unit]
    ): Unit = js.native
    @JSName("tapAsync")
    def tapAsync_async(
      name: TapOptions[async, TArg1, TArg2, TArg3, TTabResult],
      fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, Unit]
    ): Unit = js.native
    
    def tapPromise(
      name: String,
      fn: js.Function4[
          /* arg1 */ TArg1, 
          /* arg2 */ TArg2, 
          /* arg3 */ TArg3, 
          /* repeated */ js.Any, 
          js.Promise[TTabResult]
        ]
    ): Unit = js.native
    @JSName("tapPromise")
    def tapPromise_promise(
      name: TapOptions[promise, TArg1, TArg2, TArg3, TTabResult],
      fn: js.Function4[
          /* arg1 */ TArg1, 
          /* arg2 */ TArg2, 
          /* arg3 */ TArg3, 
          /* repeated */ js.Any, 
          js.Promise[TTabResult]
        ]
    ): Unit = js.native
    
    @JSName("tap")
    def tap_sync(
      name: TapOptions[sync, TArg1, TArg2, TArg3, TTabResult],
      fn: js.Function4[/* arg1 */ TArg1, /* arg2 */ TArg2, /* arg3 */ TArg3, /* repeated */ js.Any, TTabResult]
    ): Unit = js.native
    
    var taps: js.Array[Tap[TapType, TArg1, TArg2, TArg3, THookResult]] = js.native
  }
  
  @JSImport("tapable", "HookInterceptor")
  @js.native
  class HookInterceptor () extends StObject {
    
    var call: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var context: js.UndefOr[Boolean] = js.native
    
    var loop: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
    
    var register: js.UndefOr[
        js.Function1[
          /* tap */ Tap[TapType, js.Any, js.Any, js.Any, js.Any], 
          js.UndefOr[Tap[TapType, js.Any, js.Any, js.Any, js.Any]]
        ]
      ] = js.native
    
    var tap: js.UndefOr[js.Function1[/* tap */ Tap[TapType, js.Any, js.Any, js.Any, js.Any], Unit]] = js.native
  }
  
  @JSImport("tapable", "HookMap")
  @js.native
  class HookMap[T1, T2, T3] protected () extends StObject {
    def this(fn: js.Function0[Hook[js.Any, js.Any, js.Any, js.Any, js.Any]]) = this()
    
    def `for`(key: js.Any): Hook[T1, T2, T3, js.Any, js.Any] = js.native
    
    def get(key: js.Any): js.UndefOr[Hook[T1, T2, T3, js.Any, js.Any]] = js.native
    
    def intercept(interceptor: HookMapInterceptor[T1, T2, T3]): Unit = js.native
    
    def tap(
      key: js.Any,
      name: String,
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */ js.Any, js.Any]
    ): Unit = js.native
    
    def tapAsync(
      key: js.Any,
      name: String,
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */ js.Any, Unit]
    ): Unit = js.native
    @JSName("tapAsync")
    def tapAsync_async(
      key: js.Any,
      name: TapOptions[async, T1, T2, T3, js.Any],
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */ js.Any, Unit]
    ): Unit = js.native
    
    def tapPromise(
      key: js.Any,
      name: String,
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */ js.Any, js.Promise[js.Any]]
    ): Unit = js.native
    @JSName("tapPromise")
    def tapPromise_promise(
      key: js.Any,
      name: TapOptions[promise, T1, T2, T3, js.Any],
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */ js.Any, js.Promise[js.Any]]
    ): Unit = js.native
    
    @JSName("tap")
    def tap_sync(
      key: js.Any,
      name: TapOptions[sync, T1, T2, T3, js.Any],
      fn: js.Function4[/* arg1 */ T1, /* arg2 */ T2, /* arg3 */ T3, /* repeated */ js.Any, js.Any]
    ): Unit = js.native
  }
  
  @JSImport("tapable", "HookMapInterceptor")
  @js.native
  class HookMapInterceptor[T1, T2, T3] () extends StObject {
    
    def factory(key: js.Any, hook: Hook[T1, T2, T3, js.Any, js.Any]): Hook[T1, T2, T3, js.Any, js.Any] = js.native
  }
  
  @JSImport("tapable", "MultiHook")
  @js.native
  class MultiHook protected () extends StObject {
    def this(hooks: js.Array[Hook[js.Any, js.Any, js.Any, js.Any, js.Any]]) = this()
  }
  
  @JSImport("tapable", "SyncBailHook")
  @js.native
  class SyncBailHook[T1, T2, T3, THookResult] ()
    extends Hook[T1, T2, T3, js.UndefOr[THookResult], js.UndefOr[THookResult]] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "SyncHook")
  @js.native
  class SyncHook[T1, T2, T3] ()
    extends Hook[T1, T2, T3, js.Any, Unit] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "SyncLoopHook")
  @js.native
  class SyncLoopHook[T1, T2, T3] ()
    extends Hook[T1, T2, T3, js.Any, Unit] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "SyncWaterfallHook")
  @js.native
  class SyncWaterfallHook[T1, T2, T3] () extends Hook[T1, T2, T3, T1, T1] {
    def this(tapArgumentNames: js.Array[String]) = this()
  }
  
  @JSImport("tapable", "Tapable")
  @js.native
  abstract class Tapable () extends StObject {
    
    /** @deprecated Private internals. Do not use directly */
    var _pluginCompat: Hook[js.Any, js.Any, js.Any, js.Any, js.Any] = js.native
    
    /* private */ var _plugins: StringDictionary[js.Array[Handler]] = js.native
    
    /**
      * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
      * invoke all plugins with this attached.
      * This method is just to "apply" plugins' definition, so that the real event listeners can be registered into
      * registry. Mostly the `apply` method of a plugin is the main place to place extension logic.
      */
    @JSName("apply")
    def apply(plugins: ((js.ThisFunction0[/* this */ this.type, js.Any]) | Plugin)*): Unit = js.native
    
    /**
      * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
      * synchronously applies all registered handlers for target name(event id).
      *
      * The handlers are called with all the rest arguments.
      *
      * @param name - plugin group name
      * @param args
      */
    def applyPlugins(name: String, args: js.Any*): Unit = js.native
    
    def applyPlugins0(name: String): Unit = js.native
    
    def applyPlugins1(name: String, param: js.Any): Unit = js.native
    
    def applyPlugins2(name: String, param1: js.Any, param2: js.Any): Unit = js.native
    
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
    def applyPluginsAsync(name: String, args: js.Any*): Unit = js.native
    
    /**
      * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
      * same as `applyPluginsAsync`
      * @see applyPluginsAsync
      * @alias Tapable.applyPluginsAsync
      * @param name
      * @param args
      */
    def applyPluginsAsyncSeries(name: String, args: js.Any*): Unit = js.native
    
    def applyPluginsAsyncSeries1(name: String, param: js.Any, callback: CallbackFunction): Unit = js.native
    
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
    def applyPluginsAsyncSeriesBailResult(name: String, args: js.Any*): Unit = js.native
    
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
    def applyPluginsAsyncSeriesBailResult1(name: String, param: js.Any, callback: CallbackFunction): Unit = js.native
    
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
    def applyPluginsAsyncWaterfall(name: String, init: js.Any, callback: CallbackFunction): Unit = js.native
    
    /**
      * @deprecated Tapable.apply is deprecated. Call apply on the plugin directly instead
      * synchronously applies all registered handlers for target name(event id).
      *
      * The handlers are called with all the rest arguments.
      *
      * If a handler returns something !== undefined, that value is returned and no more handlers will be applied.
      */
    def applyPluginsBailResult(name: String, args: js.Any*): js.Any = js.native
    
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
    def applyPluginsBailResult1(name: String, param: js.Any): js.Any = js.native
    
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
    def applyPluginsParallel(name: String, args: js.Any*): Unit = js.native
    
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
    def applyPluginsParallelBailResult(name: String, args: js.Any*): Unit = js.native
    
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
    def applyPluginsParallelBailResult1(name: String, param: js.Any, callback: CallbackFunction): Unit = js.native
    
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
    def applyPluginsWaterfall(name: String, init: js.Any, args: js.Any*): js.Any = js.native
    
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
    def applyPluginsWaterfall0(name: String, init: js.Any): js.Any = js.native
    
    /**
      * @deprecated Tapable.plugin is deprecated. Use new API on `.hooks` instead
      * Register plugin(s)
      * This acts as the same as on() of EventEmitter, for registering a handler/listener to do something when the
      * signal/event happens.
      *
      * @param names a string or an array of strings to generate the id(group name) of plugins
      * @param handler a function which provides the plugin functionality *
      */
    def plugin(names: String, handler: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]): Unit = js.native
    /** @deprecated Tapable.plugin is deprecated. Use new API on `.hooks` instead */
    def plugin(
      names: js.Array[String],
      handler: js.ThisFunction1[/* this */ this.type, /* repeated */ js.Any, Unit]
    ): Unit = js.native
  }
  /* static members */
  object Tapable {
    
    @JSImport("tapable", "Tapable")
    @js.native
    val ^ : js.Any = js.native
    
    inline def mixin(proto: js.Any): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("mixin")(proto.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    type CallbackFunction = js.Function3[
        /* err */ js.UndefOr[Error], 
        /* result */ js.UndefOr[js.Any], 
        /* repeated */ js.Any, 
        Unit
      ]
    
    type Handler = js.Function1[/* repeated */ js.Any, Unit]
    
    trait Plugin extends StObject {
      
      @JSName("apply")
      def apply(args: js.Any*): Unit
    }
    object Plugin {
      
      inline def apply(apply: /* repeated */ js.Any => Unit): Plugin = {
        val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
        __obj.asInstanceOf[Plugin]
      }
      
      extension [Self <: Plugin](x: Self) {
        
        inline def setApply(value: /* repeated */ js.Any => Unit): Self = StObject.set(x, "apply", js.Any.fromFunction1(value))
      }
    }
  }
  
  trait HookCompileOptions extends StObject {
    
    var `type`: TapType
  }
  object HookCompileOptions {
    
    inline def apply(`type`: TapType): HookCompileOptions = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HookCompileOptions]
    }
    
    extension [Self <: HookCompileOptions](x: Self) {
      
      inline def setType(value: TapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Tap[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] extends StObject {
    
    var before: js.UndefOr[String | js.Array[String]] = js.undefined
    
    var context: js.UndefOr[Boolean] = js.undefined
    
    var fn: TapFunction[TTapType, TArg1, TArg2, TArg3, THookResult]
    
    var name: String
    
    var stage: js.UndefOr[Double] = js.undefined
    
    var `type`: TTapType
  }
  object Tap {
    
    inline def apply[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult](
      fn: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit,
      name: String,
      `type`: TTapType
    ): Tap[TTapType, TArg1, TArg2, TArg3, THookResult] = {
      val __obj = js.Dynamic.literal(fn = js.Any.fromFunction4(fn), name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Tap[TTapType, TArg1, TArg2, TArg3, THookResult]]
    }
    
    extension [Self <: Tap[?, ?, ?, ?, ?], TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult](x: Self & (Tap[TTapType, TArg1, TArg2, TArg3, THookResult])) {
      
      inline def setBefore(value: String | js.Array[String]): Self = StObject.set(x, "before", value.asInstanceOf[js.Any])
      
      inline def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      inline def setBeforeVarargs(value: String*): Self = StObject.set(x, "before", js.Array(value :_*))
      
      inline def setContext(value: Boolean): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setContextUndefined: Self = StObject.set(x, "context", js.undefined)
      
      inline def setFn(
        value: (TArg1, TArg2, TArg3, /* repeated */ js.Any) => js.Promise[THookResult] | THookResult | Unit
      ): Self = StObject.set(x, "fn", js.Any.fromFunction4(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setStage(value: Double): Self = StObject.set(x, "stage", value.asInstanceOf[js.Any])
      
      inline def setStageUndefined: Self = StObject.set(x, "stage", js.undefined)
      
      inline def setType(value: TTapType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  type TapFunction[T /* <: TapType */, TArg1, TArg2, TArg3, TResult] = js.Function4[
    /* arg1 */ TArg1, 
    /* arg2 */ TArg2, 
    /* arg3 */ TArg3, 
    /* repeated */ js.Any, 
    js.Promise[TResult] | TResult | Unit
  ]
  
  type TapOptions[TTapType /* <: TapType */, TArg1, TArg2, TArg3, THookResult] = Before & ((`0`[TTapType, TArg1, TArg2, TArg3, THookResult]) | (FnType[TArg1, TArg2, TArg3, THookResult]) | (Type[TArg1, TArg2, TArg3, THookResult]) | (Fn[TArg1, TArg2, TArg3, THookResult]))
  
  /* Rewritten from type alias, can be one of: 
    - typings.tapable.tapableStrings.sync
    - typings.tapable.tapableStrings.async
    - typings.tapable.tapableStrings.promise
  */
  trait TapType extends StObject
  object TapType {
    
    inline def async: typings.tapable.tapableStrings.async = "async".asInstanceOf[typings.tapable.tapableStrings.async]
    
    inline def promise: typings.tapable.tapableStrings.promise = "promise".asInstanceOf[typings.tapable.tapableStrings.promise]
    
    inline def sync: typings.tapable.tapableStrings.sync = "sync".asInstanceOf[typings.tapable.tapableStrings.sync]
  }
}
