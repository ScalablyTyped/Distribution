package typings.tern

import typings.tern.ternMod.DefinitionQuery
import typings.tern.ternMod.DefinitionQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResultDefinitionQuery extends js.Object {
  var query: DefinitionQuery
  var result: DefinitionQueryResult
}

object AnonQueryResultDefinitionQuery {
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): AnonQueryResultDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResultDefinitionQuery]
  }
}

