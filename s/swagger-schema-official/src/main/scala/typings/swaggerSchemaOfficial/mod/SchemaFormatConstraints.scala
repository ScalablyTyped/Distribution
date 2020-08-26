package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerSchemaOfficial.mod.GenericFormat
  - typings.swaggerSchemaOfficial.mod.IntegerFormat
  - typings.swaggerSchemaOfficial.mod.NumberFormat
  - typings.swaggerSchemaOfficial.mod.StringFormat
*/
trait SchemaFormatConstraints extends js.Object

object SchemaFormatConstraints {
  @scala.inline
  def GenericFormat(): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def IntegerFormat(`type`: integer): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def NumberFormat(`type`: number): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def StringFormat(`type`: string): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
}

