package typings.vueDashI18n.vueDashI18nMod.typesVueMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vueDashI18n.Fn_Args
import typings.vueDashI18n.Fn_ArgsKey
import typings.vueDashI18n.Fn_Choice
import typings.vueDashI18n.Fn_Key
import typings.vueDashI18n.vueDashI18nMod.IVueI18n
import typings.vueDashI18n.vueDashI18nMod.VueI18n
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$d")
  var $d_Original: Fn_Args = js.native
  @JSName("$i18n")
  val $i18n: VueI18n with IVueI18n = js.native
  @JSName("$n")
  var $n_Original: Fn_ArgsKey = js.native
  @JSName("$t")
  var $t_Original: Fn_Key = js.native
  @JSName("$tc")
  var $tc_Original: Fn_Choice = js.native
  @JSName("$te")
  var $te_Original: js.Function2[
    /* key */ typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path, 
    /* locale */ js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale], 
    Boolean
  ] = js.native
  @JSName("$d")
  def $d(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(
    value: Double,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: Date): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: Date, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: Date, key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(
    value: Date,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$n")
  def $n(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$n")
  def $n(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$n")
  def $n(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$n")
  def $n(
    value: Double,
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$t")
  def $t(key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$t")
  def $t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$t")
  def $t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$t")
  def $t(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): typings.vueDashI18n.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$tc")
  def $tc(key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): String = js.native
  @JSName("$tc")
  def $tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice
  ): String = js.native
  @JSName("$tc")
  def $tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): String = js.native
  @JSName("$tc")
  def $tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): String = js.native
  @JSName("$tc")
  def $tc(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    choice: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Choice,
    values: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Values
  ): String = js.native
  @JSName("$te")
  def $te(key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path): Boolean = js.native
  @JSName("$te")
  def $te(
    key: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Path,
    locale: typings.vueDashI18n.vueDashI18nMod.VueI18nNs.Locale
  ): Boolean = js.native
}

