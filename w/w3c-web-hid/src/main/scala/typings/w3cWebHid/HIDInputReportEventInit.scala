package typings.w3cWebHid

import typings.std.EventInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/*~ https://wicg.github.io/webhid/#hidinputreporteventinit-dictionary */
trait HIDInputReportEventInit
  extends StObject
     with EventInit {
  
  var data: js.typedarray.DataView
  
  var device: HIDDevice
  
  var reportId: Double
}
object HIDInputReportEventInit {
  
  inline def apply(data: js.typedarray.DataView, device: HIDDevice, reportId: Double): HIDInputReportEventInit = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], reportId = reportId.asInstanceOf[js.Any])
    __obj.asInstanceOf[HIDInputReportEventInit]
  }
  
  extension [Self <: HIDInputReportEventInit](x: Self) {
    
    inline def setData(value: js.typedarray.DataView): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: HIDDevice): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setReportId(value: Double): Self = StObject.set(x, "reportId", value.asInstanceOf[js.Any])
  }
}
