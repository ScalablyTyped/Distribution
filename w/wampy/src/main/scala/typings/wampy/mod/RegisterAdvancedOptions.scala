package typings.wampy.mod

import typings.wampy.wampyStrings.first
import typings.wampy.wampyStrings.last
import typings.wampy.wampyStrings.prefix
import typings.wampy.wampyStrings.random
import typings.wampy.wampyStrings.roundrobin
import typings.wampy.wampyStrings.single
import typings.wampy.wampyStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegisterAdvancedOptions extends StObject {
  
  var invoke: js.UndefOr[single | roundrobin | random | first | last] = js.undefined
  
  var `match`: js.UndefOr[prefix | wildcard] = js.undefined
}
object RegisterAdvancedOptions {
  
  inline def apply(): RegisterAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RegisterAdvancedOptions]
  }
  
  extension [Self <: RegisterAdvancedOptions](x: Self) {
    
    inline def setInvoke(value: single | roundrobin | random | first | last): Self = StObject.set(x, "invoke", value.asInstanceOf[js.Any])
    
    inline def setInvokeUndefined: Self = StObject.set(x, "invoke", js.undefined)
    
    inline def setMatch(value: prefix | wildcard): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
