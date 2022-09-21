package typings.w3cWebNfc

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFMakeReadOnlyOptions extends StObject {
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object NDEFMakeReadOnlyOptions {
  
  inline def apply(): NDEFMakeReadOnlyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NDEFMakeReadOnlyOptions]
  }
  
  extension [Self <: NDEFMakeReadOnlyOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
