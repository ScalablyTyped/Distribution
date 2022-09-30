package typings.stylelint.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableOptions extends StObject {
  
  var except: js.UndefOr[js.Array[String | js.RegExp]] = js.undefined
  
  var severity: js.UndefOr[Severity] = js.undefined
}
object DisableOptions {
  
  inline def apply(): DisableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DisableOptions]
  }
  
  extension [Self <: DisableOptions](x: Self) {
    
    inline def setExcept(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "except", value.asInstanceOf[js.Any])
    
    inline def setExceptUndefined: Self = StObject.set(x, "except", js.undefined)
    
    inline def setExceptVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "except", js.Array(value*))
    
    inline def setSeverity(value: Severity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    inline def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
  }
}
