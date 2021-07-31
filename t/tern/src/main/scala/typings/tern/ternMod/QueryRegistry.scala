package typings.tern.ternMod

import typings.tern.anon.QueryDefinitionQuery
import typings.tern.anon.QueryDocumentationQuery
import typings.tern.anon.QueryFilesQuery
import typings.tern.anon.QueryPropertiesQuery
import typings.tern.anon.QueryRefsQuery
import typings.tern.anon.QueryRenameQuery
import typings.tern.anon.Result
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRegistry extends StObject {
  
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
  
  @scala.inline
  implicit class QueryRegistryMutableBuilder[Self <: QueryRegistry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCompletions(value: Result): Self = StObject.set(x, "completions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefinition(value: QueryDefinitionQuery): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentation(value: QueryDocumentationQuery): Self = StObject.set(x, "documentation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiles(value: QueryFilesQuery): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: QueryPropertiesQuery): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRefs(value: QueryRefsQuery): Self = StObject.set(x, "refs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRename(value: QueryRenameQuery): Self = StObject.set(x, "rename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: typings.tern.anon.QueryResult): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
