package typings
package ternLib.libTernMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryRegistry extends js.Object {
  var completions: ternLib.Anon_QueryResult
  var definition: ternLib.Anon_QueryResultDefinitionQuery
  var documentation: ternLib.Anon_QueryResultDocumentationQuery
  var files: ternLib.Anon_QueryResultFilesQuery
  var properties: ternLib.Anon_QueryResultPropertiesQuery
  var refs: ternLib.Anon_QueryResultRefsQuery
  var rename: ternLib.Anon_QueryResultRenameQuery
  var `type`: ternLib.Anon_QueryResultTypeQuery
}

object QueryRegistry {
  @scala.inline
  def apply(
    completions: ternLib.Anon_QueryResult,
    definition: ternLib.Anon_QueryResultDefinitionQuery,
    documentation: ternLib.Anon_QueryResultDocumentationQuery,
    files: ternLib.Anon_QueryResultFilesQuery,
    properties: ternLib.Anon_QueryResultPropertiesQuery,
    refs: ternLib.Anon_QueryResultRefsQuery,
    rename: ternLib.Anon_QueryResultRenameQuery,
    `type`: ternLib.Anon_QueryResultTypeQuery
  ): QueryRegistry = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("completions")(completions)
    __obj.updateDynamic("definition")(definition)
    __obj.updateDynamic("documentation")(documentation)
    __obj.updateDynamic("files")(files)
    __obj.updateDynamic("properties")(properties)
    __obj.updateDynamic("refs")(refs)
    __obj.updateDynamic("rename")(rename)
    __obj.asInstanceOf[QueryRegistry]
  }
}

