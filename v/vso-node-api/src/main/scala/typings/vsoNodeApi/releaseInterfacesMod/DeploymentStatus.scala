package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeploymentStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeploymentStatus")
@js.native
object DeploymentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeploymentStatus & Double] = js.native
  
  /**
    * The deployment status is all.
    */
  @js.native
  sealed trait All
    extends StObject
       with DeploymentStatus
  /* 31 */ val All: typings.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.All & Double = js.native
  
  /**
    * The deployment status is failed.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with DeploymentStatus
  /* 16 */ val Failed: typings.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.Failed & Double = js.native
  
  /**
    * The deployment status is inprogress.
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with DeploymentStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.InProgress & Double = js.native
  
  /**
    * The deployment status is not deployed.
    */
  @js.native
  sealed trait NotDeployed
    extends StObject
       with DeploymentStatus
  /* 1 */ val NotDeployed: typings.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.NotDeployed & Double = js.native
  
  /**
    * The deployment status is partiallysucceeded.
    */
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with DeploymentStatus
  /* 8 */ val PartiallySucceeded: typings.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.PartiallySucceeded & Double = js.native
  
  /**
    * The deployment status is succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with DeploymentStatus
  /* 4 */ val Succeeded: typings.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.Succeeded & Double = js.native
  
  /**
    * The deployment status is undefined.
    */
  @js.native
  sealed trait Undefined
    extends StObject
       with DeploymentStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.DeploymentStatus.Undefined & Double = js.native
}
