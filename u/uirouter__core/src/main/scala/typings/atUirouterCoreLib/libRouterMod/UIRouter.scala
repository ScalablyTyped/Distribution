package typings
package atUirouterCoreLib.libRouterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/core/lib/router", "UIRouter")
@js.native
/**
  * Creates a new `UIRouter` object
  *
  * @param locationService a [[LocationServices]] implementation
  * @param locationConfig a [[LocationConfig]] implementation
  * @internalapi
  */
class UIRouter () extends js.Object {
  def this(locationService: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices) = this()
  def this(locationService: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices, locationConfig: atUirouterCoreLib.libCommonCoreservicesMod.LocationConfig) = this()
  /** @hidden */ @JSName("$id")
  var $id: scala.Double = js.native
  /** @hidden */ var _disposables: js.Any = js.native
  /** @hidden */ var _disposed: scala.Boolean = js.native
  /** @hidden plugin instances are registered here */
  var _plugins: js.Any = js.native
  /** Global router state */
  var globals: atUirouterCoreLib.libGlobalsMod.UIRouterGlobals = js.native
  var locationConfig: atUirouterCoreLib.libCommonCoreservicesMod.LocationConfig = js.native
  var locationService: atUirouterCoreLib.libCommonCoreservicesMod.LocationServices = js.native
  /** Provides a registry for states, and related registration services */
  var stateRegistry: atUirouterCoreLib.libStateStateRegistryMod.StateRegistry = js.native
  /** Provides services related to states */
  var stateService: atUirouterCoreLib.libStateStateServiceMod.StateService = js.native
  /** Provides trace information to the console */
  var trace: atUirouterCoreLib.libCommonTraceMod.Trace = js.native
  /** Provides services related to Transitions */
  var transitionService: atUirouterCoreLib.libTransitionTransitionServiceMod.TransitionService = js.native
  /**
    * Deprecated for public use. Use [[urlService]] instead.
    * @deprecated Use [[urlService]] instead
    */
  var urlMatcherFactory: atUirouterCoreLib.libUrlUrlMatcherFactoryMod.UrlMatcherFactory = js.native
  /**
    * Deprecated for public use. Use [[urlService]] instead.
    * @deprecated Use [[urlService]] instead
    */
  var urlRouter: atUirouterCoreLib.libUrlUrlRouterMod.UrlRouter = js.native
  /** Provides services related to the URL */
  var urlService: atUirouterCoreLib.libUrlUrlServiceMod.UrlService = js.native
  /** Provides services related to ui-view synchronization */
  var viewService: atUirouterCoreLib.libViewViewMod.ViewService = js.native
  /** Registers an object to be notified when the router is disposed */
  def disposable(disposable: atUirouterCoreLib.libInterfaceMod.Disposable): scala.Unit = js.native
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
  def dispose(): scala.Unit = js.native
  def dispose(disposable: js.Any): scala.Unit = js.native
  def getPlugin(): js.Array[atUirouterCoreLib.libInterfaceMod.UIRouterPlugin] = js.native
  /**
    * Returns registered plugins
    *
    * Returns the registered plugin of the given `pluginName`.
    * If no `pluginName` is given, returns all registered plugins
    *
    * @param pluginName (optional) the name of the plugin to get
    * @return the named plugin (undefined if not found), or all plugins (if `pluginName` is omitted)
    */
  def getPlugin(pluginName: java.lang.String): atUirouterCoreLib.libInterfaceMod.UIRouterPlugin = js.native
  /** Add plugin (as ES6 class) */
  def plugin[T /* <: atUirouterCoreLib.libInterfaceMod.UIRouterPlugin */](plugin: atUirouterCoreLib.Anon_Router[T]): T = js.native
  /** Add plugin (as javascript constructor function) */
  def plugin[T /* <: atUirouterCoreLib.libInterfaceMod.UIRouterPlugin */](plugin: atUirouterCoreLib.Anon_RouterOptions): T = js.native
  def plugin[T /* <: atUirouterCoreLib.libInterfaceMod.UIRouterPlugin */](plugin: atUirouterCoreLib.Anon_RouterOptions, options: js.Any): T = js.native
  def plugin[T /* <: atUirouterCoreLib.libInterfaceMod.UIRouterPlugin */](plugin: atUirouterCoreLib.Anon_Router[T], options: js.Any): T = js.native
  /** Add plugin (as javascript factory function) */
  def plugin[T /* <: atUirouterCoreLib.libInterfaceMod.UIRouterPlugin */](plugin: PluginFactory[T]): T = js.native
  def plugin[T /* <: atUirouterCoreLib.libInterfaceMod.UIRouterPlugin */](plugin: PluginFactory[T], options: js.Any): T = js.native
}

