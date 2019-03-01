package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultDefinitionQuery extends js.Object {
  var query: ternLib.libTernMod.DefinitionQuery
  var result: ternLib.libTernMod.DefinitionQueryResult
}

object Anon_QueryResultDefinitionQuery {
  @scala.inline
  def apply(query: ternLib.libTernMod.DefinitionQuery, result: ternLib.libTernMod.DefinitionQueryResult): Anon_QueryResultDefinitionQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_QueryResultDefinitionQuery]
  }
}

