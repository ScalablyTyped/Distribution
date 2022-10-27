package typings.vite.mod

import typings.rollup.mod.RollupError
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogErrorOptions
  extends StObject
     with LogOptions {
  
  var error: js.UndefOr[js.Error | RollupError | Null] = js.undefined
}
object LogErrorOptions {
  
  inline def apply(): LogErrorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogErrorOptions]
  }
  
  extension [Self <: LogErrorOptions](x: Self) {
    
    inline def setError(value: js.Error | RollupError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorNull: Self = StObject.set(x, "error", null)
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
