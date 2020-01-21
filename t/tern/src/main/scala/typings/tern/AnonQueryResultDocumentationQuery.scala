package typings.tern

import typings.tern.ternMod.DocumentationQuery
import typings.tern.ternMod.DocumentationQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryResultDocumentationQuery extends js.Object {
  var query: DocumentationQuery
  var result: DocumentationQueryResult
}

object AnonQueryResultDocumentationQuery {
  @scala.inline
  def apply(query: DocumentationQuery, result: DocumentationQueryResult): AnonQueryResultDocumentationQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryResultDocumentationQuery]
  }
}

