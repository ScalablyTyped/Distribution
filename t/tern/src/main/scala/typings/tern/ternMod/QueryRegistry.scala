package typings.tern.ternMod

import typings.tern.AnonQueryDefinitionQuery
import typings.tern.AnonQueryDocumentationQuery
import typings.tern.AnonQueryFilesQuery
import typings.tern.AnonQueryPropertiesQuery
import typings.tern.AnonQueryRefsQuery
import typings.tern.AnonQueryRenameQuery
import typings.tern.AnonQueryResult
import typings.tern.AnonResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRegistry extends js.Object {
  var completions: AnonResult
  var definition: AnonQueryDefinitionQuery
  var documentation: AnonQueryDocumentationQuery
  var files: AnonQueryFilesQuery
  var properties: AnonQueryPropertiesQuery
  var refs: AnonQueryRefsQuery
  var rename: AnonQueryRenameQuery
  var `type`: AnonQueryResult
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: AnonResult,
    definition: AnonQueryDefinitionQuery,
    documentation: AnonQueryDocumentationQuery,
    files: AnonQueryFilesQuery,
    properties: AnonQueryPropertiesQuery,
    refs: AnonQueryRefsQuery,
    rename: AnonQueryRenameQuery,
    `type`: AnonQueryResult
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRegistry]
  }
}

