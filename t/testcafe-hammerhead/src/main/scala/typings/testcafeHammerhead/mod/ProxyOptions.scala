package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyOptions
  extends StObject
     with RouterOptions {
  
  var cache: Boolean
  
  var developmentMode: Boolean
  
  var disableHttp2: Boolean
  
  var proxyless: Boolean
  
  var ssl: js.Object
}
object ProxyOptions {
  
  inline def apply(
    cache: Boolean,
    developmentMode: Boolean,
    disableHttp2: Boolean,
    proxyless: Boolean,
    ssl: js.Object
  ): ProxyOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], developmentMode = developmentMode.asInstanceOf[js.Any], disableHttp2 = disableHttp2.asInstanceOf[js.Any], proxyless = proxyless.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyOptions]
  }
  
  extension [Self <: ProxyOptions](x: Self) {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentMode(value: Boolean): Self = StObject.set(x, "developmentMode", value.asInstanceOf[js.Any])
    
    inline def setDisableHttp2(value: Boolean): Self = StObject.set(x, "disableHttp2", value.asInstanceOf[js.Any])
    
    inline def setProxyless(value: Boolean): Self = StObject.set(x, "proxyless", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: js.Object): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
  }
}
