package typings
package swaggerDashToolsLib.swaggerDashToolsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwaggerRouter12Options extends js.Object {
  var controllers: js.UndefOr[
    SwaggerRouter12OptionsControllers | java.lang.String | js.Array[java.lang.String]
  ] = js.undefined
  var ignoreMissingHandlers: js.UndefOr[scala.Boolean] = js.undefined
  var useStubs: js.UndefOr[scala.Boolean] = js.undefined
}

object SwaggerRouter12Options {
  @scala.inline
  def apply(
    controllers: SwaggerRouter12OptionsControllers | java.lang.String | js.Array[java.lang.String] = null,
    ignoreMissingHandlers: js.UndefOr[scala.Boolean] = js.undefined,
    useStubs: js.UndefOr[scala.Boolean] = js.undefined
  ): SwaggerRouter12Options = {
    val __obj = js.Dynamic.literal()
    if (controllers != null) __obj.updateDynamic("controllers")(controllers.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreMissingHandlers)) __obj.updateDynamic("ignoreMissingHandlers")(ignoreMissingHandlers)
    if (!js.isUndefined(useStubs)) __obj.updateDynamic("useStubs")(useStubs)
    __obj.asInstanceOf[SwaggerRouter12Options]
  }
}

