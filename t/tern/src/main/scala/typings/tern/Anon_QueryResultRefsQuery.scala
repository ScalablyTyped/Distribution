package typings.tern

import typings.tern.libTernMod.RefsQuery
import typings.tern.libTernMod.RefsQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultRefsQuery extends js.Object {
  var query: RefsQuery
  var result: RefsQueryResult
}

object Anon_QueryResultRefsQuery {
  @scala.inline
  def apply(query: RefsQuery, result: RefsQueryResult): Anon_QueryResultRefsQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueryResultRefsQuery]
  }
}

