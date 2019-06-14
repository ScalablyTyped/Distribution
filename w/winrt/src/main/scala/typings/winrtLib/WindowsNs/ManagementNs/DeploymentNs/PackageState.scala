package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageState extends js.Object

@JSGlobal("Windows.Management.Deployment.PackageState")
@js.native
object PackageState extends js.Object {
  @js.native
  sealed trait licenseInvalid
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  @js.native
  sealed trait modified
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  @js.native
  sealed trait normal
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  @js.native
  sealed trait tampered
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageState
  
  /* 1 */ val licenseInvalid: licenseInvalid with scala.Double = js.native
  /* 2 */ val modified: modified with scala.Double = js.native
  /* 0 */ val normal: normal with scala.Double = js.native
  /* 3 */ val tampered: tampered with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageState with scala.Double] = js.native
}

