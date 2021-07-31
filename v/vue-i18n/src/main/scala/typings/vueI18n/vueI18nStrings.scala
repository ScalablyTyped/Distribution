package typings.vueI18n

import typings.vueI18n.mod.VueI18n.CurrencyDisplay
import typings.vueI18n.mod.VueI18n.DateTimeDigital
import typings.vueI18n.mod.VueI18n.DateTimeHumanReadable
import typings.vueI18n.mod.VueI18n.FormatMatcher
import typings.vueI18n.mod.VueI18n.FormattedNumberPartType
import typings.vueI18n.mod.VueI18n.LocaleMatcher
import typings.vueI18n.mod.VueI18n.WarnHtmlInMessageLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vueI18nStrings {
  
  @js.native
  sealed trait `2-digit`
    extends StObject
       with DateTimeDigital
  @scala.inline
  def `2-digit`: `2-digit` = "2-digit".asInstanceOf[`2-digit`]
  
  @js.native
  sealed trait basic
    extends StObject
       with FormatMatcher
  @scala.inline
  def basic: basic = "basic".asInstanceOf[basic]
  
  @js.native
  sealed trait `best-fit`
    extends StObject
       with FormatMatcher
       with LocaleMatcher
  @scala.inline
  def `best-fit`: `best-fit` = "best-fit".asInstanceOf[`best-fit`]
  
  @js.native
  sealed trait code
    extends StObject
       with CurrencyDisplay
  @scala.inline
  def code: code = "code".asInstanceOf[code]
  
  @js.native
  sealed trait currency
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def currency: currency = "currency".asInstanceOf[currency]
  
  @js.native
  sealed trait decimal
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def decimal: decimal = "decimal".asInstanceOf[decimal]
  
  @js.native
  sealed trait error
    extends StObject
       with WarnHtmlInMessageLevel
  @scala.inline
  def error: error = "error".asInstanceOf[error]
  
  @js.native
  sealed trait fraction
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def fraction: fraction = "fraction".asInstanceOf[fraction]
  
  @js.native
  sealed trait group
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait infinity
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def infinity: infinity = "infinity".asInstanceOf[infinity]
  
  @js.native
  sealed trait integer
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def integer: integer = "integer".asInstanceOf[integer]
  
  @js.native
  sealed trait literal
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def literal: literal = "literal".asInstanceOf[literal]
  
  @js.native
  sealed trait long
    extends StObject
       with DateTimeHumanReadable
  @scala.inline
  def long: long = "long".asInstanceOf[long]
  
  @js.native
  sealed trait lookup
    extends StObject
       with LocaleMatcher
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  
  @js.native
  sealed trait minusSign
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def minusSign: minusSign = "minusSign".asInstanceOf[minusSign]
  
  @js.native
  sealed trait name
    extends StObject
       with CurrencyDisplay
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  
  @js.native
  sealed trait nan
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def nan: nan = "nan".asInstanceOf[nan]
  
  @js.native
  sealed trait narrow
    extends StObject
       with DateTimeHumanReadable
  @scala.inline
  def narrow: narrow = "narrow".asInstanceOf[narrow]
  
  @js.native
  sealed trait numeric
    extends StObject
       with DateTimeDigital
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait off
    extends StObject
       with WarnHtmlInMessageLevel
  @scala.inline
  def off: off = "off".asInstanceOf[off]
  
  @js.native
  sealed trait percent extends StObject
  @scala.inline
  def percent: percent = "percent".asInstanceOf[percent]
  
  @js.native
  sealed trait percentSign
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def percentSign: percentSign = "percentSign".asInstanceOf[percentSign]
  
  @js.native
  sealed trait plusSign
    extends StObject
       with FormattedNumberPartType
  @scala.inline
  def plusSign: plusSign = "plusSign".asInstanceOf[plusSign]
  
  @js.native
  sealed trait short
    extends StObject
       with DateTimeHumanReadable
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  
  @js.native
  sealed trait symbol
    extends StObject
       with CurrencyDisplay
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait warn
    extends StObject
       with WarnHtmlInMessageLevel
  @scala.inline
  def warn: warn = "warn".asInstanceOf[warn]
}
