package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TaskStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "TaskStatus")
@js.native
object TaskStatus extends js.Object {
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait Failed
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait Failure
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait PartiallySucceeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait Skipped
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait Success
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  @js.native
  sealed trait Unknown
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus
  
  /* 5 */ val Canceled: Canceled with scala.Double = js.native
  /* 8 */ val Failed: Failed with scala.Double = js.native
  /* 4 */ val Failure: Failure with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 9 */ val PartiallySucceeded: PartiallySucceeded with scala.Double = js.native
  /* 1 */ val Pending: Pending with scala.Double = js.native
  /* 6 */ val Skipped: Skipped with scala.Double = js.native
  /* 7 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 3 */ val Success: Success with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.TaskStatus with scala.Double
  ] = js.native
}

