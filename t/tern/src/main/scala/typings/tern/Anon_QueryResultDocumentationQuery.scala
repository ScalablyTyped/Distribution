package typings.tern

import typings.tern.libTernMod.DocumentationQuery
import typings.tern.libTernMod.DocumentationQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QueryResultDocumentationQuery extends js.Object {
  var query: DocumentationQuery
  var result: DocumentationQueryResult
}

object Anon_QueryResultDocumentationQuery {
  @scala.inline
  def apply(query: DocumentationQuery, result: DocumentationQueryResult): Anon_QueryResultDocumentationQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_QueryResultDocumentationQuery]
  }
}

