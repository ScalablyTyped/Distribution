package typings
package vueDashI18nLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object vueDashI18nLibStrings {
  @js.native
  sealed trait `2-digit`
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeDigital
  
  @js.native
  sealed trait basic
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.FormatMatcher
  
  @js.native
  sealed trait `best-fit`
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.FormatMatcher
       with vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMatcher
  
  @js.native
  sealed trait code
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.CurrencyDisplay
  
  @js.native
  sealed trait currency extends js.Object
  
  @js.native
  sealed trait decimal extends js.Object
  
  @js.native
  sealed trait long
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeHumanReadable
  
  @js.native
  sealed trait lookup
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.LocaleMatcher
  
  @js.native
  sealed trait name
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.CurrencyDisplay
  
  @js.native
  sealed trait narrow
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeHumanReadable
  
  @js.native
  sealed trait numeric
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeDigital
  
  @js.native
  sealed trait percent extends js.Object
  
  @js.native
  sealed trait short
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.DateTimeHumanReadable
  
  @js.native
  sealed trait symbol
    extends vueDashI18nLib.vueDashI18nMod.VueI18nNs.CurrencyDisplay
  
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
  def long: long = "long".asInstanceOf[long]
  @scala.inline
  def lookup: lookup = "lookup".asInstanceOf[lookup]
  @scala.inline
  def name: name = "name".asInstanceOf[name]
  @scala.inline
  def narrow: narrow = "narrow".asInstanceOf[narrow]
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  @scala.inline
  def percent: percent = "percent".asInstanceOf[percent]
  @scala.inline
  def short: short = "short".asInstanceOf[short]
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
}

