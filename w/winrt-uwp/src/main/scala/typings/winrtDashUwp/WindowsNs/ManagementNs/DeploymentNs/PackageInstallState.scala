package typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs

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
  sealed trait installed extends PackageInstallState
  
  /** The package has not been installed. */
  @js.native
  sealed trait notInstalled extends PackageInstallState
  
  /** The installation of the package has been paused. */
  @js.native
  sealed trait paused extends PackageInstallState
  
  /** The package has been downloaded. */
  @js.native
  sealed trait staged extends PackageInstallState
  
  /* 2 */ val installed: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState.installed with Double = js.native
  /* 0 */ val notInstalled: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState.notInstalled with Double = js.native
  /* 3 */ val paused: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState.paused with Double = js.native
  /* 1 */ val staged: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState.staged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageInstallState with Double] = js.native
}

