package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentReason extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentReason")
@js.native
object DeploymentReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentReason with Double] = js.native
  
  /**
    * The deployment reason is automated.
    */
  @js.native
  sealed trait Automated extends DeploymentReason
  /* 2 */ @js.native
  object Automated extends TopLevel[Automated with Double]
  
  /**
    * The deployment reason is manual.
    */
  @js.native
  sealed trait Manual extends DeploymentReason
  /* 1 */ @js.native
  object Manual extends TopLevel[Manual with Double]
  
  /**
    * The deployment reason is none.
    */
  @js.native
  sealed trait None extends DeploymentReason
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /**
    * The deployment reason is scheduled.
    */
  @js.native
  sealed trait Scheduled extends DeploymentReason
  /* 4 */ @js.native
  object Scheduled extends TopLevel[Scheduled with Double]
}
