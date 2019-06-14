package typings
package winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentOptions extends js.Object

/** Specifies the package deployment options. */
@JSGlobal("Windows.Management.Deployment.DeploymentOptions")
@js.native
object DeploymentOptions extends js.Object {
  /** When you set this option, the app is installed in development mode. For info about development mode, see Remarks. Use this option to enable key app development scenarios. */
  @js.native
  sealed trait developmentMode
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  /** If this package, or any package that depends on this package, is currently in use, the processes associated with the package are shut down forcibly so that registration can continue. */
  @js.native
  sealed trait forceApplicationShutdown
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  /** If this package is currently in use, the processes associated with the package are shut down forcibly so that registration can continue. */
  @js.native
  sealed trait forceTargetApplicationShutdown
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  /** When you set this option, the app is instructed to skip resource applicability checks. This effectively stages or registers all resource packages that a user passes in to the command, which forces applicability for all packages contained in a bundle. If a user passes in a bundle, all contained resource packages will be registered. Windows only. */
  @js.native
  sealed trait installAllResources
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  /** The default behavior is used. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  /* 2 */ val developmentMode: developmentMode with scala.Double = js.native
  /* 1 */ val forceApplicationShutdown: forceApplicationShutdown with scala.Double = js.native
  /* 4 */ val forceTargetApplicationShutdown: forceTargetApplicationShutdown with scala.Double = js.native
  /* 3 */ val installAllResources: installAllResources with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions with scala.Double
  ] = js.native
}

