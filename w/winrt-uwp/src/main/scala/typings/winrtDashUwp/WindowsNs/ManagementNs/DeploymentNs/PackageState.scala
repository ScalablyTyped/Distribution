package typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageState extends js.Object

/** Represents the state of the package. */
@JSGlobal("Windows.Management.Deployment.PackageState")
@js.native
object PackageState extends js.Object {
  /** The license of the package is not valid. */
  @js.native
  sealed trait licenseInvalid extends PackageState
  
  /** The package payload was modified by an unknown source. */
  @js.native
  sealed trait modified extends PackageState
  
  /** The package is usable. */
  @js.native
  sealed trait normal extends PackageState
  
  /** The package payload was tampered with intentionally. */
  @js.native
  sealed trait tampered extends PackageState
  
  /* 1 */ val licenseInvalid: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageState.licenseInvalid with Double = js.native
  /* 2 */ val modified: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageState.modified with Double = js.native
  /* 0 */ val normal: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageState.normal with Double = js.native
  /* 3 */ val tampered: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageState.tampered with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageState with Double] = js.native
}

