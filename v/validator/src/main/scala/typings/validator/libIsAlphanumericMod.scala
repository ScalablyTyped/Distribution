package typings.validator

import typings.validator.validatorMod.AlphanumericLocale
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isAlphanumeric", JSImport.Namespace)
@js.native
object libIsAlphanumericMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, locale: AlphanumericLocale): Boolean = js.native
}

