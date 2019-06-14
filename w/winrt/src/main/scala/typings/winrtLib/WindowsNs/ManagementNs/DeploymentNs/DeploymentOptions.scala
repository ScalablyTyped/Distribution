package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentOptions extends js.Object

@JSGlobal("Windows.Management.Deployment.DeploymentOptions")
@js.native
object DeploymentOptions extends js.Object {
  @js.native
  sealed trait developmentMode
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  @js.native
  sealed trait forceApplicationShutdown
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  @js.native
  sealed trait none
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions
  
  /* 2 */ val developmentMode: developmentMode with scala.Double = js.native
  /* 1 */ val forceApplicationShutdown: forceApplicationShutdown with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions with scala.Double] = js.native
}

