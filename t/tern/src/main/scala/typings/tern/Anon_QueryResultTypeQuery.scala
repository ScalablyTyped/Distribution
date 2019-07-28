package typings.tern

import typings.tern.libTernMod.TypeQuery
import typings.tern.libTernMod.TypeQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultTypeQuery extends js.Object {
  var query: TypeQuery
  var result: TypeQueryResult
}

object Anon_QueryResultTypeQuery {
  @scala.inline
  def apply(query: TypeQuery, result: TypeQueryResult): Anon_QueryResultTypeQuery = {
    val __obj = js.Dynamic.literal(query = query, result = result)
  
    __obj.asInstanceOf[Anon_QueryResultTypeQuery]
  }
}

