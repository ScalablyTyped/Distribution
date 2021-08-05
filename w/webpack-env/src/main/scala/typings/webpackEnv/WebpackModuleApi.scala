package typings.webpackEnv

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeModule
import typings.node.NodeRequire
import typings.std.Error
import typings.std.RegExp
import typings.webpackEnv.webpackEnvStrings.`accept-errored`
import typings.webpackEnv.webpackEnvStrings.`lazy-once`
import typings.webpackEnv.webpackEnvStrings.`lazy`
import typings.webpackEnv.webpackEnvStrings.`self-accept-error-handler-errored`
import typings.webpackEnv.webpackEnvStrings.`self-accept-errored`
import typings.webpackEnv.webpackEnvStrings.`self-declined`
import typings.webpackEnv.webpackEnvStrings.accepted
import typings.webpackEnv.webpackEnvStrings.declined
import typings.webpackEnv.webpackEnvStrings.disposed
import typings.webpackEnv.webpackEnvStrings.eager
import typings.webpackEnv.webpackEnvStrings.sync
import typings.webpackEnv.webpackEnvStrings.unaccepted
import typings.webpackEnv.webpackEnvStrings.weak
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object WebpackModuleApi {
  
  trait AcceptOptions extends StObject {
    
    /**
      * Indicates that apply() is automatically called by check function
      */
    var autoApply: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Ignore changes made to declined modules.
      */
    var ignoreDeclined: js.UndefOr[Boolean] = js.undefined
    
    /**
      *  Ignore errors throw in accept handlers, error handlers and while reevaluating module.
      */
    var ignoreErrored: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If true the update process continues even if some modules are not accepted (and would bubble to the entry point).
      */
    var ignoreUnaccepted: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Notifier for accepted modules.
      */
    var onAccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.undefined
    
    /**
      * Notifier for declined modules.
      */
    var onDeclined: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.undefined
    
    /**
      * Notifier for disposed modules.
      */
    var onDisposed: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.undefined
    
    /**
      * Notifier for errors.
      */
    var onErrored: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.undefined
    
    /**
      * Notifier for unaccepted modules.
      */
    var onUnaccepted: js.UndefOr[js.Function1[/* info */ HotNotifierInfo, Unit]] = js.undefined
  }
  object AcceptOptions {
    
    inline def apply(): AcceptOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AcceptOptions]
    }
    
    extension [Self <: AcceptOptions](x: Self) {
      
      inline def setAutoApply(value: Boolean): Self = StObject.set(x, "autoApply", value.asInstanceOf[js.Any])
      
      inline def setAutoApplyUndefined: Self = StObject.set(x, "autoApply", js.undefined)
      
      inline def setIgnoreDeclined(value: Boolean): Self = StObject.set(x, "ignoreDeclined", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDeclinedUndefined: Self = StObject.set(x, "ignoreDeclined", js.undefined)
      
      inline def setIgnoreErrored(value: Boolean): Self = StObject.set(x, "ignoreErrored", value.asInstanceOf[js.Any])
      
      inline def setIgnoreErroredUndefined: Self = StObject.set(x, "ignoreErrored", js.undefined)
      
      inline def setIgnoreUnaccepted(value: Boolean): Self = StObject.set(x, "ignoreUnaccepted", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnacceptedUndefined: Self = StObject.set(x, "ignoreUnaccepted", js.undefined)
      
      inline def setOnAccepted(value: /* info */ HotNotifierInfo => Unit): Self = StObject.set(x, "onAccepted", js.Any.fromFunction1(value))
      
      inline def setOnAcceptedUndefined: Self = StObject.set(x, "onAccepted", js.undefined)
      
      inline def setOnDeclined(value: /* info */ HotNotifierInfo => Unit): Self = StObject.set(x, "onDeclined", js.Any.fromFunction1(value))
      
      inline def setOnDeclinedUndefined: Self = StObject.set(x, "onDeclined", js.undefined)
      
      inline def setOnDisposed(value: /* info */ HotNotifierInfo => Unit): Self = StObject.set(x, "onDisposed", js.Any.fromFunction1(value))
      
      inline def setOnDisposedUndefined: Self = StObject.set(x, "onDisposed", js.undefined)
      
      inline def setOnErrored(value: /* info */ HotNotifierInfo => Unit): Self = StObject.set(x, "onErrored", js.Any.fromFunction1(value))
      
      inline def setOnErroredUndefined: Self = StObject.set(x, "onErrored", js.undefined)
      
      inline def setOnUnaccepted(value: /* info */ HotNotifierInfo => Unit): Self = StObject.set(x, "onUnaccepted", js.Any.fromFunction1(value))
      
      inline def setOnUnacceptedUndefined: Self = StObject.set(x, "onUnaccepted", js.undefined)
    }
  }
  
  @js.native
  trait Hot extends StObject {
    
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
    
    var active: Boolean = js.native
    
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
    
    var data: js.Any = js.native
    
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
  
  trait HotNotifierInfo extends StObject {
    
    /**
      * For declined/accepted/unaccepted: the chain from where the update was propagated.
      */
    var chain: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * For errors: the module id owning the accept handler.
      */
    var dependencyId: js.UndefOr[Double] = js.undefined
    
    /**
      * For errors: the thrown error
      */
    var error: js.UndefOr[Error] = js.undefined
    
    /**
      * The module in question.
      */
    var moduleId: Double
    
    /**
      * For self-accept-error-handler-errored: the error thrown by the module
      * before the error handler tried to handle it.
      */
    var originalError: js.UndefOr[Error] = js.undefined
    
    /**
      * For accepted: The location of accept handlers that will handle the update
      */
    var outdatedDependencies: js.UndefOr[NumberDictionary[js.Array[Double]]] = js.undefined
    
    /**
      * For accepted: the modules that are outdated and will be disposed
      */
    var outdatedModules: js.UndefOr[js.Array[Double]] = js.undefined
    
    /**
      * For declined: the module id of the declining parent
      */
    var parentId: js.UndefOr[Double] = js.undefined
    
    var `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
  }
  object HotNotifierInfo {
    
    inline def apply(
      moduleId: Double,
      `type`: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
    ): HotNotifierInfo = {
      val __obj = js.Dynamic.literal(moduleId = moduleId.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HotNotifierInfo]
    }
    
    extension [Self <: HotNotifierInfo](x: Self) {
      
      inline def setChain(value: js.Array[Double]): Self = StObject.set(x, "chain", value.asInstanceOf[js.Any])
      
      inline def setChainUndefined: Self = StObject.set(x, "chain", js.undefined)
      
      inline def setChainVarargs(value: Double*): Self = StObject.set(x, "chain", js.Array(value :_*))
      
      inline def setDependencyId(value: Double): Self = StObject.set(x, "dependencyId", value.asInstanceOf[js.Any])
      
      inline def setDependencyIdUndefined: Self = StObject.set(x, "dependencyId", js.undefined)
      
      inline def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setModuleId(value: Double): Self = StObject.set(x, "moduleId", value.asInstanceOf[js.Any])
      
      inline def setOriginalError(value: Error): Self = StObject.set(x, "originalError", value.asInstanceOf[js.Any])
      
      inline def setOriginalErrorUndefined: Self = StObject.set(x, "originalError", js.undefined)
      
      inline def setOutdatedDependencies(value: NumberDictionary[js.Array[Double]]): Self = StObject.set(x, "outdatedDependencies", value.asInstanceOf[js.Any])
      
      inline def setOutdatedDependenciesUndefined: Self = StObject.set(x, "outdatedDependencies", js.undefined)
      
      inline def setOutdatedModules(value: js.Array[Double]): Self = StObject.set(x, "outdatedModules", value.asInstanceOf[js.Any])
      
      inline def setOutdatedModulesUndefined: Self = StObject.set(x, "outdatedModules", js.undefined)
      
      inline def setOutdatedModulesVarargs(value: Double*): Self = StObject.set(x, "outdatedModules", js.Array(value :_*))
      
      inline def setParentId(value: Double): Self = StObject.set(x, "parentId", value.asInstanceOf[js.Any])
      
      inline def setParentIdUndefined: Self = StObject.set(x, "parentId", js.undefined)
      
      inline def setType(
        value: `self-declined` | declined | unaccepted | accepted | disposed | `accept-errored` | `self-accept-errored` | `self-accept-error-handler-errored`
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module extends StObject {
    
    var children: js.Array[NodeModule]
    
    var exports: js.Any
    
    var filename: String
    
    var hot: js.UndefOr[Hot] = js.undefined
    
    var id: String
    
    var loaded: Boolean
    
    var parent: js.UndefOr[NodeModule | Null] = js.undefined
  }
  object Module {
    
    inline def apply(children: js.Array[NodeModule], exports: js.Any, filename: String, id: String, loaded: Boolean): Module = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], exports = exports.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], loaded = loaded.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    extension [Self <: Module](x: Self) {
      
      inline def setChildren(value: js.Array[NodeModule]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: NodeModule*): Self = StObject.set(x, "children", js.Array(value :_*))
      
      inline def setExports(value: js.Any): Self = StObject.set(x, "exports", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setHot(value: Hot): Self = StObject.set(x, "hot", value.asInstanceOf[js.Any])
      
      inline def setHotUndefined: Self = StObject.set(x, "hot", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLoaded(value: Boolean): Self = StObject.set(x, "loaded", value.asInstanceOf[js.Any])
      
      inline def setParent(value: NodeModule): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setParentNull: Self = StObject.set(x, "parent", null)
      
      inline def setParentUndefined: Self = StObject.set(x, "parent", js.undefined)
    }
  }
  
  type ModuleId = String | Double
  
  /**
    * Inside env you can pass any variable
    */
  trait NodeProcess extends StObject {
    
    var env: js.UndefOr[js.Any] = js.undefined
  }
  object NodeProcess {
    
    inline def apply(): NodeProcess = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NodeProcess]
    }
    
    extension [Self <: NodeProcess](x: Self) {
      
      inline def setEnv(value: js.Any): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      inline def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
    }
  }
  
  type Require1 = js.Function1[/* id */ String, js.Any]
  
  type Require2 = js.Function1[/* id */ String, js.Any]
  
  @js.native
  trait RequireContext extends StObject {
    
    def apply(id: String): js.Any = js.native
    
    /** The module id of the context module. This may be useful for module.hot.accept. */
    var id: String = js.native
    
    def keys(): js.Array[String] = js.native
    
    def resolve(id: String): String = js.native
  }
  
  @js.native
  trait RequireFunction extends StObject {
    
    /**
      * Returns the exports from a dependency. The call is sync. No request to the server is fired. The compiler ensures that the dependency is available.
      */
    def apply(path: String): js.Any = js.native
    /**
      * Behaves similar to require.ensure, but the callback is called with the exports of each dependency in the paths array. There is no option to provide a chunk name.
      */
    def apply(paths: js.Array[String], callback: js.Function1[/* repeated */ js.Any, Unit]): Unit = js.native
    
    /**
      * Multiple requires to the same module result in only one module execution and only one export. Therefore a cache in the runtime exists. Removing values from this cache cause new module execution and a new export. This is only needed in rare cases (for compatibility!).
      */
    var cache: StringDictionary[js.UndefOr[NodeModule]] = js.native
    
    def context(path: String): RequireContext = js.native
    def context(path: String, deep: Boolean): RequireContext = js.native
    def context(path: String, deep: Boolean, filter: RegExp): RequireContext = js.native
    def context(path: String, deep: Unit, filter: RegExp): RequireContext = js.native
    @JSName("context")
    def context_eager(path: String, deep: Boolean, filter: Unit, mode: eager): RequireContext = js.native
    @JSName("context")
    def context_eager(path: String, deep: Boolean, filter: RegExp, mode: eager): RequireContext = js.native
    @JSName("context")
    def context_eager(path: String, deep: Unit, filter: Unit, mode: eager): RequireContext = js.native
    @JSName("context")
    def context_eager(path: String, deep: Unit, filter: RegExp, mode: eager): RequireContext = js.native
    @JSName("context")
    def context_lazy(path: String, deep: Boolean, filter: Unit, mode: `lazy`): RequireContext = js.native
    @JSName("context")
    def context_lazy(path: String, deep: Boolean, filter: RegExp, mode: `lazy`): RequireContext = js.native
    @JSName("context")
    def context_lazy(path: String, deep: Unit, filter: Unit, mode: `lazy`): RequireContext = js.native
    @JSName("context")
    def context_lazy(path: String, deep: Unit, filter: RegExp, mode: `lazy`): RequireContext = js.native
    @JSName("context")
    def context_lazyonce(path: String, deep: Boolean, filter: Unit, mode: `lazy-once`): RequireContext = js.native
    @JSName("context")
    def context_lazyonce(path: String, deep: Boolean, filter: RegExp, mode: `lazy-once`): RequireContext = js.native
    @JSName("context")
    def context_lazyonce(path: String, deep: Unit, filter: Unit, mode: `lazy-once`): RequireContext = js.native
    @JSName("context")
    def context_lazyonce(path: String, deep: Unit, filter: RegExp, mode: `lazy-once`): RequireContext = js.native
    @JSName("context")
    def context_sync(path: String, deep: Boolean, filter: Unit, mode: sync): RequireContext = js.native
    @JSName("context")
    def context_sync(path: String, deep: Boolean, filter: RegExp, mode: sync): RequireContext = js.native
    @JSName("context")
    def context_sync(path: String, deep: Unit, filter: Unit, mode: sync): RequireContext = js.native
    @JSName("context")
    def context_sync(path: String, deep: Unit, filter: RegExp, mode: sync): RequireContext = js.native
    @JSName("context")
    def context_weak(path: String, deep: Boolean, filter: Unit, mode: weak): RequireContext = js.native
    @JSName("context")
    def context_weak(path: String, deep: Boolean, filter: RegExp, mode: weak): RequireContext = js.native
    @JSName("context")
    def context_weak(path: String, deep: Unit, filter: Unit, mode: weak): RequireContext = js.native
    @JSName("context")
    def context_weak(path: String, deep: Unit, filter: RegExp, mode: weak): RequireContext = js.native
    
    /**
      * Download additional dependencies on demand. The paths array lists modules that should be available. When they are, callback is called. If the callback is a function expression, dependencies in that source part are extracted and also loaded on demand. A single request is fired to the server, except if all modules are already available.
      *
      * This creates a chunk. The chunk can be named. If a chunk with this name already exists, the dependencies are merged into that chunk and that chunk is used.
      */
    def ensure(paths: js.Array[String], callback: js.Function1[/* require */ NodeRequire, Unit]): Unit = js.native
    def ensure(
      paths: js.Array[String],
      callback: js.Function1[/* require */ NodeRequire, Unit],
      chunkName: String
    ): Unit = js.native
    def ensure(
      paths: js.Array[String],
      callback: js.Function1[/* require */ NodeRequire, Unit],
      errorCallback: js.Function1[/* error */ js.Any, Unit]
    ): Unit = js.native
    def ensure(
      paths: js.Array[String],
      callback: js.Function1[/* require */ NodeRequire, Unit],
      errorCallback: js.Function1[/* error */ js.Any, Unit],
      chunkName: String
    ): Unit = js.native
    def ensure(
      paths: js.Array[String],
      callback: js.Function1[/* require */ NodeRequire, Unit],
      errorCallback: Unit,
      chunkName: String
    ): Unit = js.native
    
    /**
      * Ensures that the dependency is available, but don’t execute it. This can be use for optimizing the position of a module in the chunks.
      */
    def include(path: String): Unit = js.native
    
    /**
      * Returns the module id of a dependency. The call is sync. No request to the server is fired. The compiler ensures that the dependency is available.
      *
      * The module id is a number in webpack (in contrast to node.js where it is a string, the filename).
      */
    def resolve(id: String): String | Double = js.native
    
    /**
      * Like require.resolve, but doesn’t include the module into the bundle. It’s a weak dependency.
      */
    def resolveWeak(path: String): Double | String = js.native
    
    /**
      * Returns the module id of a dependency. The call is sync. No request to the server is fired. The compiler ensures that the dependency is available.
      *
      * The module id is a number in webpack (in contrast to node.js where it is a string, the filename).
      */
    @JSName("resolve")
    var resolve_Original: typings.webpackEnv.NodeJS.RequireResolve = js.native
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - scala.Any because Already inherited
  - scala.AnyRef because Already inherited
  - js.Any because Already inherited
  - js.Object because Already inherited
  - js.Function because Already inherited
  - typings.webpackEnv.WebpackModuleApi.Require2 because Already inherited */ @js.native
  trait RequireLambda extends Require1
  
  type RequireResolve = js.Function1[/* id */ String, String | Double]
}
