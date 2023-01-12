package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Advanced configuration for modules that should be provided as shared modules to the share scope.
  */
trait ProvidesConfig extends StObject {
  
  /**
  	 * Include the provided module directly instead behind an async request. This allows to use this shared module in initial load too. All possible shared modules need to be eager too.
  	 */
  var eager: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Key in the share scope under which the shared modules should be stored.
  	 */
  var shareKey: js.UndefOr[String] = js.undefined
  
  /**
  	 * Share scope name.
  	 */
  var shareScope: js.UndefOr[String] = js.undefined
  
  /**
  	 * Version of the provided module. Will replace lower matching versions, but not higher.
  	 */
  var version: js.UndefOr[String | `false`] = js.undefined
}
object ProvidesConfig {
  
  inline def apply(): ProvidesConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvidesConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvidesConfig] (val x: Self) extends AnyVal {
    
    inline def setEager(value: Boolean): Self = StObject.set(x, "eager", value.asInstanceOf[js.Any])
    
    inline def setEagerUndefined: Self = StObject.set(x, "eager", js.undefined)
    
    inline def setShareKey(value: String): Self = StObject.set(x, "shareKey", value.asInstanceOf[js.Any])
    
    inline def setShareKeyUndefined: Self = StObject.set(x, "shareKey", js.undefined)
    
    inline def setShareScope(value: String): Self = StObject.set(x, "shareScope", value.asInstanceOf[js.Any])
    
    inline def setShareScopeUndefined: Self = StObject.set(x, "shareScope", js.undefined)
    
    inline def setVersion(value: String | `false`): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
