package typings
package vsoDashNodeDashApiLib.interfacesBuildInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TimelineRecordState extends js.Object

@JSImport("vso-node-api/interfaces/BuildInterfaces", "TimelineRecordState")
@js.native
object TimelineRecordState extends js.Object {
  @js.native
  sealed trait Completed
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.TimelineRecordState
  
  @js.native
  sealed trait InProgress
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.TimelineRecordState
  
  @js.native
  sealed trait Pending
    extends vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.TimelineRecordState
  
  /* 2 */ val Completed: Completed with scala.Double = js.native
  /* 1 */ val InProgress: InProgress with scala.Double = js.native
  /* 0 */ val Pending: Pending with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesBuildInterfacesMod.TimelineRecordState with scala.Double
  ] = js.native
}

