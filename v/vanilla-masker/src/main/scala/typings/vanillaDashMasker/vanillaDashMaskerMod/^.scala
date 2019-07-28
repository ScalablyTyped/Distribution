package typings.vanillaDashMasker.vanillaDashMaskerMod

import typings.std.Element
import typings.std.NodeListOf
import typings.vanillaDashMasker.Anon_MaskAlphaNum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vanilla-masker", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def apply(el: Element): Anon_MaskAlphaNum = js.native
  def apply(el: NodeListOf[Element]): Anon_MaskAlphaNum = js.native
  def toAlphaNumeric(value: String): String = js.native
  def toAlphaNumeric(value: Double): String = js.native
  def toMoney(value: String): String = js.native
  def toMoney(value: String, options: MoneyOptions): String = js.native
  def toMoney(value: Double): String = js.native
  def toMoney(value: Double, options: MoneyOptions): String = js.native
  def toNumber(value: String): String = js.native
  def toNumber(value: Double): String = js.native
  def toPattern(value: String): String = js.native
  def toPattern(value: String, options: String): String = js.native
  def toPattern(value: String, options: PatternOptions): String = js.native
  def toPattern(value: Double): String = js.native
  def toPattern(value: Double, options: String): String = js.native
  def toPattern(value: Double, options: PatternOptions): String = js.native
}

