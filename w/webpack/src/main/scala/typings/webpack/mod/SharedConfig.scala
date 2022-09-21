package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced configuration for modules that should be shared in the share scope.
  */
trait SharedConfig extends StObject {
  
  /**
  	 * Include the provided and fallback module directly instead behind an async request. This allows to use this shared module in initial load too. All possible shared modules need to be eager too.
  	 */
  var eager: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Provided module that should be provided to share scope. Also acts as fallback module if no shared module is found in share scope or version isn't valid. Defaults to the property name.
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
  
  /**
  	 * Version of the provided module. Will replace lower matching versions, but not higher.
  	 */
  var version: js.UndefOr[String | `false`] = js.undefined
}
object SharedConfig {
  
  inline def apply(): SharedConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedConfig]
  }
  
  extension [Self <: SharedConfig](x: Self) {
    
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
    
    inline def setVersion(value: String | `false`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
