package typings.tern

import typings.tern.libTernMod.DocumentationQuery
import typings.tern.libTernMod.DocumentationQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResult extends js.Object {
  var query: DocumentationQuery
  var result: DocumentationQueryResult
}

object Anon_QueryResult {
  @scala.inline
  def apply(query: DocumentationQuery, result: DocumentationQueryResult): Anon_QueryResult = {
    val __obj = js.Dynamic.literal(query = query, result = result)
  
    __obj.asInstanceOf[Anon_QueryResult]
  }
}

