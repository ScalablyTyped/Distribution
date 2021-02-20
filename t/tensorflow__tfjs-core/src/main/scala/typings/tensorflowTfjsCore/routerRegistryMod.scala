package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerRegistryMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry")
  @js.native
  class IORouterRegistry protected () extends StObject {
    
    var loadRouters: js.Any = js.native
    
    var saveRouters: js.Any = js.native
  }
  /* static members */
  object IORouterRegistry {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getHandlers")
    @js.native
    def getHandlers: js.Any = js.native
    @scala.inline
    def getHandlers_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getHandlers")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getInstance")
    @js.native
    def getInstance: js.Any = js.native
    @scala.inline
    def getInstance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Look up IOHandler for loading, given a URL-like string.
      *
      * @param url
      * @param loadOptions Optional, custom load options.
      * @returns All valid handlers for `url`, given the currently registered
      *   handler routers.
      */
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getLoadHandlers")
    @js.native
    def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getLoadHandlers")
    @js.native
    def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getLoadHandlers")
    @js.native
    def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getLoadHandlers")
    @js.native
    def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = js.native
    
    /**
      * Look up IOHandler for saving, given a URL-like string.
      *
      * @param url
      * @returns If only one match is found, an instance of IOHandler with the
      * `save` method defined. If no match is found, `null`.
      * @throws Error, if more than one match is found.
      */
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getSaveHandlers")
    @js.native
    def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getSaveHandlers")
    @js.native
    def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.instance")
    @js.native
    def instance: js.Any = js.native
    @scala.inline
    def instance_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    /**
      * Register a load-handler router.
      *
      * @param loadRouter A function that maps a URL-like string onto an instance
      * of `IOHandler` with the `load` method defined or `null`.
      */
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.registerLoadRouter")
    @js.native
    def registerLoadRouter(loadRouter: IORouter): Unit = js.native
    
    /**
      * Register a save-handler router.
      *
      * @param saveRouter A function that maps a URL-like string onto an instance
      * of `IOHandler` with the `save` method defined or `null`.
      */
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.registerSaveRouter")
    @js.native
    def registerSaveRouter(saveRouter: IORouter): Unit = js.native
  }
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "getLoadHandlers")
  @js.native
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "getLoadHandlers")
  @js.native
  def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "getLoadHandlers")
  @js.native
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "getLoadHandlers")
  @js.native
  def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "getSaveHandlers")
  @js.native
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "getSaveHandlers")
  @js.native
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "registerLoadRouter")
  @js.native
  def registerLoadRouter(loudRouter: IORouter): Unit = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "registerSaveRouter")
  @js.native
  def registerSaveRouter(loudRouter: IORouter): Unit = js.native
  
  type IORouter = js.Function2[
    /* url */ String | js.Array[String], 
    /* loadOptions */ js.UndefOr[LoadOptions], 
    IOHandler
  ]
}
