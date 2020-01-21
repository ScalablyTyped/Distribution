package typings.tern

import typings.tern.ternMod.RefsQuery
import typings.tern.ternMod.RefsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResultRefsQuery extends js.Object {
  var query: RefsQuery
  var result: RefsQueryResult
}

object AnonQueryResultRefsQuery {
  @scala.inline
  def apply(query: RefsQuery, result: RefsQueryResult): AnonQueryResultRefsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResultRefsQuery]
  }
}

