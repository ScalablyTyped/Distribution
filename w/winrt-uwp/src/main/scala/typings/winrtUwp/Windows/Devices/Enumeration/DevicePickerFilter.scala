package typings.winrtUwp.Windows.Devices.Enumeration

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents the filter used to determine which devices to show in the device picker. The filter parameters are OR-ed together to build the resulting filter. */
@js.native
trait DevicePickerFilter extends js.Object {
  
  /** Gets a list of supported device classes to show in the picker. This defaults to an empty list (no filter). You can add device classes to this vector and filter the devices list to those that are in one or more of the provided classes. */
  var supportedDeviceClasses: IVector[DeviceClass] = js.native
  
  /** Gets a list of AQS filter strings. This defaults to empty list (no filter). You can add one or more AQS filter strings to this vector and filter the devices list to those that meet one or more of the provided filters. */
  var supportedDeviceSelectors: IVector[String] = js.native
}
object DevicePickerFilter {
  
  @scala.inline
  def apply(supportedDeviceClasses: IVector[DeviceClass], supportedDeviceSelectors: IVector[String]): DevicePickerFilter = {
    val __obj = js.Dynamic.literal(supportedDeviceClasses = supportedDeviceClasses.asInstanceOf[js.Any], supportedDeviceSelectors = supportedDeviceSelectors.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevicePickerFilter]
  }
  
  @scala.inline
  implicit class DevicePickerFilterOps[Self <: DevicePickerFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSupportedDeviceClasses(value: IVector[DeviceClass]): Self = this.set("supportedDeviceClasses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportedDeviceSelectors(value: IVector[String]): Self = this.set("supportedDeviceSelectors", value.asInstanceOf[js.Any])
  }
}
