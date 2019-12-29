package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings._empty
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.`date-time`
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.binary
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.byte
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.date
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.password
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.string
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

