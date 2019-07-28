package typings.tern

import typings.tern.libTernMod.DefinitionQuery
import typings.tern.libTernMod.DefinitionQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultDefinitionQuery extends js.Object {
  var query: DefinitionQuery
  var result: DefinitionQueryResult
}

object Anon_QueryResultDefinitionQuery {
  @scala.inline
  def apply(query: DefinitionQuery, result: DefinitionQueryResult): Anon_QueryResultDefinitionQuery = {
    val __obj = js.Dynamic.literal(query = query, result = result)
  
    __obj.asInstanceOf[Anon_QueryResultDefinitionQuery]
  }
}

