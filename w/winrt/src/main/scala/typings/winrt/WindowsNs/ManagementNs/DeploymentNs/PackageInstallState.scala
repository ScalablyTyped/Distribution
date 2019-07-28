package typings.winrt.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageInstallState extends js.Object

@JSGlobal("Windows.Management.Deployment.PackageInstallState")
@js.native
object PackageInstallState extends js.Object {
  @js.native
  sealed trait installed extends PackageInstallState
  
  @js.native
  sealed trait notInstalled extends PackageInstallState
  
  @js.native
  sealed trait staged extends PackageInstallState
  
  /* 2 */ val installed: typings.winrt.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState.installed with Double = js.native
  /* 0 */ val notInstalled: typings.winrt.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState.notInstalled with Double = js.native
  /* 1 */ val staged: typings.winrt.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState.staged with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageInstallState with Double] = js.native
}

