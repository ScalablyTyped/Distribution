package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentStatus extends js.Object
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentStatus")
@js.native
object DeploymentStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentStatus with Double] = js.native
  
  /**
    * The deployment status is all.
    */
  @js.native
  sealed trait All extends DeploymentStatus
  /* 31 */ @js.native
  object All extends TopLevel[All with Double]
  
  /**
    * The deployment status is failed.
    */
  @js.native
  sealed trait Failed extends DeploymentStatus
  /* 16 */ @js.native
  object Failed extends TopLevel[Failed with Double]
  
  /**
    * The deployment status is inprogress.
    */
  @js.native
  sealed trait InProgress extends DeploymentStatus
  /* 2 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /**
    * The deployment status is not deployed.
    */
  @js.native
  sealed trait NotDeployed extends DeploymentStatus
  /* 1 */ @js.native
  object NotDeployed extends TopLevel[NotDeployed with Double]
  
  /**
    * The deployment status is partiallysucceeded.
    */
  @js.native
  sealed trait PartiallySucceeded extends DeploymentStatus
  /* 8 */ @js.native
  object PartiallySucceeded extends TopLevel[PartiallySucceeded with Double]
  
  /**
    * The deployment status is succeeded.
    */
  @js.native
  sealed trait Succeeded extends DeploymentStatus
  /* 4 */ @js.native
  object Succeeded extends TopLevel[Succeeded with Double]
  
  /**
    * The deployment status is undefined.
    */
  @js.native
  sealed trait Undefined extends DeploymentStatus
  /* 0 */ @js.native
  object Undefined extends TopLevel[Undefined with Double]
}
