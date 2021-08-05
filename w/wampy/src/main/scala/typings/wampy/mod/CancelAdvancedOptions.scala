package typings.wampy.mod

import typings.wampy.wampyStrings.kill
import typings.wampy.wampyStrings.killnowait
import typings.wampy.wampyStrings.skip
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelAdvancedOptions extends StObject {
  
  var mode: js.UndefOr[skip | kill | killnowait] = js.undefined
}
object CancelAdvancedOptions {
  
  inline def apply(): CancelAdvancedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelAdvancedOptions]
  }
  
  extension [Self <: CancelAdvancedOptions](x: Self) {
    
    inline def setMode(value: skip | kill | killnowait): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
