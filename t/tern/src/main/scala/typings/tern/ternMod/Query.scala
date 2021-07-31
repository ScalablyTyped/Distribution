package typings.tern.ternMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tern.ternMod.FilesQuery
  - typings.tern.ternMod.RenameQuery
  - typings.tern.ternMod.TypeQuery
  - typings.tern.ternMod.RefsQuery
  - typings.tern.ternMod.CompletionsQuery
  - typings.tern.ternMod.DocumentationQuery
  - typings.tern.ternMod.PropertiesQuery
  - typings.tern.ternMod.DefinitionQuery
*/
trait Query extends StObject
object Query {
  
  @scala.inline
  def CompletionsQuery(end: Double | Position, file: String): typings.tern.ternMod.CompletionsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("completions")
    __obj.asInstanceOf[typings.tern.ternMod.CompletionsQuery]
  }
  
  @scala.inline
  def DefinitionQuery(end: Double | Position, file: String): typings.tern.ternMod.DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[typings.tern.ternMod.DefinitionQuery]
  }
  
  @scala.inline
  def DocumentationQuery(end: Double | Position, file: String): typings.tern.ternMod.DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("documentation")
    __obj.asInstanceOf[typings.tern.ternMod.DocumentationQuery]
  }
  
  @scala.inline
  def FilesQuery(): typings.tern.ternMod.FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("files")
    __obj.asInstanceOf[typings.tern.ternMod.FilesQuery]
  }
  
  @scala.inline
  def PropertiesQuery(): typings.tern.ternMod.PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("properties")
    __obj.asInstanceOf[typings.tern.ternMod.PropertiesQuery]
  }
  
  @scala.inline
  def RefsQuery(end: Double | Position, file: String): typings.tern.ternMod.RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("refs")
    __obj.asInstanceOf[typings.tern.ternMod.RefsQuery]
  }
  
  @scala.inline
  def RenameQuery(end: Double | Position, file: String, newName: String): typings.tern.ternMod.RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rename")
    __obj.asInstanceOf[typings.tern.ternMod.RenameQuery]
  }
  
  @scala.inline
  def TypeQuery(end: Double | Position, file: String): typings.tern.ternMod.TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typings.tern.ternMod.TypeQuery]
  }
}
