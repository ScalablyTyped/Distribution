package typings.stripe.mod.disputes

import typings.stripe.mod.IDataOptionsWithMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDisputeUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Evidence to upload to respond to a dispute. Updating any field in the hash will submit all fields in the hash for review.
    */
  var evidence: js.UndefOr[IDisputeEvidence] = js.native
}

object IDisputeUpdateOptions {
  @scala.inline
  def apply(): IDisputeUpdateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDisputeUpdateOptions]
  }
  @scala.inline
  implicit class IDisputeUpdateOptionsOps[Self <: IDisputeUpdateOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEvidence(value: IDisputeEvidence): Self = this.set("evidence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEvidence: Self = this.set("evidence", js.undefined)
  }
  
}

