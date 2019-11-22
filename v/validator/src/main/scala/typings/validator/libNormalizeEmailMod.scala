package typings.validator

import typings.validator.validatorMod.NormalizeEmailOptions
import typings.validator.validatorNumbers.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/normalizeEmail", JSImport.Namespace)
@js.native
object libNormalizeEmailMod extends js.Object {
  def default(email: String): String | `false` = js.native
  def default(email: String, options: NormalizeEmailOptions): String | `false` = js.native
}

