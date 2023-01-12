package typings.trezorConnect.anon

import typings.trezorConnect.trezorConnectStrings.socks
import typings.trezorConnect.trezorConnectStrings.socks4
import typings.trezorConnect.trezorConnectStrings.socks4a
import typings.trezorConnect.trezorConnectStrings.socks5
import typings.trezorConnect.trezorConnectStrings.socks5h
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Host extends StObject {
  
  var host: String
  
  var password: js.UndefOr[String] = js.undefined
  
  var port: String | Double
  
  // Partial (useful) BlockchainLinkOptions.proxy
  var protocol: js.UndefOr[socks4 | socks4a | socks | socks5 | socks5h] = js.undefined
  
  var username: js.UndefOr[String] = js.undefined
}
object Host {
  
  inline def apply(host: String, port: String | Double): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Host] (val x: Self) extends AnyVal {
    
    inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
    
    inline def setPort(value: String | Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: socks4 | socks4a | socks | socks5 | socks5h): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    
    inline def setProtocolUndefined: Self = StObject.set(x, "protocol", js.undefined)
    
    inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
  }
}
