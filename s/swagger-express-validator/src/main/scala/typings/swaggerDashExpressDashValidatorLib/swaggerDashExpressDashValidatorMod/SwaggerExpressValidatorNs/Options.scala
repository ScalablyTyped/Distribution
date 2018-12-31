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

