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
  
  val licenseInvalid: licenseInvalid with java.lang.String = js.native
  val modified: modified with java.lang.String = js.native
  val normal: normal with java.lang.String = js.native
  val tampered: tampered with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtLib.WindowsNs.ManagementNs.DeploymentNs.PackageState with java.lang.String] = js.native
}

