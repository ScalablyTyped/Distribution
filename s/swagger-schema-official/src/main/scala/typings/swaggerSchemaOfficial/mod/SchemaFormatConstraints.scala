package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.double
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.float
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int32
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.int64
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.integer
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.number
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
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
  def GenericFormat(format: String = null, `type`: ParameterType = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def IntegerFormat(`type`: integer, format: int32 | int64 = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def NumberFormat(`type`: number, format: float | double = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
  @scala.inline
  def StringFormat(`type`: string, format: _empty | byte | binary | date | `date-time` | password = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
}

