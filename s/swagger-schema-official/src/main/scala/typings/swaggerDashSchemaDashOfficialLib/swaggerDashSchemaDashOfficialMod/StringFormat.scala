package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StringFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[
    swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.Empty | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.byte | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.binary | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.date | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`date-time` | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.password
  ] = js.undefined
  var `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.string
}

object StringFormat {
  @scala.inline
  def apply(
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.string,
    format: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.Empty | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.byte | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.binary | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.date | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.`date-time` | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.password = null
  ): StringFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[StringFormat]
  }
}

