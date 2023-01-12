package typings.wdioTypes.buildCapabilitiesMod

import typings.wdioTypes.anon.DeviceName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MoonOptions
  extends StObject
     with SelenoidOptions {
  
  var mobileDevice: js.UndefOr[DeviceName] = js.undefined
}
object MoonOptions {
  
  inline def apply(): MoonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MoonOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MoonOptions] (val x: Self) extends AnyVal {
    
    inline def setMobileDevice(value: DeviceName): Self = StObject.set(x, "mobileDevice", value.asInstanceOf[js.Any])
    
    inline def setMobileDeviceUndefined: Self = StObject.set(x, "mobileDevice", js.undefined)
  }
}
