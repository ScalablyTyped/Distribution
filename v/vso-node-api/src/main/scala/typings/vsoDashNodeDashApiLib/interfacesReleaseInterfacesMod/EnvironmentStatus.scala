package typings
package vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EnvironmentStatus extends js.Object

@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "EnvironmentStatus")
@js.native
object EnvironmentStatus extends js.Object {
  @js.native
  sealed trait Canceled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait NotStarted
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait PartiallySucceeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait Queued
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait Rejected
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait Scheduled
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait Succeeded
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  @js.native
  sealed trait Undefined
    extends vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus
  
  /* 8 */ val Canceled: Canceled with scala.Double = js.native
  /* 2 */ val InProgress: InProgress with scala.Double = js.native
  /* 1 */ val NotStarted: NotStarted with scala.Double = js.native
  /* 128 */ val PartiallySucceeded: PartiallySucceeded with scala.Double = js.native
  /* 32 */ val Queued: Queued with scala.Double = js.native
  /* 16 */ val Rejected: Rejected with scala.Double = js.native
  /* 64 */ val Scheduled: Scheduled with scala.Double = js.native
  /* 4 */ val Succeeded: Succeeded with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesReleaseInterfacesMod.EnvironmentStatus with scala.Double
  ] = js.native
}

