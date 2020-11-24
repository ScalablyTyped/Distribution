package typings.tensorflowTfjsCore

import typings.tensorflowTfjsCore.typesMod.IOHandler
import typings.tensorflowTfjsCore.typesMod.LoadOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@tensorflow/tfjs-core/dist/io/router_registry", JSImport.Namespace)
@js.native
object routerRegistryMod extends js.Object {
  
  def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = js.native
  
  def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
  def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
  
  def registerLoadRouter(loudRouter: IORouter): Unit = js.native
  
  def registerSaveRouter(loudRouter: IORouter): Unit = js.native
  
  @js.native
  class IORouterRegistry protected () extends js.Object {
    
    var loadRouters: js.Any = js.native
    
    var saveRouters: js.Any = js.native
  }
  /* static members */
  @js.native
  object IORouterRegistry extends js.Object {
    
    var getHandlers: js.Any = js.native
    
    var getInstance: js.Any = js.native
    
    /**
      * Look up IOHandler for loading, given a URL-like string.
      *
      * @param url
      * @param loadOptions Optional, custom load options.
      * @returns All valid handlers for `url`, given the currently registered
      *   handler routers.
      */
    def getLoadHandlers(url: String): js.Array[IOHandler] = js.native
    def getLoadHandlers(url: String, loadOptions: LoadOptions): js.Array[IOHandler] = js.native
    def getLoadHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
    def getLoadHandlers(url: js.Array[String], loadOptions: LoadOptions): js.Array[IOHandler] = js.native
    
    /**
      * Look up IOHandler for saving, given a URL-like string.
      *
      * @param url
      * @returns If only one match is found, an instance of IOHandler with the
      * `save` method defined. If no match is found, `null`.
      * @throws Error, if more than one match is found.
      */
    def getSaveHandlers(url: String): js.Array[IOHandler] = js.native
    def getSaveHandlers(url: js.Array[String]): js.Array[IOHandler] = js.native
    
    var instance: js.Any = js.native
    
    /**
      * Register a load-handler router.
      *
      * @param loadRouter A function that maps a URL-like string onto an instance
      * of `IOHandler` with the `load` method defined or `null`.
      */
    def registerLoadRouter(loadRouter: IORouter): Unit = js.native
    
    /**
      * Register a save-handler router.
      *
      * @param saveRouter A function that maps a URL-like string onto an instance
      * of `IOHandler` with the `save` method defined or `null`.
      */
    def registerSaveRouter(saveRouter: IORouter): Unit = js.native
  }
  
  type IORouter = js.Function2[
    /* url */ String | js.Array[String], 
    /* loadOptions */ js.UndefOr[LoadOptions], 
    IOHandler
  ]
}
