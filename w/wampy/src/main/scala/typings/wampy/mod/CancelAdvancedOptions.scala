package typings.wampy.mod

import typings.wampy.wampyStrings.kill
import typings.wampy.wampyStrings.killnowait
import typings.wampy.wampyStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelAdvancedOptions extends StObject {
  
  var mode: js.UndefOr[skip | kill | killnowait] = js.native
}
object CancelAdvancedOptions {
  
  @scala.inline
  def apply(): CancelAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelAdvancedOptions]
  }
  
  @scala.inline
  implicit class CancelAdvancedOptionsMutableBuilder[Self <: CancelAdvancedOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: skip | kill | killnowait): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
