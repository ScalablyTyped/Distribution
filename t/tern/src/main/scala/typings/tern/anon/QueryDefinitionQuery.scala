package typings.tern.anon

import typings.tern.ternMod.DefinitionQuery
import typings.tern.ternMod.DefinitionQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryDefinitionQuery extends js.Object {
  var query: DefinitionQuery = js.native
  var result: DefinitionQueryResult = js.native
}

object QueryDefinitionQuery {
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): QueryDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDefinitionQuery]
  }
  @scala.inline
  implicit class QueryDefinitionQueryOps[Self <: QueryDefinitionQuery] (val x: Self) extends AnyVal {
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
    def setQuery(value: DefinitionQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: DefinitionQueryResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

