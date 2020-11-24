package typings.watsonDeveloperCloud.compareComplyV1Mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Constants for the `deleteFeedback` operation. */
@JSImport("watson-developer-cloud/compare-comply/v1", "DeleteFeedbackConstants")
@js.native
object DeleteFeedbackConstants extends js.Object {
  
  @js.native
  sealed trait Model extends js.Object
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
    
    @js.native
    sealed trait CONTRACTS extends Model
    /* "contracts" */ @js.native
    object CONTRACTS extends TopLevel[CONTRACTS with String]
    
    @js.native
    sealed trait TABLES extends Model
    /* "tables" */ @js.native
    object TABLES extends TopLevel[TABLES with String]
  }
}
