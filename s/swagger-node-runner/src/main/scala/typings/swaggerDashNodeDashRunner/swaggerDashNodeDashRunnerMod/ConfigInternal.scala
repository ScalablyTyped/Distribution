package typings.swaggerDashNodeDashRunner.swaggerDashNodeDashRunnerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConfigInternal extends js.Object {
  /** Config of SwaggerNodeRunner  */
  var swagger: js.UndefOr[Config] = js.undefined
}

object ConfigInternal {
  @scala.inline
  def apply(swagger: Config = null): ConfigInternal = {
    val __obj = js.Dynamic.literal()
    if (swagger != null) __obj.updateDynamic("swagger")(swagger.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigInternal]
  }
}

