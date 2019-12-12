package typings.winrtDashUwp.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
import typings.winrtDashUwp.Windows.Management.Deployment.DeploymentOptions.developmentMode
import typings.winrtDashUwp.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown
import typings.winrtDashUwp.Windows.Management.Deployment.DeploymentOptions.forceTargetApplicationShutdown
import typings.winrtDashUwp.Windows.Management.Deployment.DeploymentOptions.installAllResources
import typings.winrtDashUwp.Windows.Management.Deployment.DeploymentOptions.none
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
  sealed trait developmentMode extends DeploymentOptions
  
  /** If this package, or any package that depends on this package, is currently in use, the processes associated with the package are shut down forcibly so that registration can continue. */
  @js.native
  sealed trait forceApplicationShutdown extends DeploymentOptions
  
  /** If this package is currently in use, the processes associated with the package are shut down forcibly so that registration can continue. */
  @js.native
  sealed trait forceTargetApplicationShutdown extends DeploymentOptions
  
  /** When you set this option, the app is instructed to skip resource applicability checks. This effectively stages or registers all resource packages that a user passes in to the command, which forces applicability for all packages contained in a bundle. If a user passes in a bundle, all contained resource packages will be registered. Windows only. */
  @js.native
  sealed trait installAllResources extends DeploymentOptions
  
  /** The default behavior is used. */
  @js.native
  sealed trait none extends DeploymentOptions
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOptions with Double] = js.native
  /* 2 */ @js.native
  object developmentMode extends TopLevel[developmentMode with Double]
  
  /* 1 */ @js.native
  object forceApplicationShutdown extends TopLevel[forceApplicationShutdown with Double]
  
  /* 4 */ @js.native
  object forceTargetApplicationShutdown extends TopLevel[forceTargetApplicationShutdown with Double]
  
  /* 3 */ @js.native
  object installAllResources extends TopLevel[installAllResources with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

