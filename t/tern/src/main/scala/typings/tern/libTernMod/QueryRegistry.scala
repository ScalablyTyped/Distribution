package typings.tern.libTernMod

import typings.tern.Anon_QueryResult
import typings.tern.Anon_QueryResultCompletionsQuery
import typings.tern.Anon_QueryResultDefinitionQuery
import typings.tern.Anon_QueryResultFilesQuery
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
  var documentation: Anon_QueryResult
  var files: Anon_QueryResultFilesQuery
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
    documentation: Anon_QueryResult,
    files: Anon_QueryResultFilesQuery,
    properties: Anon_QueryResultPropertiesQuery,
    refs: Anon_QueryResultRefsQuery,
    rename: Anon_QueryResultRenameQuery,
    `type`: Anon_QueryResultTypeQuery
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions, definition = definition, documentation = documentation, files = files, properties = properties, refs = refs, rename = rename)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryRegistry]
  }
}

