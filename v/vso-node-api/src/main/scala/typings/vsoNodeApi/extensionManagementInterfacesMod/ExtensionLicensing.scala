package typings.vsoNodeApi.extensionManagementInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExtensionLicensing extends js.Object {
  /**
    * A list of contributions which deviate from the default licensing behavior
    */
  var overrides: js.Array[LicensingOverride]
}

object ExtensionLicensing {
  @scala.inline
  def apply(overrides: js.Array[LicensingOverride]): ExtensionLicensing = {
    val __obj = js.Dynamic.literal(overrides = overrides.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ExtensionLicensing]
  }
}

