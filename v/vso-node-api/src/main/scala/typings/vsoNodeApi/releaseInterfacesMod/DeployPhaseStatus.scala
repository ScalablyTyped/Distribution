package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DeployPhaseStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "DeployPhaseStatus")
@js.native
object DeployPhaseStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DeployPhaseStatus & Double] = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with DeployPhaseStatus
  /* 32 */ val Canceled: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Canceled & Double = js.native
  
  @js.native
  sealed trait Cancelling
    extends StObject
       with DeployPhaseStatus
  /* 128 */ val Cancelling: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Cancelling & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with DeployPhaseStatus
  /* 16 */ val Failed: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Failed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with DeployPhaseStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait NotStarted
    extends StObject
       with DeployPhaseStatus
  /* 1 */ val NotStarted: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.NotStarted & Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with DeployPhaseStatus
  /* 4 */ val PartiallySucceeded: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.PartiallySucceeded & Double = js.native
  
  @js.native
  sealed trait Skipped
    extends StObject
       with DeployPhaseStatus
  /* 64 */ val Skipped: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Skipped & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with DeployPhaseStatus
  /* 8 */ val Succeeded: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Succeeded & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with DeployPhaseStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.DeployPhaseStatus.Undefined & Double = js.native
}
