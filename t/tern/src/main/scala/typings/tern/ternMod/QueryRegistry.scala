package typings.tern.ternMod

import typings.tern.AnonQueryResult
import typings.tern.AnonQueryResultCompletionsQuery
import typings.tern.AnonQueryResultDefinitionQuery
import typings.tern.AnonQueryResultDocumentationQuery
import typings.tern.AnonQueryResultFilesQuery
import typings.tern.AnonQueryResultPropertiesQuery
import typings.tern.AnonQueryResultRefsQuery
import typings.tern.AnonQueryResultRenameQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRegistry extends js.Object {
  var completions: AnonQueryResultCompletionsQuery
  var definition: AnonQueryResultDefinitionQuery
  var documentation: AnonQueryResultDocumentationQuery
  var files: AnonQueryResultFilesQuery
  var properties: AnonQueryResultPropertiesQuery
  var refs: AnonQueryResultRefsQuery
  var rename: AnonQueryResultRenameQuery
  var `type`: AnonQueryResult
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: AnonQueryResultCompletionsQuery,
    definition: AnonQueryResultDefinitionQuery,
    documentation: AnonQueryResultDocumentationQuery,
    files: AnonQueryResultFilesQuery,
    properties: AnonQueryResultPropertiesQuery,
    refs: AnonQueryResultRefsQuery,
    rename: AnonQueryResultRenameQuery,
    `type`: AnonQueryResult
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRegistry]
  }
}

