package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageInstallState extends js.Object

/** Represents the install state of the package. */
@JSGlobal("Windows.Management.Deployment.PackageInstallState")
@js.native
object PackageInstallState extends js.Object {
  /** The package is ready for use. */
  @js.native
  sealed trait installed
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState
  
  /** The package has not been installed. */
  @js.native
  sealed trait notInstalled
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState
  
  /** The installation of the package has been paused. */
  @js.native
  sealed trait paused
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState
  
  /** The package has been downloaded. */
  @js.native
  sealed trait staged
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState
  
  val installed: installed with java.lang.String = js.native
  val notInstalled: notInstalled with java.lang.String = js.native
  val paused: paused with java.lang.String = js.native
  val staged: staged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState with java.lang.String
  ] = js.native
}

