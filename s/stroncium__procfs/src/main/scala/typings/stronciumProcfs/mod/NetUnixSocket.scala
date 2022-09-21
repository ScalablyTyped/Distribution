package typings.stronciumProcfs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetUnixSocket extends StObject {
  
  var path: js.UndefOr[String] = js.undefined
  
  var referenceCount: Double
  
  var slot: String
  
  var `type`: Double
}
object NetUnixSocket {
  
  inline def apply(referenceCount: Double, slot: String, `type`: Double): NetUnixSocket = {
    val __obj = js.Dynamic.literal(referenceCount = referenceCount.asInstanceOf[js.Any], slot = slot.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetUnixSocket]
  }
  
  extension [Self <: NetUnixSocket](x: Self) {
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setReferenceCount(value: Double): Self = StObject.set(x, "referenceCount", value.asInstanceOf[js.Any])
    
    inline def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
    
    inline def setType(value: Double): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
