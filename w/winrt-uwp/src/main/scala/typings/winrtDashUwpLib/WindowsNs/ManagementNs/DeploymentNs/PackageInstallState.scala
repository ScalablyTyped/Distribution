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
  
  /* 2 */ val installed: installed with scala.Double = js.native
  /* 0 */ val notInstalled: notInstalled with scala.Double = js.native
  /* 3 */ val paused: paused with scala.Double = js.native
  /* 1 */ val staged: staged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState with scala.Double
  ] = js.native
}

