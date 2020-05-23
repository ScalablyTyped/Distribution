package typings.tern.ternMod

import typings.tern.anon.QueryDefinitionQuery
import typings.tern.anon.QueryDocumentationQuery
import typings.tern.anon.QueryFilesQuery
import typings.tern.anon.QueryPropertiesQuery
import typings.tern.anon.QueryRefsQuery
import typings.tern.anon.QueryRenameQuery
import typings.tern.anon.Result
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRegistry extends js.Object {
  var completions: Result
  var definition: QueryDefinitionQuery
  var documentation: QueryDocumentationQuery
  var files: QueryFilesQuery
  var properties: QueryPropertiesQuery
  var refs: QueryRefsQuery
  var rename: QueryRenameQuery
  var `type`: typings.tern.anon.QueryResult
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: Result,
    definition: QueryDefinitionQuery,
    documentation: QueryDocumentationQuery,
    files: QueryFilesQuery,
    properties: QueryPropertiesQuery,
    refs: QueryRefsQuery,
    rename: QueryRenameQuery,
    `type`: typings.tern.anon.QueryResult
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(completions = completions.asInstanceOf[js.Any], definition = definition.asInstanceOf[js.Any], documentation = documentation.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], refs = refs.asInstanceOf[js.Any], rename = rename.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryRegistry]
  }
}

