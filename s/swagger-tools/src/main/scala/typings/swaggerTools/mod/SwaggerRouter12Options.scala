package typings.swaggerTools.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerRouter12Options extends js.Object {
  var controllers: js.UndefOr[SwaggerRouter12OptionsControllers | String | js.Array[String]] = js.undefined
  var ignoreMissingHandlers: js.UndefOr[Boolean] = js.undefined
  var useStubs: js.UndefOr[Boolean] = js.undefined
}

object SwaggerRouter12Options {
  @scala.inline
  def apply(
    controllers: SwaggerRouter12OptionsControllers | String | js.Array[String] = null,
    ignoreMissingHandlers: js.UndefOr[Boolean] = js.undefined,
    useStubs: js.UndefOr[Boolean] = js.undefined
  ): SwaggerRouter12Options = {
    val __obj = js.Dynamic.literal()
    if (controllers != null) __obj.updateDynamic("controllers")(controllers.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMissingHandlers)) __obj.updateDynamic("ignoreMissingHandlers")(ignoreMissingHandlers.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useStubs)) __obj.updateDynamic("useStubs")(useStubs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SwaggerRouter12Options]
  }
}

