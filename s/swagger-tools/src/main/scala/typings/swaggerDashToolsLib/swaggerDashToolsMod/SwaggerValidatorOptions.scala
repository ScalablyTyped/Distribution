package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerValidatorOptions extends js.Object {
  var validateResponse: js.UndefOr[scala.Boolean] = js.undefined
}

object SwaggerValidatorOptions {
  @scala.inline
  def apply(validateResponse: js.UndefOr[scala.Boolean] = js.undefined): SwaggerValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse)
    __obj.asInstanceOf[SwaggerValidatorOptions]
  }
}

