package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.GetMetricsEventRateConstants.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `getMetricsEventRate` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "GetMetricsEventRateConstants")
@js.native
object GetMetricsEventRateConstants extends js.Object {
  @js.native
  sealed trait ResultType extends js.Object
  
  /** The type of result to consider when calculating the metric. */
  @js.native
  object ResultType extends js.Object {
    @js.native
    sealed trait DOCUMENT extends ResultType
    
    /* "document" */ val DOCUMENT: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.GetMetricsEventRateConstants.ResultType.DOCUMENT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResultType with String] = js.native
  }
  
}

