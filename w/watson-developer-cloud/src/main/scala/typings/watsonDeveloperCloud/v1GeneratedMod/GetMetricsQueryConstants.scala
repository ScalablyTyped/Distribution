package typings.watsonDeveloperCloud.v1GeneratedMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `getMetricsQuery` operation. */
@JSImport("watson-developer-cloud/discovery/v1-generated", "GetMetricsQueryConstants")
@js.native
object GetMetricsQueryConstants extends js.Object {
  
  @js.native
  sealed trait ResultType extends js.Object
  /** The type of result to consider when calculating the metric. */
  @js.native
  object ResultType extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ResultType with String] = js.native
    
    @js.native
    sealed trait DOCUMENT extends ResultType
    /* "document" */ @js.native
    object DOCUMENT extends TopLevel[DOCUMENT with String]
  }
}
