package typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AggregationType extends js.Object

@JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "AggregationType")
@js.native
object AggregationType extends js.Object {
  @js.native
  sealed trait Daily extends AggregationType
  
  @js.native
  sealed trait Hourly extends AggregationType
  
  /* 1 */ val Daily: typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.AggregationType.Daily with Double = js.native
  /* 0 */ val Hourly: typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod.AggregationType.Hourly with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AggregationType with Double] = js.native
}

