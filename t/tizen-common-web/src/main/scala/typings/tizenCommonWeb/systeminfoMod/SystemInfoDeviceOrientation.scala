package typings.tizenCommonWeb.systeminfoMod

import typings.tizenCommonWeb.tizenCommonWebStrings.LANDSCAPE_PRIMARY
import typings.tizenCommonWeb.tizenCommonWebStrings.LANDSCAPE_SECONDARY
import typings.tizenCommonWeb.tizenCommonWebStrings.PORTRAIT_PRIMARY
import typings.tizenCommonWeb.tizenCommonWebStrings.PORTRAIT_SECONDARY
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoDeviceOrientation extends SystemInfoProperty {
  /**
    * Indicates whether the device is in autorotation.
    *
    * @since 2.2
    */
  val isAutoRotation: Boolean = js.native
  /**
    * Represents the status of the current device orientation.
    */
  val status: SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY = js.native
}

object SystemInfoDeviceOrientation {
  @scala.inline
  def apply(
    isAutoRotation: Boolean,
    status: SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY
  ): SystemInfoDeviceOrientation = {
    val __obj = js.Dynamic.literal(isAutoRotation = isAutoRotation.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoDeviceOrientation]
  }
  @scala.inline
  implicit class SystemInfoDeviceOrientationOps[Self <: SystemInfoDeviceOrientation] (val x: Self) extends AnyVal {
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
    def setIsAutoRotation(value: Boolean): Self = this.set("isAutoRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setStatus(
      value: SystemInfoDeviceOrientationStatus | PORTRAIT_PRIMARY | PORTRAIT_SECONDARY | LANDSCAPE_PRIMARY | LANDSCAPE_SECONDARY
    ): Self = this.set("status", value.asInstanceOf[js.Any])
  }
  
}

