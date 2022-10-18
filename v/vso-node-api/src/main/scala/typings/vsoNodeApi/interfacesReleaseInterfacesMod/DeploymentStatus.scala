package typings.vsoNodeApi.interfacesReleaseInterfacesMod

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
  /* 31 */ val All: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentStatus.All & Double = js.native
  
  /**
    * The deployment status is failed.
    */
  @js.native
  sealed trait Failed
    extends StObject
       with DeploymentStatus
  /* 16 */ val Failed: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentStatus.Failed & Double = js.native
  
  /**
    * The deployment status is inprogress.
    */
  @js.native
  sealed trait InProgress
    extends StObject
       with DeploymentStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentStatus.InProgress & Double = js.native
  
  /**
    * The deployment status is not deployed.
    */
  @js.native
  sealed trait NotDeployed
    extends StObject
       with DeploymentStatus
  /* 1 */ val NotDeployed: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentStatus.NotDeployed & Double = js.native
  
  /**
    * The deployment status is partiallysucceeded.
    */
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with DeploymentStatus
  /* 8 */ val PartiallySucceeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentStatus.PartiallySucceeded & Double = js.native
  
  /**
    * The deployment status is succeeded.
    */
  @js.native
  sealed trait Succeeded
    extends StObject
       with DeploymentStatus
  /* 4 */ val Succeeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentStatus.Succeeded & Double = js.native
  
  /**
    * The deployment status is undefined.
    */
  @js.native
  sealed trait Undefined
    extends StObject
       with DeploymentStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeploymentStatus.Undefined & Double = js.native
}
