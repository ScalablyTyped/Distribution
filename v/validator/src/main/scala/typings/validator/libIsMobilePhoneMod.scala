package typings.validator

import typings.validator.validatorMod.IsMobilePhoneOptions
import typings.validator.validatorMod.MobilePhoneLocale
import typings.validator.validatorStrings.any
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("validator/lib/isMobilePhone", JSImport.Namespace)
@js.native
object libIsMobilePhoneMod extends js.Object {
  def default(str: String): Boolean = js.native
  def default(str: String, locale: js.Array[MobilePhoneLocale]): Boolean = js.native
  def default(str: String, locale: js.Array[MobilePhoneLocale], options: IsMobilePhoneOptions): Boolean = js.native
  def default(str: String, locale: MobilePhoneLocale): Boolean = js.native
  def default(str: String, locale: MobilePhoneLocale, options: IsMobilePhoneOptions): Boolean = js.native
  @JSName("default")
  def default_any(str: String, locale: any): Boolean = js.native
  @JSName("default")
  def default_any(str: String, locale: any, options: IsMobilePhoneOptions): Boolean = js.native
}

