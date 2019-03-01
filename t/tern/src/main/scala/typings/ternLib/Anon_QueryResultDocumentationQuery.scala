package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultDocumentationQuery extends js.Object {
  var query: ternLib.libTernMod.DocumentationQuery
  var result: ternLib.libTernMod.DocumentationQueryResult
}

object Anon_QueryResultDocumentationQuery {
  @scala.inline
  def apply(query: ternLib.libTernMod.DocumentationQuery, result: ternLib.libTernMod.DocumentationQueryResult): Anon_QueryResultDocumentationQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("query")(query)
    __obj.updateDynamic("result")(result)
    __obj.asInstanceOf[Anon_QueryResultDocumentationQuery]
  }
}

