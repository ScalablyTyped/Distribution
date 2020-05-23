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
  
}

