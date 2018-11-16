package typings
package winrtLib.WindowsNs.ManagementNs.DeploymentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentProgressState extends js.Object

@JSGlobal("Windows.Management.Deployment.DeploymentProgressState")
@js.native
object DeploymentProgressState extends js.Object {
  @js.native
  sealed trait processing
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState
  
  @js.native
  sealed trait queued
    extends winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState
  
  val processing: processing with java.lang.String = js.native
  val queued: queued with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.ManagementNs.DeploymentNs.DeploymentProgressState with java.lang.String
  ] = js.native
}

