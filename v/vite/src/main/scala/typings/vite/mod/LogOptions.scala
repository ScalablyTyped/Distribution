package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOptions extends StObject {
  
  var clear: js.UndefOr[Boolean] = js.undefined
  
  var timestamp: js.UndefOr[Boolean] = js.undefined
}
object LogOptions {
  
  inline def apply(): LogOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogOptions]
  }
  
  extension [Self <: LogOptions](x: Self) {
    
    inline def setClear(value: Boolean): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
    
    inline def setClearUndefined: Self = StObject.set(x, "clear", js.undefined)
    
    inline def setTimestamp(value: Boolean): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
    
    inline def setTimestampUndefined: Self = StObject.set(x, "timestamp", js.undefined)
  }
}
