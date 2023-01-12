package typings.twilioVideo.tsdefTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NoiseCancellationOptions extends StObject {
  
  var sdkAssetsPath: String
  
  var vendor: NoiseCancellationVendor
}
object NoiseCancellationOptions {
  
  inline def apply(sdkAssetsPath: String, vendor: NoiseCancellationVendor): NoiseCancellationOptions = {
    val __obj = js.Dynamic.literal(sdkAssetsPath = sdkAssetsPath.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoiseCancellationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NoiseCancellationOptions] (val x: Self) extends AnyVal {
    
    inline def setSdkAssetsPath(value: String): Self = StObject.set(x, "sdkAssetsPath", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: NoiseCancellationVendor): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
