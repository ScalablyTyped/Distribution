package typings.swaggerDashExpressDashValidator.swaggerDashExpressDashValidatorMod

import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowNullable: js.UndefOr[Boolean] = js.undefined
  var requestValidationFn: js.UndefOr[
    js.Function3[/* req */ Request[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any, Unit]
  ] = js.undefined
  var responseValidationFn: js.UndefOr[
    js.Function3[/* req */ Request[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any, Unit]
  ] = js.undefined
  var schema: String
  var validateRequest: js.UndefOr[Boolean] = js.undefined
  var validateResponse: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    schema: String,
    allowNullable: js.UndefOr[Boolean] = js.undefined,
    requestValidationFn: (/* req */ Request[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any) => Unit = null,
    responseValidationFn: (/* req */ Request[ParamsDictionary], /* data */ js.Any, /* errors */ js.Any) => Unit = null,
    validateRequest: js.UndefOr[Boolean] = js.undefined,
    validateResponse: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (!js.isUndefined(allowNullable)) __obj.updateDynamic("allowNullable")(allowNullable)
    if (requestValidationFn != null) __obj.updateDynamic("requestValidationFn")(js.Any.fromFunction3(requestValidationFn))
    if (responseValidationFn != null) __obj.updateDynamic("responseValidationFn")(js.Any.fromFunction3(responseValidationFn))
    if (!js.isUndefined(validateRequest)) __obj.updateDynamic("validateRequest")(validateRequest)
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse)
    __obj.asInstanceOf[Options]
  }
}

