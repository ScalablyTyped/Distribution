package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerValidatorOptions extends js.Object {
  var validateResponse: js.UndefOr[Boolean] = js.undefined
}

object SwaggerValidatorOptions {
  @scala.inline
  def apply(validateResponse: js.UndefOr[Boolean] = js.undefined): SwaggerValidatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerValidatorOptions]
  }
}

