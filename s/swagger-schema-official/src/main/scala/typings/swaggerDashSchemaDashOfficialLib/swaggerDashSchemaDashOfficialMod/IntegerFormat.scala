package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[
    swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.int32 | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.int64
  ] = js.undefined
  var `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.integer
}

object IntegerFormat {
  @scala.inline
  def apply(
    `type`: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.integer,
    format: swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.int32 | swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialLibStrings.int64 = null
  ): IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerFormat]
  }
}

