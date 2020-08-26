package typings.watsonDeveloperCloud.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The pagination data for the returned objects. */
@js.native
trait LogPagination extends js.Object {
  /** Reserved for future use. */
  var matched: js.UndefOr[Double] = js.native
  /** A token identifying the next page of results. */
  var next_cursor: js.UndefOr[String] = js.native
  /** The URL that will return the next page of results, if any. */
  var next_url: js.UndefOr[String] = js.native
}

object LogPagination {
  @scala.inline
  def apply(): LogPagination = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogPagination]
  }
  @scala.inline
  implicit class LogPaginationOps[Self <: LogPagination] (val x: Self) extends AnyVal {
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
    def setMatched(value: Double): Self = this.set("matched", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatched: Self = this.set("matched", js.undefined)
    @scala.inline
    def setNext_cursor(value: String): Self = this.set("next_cursor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_cursor: Self = this.set("next_cursor", js.undefined)
    @scala.inline
    def setNext_url(value: String): Self = this.set("next_url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNext_url: Self = this.set("next_url", js.undefined)
  }
  
}

