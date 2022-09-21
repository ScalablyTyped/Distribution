package typings.uapiJson.airMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ToQueueParams extends StObject {
  
  var pnr: String
  
  var ppc: String
  
  var queue: String
}
object ToQueueParams {
  
  inline def apply(pnr: String, ppc: String, queue: String): ToQueueParams = {
    val __obj = js.Dynamic.literal(pnr = pnr.asInstanceOf[js.Any], ppc = ppc.asInstanceOf[js.Any], queue = queue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToQueueParams]
  }
  
  extension [Self <: ToQueueParams](x: Self) {
    
    inline def setPnr(value: String): Self = StObject.set(x, "pnr", value.asInstanceOf[js.Any])
    
    inline def setPpc(value: String): Self = StObject.set(x, "ppc", value.asInstanceOf[js.Any])
    
    inline def setQueue(value: String): Self = StObject.set(x, "queue", value.asInstanceOf[js.Any])
  }
}
