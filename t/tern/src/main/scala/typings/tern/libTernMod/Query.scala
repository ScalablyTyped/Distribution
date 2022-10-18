package typings.tern.libTernMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.tern.libTernMod.FilesQuery
  - typings.tern.libTernMod.RenameQuery
  - typings.tern.libTernMod.TypeQuery
  - typings.tern.libTernMod.RefsQuery
  - typings.tern.libTernMod.CompletionsQuery
  - typings.tern.libTernMod.DocumentationQuery
  - typings.tern.libTernMod.PropertiesQuery
  - typings.tern.libTernMod.DefinitionQuery
*/
trait Query extends StObject
object Query {
  
  inline def CompletionsQuery(end: Double | Position, file: String): typings.tern.libTernMod.CompletionsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("completions")
    __obj.asInstanceOf[typings.tern.libTernMod.CompletionsQuery]
  }
  
  inline def DefinitionQuery(end: Double | Position, file: String): typings.tern.libTernMod.DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("definition")
    __obj.asInstanceOf[typings.tern.libTernMod.DefinitionQuery]
  }
  
  inline def DocumentationQuery(end: Double | Position, file: String): typings.tern.libTernMod.DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("documentation")
    __obj.asInstanceOf[typings.tern.libTernMod.DocumentationQuery]
  }
  
  inline def FilesQuery(): typings.tern.libTernMod.FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("files")
    __obj.asInstanceOf[typings.tern.libTernMod.FilesQuery]
  }
  
  inline def PropertiesQuery(): typings.tern.libTernMod.PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("properties")
    __obj.asInstanceOf[typings.tern.libTernMod.PropertiesQuery]
  }
  
  inline def RefsQuery(end: Double | Position, file: String): typings.tern.libTernMod.RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("refs")
    __obj.asInstanceOf[typings.tern.libTernMod.RefsQuery]
  }
  
  inline def RenameQuery(end: Double | Position, file: String, newName: String): typings.tern.libTernMod.RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("rename")
    __obj.asInstanceOf[typings.tern.libTernMod.RenameQuery]
  }
  
  inline def TypeQuery(end: Double | Position, file: String): typings.tern.libTernMod.TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("type")
    __obj.asInstanceOf[typings.tern.libTernMod.TypeQuery]
  }
}
