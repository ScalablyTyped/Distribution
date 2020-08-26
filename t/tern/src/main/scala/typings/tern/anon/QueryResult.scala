package typings.tern.anon

import typings.tern.ternMod.TypeQuery
import typings.tern.ternMod.TypeQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryResult extends js.Object {
  var query: TypeQuery = js.native
  var result: TypeQueryResult = js.native
}

object QueryResult {
  @scala.inline
  def apply(query: TypeQuery, result: TypeQueryResult): QueryResult = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
  @scala.inline
  implicit class QueryResultOps[Self <: QueryResult] (val x: Self) extends AnyVal {
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
    def setQuery(value: TypeQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: TypeQueryResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

