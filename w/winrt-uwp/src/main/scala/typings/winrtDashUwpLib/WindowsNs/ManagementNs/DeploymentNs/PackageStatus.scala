package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageStatus extends js.Object

/** Provides info about the status of a package. */
@JSGlobal("Windows.Management.Deployment.PackageStatus")
@js.native
object PackageStatus extends js.Object {
  /** The package is not available for use. It can still be serviced. */
  @js.native
  sealed trait disabled
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageStatus
  
  /** The license of the package is not valid. */
  @js.native
  sealed trait licenseIssue
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageStatus
  
  /** The package payload was modified by an unknown source. */
  @js.native
  sealed trait modified
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageStatus
  
  /** The package is usable. */
  @js.native
  sealed trait ok
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageStatus
  
  /** The package payload was tampered with intentionally. */
  @js.native
  sealed trait tampered
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageStatus
  
  /* 4 */ val disabled: disabled with scala.Double = js.native
  /* 1 */ val licenseIssue: licenseIssue with scala.Double = js.native
  /* 2 */ val modified: modified with scala.Double = js.native
  /* 0 */ val ok: ok with scala.Double = js.native
  /* 3 */ val tampered: tampered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageStatus with scala.Double
  ] = js.native
}

