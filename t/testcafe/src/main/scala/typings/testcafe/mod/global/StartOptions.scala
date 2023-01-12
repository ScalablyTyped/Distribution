package typings.testcafe.mod.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartOptions extends StObject {
  
  var cache: Boolean
  
  var configFile: String
  
  var developmentMode: Boolean
  
  var disableHttp2: Boolean
  
  var hostname: String
  
  var port1: Double
  
  var port2: Double
  
  var retryTestPages: Boolean
  
  var ssl: TlsOptions
}
object StartOptions {
  
  inline def apply(
    cache: Boolean,
    configFile: String,
    developmentMode: Boolean,
    disableHttp2: Boolean,
    hostname: String,
    port1: Double,
    port2: Double,
    retryTestPages: Boolean,
    ssl: TlsOptions
  ): StartOptions = {
    val __obj = js.Dynamic.literal(cache = cache.asInstanceOf[js.Any], configFile = configFile.asInstanceOf[js.Any], developmentMode = developmentMode.asInstanceOf[js.Any], disableHttp2 = disableHttp2.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], port1 = port1.asInstanceOf[js.Any], port2 = port2.asInstanceOf[js.Any], retryTestPages = retryTestPages.asInstanceOf[js.Any], ssl = ssl.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setConfigFile(value: String): Self = StObject.set(x, "configFile", value.asInstanceOf[js.Any])
    
    inline def setDevelopmentMode(value: Boolean): Self = StObject.set(x, "developmentMode", value.asInstanceOf[js.Any])
    
    inline def setDisableHttp2(value: Boolean): Self = StObject.set(x, "disableHttp2", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setPort1(value: Double): Self = StObject.set(x, "port1", value.asInstanceOf[js.Any])
    
    inline def setPort2(value: Double): Self = StObject.set(x, "port2", value.asInstanceOf[js.Any])
    
    inline def setRetryTestPages(value: Boolean): Self = StObject.set(x, "retryTestPages", value.asInstanceOf[js.Any])
    
    inline def setSsl(value: TlsOptions): Self = StObject.set(x, "ssl", value.asInstanceOf[js.Any])
  }
}
