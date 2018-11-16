package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PackageTypes extends js.Object

/** Defines the types of packages to be included in the result set of a query. */
@JSGlobal("Windows.Management.Deployment.PackageTypes")
@js.native
object PackageTypes extends js.Object {
  /** Include the bundle packages when you enumerate the package repository. */
  @js.native
  sealed trait bundle
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageTypes
  
  /** Include the framework packages when you enumerate the package repository. */
  @js.native
  sealed trait framework
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageTypes
  
  /** Include the main packages when you enumerate the package repository. */
  @js.native
  sealed trait main
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageTypes
  
  /** Default inventorying behavior. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageTypes
  
  /** Include the resource packages when you enumerate the package repository. */
  @js.native
  sealed trait resource
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageTypes
  
  /** Include the XAP packages when you enumerate the package repository. */
  @js.native
  sealed trait xap
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageTypes
  
  val bundle: bundle with java.lang.String = js.native
  val framework: framework with java.lang.String = js.native
  val main: main with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val resource: resource with java.lang.String = js.native
  val xap: xap with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.PackageTypes with java.lang.String
  ] = js.native
}

