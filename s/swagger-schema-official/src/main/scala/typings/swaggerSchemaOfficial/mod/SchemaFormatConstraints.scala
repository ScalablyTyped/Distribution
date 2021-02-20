package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Rewritten from type alias, can be one of: 
  - typings.swaggerSchemaOfficial.mod.GenericFormat
  - typings.swaggerSchemaOfficial.mod.IntegerFormat
  - typings.swaggerSchemaOfficial.mod.NumberFormat
  - typings.swaggerSchemaOfficial.mod.StringFormat
*/
trait SchemaFormatConstraints extends StObject
object SchemaFormatConstraints {
  
  @scala.inline
  def GenericFormat(): typings.swaggerSchemaOfficial.mod.GenericFormat = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.GenericFormat]
  }
  
  @scala.inline
  def IntegerFormat(`type`: integer): typings.swaggerSchemaOfficial.mod.IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.IntegerFormat]
  }
  
  @scala.inline
  def NumberFormat(`type`: number): typings.swaggerSchemaOfficial.mod.NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.NumberFormat]
  }
  
  @scala.inline
  def StringFormat(`type`: string): typings.swaggerSchemaOfficial.mod.StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.StringFormat]
  }
}
