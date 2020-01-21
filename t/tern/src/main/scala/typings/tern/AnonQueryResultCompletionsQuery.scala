package typings.tern

import typings.tern.ternMod.CompletionsQuery
import typings.tern.ternMod.CompletionsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResultCompletionsQuery extends js.Object {
  var query: CompletionsQuery
  var result: CompletionsQueryResult
}

object AnonQueryResultCompletionsQuery {
  @scala.inline
  def apply(query: CompletionsQuery, result: CompletionsQueryResult): AnonQueryResultCompletionsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResultCompletionsQuery]
  }
}

