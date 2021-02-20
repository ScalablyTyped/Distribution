package typings.wampy.mod

import typings.wampy.wampyStrings.prefix
import typings.wampy.wampyStrings.wildcard
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubscribeAdvancedOptions extends StObject {
  
  var `match`: js.UndefOr[prefix | wildcard] = js.native
}
object SubscribeAdvancedOptions {
  
  @scala.inline
  def apply(): SubscribeAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubscribeAdvancedOptions]
  }
  
  @scala.inline
  implicit class SubscribeAdvancedOptionsMutableBuilder[Self <: SubscribeAdvancedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMatch(value: prefix | wildcard): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
  }
}
