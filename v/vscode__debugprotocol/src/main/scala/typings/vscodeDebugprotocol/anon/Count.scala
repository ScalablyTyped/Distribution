package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Count extends StObject {
  
  /** Number of bytes updated. */
  var count: Double
  
  /** Memory reference of a memory range that has been updated. */
  var memoryReference: String
  
  /** Starting offset in bytes where memory has been updated. Can be negative. */
  var offset: Double
}
object Count {
  
  inline def apply(count: Double, memoryReference: String, offset: Double): Count = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], memoryReference = memoryReference.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Count]
  }
  
  extension [Self <: Count](x: Self) {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMemoryReference(value: String): Self = StObject.set(x, "memoryReference", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
