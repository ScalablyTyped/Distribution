package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultPropertiesQuery extends js.Object {
  var query: ternLib.libTernMod.PropertiesQuery
  var result: ternLib.libTernMod.PropertiesQueryResult
}

object Anon_QueryResultPropertiesQuery {
  @scala.inline
  def apply(query: ternLib.libTernMod.PropertiesQuery, result: ternLib.libTernMod.PropertiesQueryResult): Anon_QueryResultPropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_QueryResultPropertiesQuery]
  }
}

