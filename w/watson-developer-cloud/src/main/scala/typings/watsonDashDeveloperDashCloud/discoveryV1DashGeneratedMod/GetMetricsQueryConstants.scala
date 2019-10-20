package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.GetMetricsQueryConstants.ResultType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `getMetricsQuery` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "GetMetricsQueryConstants")
@js.native
object GetMetricsQueryConstants extends js.Object {
  @js.native
  sealed trait ResultType extends js.Object
  
  /** The type of result to consider when calculating the metric. */
  @js.native
  object ResultType extends js.Object {
    @js.native
    sealed trait DOCUMENT extends ResultType
    
    /* "document" */ val DOCUMENT: typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.GetMetricsQueryConstants.ResultType.DOCUMENT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResultType with String] = js.native
  }
  
}

