package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultTypeQuery extends js.Object {
  var query: ternLib.libTernMod.TypeQuery
  var result: ternLib.libTernMod.TypeQueryResult
}

object Anon_QueryResultTypeQuery {
  @scala.inline
  def apply(query: ternLib.libTernMod.TypeQuery, result: ternLib.libTernMod.TypeQueryResult): Anon_QueryResultTypeQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_QueryResultTypeQuery]
  }
}

