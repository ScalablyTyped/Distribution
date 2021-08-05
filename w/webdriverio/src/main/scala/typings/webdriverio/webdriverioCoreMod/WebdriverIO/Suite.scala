package typings.webdriverio.webdriverioCoreMod.WebdriverIO

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Suite extends StObject {
  
  var error: js.UndefOr[js.Any] = js.undefined
}
object Suite {
  
  inline def apply(): Suite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Suite]
  }
  
  extension [Self <: Suite](x: Self) {
    
    inline def setError(value: js.Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
  }
}
