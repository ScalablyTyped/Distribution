package typings.tern.anon

import typings.tern.ternMod.CompletionsQuery
import typings.tern.ternMod.CompletionsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Result extends js.Object {
  var query: CompletionsQuery
  var result: CompletionsQueryResult
}

object Result {
  @scala.inline
  def apply(query: CompletionsQuery, result: CompletionsQueryResult): Result = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[Result]
  }
}

