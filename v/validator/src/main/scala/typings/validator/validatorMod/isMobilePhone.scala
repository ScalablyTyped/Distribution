package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator", "isMobilePhone")
@js.native
object isMobilePhone extends js.Object {
  def apply(str: String): Boolean = js.native
  def apply(str: String, locale: js.Array[MobilePhoneLocale]): Boolean = js.native
  def apply(str: String, locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Boolean = js.native
  def apply(str: String, locale: MobilePhoneLocale): Boolean = js.native
  def apply(str: String, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
}

