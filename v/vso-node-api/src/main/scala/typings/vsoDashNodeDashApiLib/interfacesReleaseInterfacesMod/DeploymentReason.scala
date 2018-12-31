package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DeploymentReason extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentReason")
@js.native
object DeploymentReason extends js.Object {
  /**
    * The deployment reason is automated.
    */
  @js.native
  sealed trait Automated
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentReason
  
  /**
    * The deployment reason is manual.
    */
  @js.native
  sealed trait Manual
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentReason
  
  /**
    * The deployment reason is none.
    */
  @js.native
  sealed trait None
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentReason
  
  /**
    * The deployment reason is scheduled.
    */
  @js.native
  sealed trait Scheduled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentReason
  
  /* 2 */ val Automated: Automated with scala.Double = js.native
  /* 1 */ val Manual: Manual with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 4 */ val Scheduled: Scheduled with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.DeploymentReason with scala.Double
  ] = js.native
}

