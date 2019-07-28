package typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs

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
  sealed trait disabled extends PackageStatus
  
  /** The license of the package is not valid. */
  @js.native
  sealed trait licenseIssue extends PackageStatus
  
  /** The package payload was modified by an unknown source. */
  @js.native
  sealed trait modified extends PackageStatus
  
  /** The package is usable. */
  @js.native
  sealed trait ok extends PackageStatus
  
  /** The package payload was tampered with intentionally. */
  @js.native
  sealed trait tampered extends PackageStatus
  
  /* 4 */ val disabled: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageStatus.disabled with Double = js.native
  /* 1 */ val licenseIssue: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageStatus.licenseIssue with Double = js.native
  /* 2 */ val modified: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageStatus.modified with Double = js.native
  /* 0 */ val ok: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageStatus.ok with Double = js.native
  /* 3 */ val tampered: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageStatus.tampered with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageStatus with Double] = js.native
}

