package typings.watsonDeveloperCloud.v1GeneratedMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Object containing result information that was returned by the query used to create this log entry. Only returned with logs of type `query`. */
@js.native
trait LogQueryResponseResultDocuments extends js.Object {
  /** The number of results returned in the query associate with this log. */
  var count: js.UndefOr[Double] = js.native
  /** Array of log query response results. */
  var results: js.UndefOr[js.Array[LogQueryResponseResultDocumentsResult]] = js.native
}

object LogQueryResponseResultDocuments {
  @scala.inline
  def apply(): LogQueryResponseResultDocuments = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogQueryResponseResultDocuments]
  }
  @scala.inline
  implicit class LogQueryResponseResultDocumentsOps[Self <: LogQueryResponseResultDocuments] (val x: Self) extends AnyVal {
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setResultsVarargs(value: LogQueryResponseResultDocumentsResult*): Self = this.set("results", js.Array(value :_*))
    @scala.inline
    def setResults(value: js.Array[LogQueryResponseResultDocumentsResult]): Self = this.set("results", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResults: Self = this.set("results", js.undefined)
  }
  
}

