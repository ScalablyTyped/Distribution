package typings.vueI18n.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import typings.vueI18n.anon.Fn0
import typings.vueI18n.anon.FnCall
import typings.vueI18n.anon.FnCallKeyChoiceLocaleValues
import typings.vueI18n.anon.FnCallValueKeyLocale
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueTypesVueAugmentingMod {
  
  trait Vue extends StObject {
    
    @JSName("$d")
    def $d(value: Double): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Double, key: Unit, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Date): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Date, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Date, key: Unit, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Date, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    def $d(value: Date, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.DateTimeFormatResult
    @JSName("$d")
    var $d_Original: FnCallValueKeyLocale
    
    @JSName("$i18n")
    val $i18n: VueI18n & IVueI18n
    
    @JSName("$n")
    def $n(value: Double): typings.vueI18n.mod.VueI18n.NumberFormatResult
    @JSName("$n")
    def $n(value: Double, args: StringDictionary[String]): typings.vueI18n.mod.VueI18n.NumberFormatResult
    @JSName("$n")
    def $n(value: Double, key: Unit, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult
    @JSName("$n")
    def $n(value: Double, key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.NumberFormatResult
    @JSName("$n")
    def $n(value: Double, key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.NumberFormatResult
    @JSName("$n")
    var $n_Original: Fn0
    
    @JSName("$t")
    def $t(key: typings.vueI18n.mod.VueI18n.Path): typings.vueI18n.mod.VueI18n.TranslateResult
    @JSName("$t")
    def $t(key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): typings.vueI18n.mod.VueI18n.TranslateResult
    @JSName("$t")
    def $t(
      key: typings.vueI18n.mod.VueI18n.Path,
      locale: typings.vueI18n.mod.VueI18n.Locale,
      values: typings.vueI18n.mod.VueI18n.Values
    ): typings.vueI18n.mod.VueI18n.TranslateResult
    @JSName("$t")
    def $t(key: typings.vueI18n.mod.VueI18n.Path, values: typings.vueI18n.mod.VueI18n.Values): typings.vueI18n.mod.VueI18n.TranslateResult
    @JSName("$t")
    var $t_Original: FnCall
    
    @JSName("$tc")
    def $tc(key: typings.vueI18n.mod.VueI18n.Path): String
    @JSName("$tc")
    def $tc(key: typings.vueI18n.mod.VueI18n.Path, choice: Unit, values: typings.vueI18n.mod.VueI18n.Values): String
    @JSName("$tc")
    def $tc(key: typings.vueI18n.mod.VueI18n.Path, choice: typings.vueI18n.mod.VueI18n.Choice): String
    @JSName("$tc")
    def $tc(
      key: typings.vueI18n.mod.VueI18n.Path,
      choice: typings.vueI18n.mod.VueI18n.Choice,
      locale: typings.vueI18n.mod.VueI18n.Locale
    ): String
    @JSName("$tc")
    def $tc(
      key: typings.vueI18n.mod.VueI18n.Path,
      choice: typings.vueI18n.mod.VueI18n.Choice,
      locale: typings.vueI18n.mod.VueI18n.Locale,
      values: typings.vueI18n.mod.VueI18n.Values
    ): String
    @JSName("$tc")
    def $tc(
      key: typings.vueI18n.mod.VueI18n.Path,
      choice: typings.vueI18n.mod.VueI18n.Choice,
      values: typings.vueI18n.mod.VueI18n.Values
    ): String
    @JSName("$tc")
    var $tc_Original: FnCallKeyChoiceLocaleValues
    
    @JSName("$te")
    def $te(key: typings.vueI18n.mod.VueI18n.Path): Boolean
    @JSName("$te")
    def $te(key: typings.vueI18n.mod.VueI18n.Path, locale: typings.vueI18n.mod.VueI18n.Locale): Boolean
    @JSName("$te")
    var $te_Original: js.Function2[
        /* key */ typings.vueI18n.mod.VueI18n.Path, 
        /* locale */ js.UndefOr[typings.vueI18n.mod.VueI18n.Locale], 
        Boolean
      ]
  }
  object Vue {
    
    inline def apply(
      $d: FnCallValueKeyLocale,
      $i18n: VueI18n & IVueI18n,
      $n: Fn0,
      $t: FnCall,
      $tc: FnCallKeyChoiceLocaleValues,
      $te: (/* key */ typings.vueI18n.mod.VueI18n.Path, /* locale */ js.UndefOr[typings.vueI18n.mod.VueI18n.Locale]) => Boolean
    ): Vue = {
      val __obj = js.Dynamic.literal($d = $d.asInstanceOf[js.Any], $i18n = $i18n.asInstanceOf[js.Any], $n = $n.asInstanceOf[js.Any], $t = $t.asInstanceOf[js.Any], $tc = $tc.asInstanceOf[js.Any], $te = js.Any.fromFunction2($te))
      __obj.asInstanceOf[Vue]
    }
    
    extension [Self <: Vue](x: Self) {
      
      inline def set$d(value: FnCallValueKeyLocale): Self = StObject.set(x, "$d", value.asInstanceOf[js.Any])
      
      inline def set$i18n(value: VueI18n & IVueI18n): Self = StObject.set(x, "$i18n", value.asInstanceOf[js.Any])
      
      inline def set$n(value: Fn0): Self = StObject.set(x, "$n", value.asInstanceOf[js.Any])
      
      inline def set$t(value: FnCall): Self = StObject.set(x, "$t", value.asInstanceOf[js.Any])
      
      inline def set$tc(value: FnCallKeyChoiceLocaleValues): Self = StObject.set(x, "$tc", value.asInstanceOf[js.Any])
      
      inline def set$te(
        value: (/* key */ typings.vueI18n.mod.VueI18n.Path, /* locale */ js.UndefOr[typings.vueI18n.mod.VueI18n.Locale]) => Boolean
      ): Self = StObject.set(x, "$te", js.Any.fromFunction2(value))
    }
  }
}
