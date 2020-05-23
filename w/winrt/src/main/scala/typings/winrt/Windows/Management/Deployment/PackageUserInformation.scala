package typings.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PackageUserInformation extends IPackageUserInformation

object PackageUserInformation {
  @scala.inline
  def apply(installState: PackageInstallState, userSecurityId: String): PackageUserInformation = {
    val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageUserInformation]
  }
}

