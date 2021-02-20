package typings.titanium.Titanium

import typings.titanium.ProxyEventMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlatformEventMap extends ProxyEventMap {
  
  var battery: PlatformBatteryEvent = js.native
}
object PlatformEventMap {
  
  @scala.inline
  def apply(battery: PlatformBatteryEvent): PlatformEventMap = {
    val __obj = js.Dynamic.literal(battery = battery.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformEventMap]
  }
  
  @scala.inline
  implicit class PlatformEventMapMutableBuilder[Self <: PlatformEventMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBattery(value: PlatformBatteryEvent): Self = StObject.set(x, "battery", value.asInstanceOf[js.Any])
  }
}
