package typings.winrt.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPackageUserInformation extends js.Object {
  var installState: PackageInstallState
  var userSecurityId: String
}

object IPackageUserInformation {
  @scala.inline
  def apply(installState: PackageInstallState, userSecurityId: String): IPackageUserInformation = {
    val __obj = js.Dynamic.literal(installState = installState, userSecurityId = userSecurityId)
  
    __obj.asInstanceOf[IPackageUserInformation]
  }
}

