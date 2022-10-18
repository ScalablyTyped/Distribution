package typings.webpackBundleAnalyzer

import typings.node.netMod.AddressInfo
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait BoundAddress extends StObject {
    
    var boundAddress: AddressInfo
    
    var listenHost: String
    
    var listenPort: String
  }
  object BoundAddress {
    
    inline def apply(boundAddress: AddressInfo, listenHost: String, listenPort: String): BoundAddress = {
      val __obj = js.Dynamic.literal(boundAddress = boundAddress.asInstanceOf[js.Any], listenHost = listenHost.asInstanceOf[js.Any], listenPort = listenPort.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoundAddress]
    }
    
    extension [Self <: BoundAddress](x: Self) {
      
      inline def setBoundAddress(value: AddressInfo): Self = StObject.set(x, "boundAddress", value.asInstanceOf[js.Any])
      
      inline def setListenHost(value: String): Self = StObject.set(x, "listenHost", value.asInstanceOf[js.Any])
      
      inline def setListenPort(value: String): Self = StObject.set(x, "listenPort", value.asInstanceOf[js.Any])
    }
  }
}
