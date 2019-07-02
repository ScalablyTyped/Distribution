package typings
package swaggerDashSchemaDashOfficialLib.swaggerDashSchemaDashOfficialMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenericFormat extends SchemaFormatConstraints {
  var format: js.UndefOr[java.lang.String] = js.undefined
  var `type`: js.UndefOr[ParameterType] = js.undefined
}

object GenericFormat {
  @scala.inline
  def apply(format: java.lang.String = null, `type`: ParameterType = null): GenericFormat = {
    val __obj = js.Dynamic.literal()
    if (format != null) __obj.updateDynamic("format")(format)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GenericFormat]
  }
}

