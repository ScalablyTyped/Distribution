package typings.tern.anon

import typings.tern.ternMod.DefinitionQuery
import typings.tern.ternMod.DefinitionQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryDefinitionQuery extends js.Object {
  var query: DefinitionQuery
  var result: DefinitionQueryResult
}

object QueryDefinitionQuery {
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): QueryDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryDefinitionQuery]
  }
}

