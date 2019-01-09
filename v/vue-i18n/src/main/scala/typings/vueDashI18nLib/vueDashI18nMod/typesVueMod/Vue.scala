package typings
package vueDashI18nLib.vueDashI18nMod.typesVueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vue extends js.Object {
  @JSName("$d")
  var $d_Original: vueDashI18nLib.Anon_Args = js.native
  @JSName("$i18n")
  val $i18n: vueDashI18nLib.vueDashI18nMod.VueI18n with vueDashI18nLib.vueDashI18nMod.IVueI18n = js.native
  @JSName("$n")
  var $n_Original: vueDashI18nLib.Anon_ArgsKey = js.native
  @JSName("$t")
  var $t_Original: vueDashI18nLib.Anon_Key = js.native
  @JSName("$tc")
  var $tc_Original: vueDashI18nLib.Anon_Choice = js.native
  @JSName("$te")
  var $te_Original: js.Function2[
    /* key */ vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path, 
    /* locale */ js.UndefOr[vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale], 
    scala.Boolean
  ] = js.native
  @JSName("$d")
  def $d(value: scala.Double): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: scala.Double, args: org.scalablytyped.runtime.StringDictionary[java.lang.String]): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: scala.Double, key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(
    value: scala.Double,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: stdLib.Date): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: stdLib.Date, args: org.scalablytyped.runtime.StringDictionary[java.lang.String]): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(value: stdLib.Date, key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$d")
  def $d(
    value: stdLib.Date,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeFormatResult = js.native
  @JSName("$n")
  def $n(value: scala.Double): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$n")
  def $n(value: scala.Double, args: org.scalablytyped.runtime.StringDictionary[java.lang.String]): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$n")
  def $n(value: scala.Double, key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$n")
  def $n(
    value: scala.Double,
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.NumberFormatResult = js.native
  @JSName("$t")
  def $t(key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$t")
  def $t(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$t")
  def $t(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$t")
  def $t(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): vueDashI18nLib.vueDashI18nMod.VueI18nNs.TranslateResult = js.native
  @JSName("$tc")
  def $tc(key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): java.lang.String = js.native
  @JSName("$tc")
  def $tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice
  ): java.lang.String = js.native
  @JSName("$tc")
  def $tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): java.lang.String = js.native
  @JSName("$tc")
  def $tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): java.lang.String = js.native
  @JSName("$tc")
  def $tc(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    choice: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Choice,
    values: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Values
  ): java.lang.String = js.native
  @JSName("$te")
  def $te(key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path): scala.Boolean = js.native
  @JSName("$te")
  def $te(
    key: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Path,
    locale: vueDashI18nLib.vueDashI18nMod.VueI18nNs.Locale
  ): scala.Boolean = js.native
}

