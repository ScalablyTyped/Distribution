package typings.w3cWebNfc

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFScanOptions extends StObject {
  
  var signal: AbortSignal
}
object NDEFScanOptions {
  
  inline def apply(signal: AbortSignal): NDEFScanOptions = {
    val __obj = js.Dynamic.literal(signal = signal.asInstanceOf[js.Any])
    __obj.asInstanceOf[NDEFScanOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NDEFScanOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
  }
}
