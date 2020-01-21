package typings.stripe.mod.disputes

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDisputeUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Evidence to upload to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
    */
  var evidence: js.UndefOr[IDisputeEvidence] = js.undefined
}

object IDisputeUpdateOptions {
  @scala.inline
  def apply(
    evidence: IDisputeEvidence = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null
  ): IDisputeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (evidence != null) __obj.updateDynamic("evidence")(evidence.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDisputeUpdateOptions]
  }
}

