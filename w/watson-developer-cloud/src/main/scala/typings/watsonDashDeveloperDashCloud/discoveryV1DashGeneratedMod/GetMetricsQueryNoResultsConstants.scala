package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import org.scalablytyped.runtime.TopLevel
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.GetMetricsQueryNoResultsConstants.ResultType
import typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod.GetMetricsQueryNoResultsConstants.ResultType.DOCUMENT
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `getMetricsQueryNoResults` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "GetMetricsQueryNoResultsConstants")
@js.native
object GetMetricsQueryNoResultsConstants extends js.Object {
  @js.native
  sealed trait ResultType extends js.Object
  
  /** The type of result to consider when calculating the metric. */
  @js.native
  object ResultType extends js.Object {
    @js.native
    sealed trait DOCUMENT extends ResultType
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResultType with String] = js.native
    /* "document" */ @js.native
    object DOCUMENT extends TopLevel[DOCUMENT with String]
    
  }
  
}

