package typings.tern

import typings.tern.libTernMod.CompletionsQuery
import typings.tern.libTernMod.CompletionsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultCompletionsQuery extends js.Object {
  var query: CompletionsQuery
  var result: CompletionsQueryResult
}

object Anon_QueryResultCompletionsQuery {
  @scala.inline
  def apply(query: CompletionsQuery, result: CompletionsQueryResult): Anon_QueryResultCompletionsQuery = {
    val __obj = js.Dynamic.literal(query = query, result = result)
  
    __obj.asInstanceOf[Anon_QueryResultCompletionsQuery]
  }
}

