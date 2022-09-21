package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced configuration for modules that should be consumed from share scope.
  */
trait ConsumesConfig extends StObject {
  
  /**
  	 * Include the fallback module directly instead behind an async request. This allows to use fallback module in initial load too. All possible shared modules need to be eager too.
  	 */
  var eager: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Fallback module if no shared module is found in share scope. Defaults to the property name.
  	 */
  var `import`: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Package name to determine required version from description file. This is only needed when package name can't be automatically determined from request.
  	 */
  var packageName: js.UndefOr[String] = js.undefined
  
  /**
  	 * Version requirement from module in share scope.
  	 */
  var requiredVersion: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * Module is looked up under this key from the share scope.
  	 */
  var shareKey: js.UndefOr[String] = js.undefined
  
  /**
  	 * Share scope name.
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
  
  /**
  	 * Allow only a single version of the shared module in share scope (disabled by default).
  	 */
  var singleton: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Do not accept shared module if version is not valid (defaults to yes, if local fallback module is available and shared module is not a singleton, otherwise no, has no effect if there is no required version specified).
  	 */
  var strictVersion: js.UndefOr[Boolean] = js.undefined
}
object ConsumesConfig {
  
  inline def apply(): ConsumesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConsumesConfig]
  }
  
  extension [Self <: ConsumesConfig](x: Self) {
    
    inline def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
    
    inline def setEagerUndefined: Self = StObject.set(x, "eager", js.undefined)
    
    inline def setImport(value: String | `false`): Self = StObject.set(x, "import", value.asInstanceOf[js.Any])
    
    inline def setImportUndefined: Self = StObject.set(x, "import", js.undefined)
    
    inline def setPackageName(value: String): Self = StObject.set(x, "packageName", value.asInstanceOf[js.Any])
    
    inline def setPackageNameUndefined: Self = StObject.set(x, "packageName", js.undefined)
    
    inline def setRequiredVersion(value: String | `false`): Self = StObject.set(x, "requiredVersion", value.asInstanceOf[js.Any])
    
    inline def setRequiredVersionUndefined: Self = StObject.set(x, "requiredVersion", js.undefined)
    
    inline def setShareKey(value: String): Self = StObject.set(x, "shareKey", value.asInstanceOf[js.Any])
    
    inline def setShareKeyUndefined: Self = StObject.set(x, "shareKey", js.undefined)
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
    
    inline def setSingleton(value: Boolean): Self = StObject.set(x, "singleton", value.asInstanceOf[js.Any])
    
    inline def setSingletonUndefined: Self = StObject.set(x, "singleton", js.undefined)
    
    inline def setStrictVersion(value: Boolean): Self = StObject.set(x, "strictVersion", value.asInstanceOf[js.Any])
    
    inline def setStrictVersionUndefined: Self = StObject.set(x, "strictVersion", js.undefined)
  }
}
