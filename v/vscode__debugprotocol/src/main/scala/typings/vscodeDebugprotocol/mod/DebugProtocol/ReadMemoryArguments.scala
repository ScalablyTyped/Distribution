package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `readMemory` request. */
trait ReadMemoryArguments extends StObject {
  
  /** Number of bytes to read at the specified location and offset. */
  var count: Double
  
  /** Memory reference to the base location from which data should be read. */
  var memoryReference: String
  
  /** Offset (in bytes) to be applied to the reference location before reading data. Can be negative. */
  var offset: js.UndefOr[Double] = js.undefined
}
object ReadMemoryArguments {
  
  inline def apply(count: Double, memoryReference: String): ReadMemoryArguments = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], memoryReference = memoryReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadMemoryArguments]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadMemoryArguments] (val x: Self) extends AnyVal {
    
    inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setMemoryReference(value: String): Self = StObject.set(x, "memoryReference", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
