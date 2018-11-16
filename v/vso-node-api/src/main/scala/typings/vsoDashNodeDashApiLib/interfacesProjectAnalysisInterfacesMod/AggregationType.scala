package typings
package vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AggregationType extends js.Object

@JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "AggregationType")
@js.native
object AggregationType extends js.Object {
  @js.native
  sealed trait Daily
    extends vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType
  
  @js.native
  sealed trait Hourly
    extends vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType
  
  /* 1 */ val Daily: Daily with scala.Double = js.native
  /* 0 */ val Hourly: Hourly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    vsoDashNodeDashApiLib.interfacesProjectAnalysisInterfacesMod.AggregationType with scala.Double
  ] = js.native
}

