package typings.vscodeDebugprotocol.mod.DebugProtocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Arguments for `writeMemory` request. */
trait WriteMemoryArguments extends StObject {
  
  /** Property to control partial writes. If true, the debug adapter should attempt to write memory even if the entire memory region is not writable. In such a case the debug adapter should stop after hitting the first byte of memory that cannot be written and return the number of bytes written in the response via the `offset` and `bytesWritten` properties.
  			If false or missing, a debug adapter should attempt to verify the region is writable before writing, and fail the response if it is not.
  		*/
  var allowPartial: js.UndefOr[Boolean] = js.undefined
  
  /** Bytes to write, encoded using base64. */
  var data: String
  
  /** Memory reference to the base location to which data should be written. */
  var memoryReference: String
  
  /** Offset (in bytes) to be applied to the reference location before writing data. Can be negative. */
  var offset: js.UndefOr[Double] = js.undefined
}
object WriteMemoryArguments {
  
  inline def apply(data: String, memoryReference: String): WriteMemoryArguments = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], memoryReference = memoryReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteMemoryArguments]
  }
  
  extension [Self <: WriteMemoryArguments](x: Self) {
    
    inline def setAllowPartial(value: Boolean): Self = StObject.set(x, "allowPartial", value.asInstanceOf[js.Any])
    
    inline def setAllowPartialUndefined: Self = StObject.set(x, "allowPartial", js.undefined)
    
    inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setMemoryReference(value: String): Self = StObject.set(x, "memoryReference", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
  }
}
