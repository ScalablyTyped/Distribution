package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

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
  sealed trait licenseInvalid
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  /** The package payload was modified by an unknown source. */
  @js.native
  sealed trait modified
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  /** The package is usable. */
  @js.native
  sealed trait normal
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  /** The package payload was tampered with intentionally. */
  @js.native
  sealed trait tampered
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  /* 1 */ val licenseInvalid: licenseInvalid with scala.Double = js.native
  /* 2 */ val modified: modified with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 3 */ val tampered: tampered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageState with scala.Double
  ] = js.native
}

