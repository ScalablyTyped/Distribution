package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineRecordState extends StObject
@JSImport("vso-node-api/interfaces/BuildInterfaces", "TimelineRecordState")
@js.native
object TimelineRecordState extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineRecordState with Double] = js.native
  
  @js.native
  sealed trait Completed extends TimelineRecordState
  /* 2 */ val Completed: typings.vsoNodeApi.buildInterfacesMod.TimelineRecordState.Completed with Double = js.native
  
  @js.native
  sealed trait InProgress extends TimelineRecordState
  /* 1 */ val InProgress: typings.vsoNodeApi.buildInterfacesMod.TimelineRecordState.InProgress with Double = js.native
  
  @js.native
  sealed trait Pending extends TimelineRecordState
  /* 0 */ val Pending: typings.vsoNodeApi.buildInterfacesMod.TimelineRecordState.Pending with Double = js.native
}
