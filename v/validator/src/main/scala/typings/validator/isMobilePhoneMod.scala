package typings.validator

import typings.validator.validatorStrings.any
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object isMobilePhoneMod {
  
  /**
    * Check if the string is a mobile phone number.
    *
    * @param [locale] - MobilePhoneLocale(s)
    * @param [options] - Options
    */
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default(str: String): Boolean = js.native
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default(
    str: String,
    locale: js.UndefOr[scala.Nothing],
    options: typings.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default(str: String, locale: js.Array[typings.validator.mod.validator.MobilePhoneLocale]): Boolean = js.native
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default(
    str: String,
    locale: js.Array[typings.validator.mod.validator.MobilePhoneLocale],
    options: typings.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default(str: String, locale: typings.validator.mod.validator.MobilePhoneLocale): Boolean = js.native
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default(
    str: String,
    locale: typings.validator.mod.validator.MobilePhoneLocale,
    options: typings.validator.mod.validator.IsMobilePhoneOptions
  ): Boolean = js.native
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default_any(str: String, locale: any): Boolean = js.native
  @JSImport("validator/lib/isMobilePhone", JSImport.Default)
  @js.native
  def default_any(str: String, locale: any, options: typings.validator.mod.validator.IsMobilePhoneOptions): Boolean = js.native
  
  type IsMobilePhoneOptions = typings.validator.mod.validator.IsMobilePhoneOptions
  
  type MobilePhoneLocale = typings.validator.mod.validator.MobilePhoneLocale
}
