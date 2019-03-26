package typings
package ternLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResult extends js.Object {
  var query: ternLib.libTernMod.DocumentationQuery
  var result: ternLib.libTernMod.DocumentationQueryResult
}

object Anon_QueryResult {
  @scala.inline
  def apply(query: ternLib.libTernMod.DocumentationQuery, result: ternLib.libTernMod.DocumentationQueryResult): Anon_QueryResult = {
    val __obj = js.Dynamic.literal(query = query, result = result)
  
    __obj.asInstanceOf[Anon_QueryResult]
  }
}

