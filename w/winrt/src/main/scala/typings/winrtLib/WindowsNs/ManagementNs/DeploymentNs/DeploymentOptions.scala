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
  
  val developmentMode: developmentMode with java.lang.String = js.native
  val forceApplicationShutdown: forceApplicationShutdown with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentOptions with java.lang.String
  ] = js.native
}

