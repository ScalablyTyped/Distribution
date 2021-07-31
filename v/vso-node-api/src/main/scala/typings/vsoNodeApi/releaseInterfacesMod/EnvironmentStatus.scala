package typings.vsoNodeApi.releaseInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EnvironmentStatus extends StObject
@JSImport("vso-node-api/interfaces/ReleaseInterfaces", "EnvironmentStatus")
@js.native
object EnvironmentStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EnvironmentStatus & Double] = js.native
  
  @js.native
  sealed trait Canceled
    extends StObject
       with EnvironmentStatus
  /* 8 */ val Canceled: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Canceled & Double = js.native
  
  @js.native
  sealed trait InProgress
    extends StObject
       with EnvironmentStatus
  /* 2 */ val InProgress: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.InProgress & Double = js.native
  
  @js.native
  sealed trait NotStarted
    extends StObject
       with EnvironmentStatus
  /* 1 */ val NotStarted: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.NotStarted & Double = js.native
  
  @js.native
  sealed trait PartiallySucceeded
    extends StObject
       with EnvironmentStatus
  /* 128 */ val PartiallySucceeded: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.PartiallySucceeded & Double = js.native
  
  @js.native
  sealed trait Queued
    extends StObject
       with EnvironmentStatus
  /* 32 */ val Queued: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Queued & Double = js.native
  
  @js.native
  sealed trait Rejected
    extends StObject
       with EnvironmentStatus
  /* 16 */ val Rejected: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Rejected & Double = js.native
  
  @js.native
  sealed trait Scheduled
    extends StObject
       with EnvironmentStatus
  /* 64 */ val Scheduled: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Scheduled & Double = js.native
  
  @js.native
  sealed trait Succeeded
    extends StObject
       with EnvironmentStatus
  /* 4 */ val Succeeded: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Succeeded & Double = js.native
  
  @js.native
  sealed trait Undefined
    extends StObject
       with EnvironmentStatus
  /* 0 */ val Undefined: typings.vsoNodeApi.releaseInterfacesMod.EnvironmentStatus.Undefined & Double = js.native
}
