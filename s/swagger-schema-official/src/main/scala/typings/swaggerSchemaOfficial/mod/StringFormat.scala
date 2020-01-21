package typings.swaggerSchemaOfficial.mod

import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings._empty
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.`date-time`
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.binary
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.byte
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.date
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.password
import typings.swaggerSchemaOfficial.swaggerSchemaOfficialStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[_empty | byte | binary | date | `date-time` | password] = js.undefined
  var `type`: string
}

object StringFormat {
  @scala.inline
  def apply(`type`: string, format: _empty | byte | binary | date | `date-time` | password = null): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormat]
  }
}

