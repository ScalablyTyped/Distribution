package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.Empty
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.`date-time`
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.binary
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.byte
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.date
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.double
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.float
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.int32
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.int64
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.integer
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.number
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.password
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.GenericFormat
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.IntegerFormat
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.NumberFormat
  - typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod.StringFormat
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
  def StringFormat(`type`: string, format: Empty | byte | binary | date | `date-time` | password = null): SchemaFormatConstraints = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaFormatConstraints]
  }
}

