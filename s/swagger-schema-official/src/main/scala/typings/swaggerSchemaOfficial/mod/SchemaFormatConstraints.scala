package typings.swaggerSchemaOfficial.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
  def IntegerFormat(): typings.swaggerSchemaOfficial.mod.IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("integer")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.IntegerFormat]
  }
  
  @scala.inline
  def NumberFormat(): typings.swaggerSchemaOfficial.mod.NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("number")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.NumberFormat]
  }
  
  @scala.inline
  def StringFormat(): typings.swaggerSchemaOfficial.mod.StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("string")
    __obj.asInstanceOf[typings.swaggerSchemaOfficial.mod.StringFormat]
  }
}
