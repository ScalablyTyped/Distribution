package typings.workerbApi

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectQueryOptions extends QueryOptions {
  /**
    * Allows to select an element with different methods:
    *
    * * by_text - finds the target element by text value.
    * * by_regex - finds the target element by regex.
    * * by_id - finds the target element by id
    * * by_xpath - finds the target element by an [xpath](https://developer.mozilla.org/en-US/docs/Web/XPath) query
    * * by_query_selector finds - the target element using a query selector
    */
  var method: js.UndefOr[clickQueryMethods] = js.native
  /**
    * Specify if the provided value is a label or value of the option needs to be selected. The default value is label.
    */
  var selectBy: String = js.native
}

object SelectQueryOptions {
  @scala.inline
  def apply(selectBy: String): SelectQueryOptions = {
    val __obj = js.Dynamic.literal(selectBy = selectBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectQueryOptions]
  }
  @scala.inline
  implicit class SelectQueryOptionsOps[Self <: SelectQueryOptions] (val x: Self) extends AnyVal {
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
    def setSelectBy(value: String): Self = this.set("selectBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setMethod(value: clickQueryMethods): Self = this.set("method", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
  }
  
}

