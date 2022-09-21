package typings.webpack.mod

import typings.webpack.webpackBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Options for building http resources.
  */
trait HttpUriOptions extends StObject {
  
  /**
  	 * List of allowed URIs (resp. the beginning of them).
  	 */
  var allowedUris: js.Array[String | js.RegExp | (js.Function1[/* uri */ String, Boolean])]
  
  /**
  	 * Location where resource content is stored for lockfile entries. It's also possible to disable storing by passing false.
  	 */
  var cacheLocation: js.UndefOr[String | `false`] = js.undefined
  
  /**
  	 * When set, anything that would lead to a modification of the lockfile or any resource content, will result in an error.
  	 */
  var frozen: js.UndefOr[Boolean] = js.undefined
  
  /**
  	 * Location of the lockfile.
  	 */
  var lockfileLocation: js.UndefOr[String] = js.undefined
  
  /**
  	 * Proxy configuration, which can be used to specify a proxy server to use for HTTP requests.
  	 */
  var proxy: js.UndefOr[String] = js.undefined
  
  /**
  	 * When set, resources of existing lockfile entries will be fetched and entries will be upgraded when resource content has changed.
  	 */
  var upgrade: js.UndefOr[Boolean] = js.undefined
}
object HttpUriOptions {
  
  inline def apply(allowedUris: js.Array[String | js.RegExp | (js.Function1[/* uri */ String, Boolean])]): HttpUriOptions = {
    val __obj = js.Dynamic.literal(allowedUris = allowedUris.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUriOptions]
  }
  
  extension [Self <: HttpUriOptions](x: Self) {
    
    inline def setAllowedUris(value: js.Array[String | js.RegExp | (js.Function1[/* uri */ String, Boolean])]): Self = StObject.set(x, "allowedUris", value.asInstanceOf[js.Any])
    
    inline def setAllowedUrisVarargs(value: (String | js.RegExp | (js.Function1[/* uri */ String, Boolean]))*): Self = StObject.set(x, "allowedUris", js.Array(value*))
    
    inline def setCacheLocation(value: String | `false`): Self = StObject.set(x, "cacheLocation", value.asInstanceOf[js.Any])
    
    inline def setCacheLocationUndefined: Self = StObject.set(x, "cacheLocation", js.undefined)
    
    inline def setFrozen(value: Boolean): Self = StObject.set(x, "frozen", value.asInstanceOf[js.Any])
    
    inline def setFrozenUndefined: Self = StObject.set(x, "frozen", js.undefined)
    
    inline def setLockfileLocation(value: String): Self = StObject.set(x, "lockfileLocation", value.asInstanceOf[js.Any])
    
    inline def setLockfileLocationUndefined: Self = StObject.set(x, "lockfileLocation", js.undefined)
    
    inline def setProxy(value: String): Self = StObject.set(x, "proxy", value.asInstanceOf[js.Any])
    
    inline def setProxyUndefined: Self = StObject.set(x, "proxy", js.undefined)
    
    inline def setUpgrade(value: Boolean): Self = StObject.set(x, "upgrade", value.asInstanceOf[js.Any])
    
    inline def setUpgradeUndefined: Self = StObject.set(x, "upgrade", js.undefined)
  }
}
