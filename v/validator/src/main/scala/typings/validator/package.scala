package typings

import typings.validator.ValidatorJSNs.IsFQDNOptions
import typings.validator.ValidatorJSNs.IsURLOptions
import typings.validator.ValidatorJSNs.NormalizeEmailOptions
import typings.validator.ValidatorJSNs.ValidatorStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validator {
  type IEmailoptions = NormalizeEmailOptions
  type IFQDNoptions = IsFQDNOptions
  type IURLoptions = IsURLOptions
  // deprecated interfaces for backward compatibility, please use ValidatorJS.* instead the ones
  type IValidatorStatic = ValidatorStatic
}
