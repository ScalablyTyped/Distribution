package typings.tern.anon

import typings.tern.ternMod.PropertiesQuery
import typings.tern.ternMod.PropertiesQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryPropertiesQuery extends js.Object {
  var query: PropertiesQuery = js.native
  var result: PropertiesQueryResult = js.native
}

object QueryPropertiesQuery {
  @scala.inline
  def apply(query: PropertiesQuery, result: PropertiesQueryResult): QueryPropertiesQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryPropertiesQuery]
  }
  @scala.inline
  implicit class QueryPropertiesQueryOps[Self <: QueryPropertiesQuery] (val x: Self) extends AnyVal {
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
    def setQuery(value: PropertiesQuery): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: PropertiesQueryResult): Self = this.set("result", value.asInstanceOf[js.Any])
  }
  
}

