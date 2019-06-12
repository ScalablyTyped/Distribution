package typings
package vanillaDashMaskerLib.vanillaDashMaskerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-masker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(el: stdLib.Element): vanillaDashMaskerLib.Anon_MaskAlphaNum = js.native
  def apply(el: stdLib.NodeListOf[stdLib.Element]): vanillaDashMaskerLib.Anon_MaskAlphaNum = js.native
  def toAlphaNumeric(value: java.lang.String): java.lang.String = js.native
  def toAlphaNumeric(value: scala.Double): java.lang.String = js.native
  def toMoney(value: java.lang.String): java.lang.String = js.native
  def toMoney(value: java.lang.String, options: MoneyOptions): java.lang.String = js.native
  def toMoney(value: scala.Double): java.lang.String = js.native
  def toMoney(value: scala.Double, options: MoneyOptions): java.lang.String = js.native
  def toNumber(value: java.lang.String): java.lang.String = js.native
  def toNumber(value: scala.Double): java.lang.String = js.native
  def toPattern(value: java.lang.String): java.lang.String = js.native
  def toPattern(value: java.lang.String, options: java.lang.String): java.lang.String = js.native
  def toPattern(value: java.lang.String, options: PatternOptions): java.lang.String = js.native
  def toPattern(value: scala.Double): java.lang.String = js.native
  def toPattern(value: scala.Double, options: java.lang.String): java.lang.String = js.native
  def toPattern(value: scala.Double, options: PatternOptions): java.lang.String = js.native
}

