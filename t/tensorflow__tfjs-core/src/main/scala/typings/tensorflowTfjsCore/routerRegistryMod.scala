package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routerRegistryMod {
  
  @JSImport("@tensorflow/tfjs-core/dist/io/router_registry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    @scala.inline
    def getLoadHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    @scala.inline
    def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
    @scala.inline
    def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    @scala.inline
    def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
    
    /**
      * Look up IOHandler for saving, given a URL-like string.
      *
      * @param url
      * @returns If only one match is found, an instance of IOHandler with the
      * `save` method defined. If no match is found, `null`.
      * @throws Error, if more than one match is found.
      */
    @scala.inline
    def getSaveHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    @scala.inline
    def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
    
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
    @scala.inline
    def registerLoadRouter(loadRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadRouter")(loadRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    /**
      * Register a save-handler router.
      *
      * @param saveRouter A function that maps a URL-like string onto an instance
      * of `IOHandler` with the `save` method defined or `null`.
      */
    @scala.inline
    def registerSaveRouter(saveRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSaveRouter")(saveRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  }
  
  @scala.inline
  def getLoadHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = (^.asInstanceOf[js.Dynamic].applyDynamic("getLoadHandlers")(url.asInstanceOf[js.Any], loadOptions.asInstanceOf[js.Any])).asInstanceOf[js.Array[IOHandler]]
  
  @scala.inline
  def getSaveHandlers(url: String): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  @scala.inline
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSaveHandlers")(url.asInstanceOf[js.Any]).asInstanceOf[js.Array[IOHandler]]
  
  @scala.inline
  def registerLoadRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerLoadRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def registerSaveRouter(loudRouter: IORouter): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("registerSaveRouter")(loudRouter.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type IORouter = js.Function2[
    /* url */ String | js.Array[String], 
    /* loadOptions */ js.UndefOr[LoadOptions], 
    IOHandler
  ]
}
