package typings.vite.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoggerOptions extends StObject {
  
  var allowClearScreen: js.UndefOr[Boolean] = js.undefined
  
  var customLogger: js.UndefOr[Logger] = js.undefined
  
  var prefix: js.UndefOr[String] = js.undefined
}
object LoggerOptions {
  
  inline def apply(): LoggerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoggerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LoggerOptions] (val x: Self) extends AnyVal {
    
    inline def setAllowClearScreen(value: Boolean): Self = StObject.set(x, "allowClearScreen", value.asInstanceOf[js.Any])
    
    inline def setAllowClearScreenUndefined: Self = StObject.set(x, "allowClearScreen", js.undefined)
    
    inline def setCustomLogger(value: Logger): Self = StObject.set(x, "customLogger", value.asInstanceOf[js.Any])
    
    inline def setCustomLoggerUndefined: Self = StObject.set(x, "customLogger", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
  }
}
