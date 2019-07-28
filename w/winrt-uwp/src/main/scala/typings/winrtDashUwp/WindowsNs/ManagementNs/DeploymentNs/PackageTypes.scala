package typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs

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
  sealed trait bundle extends PackageTypes
  
  /** Include the framework packages when you enumerate the package repository. */
  @js.native
  sealed trait framework extends PackageTypes
  
  /** Include the main packages when you enumerate the package repository. */
  @js.native
  sealed trait main extends PackageTypes
  
  /** Default inventorying behavior. */
  @js.native
  sealed trait none extends PackageTypes
  
  /** Include the resource packages when you enumerate the package repository. */
  @js.native
  sealed trait resource extends PackageTypes
  
  /** Include the XAP packages when you enumerate the package repository. */
  @js.native
  sealed trait xap extends PackageTypes
  
  /* 4 */ val bundle: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageTypes.bundle with Double = js.native
  /* 2 */ val framework: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageTypes.framework with Double = js.native
  /* 1 */ val main: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageTypes.main with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageTypes.none with Double = js.native
  /* 3 */ val resource: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageTypes.resource with Double = js.native
  /* 5 */ val xap: typings.winrtDashUwp.WindowsNs.ManagementNs.DeploymentNs.PackageTypes.xap with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[PackageTypes with Double] = js.native
}

