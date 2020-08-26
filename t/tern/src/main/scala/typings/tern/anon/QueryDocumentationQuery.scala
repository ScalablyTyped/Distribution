package typings.tern.anon

import typings.tern.ternMod.DocumentationQuery
import typings.tern.ternMod.DocumentationQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDocumentationQuery extends js.Object {
  var query: DocumentationQuery = js.native
  var result: DocumentationQueryResult = js.native
}

object QueryDocumentationQuery {
  @scala.inline
  def apply(query: DocumentationQuery, result: DocumentationQueryResult): QueryDocumentationQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDocumentationQuery]
  }
  @scala.inline
  implicit class QueryDocumentationQueryOps[Self <: QueryDocumentationQuery] (val x: Self) extends AnyVal {
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
    def setQuery(value: DocumentationQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: DocumentationQueryResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

