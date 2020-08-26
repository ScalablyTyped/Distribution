package typings.winrtUwp.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the users of an installed package. */
@js.native
trait PackageUserInformation extends js.Object {
  /** Gets the install state of the package for the user. */
  var installState: PackageInstallState = js.native
  /** Gets the security identifier (SID) of the package user. */
  var userSecurityId: String = js.native
}

object PackageUserInformation {
  @scala.inline
  def apply(installState: PackageInstallState, userSecurityId: String): PackageUserInformation = {
    val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageUserInformation]
  }
  @scala.inline
  implicit class PackageUserInformationOps[Self <: PackageUserInformation] (val x: Self) extends AnyVal {
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
    def setInstallState(value: PackageInstallState): Self = this.set("installState", value.asInstanceOf[js.Any])
    @scala.inline
    def setUserSecurityId(value: String): Self = this.set("userSecurityId", value.asInstanceOf[js.Any])
  }
  
}

