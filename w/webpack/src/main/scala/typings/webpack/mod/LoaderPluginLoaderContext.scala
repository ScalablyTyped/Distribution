package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * These properties are added by the LoaderPlugin
  */
@js.native
trait LoaderPluginLoaderContext extends StObject {
  
  def importModule(request: String): js.Promise[Any] = js.native
  def importModule(request: String, options: ImportModuleOptions): js.Promise[Any] = js.native
  def importModule(
    request: String,
    options: ImportModuleOptions,
    callback: js.Function2[/* err */ js.UndefOr[Null | js.Error], /* exports */ js.UndefOr[Any], Any]
  ): Unit = js.native
  
  /**
  	 * Resolves the given request to a module, applies all configured loaders and calls
  	 * back with the generated source, the sourceMap and the module instance (usually an
  	 * instance of NormalModule). Use this function if you need to know the source code
  	 * of another module to generate the result.
  	 */
  def loadModule(
    request: String,
    callback: js.Function4[
      /* err */ Null | js.Error, 
      /* source */ String, 
      /* sourceMap */ Any, 
      /* module */ NormalModule, 
      Unit
    ]
  ): Unit = js.native
}
