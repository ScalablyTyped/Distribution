package typings.watsonDashDeveloperDashCloud.discoveryV1DashGeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An object contain retrieval type information. */
trait RetrievalDetails extends js.Object {
  /** Indentifies the document retrieval strategy used for this query. `relevancy_training` indicates that the results were returned using a relevancy trained model. `continuous_relevancy_training` indicates that the results were returned using the continuous relevancy training model created by result feedback analysis. `untrained` means the results were returned using the standard untrained model. **Note**: In the event of trained collections being queried, but the trained model is not used to return results, the **document_retrieval_strategy** will be listed as `untrained`. */
  var document_retrieval_strategy: js.UndefOr[String] = js.undefined
}

object RetrievalDetails {
  @scala.inline
  def apply(document_retrieval_strategy: String = null): RetrievalDetails = {
    val __obj = js.Dynamic.literal()
    if (document_retrieval_strategy != null) __obj.updateDynamic("document_retrieval_strategy")(document_retrieval_strategy)
    __obj.asInstanceOf[RetrievalDetails]
  }
}

