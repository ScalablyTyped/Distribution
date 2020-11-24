package typings.vueI18n

import typings.vueI18n.mod.VueI18n.CurrencyDisplay
import typings.vueI18n.mod.VueI18n.DateTimeDigital
import typings.vueI18n.mod.VueI18n.DateTimeHumanReadable
import typings.vueI18n.mod.VueI18n.FormatMatcher
import typings.vueI18n.mod.VueI18n.FormattedNumberPartType
import typings.vueI18n.mod.VueI18n.LocaleMatcher
import typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueI18nStrings {
  
  @scala.inline
  def `2-digit`: `2-digit` = "2-digit".asInstanceOf[`2-digit`]
  
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @scala.inline
  def `best-fit`: `best-fit` = "best-fit".asInstanceOf[`best-fit`]
  
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @scala.inline
  def currency: currency = "currency".asInstanceOf[currency]
  
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @scala.inline
  def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  
  @scala.inline
  def infinity: infinity = "infinity".asInstanceOf[infinity]
  
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @scala.inline
  def literal: literal = "literal".asInstanceOf[literal]
  
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @scala.inline
  def minusSign: minusSign = "minusSign".asInstanceOf[minusSign]
  
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @scala.inline
  def nan: nan = "nan".asInstanceOf[nan]
  
  @scala.inline
  def narrow: narrow = "narrow".asInstanceOf[narrow]
  
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @scala.inline
  def percent: percent = "percent".asInstanceOf[percent]
  
  @scala.inline
  def percentSign: percentSign = "percentSign".asInstanceOf[percentSign]
  
  @scala.inline
  def plusSign: plusSign = "plusSign".asInstanceOf[plusSign]
  
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
  
  @js.native
  sealed trait `2-digit` extends DateTimeDigital
  
  @js.native
  sealed trait basic extends FormatMatcher
  
  @js.native
  sealed trait `best-fit`
    extends FormatMatcher
       with LocaleMatcher
  
  @js.native
  sealed trait code extends CurrencyDisplay
  
  @js.native
  sealed trait currency extends FormattedNumberPartType
  
  @js.native
  sealed trait decimal extends FormattedNumberPartType
  
  @js.native
  sealed trait error extends WarnHtmlInMessageLevel
  
  @js.native
  sealed trait fraction extends FormattedNumberPartType
  
  @js.native
  sealed trait group extends FormattedNumberPartType
  
  @js.native
  sealed trait infinity extends FormattedNumberPartType
  
  @js.native
  sealed trait integer extends FormattedNumberPartType
  
  @js.native
  sealed trait literal extends FormattedNumberPartType
  
  @js.native
  sealed trait long extends DateTimeHumanReadable
  
  @js.native
  sealed trait lookup extends LocaleMatcher
  
  @js.native
  sealed trait minusSign extends FormattedNumberPartType
  
  @js.native
  sealed trait name extends CurrencyDisplay
  
  @js.native
  sealed trait nan extends FormattedNumberPartType
  
  @js.native
  sealed trait narrow extends DateTimeHumanReadable
  
  @js.native
  sealed trait numeric extends DateTimeDigital
  
  @js.native
  sealed trait off extends WarnHtmlInMessageLevel
  
  @js.native
  sealed trait percent extends js.Object
  
  @js.native
  sealed trait percentSign extends FormattedNumberPartType
  
  @js.native
  sealed trait plusSign extends FormattedNumberPartType
  
  @js.native
  sealed trait short extends DateTimeHumanReadable
  
  @js.native
  sealed trait symbol extends CurrencyDisplay
  
  @js.native
  sealed trait warn extends WarnHtmlInMessageLevel
}
