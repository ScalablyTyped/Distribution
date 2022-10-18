package typings.vsoNodeApi.interfacesReleaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TaskStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TaskStatus")
@js.native
object TaskStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TaskStatus & Double] = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with TaskStatus
  /* 5 */ val Canceled: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Canceled & Double = js.native
  
  @js.native
  sealed trait Failed
    extends StObject
       with TaskStatus
  /* 8 */ val Failed: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Failed & Double = js.native
  
  @js.native
  sealed trait Failure
    extends StObject
       with TaskStatus
  /* 4 */ val Failure: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Failure & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with TaskStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with TaskStatus
  /* 9 */ val PartiallySucceeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.PartiallySucceeded & Double = js.native
  
  @js.native
  sealed trait Pending
    extends StObject
       with TaskStatus
  /* 1 */ val Pending: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Pending & Double = js.native
  
  @js.native
  sealed trait Skipped
    extends StObject
       with TaskStatus
  /* 6 */ val Skipped: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Skipped & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with TaskStatus
  /* 7 */ val Succeeded: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Succeeded & Double = js.native
  
  @js.native
  sealed trait Success
    extends StObject
       with TaskStatus
  /* 3 */ val Success: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Success & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with TaskStatus
  /* 0 */ val Unknown: typings.vsoNodeApi.interfacesReleaseInterfacesMod.TaskStatus.Unknown & Double = js.native
}
