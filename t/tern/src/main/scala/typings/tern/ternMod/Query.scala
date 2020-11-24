package typings.tern.ternMod

import typings.tern.ternStrings.`type`
import typings.tern.ternStrings.completions
import typings.tern.ternStrings.definition
import typings.tern.ternStrings.documentation
import typings.tern.ternStrings.files
import typings.tern.ternStrings.properties
import typings.tern.ternStrings.refs
import typings.tern.ternStrings.rename
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
trait Query extends js.Object
object Query {
  
  @scala.inline
  def CompletionsQuery(end: Double | Position, file: String, `type`: completions): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  def DefinitionQuery(end: Double | Position, file: String, `type`: definition): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  def RenameQuery(end: Double | Position, file: String, newName: String, `type`: rename): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], newName = newName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  def FilesQuery(`type`: files): Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  def TypeQuery(end: Double | Position, file: String, `type`: `type`): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  def RefsQuery(end: Double | Position, file: String, `type`: refs): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  def PropertiesQuery(`type`: properties): Query = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
  
  @scala.inline
  def DocumentationQuery(end: Double | Position, file: String, `type`: documentation): Query = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Query]
  }
}
