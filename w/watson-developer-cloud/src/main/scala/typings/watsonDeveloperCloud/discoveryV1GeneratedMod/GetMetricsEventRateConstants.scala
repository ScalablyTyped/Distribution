package typings.watsonDeveloperCloud.discoveryV1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getMetricsEventRate` operation. */
object GetMetricsEventRateConstants {
  
  @js.native
  sealed trait ResultType extends StObject
  /** The type of result to consider when calculating the metric. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "GetMetricsEventRateConstants.ResultType")
  @js.native
  object ResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResultType & String] = js.native
    
    @js.native
    sealed trait DOCUMENT
      extends StObject
         with ResultType
    /* "document" */ val DOCUMENT: typings.watsonDeveloperCloud.discoveryV1GeneratedMod.GetMetricsEventRateConstants.ResultType.DOCUMENT & String = js.native
  }
}
