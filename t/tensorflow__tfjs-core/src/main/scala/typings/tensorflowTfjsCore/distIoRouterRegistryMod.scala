package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.distIoTypesMod.IOHandler
import typings.tensorflowTfjsCore.distIoTypesMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distIoRouterRegistryMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry")
  @js.native
  /* private */ open class IORouterRegistry () extends StObject {
    
    /* private */ var loadRouters: Any = js.native
    
    /* private */ var saveRouters: Any = js.native
  }
  /* static members */
  object IORouterRegistry {
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getHandlers")
    @js.native
    def getHandlers: Any = js.native
    inline def getHandlers_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getHandlers")(x.asInstanceOf[js.Any])
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.getInstance")
    @js.native
    def getInstance: Any = js.native
    inline def getInstance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getInstance")(x.asInstanceOf[js.Any])
    
    /**
      * Look up IOHandler for loading, given a URL-like string.
      *
      * @param url
      * @param loadOptions Optional, custom load options.
      * @returns All valid handlers for `url`, given the currently registered
      *   handler routers.
      */
    inline def getLoadHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    inline def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
    inline def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    inline def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
    
    /**
      * Look up IOHandler for saving, given a URL-like string.
      *
      * @param url
      * @returns If only one match is found, an instance of IOHandler with the
      * `save` method defined. If no match is found, `null`.
      * @throws Error, if more than one match is found.
      */
    inline def getSaveHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    inline def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    
    @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", "IORouterRegistry.instance")
    @js.native
    def instance: Any = js.native
    inline def instance_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("instance")(x.asInstanceOf[js.Any])
    
    /**
      * Register a load-handler router.
      *
      * @param loadRouter A function that maps a URL-like string onto an instance
      * of `IOHandler` with the `load` method defined or `null`.
      */
    inline def registerLoadRouter(loadRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadRouter")(loadRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Register a save-handler router.
      *
      * @param saveRouter A function that maps a URL-like string onto an instance
      * of `IOHandler` with the `save` method defined or `null`.
      */
    inline def registerSaveRouter(saveRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSaveRouter")(saveRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  inline def getLoadHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  inline def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  inline def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  inline def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  
  inline def getSaveHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  inline def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  
  inline def registerLoadRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def registerSaveRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSaveRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type IORouter = js.Function2[
    /* url */ String | js.Array[String], 
    /* loadOptions */ js.UndefOr[LoadOptions], 
    IOHandler
  ]
}
