package typings.vsoNodeApi.interfacesReleaseInterfacesMod

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
  /* 32 */ val Canceled: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Canceled & Double = js.native
  
  @js.native
  sealed trait Cancelling
    extends StObject
       with DeployPhaseStatus
  /* 128 */ val Cancelling: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Cancelling & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with DeployPhaseStatus
  /* 16 */ val Failed: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Failed & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with DeployPhaseStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait NotStarted
    extends StObject
       with DeployPhaseStatus
  /* 1 */ val NotStarted: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.NotStarted & Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with DeployPhaseStatus
  /* 4 */ val PartiallySucceeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.PartiallySucceeded & Double = js.native
  
  @js.native
  sealed trait Skipped
    extends StObject
       with DeployPhaseStatus
  /* 64 */ val Skipped: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Skipped & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with DeployPhaseStatus
  /* 8 */ val Succeeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Succeeded & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with DeployPhaseStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.interfacesReleaseInterfacesMod.DeployPhaseStatus.Undefined & Double = js.native
}
