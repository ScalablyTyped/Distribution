package typings.tern.anon

import typings.tern.ternMod.TypeQuery
import typings.tern.ternMod.TypeQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult extends js.Object {
  var query: TypeQuery
  var result: TypeQueryResult
}

object QueryResult {
  @scala.inline
  def apply(query: TypeQuery, result: TypeQueryResult): QueryResult = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryResult]
  }
}

