package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExtensionLicensing extends js.Object {
  /**
    * A list of contributions which deviate from the default licensing behavior
    */
  var overrides: js.Array[LicensingOverride] = js.native
}

object ExtensionLicensing {
  @scala.inline
  def apply(overrides: js.Array[LicensingOverride]): ExtensionLicensing = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExtensionLicensing]
  }
  @scala.inline
  implicit class ExtensionLicensingOps[Self <: ExtensionLicensing] (val x: Self) extends AnyVal {
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
    def setOverridesVarargs(value: LicensingOverride*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[LicensingOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
  }
  
}

