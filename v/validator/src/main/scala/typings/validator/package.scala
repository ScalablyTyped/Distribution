package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object validator {
  import typings.validator.ValidatorJS.IsFQDNOptions
  import typings.validator.ValidatorJS.IsURLOptions
  import typings.validator.ValidatorJS.NormalizeEmailOptions
  import typings.validator.ValidatorJS.ValidatorStatic

  type IEmailoptions = NormalizeEmailOptions
  type IFQDNoptions = IsFQDNOptions
  type IURLoptions = IsURLOptions
  // deprecated interfaces for backward compatibility, please use ValidatorJS.* instead the ones
  type IValidatorStatic = ValidatorStatic
}
