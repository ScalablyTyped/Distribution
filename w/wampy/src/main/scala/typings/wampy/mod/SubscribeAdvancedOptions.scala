package typings.wampy.mod

import typings.wampy.wampyStrings.prefix
import typings.wampy.wampyStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubscribeAdvancedOptions extends StObject {
  
  var `match`: js.UndefOr[prefix | wildcard] = js.undefined
}
object SubscribeAdvancedOptions {
  
  inline def apply(): SubscribeAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeAdvancedOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubscribeAdvancedOptions] (val x: Self) extends AnyVal {
    
    inline def setMatch(value: prefix | wildcard): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
