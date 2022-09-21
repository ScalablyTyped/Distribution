package typings.webgpuTypes

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GPUUncapturedErrorEventInit
  extends StObject
     with EventInit {
  
  var error: GPUError
}
object GPUUncapturedErrorEventInit {
  
  inline def apply(error: GPUError): GPUUncapturedErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[GPUUncapturedErrorEventInit]
  }
  
  extension [Self <: GPUUncapturedErrorEventInit](x: Self) {
    
    inline def setError(value: GPUError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
