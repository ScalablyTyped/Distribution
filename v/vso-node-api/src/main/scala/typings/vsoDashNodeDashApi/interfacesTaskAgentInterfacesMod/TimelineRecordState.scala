package typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod

import org.scalablytyped.runtime.TopLevel
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TimelineRecordState.Completed
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TimelineRecordState.InProgress
import typings.vsoDashNodeDashApi.interfacesTaskAgentInterfacesMod.TimelineRecordState.Pending
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineRecordState extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TimelineRecordState")
@js.native
object TimelineRecordState extends js.Object {
  @js.native
  sealed trait Completed extends TimelineRecordState
  
  @js.native
  sealed trait InProgress extends TimelineRecordState
  
  @js.native
  sealed trait Pending extends TimelineRecordState
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineRecordState with Double] = js.native
  /* 2 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  /* 0 */ @js.native
  object Pending extends TopLevel[Pending with Double]
  
}

