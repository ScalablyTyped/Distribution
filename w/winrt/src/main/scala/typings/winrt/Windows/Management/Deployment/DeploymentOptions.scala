package typings.winrt.Windows.Management.Deployment

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentOptions with Double] = js.native
  /* 2 */ @js.native
  object developmentMode extends TopLevel[developmentMode with Double]
  
  /* 1 */ @js.native
  object forceApplicationShutdown extends TopLevel[forceApplicationShutdown with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
}

