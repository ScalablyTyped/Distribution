package typings.tern.anon

import typings.tern.ternMod.RefsQuery
import typings.tern.ternMod.RefsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryRefsQuery extends js.Object {
  var query: RefsQuery = js.native
  var result: RefsQueryResult = js.native
}

object QueryRefsQuery {
  @scala.inline
  def apply(query: RefsQuery, result: RefsQueryResult): QueryRefsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRefsQuery]
  }
  @scala.inline
  implicit class QueryRefsQueryOps[Self <: QueryRefsQuery] (val x: Self) extends AnyVal {
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
    def setQuery(value: RefsQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: RefsQueryResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

