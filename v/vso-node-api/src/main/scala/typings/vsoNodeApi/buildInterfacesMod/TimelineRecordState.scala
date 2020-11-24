package typings.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TimelineRecordState extends js.Object
@JSImport("vso-node-api/interfaces/BuildInterfaces", "TimelineRecordState")
@js.native
object TimelineRecordState extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TimelineRecordState with Double] = js.native
  
  @js.native
  sealed trait Completed extends TimelineRecordState
  /* 2 */ @js.native
  object Completed extends TopLevel[Completed with Double]
  
  @js.native
  sealed trait InProgress extends TimelineRecordState
  /* 1 */ @js.native
  object InProgress extends TopLevel[InProgress with Double]
  
  @js.native
  sealed trait Pending extends TimelineRecordState
  /* 0 */ @js.native
  object Pending extends TopLevel[Pending with Double]
}
