package typings.vueDashI18n.vueDashI18nMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vueDashI18n.Fn_Args
import typings.vueDashI18n.Fn_ArgsKey
import typings.vueDashI18n.Fn_Choice
import typings.vueDashI18n.Fn_Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object typesVueMod extends js.Object {
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
        /* key */ typings.vueDashI18n.vueDashI18nMod.VueI18n.Path, 
        /* locale */ js.UndefOr[typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale], 
        Boolean
      ] = js.native
    @JSName("$d")
    def $d(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: Double,
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(value: Date, key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$d")
    def $d(
      value: Date,
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typings.vueDashI18n.vueDashI18nMod.VueI18n.DateTimeFormatResult = js.native
    @JSName("$n")
    def $n(value: Double): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, args: StringDictionary[String]): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(value: Double, key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$n")
    def $n(
      value: Double,
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typings.vueDashI18n.vueDashI18nMod.VueI18n.NumberFormatResult = js.native
    @JSName("$t")
    def $t(key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
      values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$t")
    def $t(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): typings.vueDashI18n.vueDashI18nMod.VueI18n.TranslateResult = js.native
    @JSName("$tc")
    def $tc(key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): String = js.native
    @JSName("$tc")
    def $tc(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale,
      values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): String = js.native
    @JSName("$tc")
    def $tc(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      choice: typings.vueDashI18n.vueDashI18nMod.VueI18n.Choice,
      values: typings.vueDashI18n.vueDashI18nMod.VueI18n.Values
    ): String = js.native
    @JSName("$te")
    def $te(key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path): Boolean = js.native
    @JSName("$te")
    def $te(
      key: typings.vueDashI18n.vueDashI18nMod.VueI18n.Path,
      locale: typings.vueDashI18n.vueDashI18nMod.VueI18n.Locale
    ): Boolean = js.native
  }
  
}

