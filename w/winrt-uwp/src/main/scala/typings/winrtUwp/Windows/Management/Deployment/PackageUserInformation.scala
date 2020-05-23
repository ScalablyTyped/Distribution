package typings.winrtUwp.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the users of an installed package. */
trait PackageUserInformation extends js.Object {
  /** Gets the install state of the package for the user. */
  var installState: PackageInstallState
  /** Gets the security identifier (SID) of the package user. */
  var userSecurityId: String
}

object PackageUserInformation {
  @scala.inline
  def apply(installState: PackageInstallState, userSecurityId: String): PackageUserInformation = {
    val __obj = js.Dynamic.literal(installState = installState.asInstanceOf[js.Any], userSecurityId = userSecurityId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PackageUserInformation]
  }
}

