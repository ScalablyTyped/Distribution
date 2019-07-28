package typings.voucherDashCodeDashGenerator.voucherDashCodeDashGeneratorMod

import typings.voucherDashCodeDashGenerator.voucherDashCodeDashGeneratorStrings.alphabetic
import typings.voucherDashCodeDashGenerator.voucherDashCodeDashGeneratorStrings.alphanumeric
import typings.voucherDashCodeDashGenerator.voucherDashCodeDashGeneratorStrings.numbers
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("voucher-code-generator", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  @JSName("charset")
  def charset_alphabetic(name: alphabetic): String = js.native
  @JSName("charset")
  def charset_alphanumeric(name: alphanumeric): String = js.native
  @JSName("charset")
  def charset_numbers(name: numbers): String = js.native
  def generate(): js.Array[String] = js.native
  def generate(config: generatorConfig): js.Array[String] = js.native
}

