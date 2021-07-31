package typings.tuyaPanelKit.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IsVDevice extends StObject {
  
  var isVDevice: Boolean
}
object IsVDevice {
  
  @scala.inline
  def apply(isVDevice: Boolean): IsVDevice = {
    val __obj = js.Dynamic.literal(isVDevice = isVDevice.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsVDevice]
  }
  
  @scala.inline
  implicit class IsVDeviceMutableBuilder[Self <: IsVDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsVDevice(value: Boolean): Self = StObject.set(x, "isVDevice", value.asInstanceOf[js.Any])
  }
}
