package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait RemovalOptions extends js.Object

/** Values that modify the removal of a package. */
@JSGlobal("Windows.Management.Deployment.RemovalOptions")
@js.native
object RemovalOptions extends js.Object {
  /** No removal options are specified. This is the default deployment behavior. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.RemovalOptions
  
  /** Don't remove any application data when the package is removed. This can only apply to packages that were deployed with the DeploymentOptions::DevelopmentMode value. If you specify PreserveApplicationData on an incompatible package, PackageManager::RemovePackageAsync(String, RemovalOptions) returns E_INVALIDARG. */
  @js.native
  sealed trait preserveApplicationData
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.RemovalOptions
  
  val none: none with java.lang.String = js.native
  val preserveApplicationData: preserveApplicationData with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.RemovalOptions with java.lang.String
  ] = js.native
}

