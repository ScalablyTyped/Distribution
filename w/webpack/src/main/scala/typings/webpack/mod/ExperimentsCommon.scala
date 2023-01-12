package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Enables/Disables experiments (experimental features with relax SemVer compatibility).
  */
trait ExperimentsCommon extends StObject {
  
  /**
  	 * Support WebAssembly as asynchronous EcmaScript Module.
  	 */
  var asyncWebAssembly: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable backward-compat layer with deprecation warnings for many webpack 4 APIs.
  	 */
  var backCompat: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable additional in memory caching of modules that are unchanged and reference only unchanged modules.
  	 */
  var cacheUnaffected: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Apply defaults of next major version.
  	 */
  var futureDefaults: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Enable module layers.
  	 */
  var layers: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Allow output javascript files as module source type.
  	 */
  var outputModule: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Support WebAssembly as synchronous EcmaScript Module (outdated).
  	 */
  var syncWebAssembly: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Allow using top-level-await in EcmaScript Modules.
  	 */
  var topLevelAwait: js.UndefOr[Boolean] = js.undefined
}
object ExperimentsCommon {
  
  inline def apply(): ExperimentsCommon = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentsCommon]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentsCommon] (val x: Self) extends AnyVal {
    
    inline def setAsyncWebAssembly(value: Boolean): Self = StObject.set(x, "asyncWebAssembly", value.asInstanceOf[js.Any])
    
    inline def setAsyncWebAssemblyUndefined: Self = StObject.set(x, "asyncWebAssembly", js.undefined)
    
    inline def setBackCompat(value: Boolean): Self = StObject.set(x, "backCompat", value.asInstanceOf[js.Any])
    
    inline def setBackCompatUndefined: Self = StObject.set(x, "backCompat", js.undefined)
    
    inline def setCacheUnaffected(value: Boolean): Self = StObject.set(x, "cacheUnaffected", value.asInstanceOf[js.Any])
    
    inline def setCacheUnaffectedUndefined: Self = StObject.set(x, "cacheUnaffected", js.undefined)
    
    inline def setFutureDefaults(value: Boolean): Self = StObject.set(x, "futureDefaults", value.asInstanceOf[js.Any])
    
    inline def setFutureDefaultsUndefined: Self = StObject.set(x, "futureDefaults", js.undefined)
    
    inline def setLayers(value: Boolean): Self = StObject.set(x, "layers", value.asInstanceOf[js.Any])
    
    inline def setLayersUndefined: Self = StObject.set(x, "layers", js.undefined)
    
    inline def setOutputModule(value: Boolean): Self = StObject.set(x, "outputModule", value.asInstanceOf[js.Any])
    
    inline def setOutputModuleUndefined: Self = StObject.set(x, "outputModule", js.undefined)
    
    inline def setSyncWebAssembly(value: Boolean): Self = StObject.set(x, "syncWebAssembly", value.asInstanceOf[js.Any])
    
    inline def setSyncWebAssemblyUndefined: Self = StObject.set(x, "syncWebAssembly", js.undefined)
    
    inline def setTopLevelAwait(value: Boolean): Self = StObject.set(x, "topLevelAwait", value.asInstanceOf[js.Any])
    
    inline def setTopLevelAwaitUndefined: Self = StObject.set(x, "topLevelAwait", js.undefined)
  }
}
