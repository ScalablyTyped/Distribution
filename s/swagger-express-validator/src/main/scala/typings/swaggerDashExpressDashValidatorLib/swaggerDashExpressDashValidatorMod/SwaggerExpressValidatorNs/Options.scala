package typings
package swaggerDashExpressDashValidatorLib.swaggerDashExpressDashValidatorMod.SwaggerExpressValidatorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var allowNullable: js.UndefOr[scala.Boolean] = js.undefined
  var requestValidationFn: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var responseValidationFn: js.UndefOr[
    js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      scala.Unit
    ]
  ] = js.undefined
  var schema: java.lang.String
  var validateRequest: js.UndefOr[scala.Boolean] = js.undefined
  var validateResponse: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    schema: java.lang.String,
    allowNullable: js.UndefOr[scala.Boolean] = js.undefined,
    requestValidationFn: js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      scala.Unit
    ] = null,
    responseValidationFn: js.Function3[
      /* req */ expressLib.expressMod.eNs.Request, 
      /* data */ js.Any, 
      /* errors */ js.Any, 
      scala.Unit
    ] = null,
    validateRequest: js.UndefOr[scala.Boolean] = js.undefined,
    validateResponse: js.UndefOr[scala.Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal(schema = schema)
    if (!js.isUndefined(allowNullable)) __obj.updateDynamic("allowNullable")(allowNullable)
    if (requestValidationFn != null) __obj.updateDynamic("requestValidationFn")(requestValidationFn)
    if (responseValidationFn != null) __obj.updateDynamic("responseValidationFn")(responseValidationFn)
    if (!js.isUndefined(validateRequest)) __obj.updateDynamic("validateRequest")(validateRequest)
    if (!js.isUndefined(validateResponse)) __obj.updateDynamic("validateResponse")(validateResponse)
    __obj.asInstanceOf[Options]
  }
}

