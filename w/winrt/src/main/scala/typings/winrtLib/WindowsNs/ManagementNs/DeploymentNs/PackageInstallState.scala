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
  
  val installed: installed with java.lang.String = js.native
  val notInstalled: notInstalled with java.lang.String = js.native
  val staged: staged with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageInstallState with java.lang.String
  ] = js.native
}

