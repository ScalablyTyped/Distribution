package typings.tern

import typings.tern.ternMod.RenameQuery
import typings.tern.ternMod.RenameQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryRenameQuery extends js.Object {
  var query: RenameQuery
  var result: RenameQueryResult
}

object AnonQueryRenameQuery {
  @scala.inline
  def apply(query: RenameQuery, result: RenameQueryResult): AnonQueryRenameQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonQueryRenameQuery]
  }
}

