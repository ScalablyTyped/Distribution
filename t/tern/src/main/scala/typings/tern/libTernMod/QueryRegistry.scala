package typings.tern.libTernMod

import typings.tern.Anon_QueryResult
import typings.tern.Anon_QueryResultCompletionsQuery
import typings.tern.Anon_QueryResultDefinitionQuery
import typings.tern.Anon_QueryResultDocumentationQuery
import typings.tern.Anon_QueryResultPropertiesQuery
import typings.tern.Anon_QueryResultRefsQuery
import typings.tern.Anon_QueryResultRenameQuery
import typings.tern.Anon_QueryResultTypeQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRegistry extends js.Object {
  var completions: Anon_QueryResultCompletionsQuery
  var definition: Anon_QueryResultDefinitionQuery
  var documentation: Anon_QueryResultDocumentationQuery
  var files: Anon_QueryResult
  var properties: Anon_QueryResultPropertiesQuery
  var refs: Anon_QueryResultRefsQuery
  var rename: Anon_QueryResultRenameQuery
  var `type`: Anon_QueryResultTypeQuery
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: Anon_QueryResultCompletionsQuery,
    definition: Anon_QueryResultDefinitionQuery,
    documentation: Anon_QueryResultDocumentationQuery,
    files: Anon_QueryResult,
    properties: Anon_QueryResultPropertiesQuery,
    refs: Anon_QueryResultRefsQuery,
    rename: Anon_QueryResultRenameQuery,
    `type`: Anon_QueryResultTypeQuery
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRegistry]
  }
}

