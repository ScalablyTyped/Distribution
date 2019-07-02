package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NumberFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[
    swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.float | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.double
  ] = js.undefined
  var `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.number
}

object NumberFormat {
  @scala.inline
  def apply(
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.number,
    format: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.float | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.double = null
  ): NumberFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[NumberFormat]
  }
}

