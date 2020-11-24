package typings.vsoNodeApi.projectAnalysisInterfacesMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait AggregationType extends js.Object
@JSImport("vso-node-api/interfaces/ProjectAnalysisInterfaces", "AggregationType")
@js.native
object AggregationType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[AggregationType with Double] = js.native
  
  @js.native
  sealed trait Daily extends AggregationType
  /* 1 */ @js.native
  object Daily extends TopLevel[Daily with Double]
  
  @js.native
  sealed trait Hourly extends AggregationType
  /* 0 */ @js.native
  object Hourly extends TopLevel[Hourly with Double]
}
