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

@js.native
trait QueryRegistry extends js.Object {
  var completions: Result = js.native
  var definition: QueryDefinitionQuery = js.native
  var documentation: QueryDocumentationQuery = js.native
  var files: QueryFilesQuery = js.native
  var properties: QueryPropertiesQuery = js.native
  var refs: QueryRefsQuery = js.native
  var rename: QueryRenameQuery = js.native
  var `type`: typings.tern.anon.QueryResult = js.native
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
  @scala.inline
  implicit class QueryRegistryOps[Self <: QueryRegistry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCompletions(value: Result): Self = this.set("completions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefinition(value: QueryDefinitionQuery): Self = this.set("definition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocumentation(value: QueryDocumentationQuery): Self = this.set("documentation", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiles(value: QueryFilesQuery): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: QueryPropertiesQuery): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefs(value: QueryRefsQuery): Self = this.set("refs", value.asInstanceOf[js.Any])
    @scala.inline
    def setRename(value: QueryRenameQuery): Self = this.set("rename", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: typings.tern.anon.QueryResult): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

