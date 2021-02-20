package typings.winrtUwp.anon

import typings.winrtUwp.Windows.Devices.Enumeration.DeviceInformation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ItemsDeviceInformation extends StObject {
  
  /** The array of DeviceInformation objects starting at the index specified by startIndex. */ var items: DeviceInformation = js.native
  
  /** The number of DeviceInformation objects returned. */ var returnValue: Double = js.native
}
object ItemsDeviceInformation {
  
  @scala.inline
  def apply(items: DeviceInformation, returnValue: Double): ItemsDeviceInformation = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ItemsDeviceInformation]
  }
  
  @scala.inline
  implicit class ItemsDeviceInformationMutableBuilder[Self <: ItemsDeviceInformation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: DeviceInformation): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: Double): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
