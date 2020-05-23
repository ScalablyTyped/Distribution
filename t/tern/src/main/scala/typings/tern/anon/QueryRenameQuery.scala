package typings.tern.anon

import typings.tern.ternMod.RenameQuery
import typings.tern.ternMod.RenameQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRenameQuery extends js.Object {
  var query: RenameQuery
  var result: RenameQueryResult
}

object QueryRenameQuery {
  @scala.inline
  def apply(query: RenameQuery, result: RenameQueryResult): QueryRenameQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRenameQuery]
  }
}

