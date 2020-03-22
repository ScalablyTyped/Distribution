package typings.tern

import typings.tern.ternMod.DocumentationQuery
import typings.tern.ternMod.DocumentationQueryResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQueryDocumentationQuery extends js.Object {
  var query: DocumentationQuery
  var result: DocumentationQueryResult
}

object AnonQueryDocumentationQuery {
  @scala.inline
  def apply(query: DocumentationQuery, result: DocumentationQueryResult): AnonQueryDocumentationQuery = {
    val __obj = js.Dynamic.literal(query = query.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQueryDocumentationQuery]
  }
}

