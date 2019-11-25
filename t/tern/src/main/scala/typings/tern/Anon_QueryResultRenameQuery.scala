package typings.tern

import typings.tern.libTernMod.RenameQuery
import typings.tern.libTernMod.RenameQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultRenameQuery extends js.Object {
  var query: RenameQuery
  var result: RenameQueryResult
}

object Anon_QueryResultRenameQuery {
  @scala.inline
  def apply(query: RenameQuery, result: RenameQueryResult): Anon_QueryResultRenameQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueryResultRenameQuery]
  }
}

