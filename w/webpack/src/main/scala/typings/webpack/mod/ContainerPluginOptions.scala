package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContainerPluginOptions extends StObject {
  
  /**
  	 * Modules that should be exposed by this container. When provided, property name is used as public name, otherwise public name is automatically inferred from request.
  	 */
  var exposes: Exposes
  
  /**
  	 * The filename for this container relative path inside the `output.path` directory.
  	 */
  var filename: js.UndefOr[String] = js.undefined
  
  /**
  	 * Options for library.
  	 */
  var library: js.UndefOr[LibraryOptions] = js.undefined
  
  /**
  	 * The name for this container.
  	 */
  var name: String
  
  /**
  	 * The name of the runtime chunk. If set a runtime chunk with this name is created or an existing entrypoint is used as runtime.
  	 */
  var runtime: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * The name of the share scope which is shared with the host (defaults to 'default').
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
}
object ContainerPluginOptions {
  
  inline def apply(exposes: Exposes, name: String): ContainerPluginOptions = {
    val __obj = js.Dynamic.literal(exposes = exposes.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContainerPluginOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContainerPluginOptions] (val x: Self) extends AnyVal {
    
    inline def setExposes(value: Exposes): Self = StObject.set(x, "exposes", value.asInstanceOf[js.Any])
    
    inline def setExposesVarargs(value: (String | ExposesObject)*): Self = StObject.set(x, "exposes", js.Array(value*))
    
    inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
    
    inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    
    inline def setLibrary(value: LibraryOptions): Self = StObject.set(x, "library", value.asInstanceOf[js.Any])
    
    inline def setLibraryUndefined: Self = StObject.set(x, "library", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRuntime(value: String | `false`): Self = StObject.set(x, "runtime", value.asInstanceOf[js.Any])
    
    inline def setRuntimeUndefined: Self = StObject.set(x, "runtime", js.undefined)
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
  }
}
