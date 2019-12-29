package typings.vsoDashNodeDashApi.interfacesProjectAnalysisInterfacesMod

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AggregationType with Double] = js.native
  /* 1 */ @js.native
  object Daily extends TopLevel[Daily with Double]
  
  /* 0 */ @js.native
  object Hourly extends TopLevel[Hourly with Double]
  
}

