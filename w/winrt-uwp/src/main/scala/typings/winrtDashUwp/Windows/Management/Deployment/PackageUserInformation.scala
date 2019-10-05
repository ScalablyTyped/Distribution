package typings.winrtDashUwp.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides information about the users of an installed package. */
@JSGlobal("Windows.Management.Deployment.PackageUserInformation")
@js.native
abstract class PackageUserInformation () extends js.Object {
  /** Gets the install state of the package for the user. */
  var installState: PackageInstallState = js.native
  /** Gets the security identifier (SID) of the package user. */
  var userSecurityId: String = js.native
}

