package typings.winrtUwp.Windows.Media.DialProtocol

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the filter used to determine which devices to show in a DialDevicePicker . The filter parameters are OR-ed together to build the resulting filter. */
@js.native
trait DialDevicePickerFilter extends js.Object {
  /** Gets a list of DIAL apps supported by the remote devices. Defaults to an empty list (no filter). You can add one or more app names and filter the devices list to those that can launch one the supported apps. */
  var supportedAppNames: IVector[String] = js.native
}

object DialDevicePickerFilter {
  @scala.inline
  def apply(supportedAppNames: IVector[String]): DialDevicePickerFilter = {
    val __obj = js.Dynamic.literal(supportedAppNames = supportedAppNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialDevicePickerFilter]
  }
  @scala.inline
  implicit class DialDevicePickerFilterOps[Self <: DialDevicePickerFilter] (val x: Self) extends AnyVal {
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
    def setSupportedAppNames(value: IVector[String]): Self = this.set("supportedAppNames", value.asInstanceOf[js.Any])
  }
  
}

