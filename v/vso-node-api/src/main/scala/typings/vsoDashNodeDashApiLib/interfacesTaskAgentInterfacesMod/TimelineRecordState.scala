package typings
package vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineRecordState extends js.Object

@JSImport("vso-node-api/interfaces/TaskAgentInterfaces", "TimelineRecordState")
@js.native
object TimelineRecordState extends js.Object {
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecordState
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecordState
  
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecordState
  
  /* 2 */ val Completed: Completed with scala.Double = js.native
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  /* 0 */ val Pending: Pending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesTaskAgentInterfacesMod.TimelineRecordState with scala.Double
  ] = js.native
}

