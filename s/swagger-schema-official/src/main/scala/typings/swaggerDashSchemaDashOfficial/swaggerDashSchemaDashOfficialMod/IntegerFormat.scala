package typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialMod

import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.int32
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.int64
import typings.swaggerDashSchemaDashOfficial.swaggerDashSchemaDashOfficialStrings.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntegerFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[int32 | int64] = js.undefined
  var `type`: integer
}

object IntegerFormat {
  @scala.inline
  def apply(`type`: integer, format: int32 | int64 = null): IntegerFormat = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntegerFormat]
  }
}

