package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validatorLib {
  type IEmailoptions = validatorLib.ValidatorJSNs.NormalizeEmailOptions
  type IFQDNoptions = validatorLib.ValidatorJSNs.IsFQDNOptions
  type IURLoptions = validatorLib.ValidatorJSNs.IsURLOptions
  // deprecated interfaces for backward compatibility, please use ValidatorJS.* instead the ones
  type IValidatorStatic = validatorLib.ValidatorJSNs.ValidatorStatic
}
