package typings.webdriver.WebDriver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait W3CCapabilities extends StObject {
  
  var alwaysMatch: Capabilities
  
  var firstMatch: js.Array[Capabilities]
}
object W3CCapabilities {
  
  inline def apply(alwaysMatch: Capabilities, firstMatch: js.Array[Capabilities]): W3CCapabilities = {
    val __obj = js.Dynamic.literal(alwaysMatch = alwaysMatch.asInstanceOf[js.Any], firstMatch = firstMatch.asInstanceOf[js.Any])
    __obj.asInstanceOf[W3CCapabilities]
  }
  
  extension [Self <: W3CCapabilities](x: Self) {
    
    inline def setAlwaysMatch(value: Capabilities): Self = StObject.set(x, "alwaysMatch", value.asInstanceOf[js.Any])
    
    inline def setFirstMatch(value: js.Array[Capabilities]): Self = StObject.set(x, "firstMatch", value.asInstanceOf[js.Any])
    
    inline def setFirstMatchVarargs(value: Capabilities*): Self = StObject.set(x, "firstMatch", js.Array(value :_*))
  }
}
