package typings.uirouterCore

import typings.uirouterCore.anon.InstantiableT
import typings.uirouterCore.coreservicesMod.LocationConfig
import typings.uirouterCore.coreservicesMod.LocationServices
import typings.uirouterCore.globalsMod.UIRouterGlobals
import typings.uirouterCore.interfaceMod.Disposable
import typings.uirouterCore.interfaceMod.UIRouterPlugin
import typings.uirouterCore.stateRegistryMod.StateRegistry
import typings.uirouterCore.stateServiceMod.StateService
import typings.uirouterCore.traceMod.Trace_
import typings.uirouterCore.transitionServiceMod.TransitionService
import typings.uirouterCore.urlMatcherFactoryMod.UrlMatcherFactory
import typings.uirouterCore.urlRouterMod.UrlRouter
import typings.uirouterCore.urlServiceMod.UrlService
import typings.uirouterCore.viewViewMod.ViewService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerMod {
  
  @JSImport("@uirouter/core/lib/router", "UIRouter")
  @js.native
  /**
    * Creates a new `UIRouter` object
    *
    * @param locationService a [[LocationServices]] implementation
    * @param locationConfig a [[LocationConfig]] implementation
    * @internal
    */
  open class UIRouter () extends StObject {
    def this(locationService: LocationServices) = this()
    def this(locationService: Unit, locationConfig: LocationConfig) = this()
    def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
    
    /** @internal */ @JSName("$id")
    var $id: Double = js.native
    
    /** @internal */ /* private */ var _disposables: Any = js.native
    
    /** @internal */ var _disposed: Boolean = js.native
    
    /** @internal plugin instances are registered here */
    /* private */ var _plugins: Any = js.native
    
    /** Registers an object to be notified when the router is disposed */
    def disposable(disposable: Disposable): Unit = js.native
    
    /**
      * Disposes this router instance
      *
      * When called, clears resources retained by the router by calling `dispose(this)` on all
      * registered [[disposable]] objects.
      *
      * Or, if a `disposable` object is provided, calls `dispose(this)` on that object only.
      *
      * @internal
      * @param disposable (optional) the disposable to dispose
      */
    def dispose(): Unit = js.native
    def dispose(disposable: Any): Unit = js.native
    
    /**
      * Returns all registered plugins
      * @return all registered plugins
      */
    def getPlugin(): js.Array[UIRouterPlugin] = js.native
    /**
      * Returns a plugin registered with the given `pluginName`.
      *
      * @param pluginName the name of the plugin to get
      * @return the plugin, or undefined
      */
    def getPlugin(pluginName: String): UIRouterPlugin = js.native
    
    /** An object that contains global router state, such as the current state and params */
    var globals: UIRouterGlobals = js.native
    
    var locationConfig: LocationConfig = js.native
    
    var locationService: LocationServices = js.native
    
    /** Add plugin (as javascript constructor function) */
    /** Add plugin (as javascript factory function) */
    def plugin[T /* <: UIRouterPlugin */](
      plugin: (js.Function2[/* router */ this.type, /* options */ js.UndefOr[Any], Unit]) | PluginFactory[T]
    ): T = js.native
    def plugin[T /* <: UIRouterPlugin */](
      plugin: (js.Function2[/* router */ this.type, /* options */ js.UndefOr[Any], Unit]) | PluginFactory[T],
      options: Any
    ): T = js.native
    /** Add plugin (as ES6 class) */
    def plugin[T /* <: UIRouterPlugin */](plugin: InstantiableT[T]): T = js.native
    def plugin[T /* <: UIRouterPlugin */](plugin: InstantiableT[T], options: Any): T = js.native
    
    /** Provides a registry for states, and related registration services */
    var stateRegistry: StateRegistry = js.native
    
    /** Provides services related to states */
    var stateService: StateService = js.native
    
    /** Enable/disable tracing to the javascript console */
    var trace: Trace_ = js.native
    
    /** A service that exposes global Transition Hooks */
    var transitionService: TransitionService = js.native
    
    /**
      * Deprecated for public use. Use [[urlService]] instead.
      * @deprecated Use [[urlService]] instead
      */
    var urlMatcherFactory: UrlMatcherFactory = js.native
    
    /**
      * Deprecated for public use. Use [[urlService]] instead.
      * @deprecated Use [[urlService]] instead
      */
    var urlRouter: UrlRouter = js.native
    
    /** Provides services related to the URL */
    var urlService: UrlService = js.native
    
    /** Provides services related to ui-view synchronization */
    var viewService: ViewService = js.native
  }
  
  type PluginFactory[T] = js.Function2[/* router */ UIRouter, /* options */ js.UndefOr[Any], T]
}
