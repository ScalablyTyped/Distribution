package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Information about the Continuous Relevancy Training for this environment. */
@js.native
trait SearchStatus extends js.Object {
  /** The date stamp of the most recent completed training for this environment. */
  var last_trained: js.UndefOr[String] = js.native
  /** Current scope of the training. Always returned as `environment`. */
  var scope: js.UndefOr[String] = js.native
  /** The current status of Continuous Relevancy Training for this environment. */
  var status: js.UndefOr[String] = js.native
  /** Long description of the current Continuous Relevancy Training status. */
  var status_description: js.UndefOr[String] = js.native
}

object SearchStatus {
  @scala.inline
  def apply(): SearchStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchStatus]
  }
  @scala.inline
  implicit class SearchStatusOps[Self <: SearchStatus] (val x: Self) extends AnyVal {
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
    def setLast_trained(value: String): Self = this.set("last_trained", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_trained: Self = this.set("last_trained", js.undefined)
    @scala.inline
    def setScope(value: String): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setStatus(value: String): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatus_description(value: String): Self = this.set("status_description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus_description: Self = this.set("status_description", js.undefined)
  }
  
}

