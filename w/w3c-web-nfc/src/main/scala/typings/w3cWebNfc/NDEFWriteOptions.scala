package typings.w3cWebNfc

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NDEFWriteOptions extends StObject {
  
  var overwrite: js.UndefOr[Boolean] = js.undefined
  
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object NDEFWriteOptions {
  
  inline def apply(): NDEFWriteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NDEFWriteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NDEFWriteOptions] (val x: Self) extends AnyVal {
    
    inline def setOverwrite(value: Boolean): Self = StObject.set(x, "overwrite", value.asInstanceOf[js.Any])
    
    inline def setOverwriteUndefined: Self = StObject.set(x, "overwrite", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
