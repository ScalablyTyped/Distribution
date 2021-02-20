package typings.tern.ternMod

import typings.tern.ternStrings.`type`
import typings.tern.ternStrings.completions
import typings.tern.ternStrings.definition
import typings.tern.ternStrings.documentation
import typings.tern.ternStrings.files
import typings.tern.ternStrings.properties
import typings.tern.ternStrings.refs
import typings.tern.ternStrings.rename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
  def CompletionsQuery(end: Double | Position, file: String, `type`: completions): typings.tern.ternMod.CompletionsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.CompletionsQuery]
  }
  
  @scala.inline
  def DefinitionQuery(end: Double | Position, file: String, `type`: definition): typings.tern.ternMod.DefinitionQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.DefinitionQuery]
  }
  
  @scala.inline
  def DocumentationQuery(end: Double | Position, file: String, `type`: documentation): typings.tern.ternMod.DocumentationQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.DocumentationQuery]
  }
  
  @scala.inline
  def FilesQuery(`type`: files): typings.tern.ternMod.FilesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.FilesQuery]
  }
  
  @scala.inline
  def PropertiesQuery(`type`: properties): typings.tern.ternMod.PropertiesQuery = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.PropertiesQuery]
  }
  
  @scala.inline
  def RefsQuery(end: Double | Position, file: String, `type`: refs): typings.tern.ternMod.RefsQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.RefsQuery]
  }
  
  @scala.inline
  def RenameQuery(end: Double | Position, file: String, newName: String, `type`: rename): typings.tern.ternMod.RenameQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.RenameQuery]
  }
  
  @scala.inline
  def TypeQuery(end: Double | Position, file: String, `type`: `type`): typings.tern.ternMod.TypeQuery = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.tern.ternMod.TypeQuery]
  }
}
