package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getMetricsQuery` operation. */
object GetMetricsQueryConstants {
  
  @js.native
  sealed trait ResultType extends StObject
  /** The type of result to consider when calculating the metric. */
  @JSImport("watson-developer-cloud/discovery/v1-generated", "GetMetricsQueryConstants.ResultType")
  @js.native
  object ResultType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResultType with String] = js.native
    
    @js.native
    sealed trait DOCUMENT extends ResultType
    /* "document" */ val DOCUMENT: typings.watsonDeveloperCloud.v1GeneratedMod.GetMetricsQueryConstants.ResultType.DOCUMENT with String = js.native
  }
}
