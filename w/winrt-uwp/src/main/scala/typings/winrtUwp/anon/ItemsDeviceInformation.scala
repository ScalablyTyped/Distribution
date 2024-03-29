package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ItemsDeviceInformation extends StObject {
  
  /** The array of DeviceInformation objects starting at the index specified by startIndex. */ var items: DeviceInformation
  
  /** The number of DeviceInformation objects returned. */ var returnValue: Double
}
object ItemsDeviceInformation {
  
  inline def apply(items: DeviceInformation, returnValue: Double): ItemsDeviceInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDeviceInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ItemsDeviceInformation] (val x: Self) extends AnyVal {
    
    inline def setItems(value: DeviceInformation): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
