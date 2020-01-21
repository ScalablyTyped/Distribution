package typings.watsonDeveloperCloud.sdkMod.CompareComplyV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Constants for the `getFeedback` operation. */
@JSImport("watson-developer-cloud/sdk", "CompareComplyV1.GetFeedbackConstants")
@js.native
object GetFeedbackConstants extends js.Object {
  /** The analysis model to be used by the service. For the **Element classification** and **Compare two documents** methods, the default is `contracts`. For the **Extract tables** method, the default is `tables`. These defaults apply to the standalone methods as well as to the methods' use in batch-processing requests. */
  @js.native
  object Model extends js.Object {
    /* "contracts" */ val CONTRACTS: typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model.CONTRACTS with String = js.native
    /* "tables" */ val TABLES: typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model.TABLES with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[
        typings.watsonDeveloperCloud.compareComplyV1Mod.GetFeedbackConstants.Model with String
      ] = js.native
  }
  
}

