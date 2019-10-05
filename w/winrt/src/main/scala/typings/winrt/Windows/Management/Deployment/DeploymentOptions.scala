package typings.winrt.Windows.Management.Deployment

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentOptions extends js.Object

@JSGlobal("Windows.Management.Deployment.DeploymentOptions")
@js.native
object DeploymentOptions extends js.Object {
  @js.native
  sealed trait developmentMode extends DeploymentOptions
  
  @js.native
  sealed trait forceApplicationShutdown extends DeploymentOptions
  
  @js.native
  sealed trait none extends DeploymentOptions
  
  /* 2 */ val developmentMode: typings.winrt.Windows.Management.Deployment.DeploymentOptions.developmentMode with Double = js.native
  /* 1 */ val forceApplicationShutdown: typings.winrt.Windows.Management.Deployment.DeploymentOptions.forceApplicationShutdown with Double = js.native
  /* 0 */ val none: typings.winrt.Windows.Management.Deployment.DeploymentOptions.none with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOptions with Double] = js.native
}

