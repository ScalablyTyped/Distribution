package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageInstallState extends js.Object

@JSGlobal("Windows.Management.Deployment.PackageInstallState")
@js.native
object PackageInstallState extends js.Object {
  @js.native
  sealed trait installed
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState
  
  @js.native
  sealed trait notInstalled
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState
  
  @js.native
  sealed trait staged
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState
  
  /* 2 */ val installed: installed with scala.Double = js.native
  /* 0 */ val notInstalled: notInstalled with scala.Double = js.native
  /* 1 */ val staged: staged with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState with scala.Double
  ] = js.native
}

