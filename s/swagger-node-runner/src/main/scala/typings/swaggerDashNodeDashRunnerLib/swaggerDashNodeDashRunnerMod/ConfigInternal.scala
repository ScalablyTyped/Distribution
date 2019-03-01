package typings
package swaggerDashNodeDashRunnerLib.swaggerDashNodeDashRunnerMod

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
    if (swagger != null) __obj.updateDynamic("swagger")(swagger)
    __obj.asInstanceOf[ConfigInternal]
  }
}

