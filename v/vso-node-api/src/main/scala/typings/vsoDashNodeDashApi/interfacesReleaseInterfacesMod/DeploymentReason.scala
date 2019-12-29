package typings.vsoDashNodeDashApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  sealed trait Automated extends DeploymentReason
  
  /**
    * The deployment reason is manual.
    */
  @js.native
  sealed trait Manual extends DeploymentReason
  
  /**
    * The deployment reason is none.
    */
  @js.native
  sealed trait None extends DeploymentReason
  
  /**
    * The deployment reason is scheduled.
    */
  @js.native
  sealed trait Scheduled extends DeploymentReason
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentReason with Double] = js.native
  /* 2 */ @js.native
  object Automated extends TopLevel[Automated with Double]
  
  /* 1 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 4 */ @js.native
  object Scheduled extends TopLevel[Scheduled with Double]
  
}

