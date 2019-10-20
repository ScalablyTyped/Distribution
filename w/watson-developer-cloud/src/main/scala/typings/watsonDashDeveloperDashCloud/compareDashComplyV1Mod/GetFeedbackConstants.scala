package typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod

import typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.GetFeedbackConstants.Model
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `getFeedback` operation. */
@JSImport("watson-developer-cloud/compare-comply/v1", "GetFeedbackConstants")
@js.native
object GetFeedbackConstants extends js.Object {
  @js.native
  sealed trait Model extends js.Object
  
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    @js.native
    sealed trait CONTRACTS extends Model
    
    @js.native
    sealed trait TABLES extends Model
    
    /* "contracts" */ val CONTRACTS: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.GetFeedbackConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typings.watsonDashDeveloperDashCloud.compareDashComplyV1Mod.GetFeedbackConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Model with String] = js.native
  }
  
}

