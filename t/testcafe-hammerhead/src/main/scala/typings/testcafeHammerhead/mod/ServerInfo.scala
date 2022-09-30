package typings.testcafeHammerhead.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServerInfo extends StObject {
  
  var cacheRequests: Boolean
  
  var crossDomainPort: Double
  
  var domain: String
  
  var hostname: String
  
  var port: Double
  
  var protocol: String
}
object ServerInfo {
  
  inline def apply(
    cacheRequests: Boolean,
    crossDomainPort: Double,
    domain: String,
    hostname: String,
    port: Double,
    protocol: String
  ): ServerInfo = {
    val __obj = js.Dynamic.literal(cacheRequests = cacheRequests.asInstanceOf[js.Any], crossDomainPort = crossDomainPort.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], hostname = hostname.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServerInfo]
  }
  
  extension [Self <: ServerInfo](x: Self) {
    
    inline def setCacheRequests(value: Boolean): Self = StObject.set(x, "cacheRequests", value.asInstanceOf[js.Any])
    
    inline def setCrossDomainPort(value: Double): Self = StObject.set(x, "crossDomainPort", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
