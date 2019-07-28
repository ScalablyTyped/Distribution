package typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineRecordState extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "TimelineRecordState")
@js.native
object TimelineRecordState extends js.Object {
  @js.native
  sealed trait Completed extends TimelineRecordState
  
  @js.native
  sealed trait InProgress extends TimelineRecordState
  
  @js.native
  sealed trait Pending extends TimelineRecordState
  
  /* 2 */ val Completed: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.TimelineRecordState.Completed with Double = js.native
  /* 1 */ val InProgress: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.TimelineRecordState.InProgress with Double = js.native
  /* 0 */ val Pending: typings.vsoDashNodeDashApi.interfacesBuildInterfacesMod.TimelineRecordState.Pending with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineRecordState with Double] = js.native
}

