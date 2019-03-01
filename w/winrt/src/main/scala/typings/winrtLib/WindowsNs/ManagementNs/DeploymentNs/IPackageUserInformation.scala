package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackageUserInformation extends js.Object {
  var installState: PackageInstallState
  var userSecurityId: java.lang.String
}

object IPackageUserInformation {
  @scala.inline
  def apply(installState: PackageInstallState, userSecurityId: java.lang.String): IPackageUserInformation = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("installState")(installState)
    __obj.updateDynamic("userSecurityId")(userSecurityId)
    __obj.asInstanceOf[IPackageUserInformation]
  }
}

