package typings.tizenCommonWeb.systeminfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SystemInfoBuild extends SystemInfoProperty {
  /**
    * Represents the build version information of the device.
    *
    * @since 2.2
    */
  val buildVersion: String = js.native
  /**
    * Represents the manufacturer of the device.
    *
    * @since 2.1
    */
  val manufacturer: String = js.native
  /**
    * Represents the model name of the current device.
    */
  val model: String = js.native
}

object SystemInfoBuild {
  @scala.inline
  def apply(buildVersion: String, manufacturer: String, model: String): SystemInfoBuild = {
    val __obj = js.Dynamic.literal(buildVersion = buildVersion.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], model = model.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemInfoBuild]
  }
  @scala.inline
  implicit class SystemInfoBuildOps[Self <: SystemInfoBuild] (val x: Self) extends AnyVal {
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
    def setBuildVersion(value: String): Self = this.set("buildVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setManufacturer(value: String): Self = this.set("manufacturer", value.asInstanceOf[js.Any])
    @scala.inline
    def setModel(value: String): Self = this.set("model", value.asInstanceOf[js.Any])
  }
  
}

