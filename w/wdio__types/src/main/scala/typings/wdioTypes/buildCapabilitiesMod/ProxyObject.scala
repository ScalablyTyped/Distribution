package typings.wdioTypes.buildCapabilitiesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProxyObject extends StObject {
  
  var ftpProxy: js.UndefOr[String] = js.undefined
  
  var ftpProxyPort: js.UndefOr[Double] = js.undefined
  
  var httpProxy: js.UndefOr[String] = js.undefined
  
  var httpProxyPort: js.UndefOr[Double] = js.undefined
  
  var proxyAutoconfigUrl: js.UndefOr[String] = js.undefined
  
  var proxyType: js.UndefOr[ProxyTypes] = js.undefined
  
  var socksPassword: js.UndefOr[String] = js.undefined
  
  var socksProxy: js.UndefOr[String] = js.undefined
  
  var socksProxyPort: js.UndefOr[Double] = js.undefined
  
  var socksUsername: js.UndefOr[String] = js.undefined
  
  var socksVersion: js.UndefOr[String] = js.undefined
  
  var sslProxy: js.UndefOr[String] = js.undefined
  
  var sslProxyPort: js.UndefOr[Double] = js.undefined
}
object ProxyObject {
  
  inline def apply(): ProxyObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProxyObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProxyObject] (val x: Self) extends AnyVal {
    
    inline def setFtpProxy(value: String): Self = StObject.set(x, "ftpProxy", value.asInstanceOf[js.Any])
    
    inline def setFtpProxyPort(value: Double): Self = StObject.set(x, "ftpProxyPort", value.asInstanceOf[js.Any])
    
    inline def setFtpProxyPortUndefined: Self = StObject.set(x, "ftpProxyPort", js.undefined)
    
    inline def setFtpProxyUndefined: Self = StObject.set(x, "ftpProxy", js.undefined)
    
    inline def setHttpProxy(value: String): Self = StObject.set(x, "httpProxy", value.asInstanceOf[js.Any])
    
    inline def setHttpProxyPort(value: Double): Self = StObject.set(x, "httpProxyPort", value.asInstanceOf[js.Any])
    
    inline def setHttpProxyPortUndefined: Self = StObject.set(x, "httpProxyPort", js.undefined)
    
    inline def setHttpProxyUndefined: Self = StObject.set(x, "httpProxy", js.undefined)
    
    inline def setProxyAutoconfigUrl(value: String): Self = StObject.set(x, "proxyAutoconfigUrl", value.asInstanceOf[js.Any])
    
    inline def setProxyAutoconfigUrlUndefined: Self = StObject.set(x, "proxyAutoconfigUrl", js.undefined)
    
    inline def setProxyType(value: ProxyTypes): Self = StObject.set(x, "proxyType", value.asInstanceOf[js.Any])
    
    inline def setProxyTypeUndefined: Self = StObject.set(x, "proxyType", js.undefined)
    
    inline def setSocksPassword(value: String): Self = StObject.set(x, "socksPassword", value.asInstanceOf[js.Any])
    
    inline def setSocksPasswordUndefined: Self = StObject.set(x, "socksPassword", js.undefined)
    
    inline def setSocksProxy(value: String): Self = StObject.set(x, "socksProxy", value.asInstanceOf[js.Any])
    
    inline def setSocksProxyPort(value: Double): Self = StObject.set(x, "socksProxyPort", value.asInstanceOf[js.Any])
    
    inline def setSocksProxyPortUndefined: Self = StObject.set(x, "socksProxyPort", js.undefined)
    
    inline def setSocksProxyUndefined: Self = StObject.set(x, "socksProxy", js.undefined)
    
    inline def setSocksUsername(value: String): Self = StObject.set(x, "socksUsername", value.asInstanceOf[js.Any])
    
    inline def setSocksUsernameUndefined: Self = StObject.set(x, "socksUsername", js.undefined)
    
    inline def setSocksVersion(value: String): Self = StObject.set(x, "socksVersion", value.asInstanceOf[js.Any])
    
    inline def setSocksVersionUndefined: Self = StObject.set(x, "socksVersion", js.undefined)
    
    inline def setSslProxy(value: String): Self = StObject.set(x, "sslProxy", value.asInstanceOf[js.Any])
    
    inline def setSslProxyPort(value: Double): Self = StObject.set(x, "sslProxyPort", value.asInstanceOf[js.Any])
    
    inline def setSslProxyPortUndefined: Self = StObject.set(x, "sslProxyPort", js.undefined)
    
    inline def setSslProxyUndefined: Self = StObject.set(x, "sslProxy", js.undefined)
  }
}
