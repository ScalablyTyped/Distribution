package typings.vscodeDebugprotocol.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProcessId extends StObject {
  
  /** The process ID. The value should be less than or equal to 2147483647 (2^31-1). */
  var processId: js.UndefOr[Double] = js.undefined
  
  /** The process ID of the terminal shell. The value should be less than or equal to 2147483647 (2^31-1). */
  var shellProcessId: js.UndefOr[Double] = js.undefined
}
object ProcessId {
  
  inline def apply(): ProcessId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProcessId]
  }
  
  extension [Self <: ProcessId](x: Self) {
    
    inline def setProcessId(value: Double): Self = StObject.set(x, "processId", value.asInstanceOf[js.Any])
    
    inline def setProcessIdUndefined: Self = StObject.set(x, "processId", js.undefined)
    
    inline def setShellProcessId(value: Double): Self = StObject.set(x, "shellProcessId", value.asInstanceOf[js.Any])
    
    inline def setShellProcessIdUndefined: Self = StObject.set(x, "shellProcessId", js.undefined)
  }
}
