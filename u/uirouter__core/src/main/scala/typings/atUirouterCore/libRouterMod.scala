package typings.atUirouterCore

import typings.atUirouterCore.libCommonCoreservicesMod.LocationConfig
import typings.atUirouterCore.libCommonCoreservicesMod.LocationServices
import typings.atUirouterCore.libCommonTraceMod.Trace
import typings.atUirouterCore.libGlobalsMod.UIRouterGlobals
import typings.atUirouterCore.libInterfaceMod.Disposable
import typings.atUirouterCore.libInterfaceMod.UIRouterPlugin
import typings.atUirouterCore.libRouterMod.PluginFactory
import typings.atUirouterCore.libRouterMod.UIRouter
import typings.atUirouterCore.libStateStateRegistryMod.StateRegistry
import typings.atUirouterCore.libStateStateServiceMod.StateService
import typings.atUirouterCore.libTransitionTransitionServiceMod.TransitionService
import typings.atUirouterCore.libUrlUrlMatcherFactoryMod.UrlMatcherFactory
import typings.atUirouterCore.libUrlUrlRouterMod.UrlRouter
import typings.atUirouterCore.libUrlUrlServiceMod.UrlService
import typings.atUirouterCore.libViewViewMod.ViewService
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/router", JSImport.Namespace)
@js.native
object libRouterMod extends js.Object {
  @js.native
  /**
    * Creates a new `UIRouter` object
    *
    * @param locationService a [[LocationServices]] implementation
    * @param locationConfig a [[LocationConfig]] implementation
    * @internalapi
    */
  class UIRouter () extends js.Object {
    def this(locationService: LocationServices) = this()
    def this(locationService: LocationServices, locationConfig: LocationConfig) = this()
    /** @hidden */ @JSName("$id")
    var $id: Double = js.native
    /** @hidden */ var _disposables: js.Any = js.native
    /** @hidden */ var _disposed: Boolean = js.native
    /** @hidden plugin instances are registered here */
    var _plugins: js.Any = js.native
    /** Global router state */
    var globals: UIRouterGlobals = js.native
    var locationConfig: LocationConfig = js.native
    var locationService: LocationServices = js.native
    /** Provides a registry for states, and related registration services */
    var stateRegistry: StateRegistry = js.native
    /** Provides services related to states */
    var stateService: StateService = js.native
    /** Provides trace information to the console */
    var trace: Trace = js.native
    /** Provides services related to Transitions */
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
      * @param disposable (optional) the disposable to dispose
      */
    def dispose(): Unit = js.native
    def dispose(disposable: js.Any): Unit = js.native
    def getPlugin(): js.Array[UIRouterPlugin] = js.native
    /**
      * Returns registered plugins
      *
      * Returns the registered plugin of the given `pluginName`.
      * If no `pluginName` is given, returns all registered plugins
      *
      * @param pluginName (optional) the name of the plugin to get
      * @return the named plugin (undefined if not found), or all plugins (if `pluginName` is omitted)
      */
    def getPlugin(pluginName: String): UIRouterPlugin = js.native
    /** Add plugin (as ES6 class) */
    def plugin[T /* <: UIRouterPlugin */](plugin: Anon_Options[T]): T = js.native
    def plugin[T /* <: UIRouterPlugin */](plugin: Anon_Options[T], options: js.Any): T = js.native
    /** Add plugin (as javascript constructor function) */
    def plugin[T /* <: UIRouterPlugin */](plugin: Fn_Options): T = js.native
    def plugin[T /* <: UIRouterPlugin */](plugin: Fn_Options, options: js.Any): T = js.native
    /** Add plugin (as javascript factory function) */
    def plugin[T /* <: UIRouterPlugin */](plugin: PluginFactory[T]): T = js.native
    def plugin[T /* <: UIRouterPlugin */](plugin: PluginFactory[T], options: js.Any): T = js.native
  }
  
  type PluginFactory[T] = js.Function2[/* router */ UIRouter, /* options */ js.UndefOr[js.Any], T]
}

