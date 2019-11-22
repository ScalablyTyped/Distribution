package typings.validator

import typings.validator.validatorMod.AlphaLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isAlpha", JSImport.Namespace)
@js.native
object libIsAlphaMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, locale: AlphaLocale): Boolean = js.native
}

