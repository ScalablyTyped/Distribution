package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResolvedServerUrls extends StObject {
  
  var local: js.Array[String]
  
  var network: js.Array[String]
}
object ResolvedServerUrls {
  
  inline def apply(local: js.Array[String], network: js.Array[String]): ResolvedServerUrls = {
    val __obj = js.Dynamic.literal(local = local.asInstanceOf[js.Any], network = network.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResolvedServerUrls]
  }
  
  extension [Self <: ResolvedServerUrls](x: Self) {
    
    inline def setLocal(value: js.Array[String]): Self = StObject.set(x, "local", value.asInstanceOf[js.Any])
    
    inline def setLocalVarargs(value: String*): Self = StObject.set(x, "local", js.Array(value*))
    
    inline def setNetwork(value: js.Array[String]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
    
    inline def setNetworkVarargs(value: String*): Self = StObject.set(x, "network", js.Array(value*))
  }
}
